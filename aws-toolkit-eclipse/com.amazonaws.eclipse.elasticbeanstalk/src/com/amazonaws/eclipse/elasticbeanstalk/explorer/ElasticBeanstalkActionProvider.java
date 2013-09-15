/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.elasticbeanstalk.explorer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.navigator.CommonActionProvider;

import com.amazonaws.eclipse.core.AwsToolkitCore;
import com.amazonaws.eclipse.core.regions.RegionUtils;
import com.amazonaws.eclipse.core.regions.ServiceAbbreviations;
import com.amazonaws.eclipse.explorer.ContentProviderRegistry;
import com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk;
import com.amazonaws.services.elasticbeanstalk.model.EnvironmentDescription;
import com.amazonaws.services.elasticbeanstalk.model.TerminateEnvironmentRequest;

public class ElasticBeanstalkActionProvider extends CommonActionProvider {

    @Override
    public void fillContextMenu(IMenuManager menu) {
        boolean onlyEnvironmentsSelected = true;
        StructuredSelection selection = (StructuredSelection)getActionSite().getStructuredViewer().getSelection();
        @SuppressWarnings("rawtypes")
        Iterator iterator = selection.iterator();
        List<EnvironmentDescription> environments = new ArrayList<EnvironmentDescription>();
        while ( iterator.hasNext() ) {
            Object obj = iterator.next();
            if ( obj instanceof EnvironmentDescription ) {
                environments.add((EnvironmentDescription) obj);
            } else {
                onlyEnvironmentsSelected = false;
            }
        }

        if ( onlyEnvironmentsSelected ) {
            if ( environments.size() == 1 ) {
                menu.add(new OpenEnvironmentEditorAction(environments.get(0), RegionUtils.getCurrentRegion()));
                menu.add(new Separator());
            }

            menu.add(new TerminateEnvironmentsAction(environments));
        }
    }


    private static class TerminateEnvironmentsAction extends Action {
        private final List<EnvironmentDescription> environments;

        public TerminateEnvironmentsAction(List<EnvironmentDescription> environments) {
            this.environments = environments;

            this.setText("Terminate Environment");
            this.setToolTipText("Terminate the selected environments");
            this.setImageDescriptor(AwsToolkitCore.getDefault().getImageRegistry().getDescriptor(AwsToolkitCore.IMAGE_REMOVE));
        }

        @Override
        public void run() {
            Dialog dialog = newConfirmationDialog("Terminate selected environments?", "Are you sure you want to terminate the selected AWS Elastic Beanstalk environments?");
            if (dialog.open() != 0) return;

            Job terminateEnvironmentsJob = new Job("Terminating Environments") {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    String endpoint = RegionUtils.getCurrentRegion().getServiceEndpoints().get(ServiceAbbreviations.BEANSTALK);
                    AWSElasticBeanstalk beanstalk = AwsToolkitCore.getClientFactory().getElasticBeanstalkClientByEndpoint(endpoint);

                    List<Exception> errors = new ArrayList<Exception>();
                    for (EnvironmentDescription env : environments) {
                        try {
                            beanstalk.terminateEnvironment(new TerminateEnvironmentRequest().withEnvironmentId(env.getEnvironmentId()));
                        } catch (Exception e) {
                            errors.add(e);
                        }
                    }

                    IStatus status = Status.OK_STATUS;
                    if (errors.size() > 0) {
                        status = new MultiStatus(AwsToolkitCore.PLUGIN_ID, 0, "Unable to terminate environments", null);
                        for (Exception error : errors) {
                            ((MultiStatus)status).add(new Status(Status.ERROR, AwsToolkitCore.PLUGIN_ID, "Unable to terminate environment", error));
                        }
                    }

                    ContentProviderRegistry.refreshAllContentProviders();

                    return status;
                }
            };

            terminateEnvironmentsJob.schedule();
        }

        private Dialog newConfirmationDialog(String title, String message) {
            return new MessageDialog(Display.getDefault().getActiveShell(), title, null, message, MessageDialog.WARNING, new String[] {"OK", "Cancel"}, 0);
        }
    }
}
