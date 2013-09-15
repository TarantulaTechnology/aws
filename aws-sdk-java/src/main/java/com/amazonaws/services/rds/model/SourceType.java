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
package com.amazonaws.services.rds.model;

/**
 * Source Type
 */
public enum SourceType {
    
    DbInstance("db-instance"),
    DbParameterGroup("db-parameter-group"),
    DbSecurityGroup("db-security-group"),
    DbSnapshot("db-snapshot");

    private String value;

    private SourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return SourceType corresponding to the value
     */
    public static SourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("db-instance".equals(value)) {
            return SourceType.DbInstance;
        } else if ("db-parameter-group".equals(value)) {
            return SourceType.DbParameterGroup;
        } else if ("db-security-group".equals(value)) {
            return SourceType.DbSecurityGroup;
        } else if ("db-snapshot".equals(value)) {
            return SourceType.DbSnapshot;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    