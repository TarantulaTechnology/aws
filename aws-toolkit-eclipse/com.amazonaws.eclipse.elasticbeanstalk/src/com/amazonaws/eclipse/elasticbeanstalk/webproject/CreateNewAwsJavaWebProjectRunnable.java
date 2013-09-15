/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.eclipse.elasticbeanstalk.webproject;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jst.j2ee.classpathdep.ClasspathDependencyUtil;
import org.eclipse.jst.j2ee.classpathdep.UpdateClasspathAttributeUtil;
import org.eclipse.jst.j2ee.project.facet.IJ2EEFacetConstants;
import org.eclipse.jst.j2ee.web.project.facet.IWebFacetInstallDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties;
import org.eclipse.wst.common.componentcore.datamodel.properties.IFacetProjectCreationDataModelProperties.FacetDataModelMap;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;
import org.eclipse.wst.common.project.facet.core.runtime.RuntimeManager;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IRuntimeType;
import org.eclipse.wst.server.core.IRuntimeWorkingCopy;
import org.eclipse.wst.server.core.ServerCore;
import org.osgi.framework.Bundle;

import com.amazonaws.eclipse.core.AccountInfo;
import com.amazonaws.eclipse.core.AwsToolkitCore;
import com.amazonaws.eclipse.core.regions.Region;
import com.amazonaws.eclipse.core.regions.RegionUtils;
import com.amazonaws.eclipse.core.regions.ServiceAbbreviations;
import com.amazonaws.eclipse.elasticbeanstalk.ElasticBeanstalkPlugin;
import com.amazonaws.eclipse.sdk.ui.JavaSdkInstall;
import com.amazonaws.eclipse.sdk.ui.JavaSdkManager;
import com.amazonaws.eclipse.sdk.ui.JavaSdkPlugin;
import com.amazonaws.eclipse.sdk.ui.classpath.AwsClasspathContainer;
import com.amazonaws.eclipse.sdk.ui.classpath.AwsSdkClasspathUtils;

/**
 * Runnable (with progress) that creates a new AWS Java web project, based on
 * the configured data model. This class is responsible for creating the WTP
 * dynamic web project, adding and configuring the AWS SDK for Java, creating
 * the security credential configuration file and eventually configuring the WTP
 * runtime targeted by the new project.
 */
final class CreateNewAwsJavaWebProjectRunnable implements IRunnableWithProgress {

    private static final String ELASTIC_BEANSTALK_RUNTIME_ID = "com.amazonaws.eclipse.elasticbeanstalk.jee.runtime";
    private static final String GENERIC_JEE_RUNTIME_ID = "org.eclipse.jst.server.core.runtimeType";

    private final NewAwsJavaWebProjectDataModel dataModel;
    
    /*
     * TODO: it would be better to inspect these from the travel log itself
     * somehow -- right now it's coupled tightly to that file structure.
     */
    public static final String LANGUAGES_DIR = "language";
    public static final Map<String, String> LANGUAGE_DIRS = new HashMap<String, String>();
    static {
        LANGUAGE_DIRS.put(NewAwsJavaWebProjectDataModel.JAPANESE, "jp");
    }

    public static final Map<String, String> LANGUAGE_BUNDLE_PATHS = new HashMap<String, String>();
    static {
        LANGUAGE_BUNDLE_PATHS.put(NewAwsJavaWebProjectDataModel.ENGLISH, "hawaii");
        LANGUAGE_BUNDLE_PATHS.put(NewAwsJavaWebProjectDataModel.JAPANESE, "japan");
    }

    public static final String BUNDLE_BUCKET = "aws-travellog-sample-data";

    public CreateNewAwsJavaWebProjectRunnable(NewAwsJavaWebProjectDataModel dataModel) {
        this.dataModel = dataModel;
    }

