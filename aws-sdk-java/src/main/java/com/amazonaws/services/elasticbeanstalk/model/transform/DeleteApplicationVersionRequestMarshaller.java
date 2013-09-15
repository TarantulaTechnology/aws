/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Delete Application Version Request Marshaller
 */
public class DeleteApplicationVersionRequestMarshaller implements Marshaller<Request<DeleteApplicationVersionRequest>, DeleteApplicationVersionRequest> {

    public Request<DeleteApplicationVersionRequest> marshall(DeleteApplicationVersionRequest deleteApplicationVersionRequest) {

        if (deleteApplicationVersionRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteApplicationVersionRequest> request = new DefaultRequest<DeleteApplicationVersionRequest>(deleteApplicationVersionRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DeleteApplicationVersion");
        request.addParameter("Version", "2010-12-01");

        if (deleteApplicationVersionRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(deleteApplicationVersionRequest.getApplicationName()));
        }
        if (deleteApplicationVersionRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(deleteApplicationVersionRequest.getVersionLabel()));
        }
        if (deleteApplicationVersionRequest.isDeleteSourceBundle() != null) {
            request.addParameter("DeleteSourceBundle", StringUtils.fromBoolean(deleteApplicationVersionRequest.isDeleteSourceBundle()));
        }


        return request;
    }
}
