==========================
Building The Documentation
==========================

The process for building the documention is:

* Run ``rstgen`` which does the following:

  * Generates all of the source reference ReST files.
  * Generates the ``aws_man_pages.json`` file which contains the list
    of all man pages to be generated as needed by ``conf.py``.
  * Generates ``tutorial/services.rst`` which is included by
    ``tutorial/getting_started.rst``.

* Run ``make html`` which will build all of the HTML documentation
  into the ``build/html`` directory.

* Run ``make man`` which will build all of the man pages into
  ``../doc/man/man1``.  These files are included in the source
  distribution and installed by ``python setup.py install``.

* Run ``make text`` which will build all of the text pages that
  are used for interactive help on the Window platform.  These files
  are included in the source distribution and installed by
  ``python setup.py install``.

You can perform all of these tasks by running ``make all`` in this
directory.  If you have previously built the documentation and want
to regenerate it, run ``make clean`` first.
