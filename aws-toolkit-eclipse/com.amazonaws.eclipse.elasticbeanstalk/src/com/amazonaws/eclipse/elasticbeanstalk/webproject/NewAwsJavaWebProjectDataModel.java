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

import com.amazonaws.eclipse.core.regions.Region;

/**
 * Data model containing all the options for creating a new AWS Java web
 * project. Used by the New AWS Java Web Project Wizard to collect information
 * from users, bind UI controls to values, and pass the data to the runnable
 * objects to actually perform the project creation.
 */
class NewAwsJavaWebProjectDataModel {

    private String accountId;
    private String projectName;
    private boolean sampleAppIncluded;
    private String language;
    private Region region;

    public static final String ACCOUNT_ID = "accountId";
    public static final String PROJECT_NAME = "projectName";
    public static final String SAMPLE_APP_INCLUDED = "sampleAppIncluded";
    public static final String REGION = "region";
    public static final String LANGUAGE = "language";

    /*
     * Supported languages and map of languages to directories and overrides
     */
    public static final String ENGLISH = "English";
    public static final String JAPANESE = "Japanese";
    public static final String[] LANGUAGES = new String[] { ENGLISH, JAPANESE };

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public boolean isSampleAppIncluded() {
        return sampleAppIncluded;
    }

    public void setSampleAppIncluded(boolean sampleAppIncluded) {
        this.sampleAppIncluded = sampleAppIncluded;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
