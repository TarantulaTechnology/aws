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
package com.amazonaws.services.opsworks.model;
import java.io.Serializable;

/**
 * <p>
 * Contains the response to a <code>CreateStack</code> request.
 * </p>
 */
public class CreateStackResult implements Serializable {

    /**
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     */
    private String stackId;

    /**
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     *
     * @return The stack ID, which is an opaque string that you use to identify the
     *         stack when performing actions such as <code>DescribeStacks</code>.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     *
     * @param stackId The stack ID, which is an opaque string that you use to identify the
     *         stack when performing actions such as <code>DescribeStacks</code>.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID, which is an opaque string that you use to identify the
     *         stack when performing actions such as <code>DescribeStacks</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateStackResult withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateStackResult == false) return false;
        CreateStackResult other = (CreateStackResult)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        return true;
    }
    
}
    