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
package com.amazonaws.services.dynamodbv2.model;

/**
 * Return Consumed Capacity
 */
public enum ReturnConsumedCapacity {
    
    TOTAL("TOTAL"),
    NONE("NONE");

    private String value;

    private ReturnConsumedCapacity(String value) {
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
     * @return ReturnConsumedCapacity corresponding to the value
     */
    public static ReturnConsumedCapacity fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("TOTAL".equals(value)) {
            return ReturnConsumedCapacity.TOTAL;
        } else if ("NONE".equals(value)) {
            return ReturnConsumedCapacity.NONE;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    