# Copyright 2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License"). You
# may not use this file except in compliance with the License. A copy of
# the License is located at
#
#     http://aws.amazon.com/apache2.0/
#
# or in the "license" file accompanying this file. This file is
# distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF
# ANY KIND, either express or implied. See the License for the specific
# language governing permissions and limitations under the License.
import logging
import math
import os
import threading
import time

from awscli.customizations.s3.constants import MULTI_THRESHOLD, CHUNKSIZE, \
    NUM_THREADS, NUM_MULTI_THREADS, QUEUE_TIMEOUT_GET, MAX_UPLOAD_SIZE
from awscli.customizations.s3.utils import NoBlockQueue, find_chunksize
from awscli.customizations.s3.executer import Executer
from awscli.customizations.s3.tasks import BasicTask

LOGGER = logging.getLogger(__name__)


class S3Handler(object):
    """
    This class sets up the process to perform the tasks sent to it.  It
    sources the ``self.executer`` from which threads inside the
    class pull tasks from to complete.
    """
    def __init__(self, session, params, multi_threshold=MULTI_THRESHOLD,
                 chunksize=CHUNKSIZE):
        self.session = session
        self.done = threading.Event()
        self.interrupt = threading.Event()
        self.printQueue = NoBlockQueue()
        self.params = {'dryrun': False, 'quiet': False, 'acl': None, 'guess_mime_type': True}
        self.params['region'] = params['region']
        for key in self.params.keys():
            if key in params:
                self.params[key] = params[key]
        self.multi_threshold = multi_threshold
        self.chunksize = chunksize
        self.executer = Executer(done=self.done,
                                 num_threads=NUM_THREADS,
                                 timeout=QUEUE_TIMEOUT_GET,
                                 printQueue=self.printQueue,
                                 quiet=self.params['quiet'],
                                 interrupt=self.interrupt,
                                 max_multi=NUM_MULTI_THREADS)

    def call(self, files):
        """
        This function pulls a ``FileInfo`` or ``TaskInfo`` object from
        a list ``files``.  Each object is then deemed if it will be a
        multipart operation and add the necessary attributes if so.  Each
        object is then wrapped with a ``BasicTask`` object which is
        essentially a thread of execution for a thread to follow.  These
        tasks are then submitted to the main executer.
        """
        self.done.clear()
        self.interrupt.clear()
        try:
            self.executer.start()
            tot_files = 0
            tot_parts = 0
            for filename in files:
                num_uploads = 1
                is_larger = False
                chunksize = self.chunksize
                too_large = False
                if hasattr(filename, 'size'):
                    is_larger = filename.size > self.multi_threshold
                    too_large = filename.size > MAX_UPLOAD_SIZE
                if is_larger:
                    if filename.operation == 'upload':
                        num_uploads = int(math.ceil(filename.size /
                                                    float(chunksize)))
                        chunksize = find_chunksize(filename.size, chunksize)
                        filename.set_multi(executer=self.executer,
                                           printQueue=self.printQueue,
                                           interrupt=self.interrupt,
                                           chunksize=chunksize)
                    elif filename.operation == 'download':
                        num_uploads = int(filename.size / chunksize)
                        filename.set_multi(executer=self.executer,
                                           printQueue=self.printQueue,
                                           interrupt=self.interrupt,
                                           chunksize=chunksize)
                task = BasicTask(session=self.session, filename=filename,
                                 executer=self.executer, done=self.done,
                                 parameters=self.params,
                                 multi_threshold=self.multi_threshold,
                                 chunksize=chunksize,
                                 printQueue=self.printQueue,
                                 interrupt=self.interrupt)
                if too_large and filename.operation == 'upload':
                    warning = "Warning %s exceeds 5 TB and upload is " \
                              "being skipped" % os.path.relpath(filename.src)
                    self.printQueue.put({'result': warning})
                else:
                    self.executer.submit(task)
                tot_files += 1
                tot_parts += num_uploads
            self.executer.print_thread.totalFiles = tot_files
            self.executer.print_thread.totalParts = tot_parts
            self.executer.wait()
            self.printQueue.join()

        except Exception as e:
            LOGGER.debug('%s' % str(e))
        except KeyboardInterrupt:
            self.interrupt.set()
            self.printQueue.put({'result': "Cleaning up. Please wait..."})

        self.done.set()
        self.executer.join()
