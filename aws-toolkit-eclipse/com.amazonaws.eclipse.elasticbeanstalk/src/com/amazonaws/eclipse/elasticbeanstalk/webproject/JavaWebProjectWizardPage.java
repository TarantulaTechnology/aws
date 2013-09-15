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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.databinding.AggregateValidationStatus;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.PojoObservables;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.validation.IValidator;
import org.eclipse.core.databinding.validation.ValidationStatus;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import com.amazonaws.eclipse.core.AwsToolkitCore;
import com.amazonaws.eclipse.core.regions.Region;
import com.amazonaws.eclipse.core.regions.RegionUtils;
import com.amazonaws.eclipse.core.regions.ServiceAbbreviations;
import com.amazonaws.eclipse.core.ui.AccountSelectionComposite;

final class JavaWebProjectWizardPage extends WizardPage {
    private Text projectNameText;
    private Button basicTemplateRadioButton;
    private Button travelLogRadioButton;
    private AccountSelectionComposite accountSelectionComposite;

    private final NewAwsJavaWebProjectDataModel dataModel;
    private DataBindingContext bindingContext = new DataBindingContext();

    /** Collective status of all validators in our binding context */
    protected AggregateValidationStatus aggregateValidationStatus =
        new AggregateValidationStatus(bindingContext, AggregateValidationStatus.MAX_SEVERITY);
    private Combo regionCombo;
    private Combo languageCombo;


    JavaWebProjectWizardPage(NewAwsJavaWebProjectDataModel dataModel) {
        super("New AWS Java Web Project Wizard Page");
        this.dataModel = dataModel;

        this.setTitle("New AWS Java Web Project");
        this.setDescription("Configure the options for creating a new AWS Java web project.");

        aggregateValidationStatus.addChangeListener(new IChangeListener() {
            public void handleChange(ChangeEvent event) {
                Object value = aggregateValidationStatus.getValue();
                if (value instanceof IStatus == false) return;

                IStatus status = (IStatus)value;
                if (status.getSeverity() == IStatus.OK) {
                    setMessage(null);
                    setErrorMessage(null);
                    setPageComplete(true);
                } else {
                    if (status.getSeverity() == IStatus.ERROR) {
                        setErrorMessage(status.getMessage());
                    } else {
                        setMessage(status.getMessage());
                    }
                    setPageComplete(false);
                }
            }
        });
    }

    public void createControl(Composite parent) {
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayout layout = new GridLayout(2, false);
        layout.verticalSpacing = 10;
        composite.setLayout(layout);
        this.setControl(composite);

        new Label(composite, SWT.NONE).setText("Project name: ");
        projectNameText = new Text(composite, SWT.BORDER);
        projectNameText.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
        layoutData.horizontalSpan = 2;
        layoutData.minimumWidth = 100;
        layoutData.widthHint = 500;

        Group group = new Group(composite, SWT.NONE);
        group.setLayoutData(layoutData);
        group.setLayout(new FillLayout());
        accountSelectionComposite = new AccountSelectionComposite(group, SWT.None);

        dataModel.setAccountId(AwsToolkitCore.getDefault().getCurrentAccountId());
        accountSelectionComposite.selectAccountId(dataModel.getAccountId());

        dataModel.setSampleAppIncluded(false);
        createSamplesGroup(composite);

        bindControls();
    }