    /* (non-Javadoc)
     * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
     */
    public void run(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException {
        SubMonitor monitor = SubMonitor.convert(progressMonitor, "Creating new AWS Java web project", 100);

        try {
            IRuntime genericJeeServerRuntime = configureGenericJeeServerRuntime();

            // Create a WTP Dynamic Web project
            IDataModel newWebProjectDataModel = DataModelFactory.createDataModel(IWebFacetInstallDataModelProperties.class);
            newWebProjectDataModel.setProperty(IFacetProjectCreationDataModelProperties.FACET_PROJECT_NAME, dataModel.getProjectName());
            if (genericJeeServerRuntime != null) {
                newWebProjectDataModel.setProperty(
                        IFacetProjectCreationDataModelProperties.FACET_RUNTIME,
                        RuntimeManager.getRuntime(genericJeeServerRuntime.getId()));
            }

            // Default to a 2.5 web app
            FacetDataModelMap facetDataModelMap = (FacetDataModelMap)newWebProjectDataModel.getProperty(IFacetProjectCreationDataModelProperties.FACET_DM_MAP);
            IDataModel facetDataModel = facetDataModelMap.getFacetDataModel(IJ2EEFacetConstants.DYNAMIC_WEB);
            facetDataModel.setProperty(IFacetDataModelProperties.FACET_VERSION, IJ2EEFacetConstants.DYNAMIC_WEB_25);

            newWebProjectDataModel.getDefaultOperation().execute(monitor.newChild(30), null);

            // Add the AWS SDK for Java
            IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(dataModel.getProjectName());
            IJavaProject javaProject = JavaCore.create(project);
            JavaSdkManager sdkManager = JavaSdkManager.getInstance();
            
            // When installing the SDK, make sure we're not in the middle of
            // bootstrapping the environment
            JavaSdkInstall sdkInstall = null;
            Job installationJob = null;
            synchronized ( sdkManager ) {
                sdkInstall = sdkManager.getDefaultSdkInstall();
                if ( sdkInstall == null ) {
                    installationJob = sdkManager.getInstallationJob();
                    if ( installationJob == null ) {
                        JavaSdkPlugin
                                .getDefault()
                                .getLog()
                                .log(new Status(IStatus.ERROR, JavaSdkPlugin.PLUGIN_ID,
                                        "Unable to check status of AWS SDK for Java download"));
                    }
                }
            }
            
            if ( sdkInstall == null && installationJob != null ) {
                installationJob.join();
            }

            sdkInstall = sdkManager.getDefaultSdkInstall();
            if ( sdkInstall != null ) {
                sdkInstall.writeMetadataToProject(javaProject);
                AwsSdkClasspathUtils.addAwsSdkToProjectClasspath(javaProject, sdkInstall);
            }            
            
            monitor.worked(20);
            
            // Mark it as a Java EE module dependency
            // TODO: If the user changes the SDK version (through the properties page) then we'll lose the
            //       Java EE module dependency classpath entry attribute.
            Map<IClasspathEntry, IPath> classpathEntriesToRuntimePath = new HashMap<IClasspathEntry, IPath>();
            IClasspathEntry entry = findSdkClasspathEntry(javaProject);
            final IPath runtimePath = ClasspathDependencyUtil.getRuntimePath(null, true, ClasspathDependencyUtil.isClassFolderEntry(entry));
            classpathEntriesToRuntimePath.put(entry, runtimePath);
            IDataModelOperation addDependencyAttributesOperation = UpdateClasspathAttributeUtil.createAddDependencyAttributesOperation(project.getName(), classpathEntriesToRuntimePath);
            addDependencyAttributesOperation.execute(monitor.newChild(30), null);

            // Add files to the the project
            addTemplateFiles(project);
            monitor.worked(10);
            CredentialsUtils credentialsUtils = new CredentialsUtils();
            AccountInfo accountInfo = AwsToolkitCore.getDefault().getAccountInfo(dataModel.getAccountId());
            credentialsUtils.addAwsCredentialsFileToProject(project, accountInfo.getAccessKey(), accountInfo.getSecretKey());
            monitor.worked(10);
        } catch (Exception e) {
            throw new InvocationTargetException(e);
        } finally {
            progressMonitor.done();
        }
    }

    private IClasspathEntry findSdkClasspathEntry(IJavaProject javaProject) throws JavaModelException {
        IPath expectedPath = new AwsClasspathContainer(JavaSdkManager.getInstance().getDefaultSdkInstall()).getPath();
        for (IClasspathEntry entry : javaProject.getRawClasspath()) {
            if (entry.getPath().equals(expectedPath)) return entry;
        }

        return null;
    }

    private IRuntime configureGenericJeeServerRuntime() {
        // Return the existing AWS generic J2EE runtime if it already exists
        IRuntime runtime = ServerCore.findRuntime(ELASTIC_BEANSTALK_RUNTIME_ID);
        if (runtime != null) return runtime;

        // Otherwise try to create a new one...
        try {
            IRuntimeType jeeRuntimeType = ServerCore.findRuntimeType(GENERIC_JEE_RUNTIME_ID);
            IRuntimeWorkingCopy workingCopy = jeeRuntimeType.createRuntime(ELASTIC_BEANSTALK_RUNTIME_ID, new NullProgressMonitor());
            workingCopy.setName("AWS Elastic Beanstalk J2EE Runtime");

            Bundle bundle = ElasticBeanstalkPlugin.getDefault().getBundle();
            URL url = FileLocator.resolve(bundle.getEntry("/"));

            try {
                File source = new File(url.getFile(), "runtime-lib/j2ee.jar");
                File dest = new File(ElasticBeanstalkPlugin.getDefault().getStateLocation().toFile(), "runtime-lib/j2ee.jar");
                if ( !dest.exists() )
                    FileUtils.copyFile(source, dest);
                workingCopy.setLocation(new Path(dest.getParentFile().getAbsolutePath()));
            } catch ( Exception e ) {
                // If we can't copy the j2ee jar into the workspace, fall back
                // to using the file in the plugin.
                workingCopy.setLocation(new Path(url.getFile(), "runtime-lib"));
            }

            return workingCopy.save(true, new NullProgressMonitor());
        } catch ( Exception e ) {
            ElasticBeanstalkPlugin.getDefault().getLog()
                    .log(new Status(Status.ERROR, ElasticBeanstalkPlugin.PLUGIN_ID, e.getMessage(), e));
            return null;
        }
    }

    /** Filename filter that selects all ZIP files. */
    private static final class ZipFileFilter implements FilenameFilter {
        public boolean accept(File dir, String name) {
            return (name.toLowerCase().endsWith(".zip"));
        }
    }

    /** Filename filter that filters out all SVN metadata files. */
    private static final class SvnMetadataFilter implements FileFilter {
        public boolean accept(File pathname) {
            return (pathname.toString().contains("/.svn/") == false);
        }
    }

    private static class CredentialsUtils {
        private static final String AWS_CREDENTIALS_URL = "http://aws.amazon.com/security-credentials";
        private static final String AWS_CREDENTIALS_PROPERTIES_FILE = "AwsCredentials.properties";

        public void addAwsCredentialsFileToProject(final IProject project, String accessKeyId, String secretKey) throws CoreException {
            Properties credentialProperties = new Properties();
            credentialProperties.setProperty("accessKey", accessKeyId);
            credentialProperties.setProperty("secretKey", secretKey);

            IPath srcDirPath = project.getLocation().append("src");
            final IPath credentialsFilePath = srcDirPath.append(AWS_CREDENTIALS_PROPERTIES_FILE);

            IFileStore credentialPropertiesFile =
                EFS.getLocalFileSystem().fromLocalFile(credentialsFilePath.toFile());
            OutputStream os = credentialPropertiesFile.openOutputStream(EFS.NONE, null);

            try {
                credentialProperties.store(os, "Insert your AWS Credentials from " + AWS_CREDENTIALS_URL);
            } catch (IOException e) {
                Status status = new Status(Status.ERROR, ElasticBeanstalkPlugin.PLUGIN_ID, "Unable to write AWS credentials to file", e);
                throw new CoreException(status);
            } finally {
                try {os.close();} catch (Exception e) {}
            }

            project.refreshLocal(IResource.DEPTH_INFINITE, null);
        }
    }

    private void addTemplateFiles(IProject project) throws IOException, CoreException {
        Bundle bundle = ElasticBeanstalkPlugin.getDefault().getBundle();
        URL url = FileLocator.resolve(bundle.getEntry("/"));
        IPath templateRoot = new Path(url.getFile(), "templates");

        if (dataModel.isSampleAppIncluded()) {
            // The TravelLog sample app template is zipped up, so we need to extract it to the right location
            for (File file : templateRoot.append("TravelLog").toFile().listFiles(new ZipFileFilter())) {
                unzipSampleAppTemplate(file, project.getLocation().toFile());
            }
        } else {
            // The basic template can simply be copied over without being unzipped
            FileUtils.copyDirectory(
                templateRoot.append("basic").toFile(),
                project.getLocation().toFile(),
                new SvnMetadataFilter());
        }

        project.refreshLocal(IResource.DEPTH_INFINITE, null);
    }


    private void unzipSampleAppTemplate(File file, File destination) throws FileNotFoundException, IOException {
        
        // Get a temp directory
        File temp = File.createTempFile("travellog", "");
        temp.delete();
        temp.mkdirs();
        
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));

