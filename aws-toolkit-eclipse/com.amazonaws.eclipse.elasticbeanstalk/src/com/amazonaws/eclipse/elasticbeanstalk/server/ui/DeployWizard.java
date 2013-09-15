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
package com.amazonaws.eclipse.elasticbeanstalk.server.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.wst.server.core.IServerWorkingCopy;
import org.eclipse.wst.server.core.TaskModel;
import org.eclipse.wst.server.ui.wizard.WizardFragment;

import com.amazonaws.eclipse.core.AwsToolkitCore;
import com.amazonaws.eclipse.core.regions.RegionUtils;
import com.amazonaws.eclipse.core.regions.ServiceAbbreviations;
import com.amazonaws.eclipse.elasticbeanstalk.ElasticBeanstalkPlugin;
import com.amazonaws.eclipse.elasticbeanstalk.Environment;
import com.amazonaws.eclipse.elasticbeanstalk.SolutionStacks;
import com.amazonaws.eclipse.elasticbeanstalk.deploy.DeployWizardDataModel;

public class DeployWizard extends WizardFragment {

    private static final Logger logger = Logger.getLogger(WizardFragment.class.getName());

    private DeployWizardApplicationSelectionPage applicationSelectionPage;
    private DeployWizardEnvironmentConfigPage releaseDetailsPage;
    private NoCredentialsConfiguredWizardFragment noCredentialsConfiguredWizardFragment;

    private final DeployWizardDataModel wizardDataModel = new DeployWizardDataModel();

    public static final String DEPLOY_WIZARD_DIALOG_SETTINGS_SECTION  = "deployWizardDialogSettingsSection";
    public static final String DEPLOY_WIZARD_APPLICATION_NAME_SETTING = "deployWizardApplicationNameSetting";
    public static final String DEPLOY_WIZARD_ENVIRONMENT_NAME_SETTING = "deployWizardEnvironmentNameSetting";
    public static final String DEPLOY_WIZARD_S3_BUCKET_SETTING        = "deployWizardS3BucketSetting";
    public static final String DEPLOY_WIZARD_REGION_ENDPOINT_SETTING  = "deployWizardRegionEndpoint";

    public DeployWizard() {
        applicationSelectionPage = new DeployWizardApplicationSelectionPage(wizardDataModel);
        releaseDetailsPage = new DeployWizardEnvironmentConfigPage(wizardDataModel);
        noCredentialsConfiguredWizardFragment = new NoCredentialsConfiguredWizardFragment(wizardDataModel);

        IDialogSettings globalDialogSettings = ElasticBeanstalkPlugin.getDefault().getDialogSettings();
        IDialogSettings deployWizardSection = globalDialogSettings.getSection(DEPLOY_WIZARD_DIALOG_SETTINGS_SECTION);
        if (deployWizardSection == null) {
            deployWizardSection = globalDialogSettings.addNewSection(DEPLOY_WIZARD_DIALOG_SETTINGS_SECTION);
        }

        if ( RegionUtils.isServiceSupportedInCurrentRegion(ServiceAbbreviations.BEANSTALK) ) {
            wizardDataModel.setRegion(RegionUtils.getCurrentRegion());
        } else {
            wizardDataModel.setRegion(RegionUtils.getRegion(ElasticBeanstalkPlugin.DEFAULT_REGION));
        }
    }

    @Override
    @SuppressWarnings("rawtypes")
    public List getChildFragments() {
        List<WizardFragment> list = new ArrayList<WizardFragment>();
        if (AwsToolkitCore.getDefault().getAccountInfo().isValid()) {
            list.add(applicationSelectionPage);
            list.add(releaseDetailsPage);
        } else {
            list.add(noCredentialsConfiguredWizardFragment);
        }
        return list;
    }

    @Override
    public boolean isComplete() {
        @SuppressWarnings("unchecked")
        List<WizardFragment> childFragments = getChildFragments();
        for (WizardFragment fragment : childFragments) {
            if (fragment.isComplete() == false) return false;
        }
        return true;
    }

    @Override
    public void enter() {
        IServerWorkingCopy runtime = (IServerWorkingCopy)getTaskModel().getObject(TaskModel.TASK_SERVER);
        if (runtime == null) {
            logger.warning("null server working copy");
            return;
        }
    }

    @Override
    public void performFinish(IProgressMonitor monitor) throws CoreException {
        IServerWorkingCopy serverWorkingCopy = (IServerWorkingCopy) getTaskModel().getObject(TaskModel.TASK_SERVER);

        ServerDefaultsUtils.setDefaultHostName(serverWorkingCopy, wizardDataModel.getRegionEndpoint());
        ServerDefaultsUtils.setDefaultServerName(serverWorkingCopy, wizardDataModel.getEnvironmentName());

        Environment environment = (Environment)serverWorkingCopy.loadAdapter(Environment.class, monitor);
        environment.setApplicationName(wizardDataModel.getApplicationName());
        environment.setApplicationDescription(wizardDataModel.getNewApplicationDescription());
        environment.setEnvironmentName(wizardDataModel.getEnvironmentName());
        environment.setEnvironmentDescription(wizardDataModel.getNewEnvironmentDescription());
        environment.setRegionId(wizardDataModel.getRegion().getId());
        environment.setHealthCheckUrl(wizardDataModel.getHealthCheckUrl());
        environment.setSslCertificateId(wizardDataModel.getSslCertificateId());
        environment.setSnsEndpoint(wizardDataModel.getSnsEndpoint());
        environment.setAccountId(AwsToolkitCore.getDefault().getCurrentAccountId());
        environment.setIncrementalDeployment(wizardDataModel.isIncrementalDeployment());

        if ( wizardDataModel.isUsingCname() )
            environment.setCname(wizardDataModel.getCname());
        if ( wizardDataModel.isUsingKeyPair() )
            environment.setKeyPairName(wizardDataModel.getKeyPair().getKeyName());

        String serverTypeId = serverWorkingCopy.getServerType().getId();
        environment.setSolutionStack(SolutionStacks.lookupSolutionStackByServerTypeId(serverTypeId));
    }

}