    private void createSamplesGroup(Composite composite) {
        Group group = new Group(composite, SWT.NONE);
        group.setText("Start from:");
        GridLayout layout = new GridLayout(1, false);
        layout.verticalSpacing = 3;
        group.setLayout(layout);
        GridData layoutData = new GridData(SWT.FILL, SWT.TOP, true, false);
        layoutData.horizontalSpan = 2;
        group.setLayoutData(layoutData);

        basicTemplateRadioButton = new Button(group, SWT.RADIO);
        basicTemplateRadioButton.setText("Basic Java Web Application");
        basicTemplateRadioButton.setSelection(true);
        Label basicTemplateDescriptionLabel = new Label(group, SWT.WRAP);
        basicTemplateDescriptionLabel.setText("A simple Java web application with a single JSP.");
        GridData gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.horizontalIndent = 20;
        gridData.widthHint = 100;
        basicTemplateDescriptionLabel.setLayoutData(gridData);

        travelLogRadioButton = new Button(group, SWT.RADIO);
        travelLogRadioButton.setText("Travel Log - Sample Java Web Application");
        gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.verticalIndent = 5;
        travelLogRadioButton.setLayoutData(gridData);
        Label travelLogDescriptionLabel = new Label(group, SWT.WRAP);
        gridData = new GridData(SWT.FILL, SWT.TOP, true, false);
        gridData.horizontalIndent = 20;
        gridData.widthHint = 100;
        travelLogDescriptionLabel.setLayoutData(gridData);
        travelLogDescriptionLabel.setText("A Java web application demonstrating the use of Amazon S3, Amazon SimpleDB, and Amazon SNS.");

        Composite regionAndLanguage = new Composite(group, SWT.None);
        GridLayoutFactory.fillDefaults().numColumns(2).margins(30, 10).applyTo(regionAndLanguage);

        final List<Control> controlsToEnable = new LinkedList<Control>();
        
        Label regionLabel = new Label(regionAndLanguage, SWT.READ_ONLY);
        regionLabel.setText("Use services in this region: ");
        controlsToEnable.add(regionLabel);

        regionCombo = new Combo(regionAndLanguage, SWT.DROP_DOWN | SWT.READ_ONLY);
        for ( Region region : RegionUtils.getRegionsForService(ServiceAbbreviations.BEANSTALK) ) {
            regionCombo.add(region.getName());
            regionCombo.setData(region.getName(), region);
        }
        regionCombo.select(0);
        controlsToEnable.add(regionCombo);

        SelectionAdapter regionListener = new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                dataModel.setRegion((Region) regionCombo.getData(regionCombo.getText()));
            }
        };
        regionCombo.addSelectionListener(regionListener);
        regionListener.widgetSelected(null);

        Label languageLabel = new Label(regionAndLanguage, SWT.READ_ONLY);
        languageLabel.setText("Language: ");
        controlsToEnable.add(languageLabel);

        languageCombo = new Combo(regionAndLanguage, SWT.DROP_DOWN | SWT.READ_ONLY);
        for ( String lang : NewAwsJavaWebProjectDataModel.LANGUAGES ) {
            languageCombo.add(lang);
        }
        languageCombo.select(0);
        controlsToEnable.add(languageCombo);

        SelectionAdapter travelLogSelectionListener = new SelectionAdapter() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                for ( Control control : controlsToEnable ) {
                    control.setEnabled(travelLogRadioButton.getSelection());
                }
            }
        };
        travelLogRadioButton.addSelectionListener(travelLogSelectionListener);
        travelLogSelectionListener.widgetSelected(null);
    }

    @SuppressWarnings("static-access")
    private void bindControls() {
        UpdateValueStrategy projectNameUpdateStrategy = new UpdateValueStrategy();
        projectNameUpdateStrategy.setAfterConvertValidator(new NewProjectNameValidator());

        bindingContext.bindValue(
                SWTObservables.observeText(projectNameText, SWT.Modify),
                PojoObservables.observeValue(dataModel, dataModel.PROJECT_NAME),
                projectNameUpdateStrategy, null);
        
        final IObservableValue accountId = new WritableValue();
        accountId.setValue(dataModel.getAccountId());
        accountSelectionComposite.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                accountId.setValue(accountSelectionComposite.getSelectedAccountId());
            }
        });
        bindingContext.bindValue(accountId,
                PojoObservables.observeValue(dataModel, dataModel.ACCOUNT_ID), new UpdateValueStrategy(
                        UpdateValueStrategy.POLICY_UPDATE), new UpdateValueStrategy(UpdateValueStrategy.POLICY_NEVER));
        bindingContext.bindValue(SWTObservables.observeSelection(travelLogRadioButton),
                PojoObservables.observeValue(dataModel, dataModel.SAMPLE_APP_INCLUDED), null, null)
                .updateTargetToModel();
        bindingContext.bindValue(SWTObservables.observeSelection(languageCombo),
                PojoObservables.observeValue(dataModel, dataModel.LANGUAGE), null, null).updateTargetToModel();
    }

    /**
     * Simple validator implementation that validates that the associated value
     * is not empty and does not match an existing project in the workspace.
     */
    private static class NewProjectNameValidator implements IValidator {
        public IStatus validate(Object obj) {
            String value = (String)obj;

            if (value == null || value.trim().length() == 0) {
                String errorMessage = "Enter a project name.";
                return ValidationStatus.info(errorMessage);
            }

            for (IProject existingProject : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
                if (existingProject.getName().equals(value)) {
                    String errorMessage = "Project '" + value + "' already exists in the workspace";
                    return ValidationStatus.error(errorMessage);
                }
            }

            return Status.OK_STATUS;
        }
    }
}
