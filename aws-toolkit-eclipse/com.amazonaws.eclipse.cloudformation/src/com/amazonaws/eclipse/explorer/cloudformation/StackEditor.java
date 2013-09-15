/*
 * Copyright 2012 Amazon Technologies, Inc.
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
package com.amazonaws.eclipse.explorer.cloudformation;

import java.util.Date;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IFormColors;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.statushandlers.StatusManager;

import com.amazonaws.AmazonClientException;
import com.amazonaws.eclipse.cloudformation.CloudFormationPlugin;
import com.amazonaws.eclipse.core.AWSClientFactory;
import com.amazonaws.eclipse.core.AwsToolkitCore;
import com.amazonaws.eclipse.core.regions.Region;
import com.amazonaws.eclipse.core.regions.RegionUtils;
import com.amazonaws.services.cloudformation.AmazonCloudFormation;
import com.amazonaws.services.cloudformation.model.DescribeStacksRequest;
import com.amazonaws.services.cloudformation.model.Stack;

public class StackEditor extends EditorPart {

    private StackEditorInput stackEditorInput;
    private Text stackNameLabel;
    private Text createdLabel;
    private Text statusLabel;
    private Text createTimeoutLabel;
    private Text statusReasonLabel;
    private Text lastUpdatedLabel;
    private Text descriptionLabel;
    private Text rollbackOnFailureLabel;
    
    private StackEventsTable stackEventsTable;
    private StackOutputsTable stackOutputsTable;
    private StackParametersTable stackParametersTable;
    private StackResourcesTable stackResourcesTable;

    @Override
    public void doSave(IProgressMonitor monitor) {}

    @Override
    public void doSaveAs() {}

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        setSite(site);
        setInput(input);
        setPartName(input.getName());
        this.stackEditorInput = (StackEditorInput)input;
    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }

    @Override
    public void createPartControl(Composite parent) {
        FormToolkit toolkit = new FormToolkit(Display.getDefault());
        ScrolledForm form = new ScrolledForm(parent, SWT.V_SCROLL);
        form.setExpandHorizontal(true);
        form.setExpandVertical(true);
        form.setBackground(toolkit.getColors().getBackground());
        form.setForeground(toolkit.getColors().getColor(IFormColors.TITLE));
        form.setFont(JFaceResources.getHeaderFont());

        form.setText(getFormTitle());
        toolkit.decorateFormHeading(form.getForm());
        form.setImage(AwsToolkitCore.getDefault().getImageRegistry().get(AwsToolkitCore.IMAGE_STACK));
        form.getBody().setLayout(new GridLayout());
        
     
        createSummarySection(form.getBody(), toolkit);
        createTabsSection(form.getBody(), toolkit);

        form.getToolBarManager().add(new RefreshAction());
        form.getToolBarManager().update(true);
        
        new LoadStackSummaryThread().start();
    }

    private String getFormTitle() {
        String formTitle = stackEditorInput.getName();
        Region region = RegionUtils.getRegionByEndpoint(stackEditorInput.getRegionEndpoint());
        if (region != null) {
            formTitle += " - " + region.getName();
        } else {
            formTitle += " - " + stackEditorInput.getRegionEndpoint();
        }
        return formTitle;
    }

    private void createSummarySection(Composite parent, FormToolkit toolkit) {
        GridDataFactory gridDataFactory = GridDataFactory.swtDefaults()
            .align(SWT.FILL, SWT.TOP).grab(true, false).minSize(200, SWT.DEFAULT).hint(200, SWT.DEFAULT);

        Composite composite = toolkit.createComposite(parent, SWT.NONE);
        composite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
        composite.setLayout(new GridLayout(4, false));

        toolkit.createLabel(composite, "Stack Name:");
        stackNameLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        gridDataFactory.applyTo(stackNameLabel);
        
        toolkit.createLabel(composite, "Created:");
        createdLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        gridDataFactory.applyTo(createdLabel);
        
        toolkit.createLabel(composite, "Status:");
        statusLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        gridDataFactory.applyTo(statusLabel);
        
        toolkit.createLabel(composite, "Create Timeout:");
        createTimeoutLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        gridDataFactory.applyTo(createTimeoutLabel);
        
        toolkit.createLabel(composite, "Status Reason:");
        statusReasonLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        gridDataFactory.applyTo(statusReasonLabel);
        
        toolkit.createLabel(composite, "Last Updated:");
        lastUpdatedLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        gridDataFactory.applyTo(lastUpdatedLabel);
        
        toolkit.createLabel(composite, "Rollback on Failure:");
        rollbackOnFailureLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE);
        toolkit.createLabel(composite, "");
        toolkit.createLabel(composite, "");
        
        Label l = toolkit.createLabel(composite, "Description:");
        gridDataFactory.copy().hint(100, SWT.DEFAULT).minSize(1, SWT.DEFAULT).align(SWT.LEFT, SWT.TOP).grab(false, false).applyTo(l);
        descriptionLabel = new Text(composite, SWT.READ_ONLY | SWT.NONE | SWT.MULTI | SWT.WRAP);
        gridDataFactory.copy().span(3, 1).applyTo(descriptionLabel);
    }

    private void createTabsSection(Composite parent, FormToolkit toolkit) {
        Composite tabsSection = toolkit.createComposite(parent, SWT.NONE);
        tabsSection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        tabsSection.setLayout(new FillLayout());
        
        TabFolder tabFolder = new TabFolder (tabsSection, SWT.BORDER);

        Rectangle clientArea = parent.getClientArea();
        tabFolder.setLocation(clientArea.x, clientArea.y);

        TabItem eventsTab = new TabItem(tabFolder, SWT.NONE);
        eventsTab.setText("Events");
        stackEventsTable = new StackEventsTable(tabFolder, toolkit, stackEditorInput);
        eventsTab.setControl(stackEventsTable);

        TabItem resourcesTab = new TabItem(tabFolder, SWT.NONE);
        resourcesTab.setText("Resources");
        stackResourcesTable = new StackResourcesTable(tabFolder, toolkit, stackEditorInput);
        resourcesTab.setControl(stackResourcesTable);

        TabItem parametersTab = new TabItem(tabFolder, SWT.NONE);
        parametersTab.setText("Parameters");
        stackParametersTable = new StackParametersTable(tabFolder, toolkit);
        parametersTab.setControl(stackParametersTable);
        
        TabItem outputsTab = new TabItem(tabFolder, SWT.NONE);
        outputsTab.setText("Outputs");
        stackOutputsTable = new StackOutputsTable(tabFolder, toolkit);
        outputsTab.setControl(stackOutputsTable);
        
        tabFolder.pack();
    }
    
    @Override
    public void setFocus() {}

    private AmazonCloudFormation getClient() {
        AWSClientFactory clientFactory = AwsToolkitCore.getClientFactory(stackEditorInput.getAccountId());
        return clientFactory.getCloudFormationClientByEndpoint(stackEditorInput.getRegionEndpoint());
    }

    private class LoadStackSummaryThread extends Thread {
        
        private Stack describeStack() {
            DescribeStacksRequest request = new DescribeStacksRequest().withStackName(stackEditorInput.getStackName());
            List<Stack> stacks = getClient().describeStacks(request).getStacks();
            
            if (stacks.size() == 0) {
                return new Stack();
            } else  if (stacks.size() > 1) {
                throw new RuntimeException("Unexpected number of stacks returned");
            } 
            
            return stacks.get(0);
        }
        
        @Override
        public void run() {
            try {
                final Stack stack = describeStack();
                Display.getDefault().asyncExec(new Runnable() {
                    public void run() {
                        descriptionLabel.setText(stack.getDescription());
                        lastUpdatedLabel.setText(valueOrDefault(stack.getLastUpdatedTime(), "N/A"));
                        stackNameLabel.setText(stack.getStackName());
                        statusLabel.setText(stack.getStackStatus());
                        statusReasonLabel.setText(stack.getStackStatusReason());
                        createdLabel.setText(valueOrDefault(stack.getCreationTime(), "N/A"));
                        createTimeoutLabel.setText(valueOrDefault(stack.getTimeoutInMinutes(), "N/A"));
                        
                        Boolean disableRollback = stack.getDisableRollback();
                        if (disableRollback != null) disableRollback = !disableRollback;
                        rollbackOnFailureLabel.setText(booleanYesOrNo(disableRollback));
    
                        stackNameLabel.getParent().layout();
                        stackNameLabel.getParent().getParent().layout(true);
                        
                        stackOutputsTable.setStackOutputs(stack.getOutputs());
                        stackParametersTable.setStackParameters(stack.getParameters());
                    }
                });
            } catch (Exception e) {
                Status status = new Status(IStatus.WARNING, CloudFormationPlugin.PLUGIN_ID, "Unable to describe stack " + stackEditorInput.getStackName(), e);
                StatusManager.getManager().handle(status, StatusManager.LOG | StatusManager.SHOW);
            }
        }
        
        private String booleanYesOrNo(Boolean b) {
            if (b == null) return "";
            if (b == true) return "Yes";
            else return "No";
        }

        private String valueOrDefault(Date date, String defaultValue) {
            if (date != null) return date.toString();
            else return defaultValue;
        }
        
        private String valueOrDefault(Integer integer, String defaultValue) {
            if (integer != null) return integer.toString();
            else return defaultValue;
        }
        
        private String valueOrDefault(String value, String defaultValue) {
            if (value != null) return value;
            else return defaultValue;
        }
    }
    
    private class RefreshAction extends Action {
        public RefreshAction() {
            this.setText("Refresh");
            this.setToolTipText("Refresh stack information");
            this.setImageDescriptor(AwsToolkitCore.getDefault().getImageRegistry().getDescriptor(AwsToolkitCore.IMAGE_REFRESH));
        }
        
        @Override
        public void run() {
            new LoadStackSummaryThread().start();
            stackEventsTable.refresh();
            stackResourcesTable.refresh();
        }
    }
    
}