        ZipEntry zipEntry = null;
        while ((zipEntry = zipInputStream.getNextEntry()) != null) {
            IPath path = new Path(zipEntry.getName());

            File destinationFile = new File(temp, path.toOSString());
            if ( zipEntry.isDirectory() ) {
                destinationFile.mkdirs();
            } else {
                FileOutputStream outputStream = new FileOutputStream(destinationFile);
                IOUtils.copy(zipInputStream, outputStream);
                outputStream.close();
            }
        }
        zipInputStream.close();

        File travellogDir = new File(temp, "travellog");
        File srcDir = new File(travellogDir, "src");

        // Override the language-specific files
        if ( !dataModel.getLanguage().equals(NewAwsJavaWebProjectDataModel.ENGLISH) ) {
            File languagesDir = new File(temp, LANGUAGES_DIR);
            File languageDir = new File(languagesDir, LANGUAGE_DIRS.get(dataModel.getLanguage()));
            if ( languageDir.exists() ) {
                FileUtils.copyDirectory(languageDir, travellogDir);
            }
        }
        
        // Override the sample content properties
        LinkedList<String> bundlePropertiesContents = new LinkedList<String>();
        bundlePropertiesContents.add("bundleBucket = " + BUNDLE_BUCKET);
        bundlePropertiesContents.add("bundlePath = " + LANGUAGE_BUNDLE_PATHS.get(dataModel.getLanguage()));        
        File bundleProperties = new File(srcDir, "content-bundle.properties");
        truncateFile(bundleProperties);
        FileUtils.writeLines(bundleProperties, bundlePropertiesContents);

        // Override the service endpoints
        Region region = dataModel.getRegion();
        List<String> endpoints = new LinkedList<String>();
        for ( String service : new String[] { ServiceAbbreviations.S3, ServiceAbbreviations.SIMPLEDB,
                ServiceAbbreviations.SNS } ) {
            String endpoint;
            if ( region.isServiceSupported(service) ) {
                endpoint = region.getServiceEndpoint(service);
            } else {
                endpoint = RegionUtils.getRegionsForService(service).get(0).getServiceEndpoint(service);
            }
            endpoints.add(service + " = " + endpoint);
        }
        File serviceEndpoints = new File(srcDir, "endpoints.properties");
        truncateFile(serviceEndpoints);
        FileUtils.writeLines(serviceEndpoints, endpoints);
        
        // Finally, copy the entire travellog directory into the destination
        FileUtils.copyDirectory(travellogDir, destination);
    }
    
    private void truncateFile(File f) throws FileNotFoundException, IOException {
        new RandomAccessFile(f, "rw").setLength(0);
    }
}
