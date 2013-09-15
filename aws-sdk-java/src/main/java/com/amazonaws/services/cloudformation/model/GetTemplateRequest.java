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
package com.amazonaws.services.cloudformation.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudformation.AmazonCloudFormation#getTemplate(GetTemplateRequest) GetTemplate operation}.
 * <p>
 * Returns the template body for a specified stack name. You can get the template for running or deleted stacks.
 * </p>
 * <p>
 * For deleted stacks, GetTemplate returns the template for up to 90 days after the stack has been deleted.
 * </p>
 * <p>
 * <b>NOTE:</b> If the template does not exist, a ValidationError is returned.
 * </p>
 *
 * @see com.amazonaws.services.cloudformation.AmazonCloudFormation#getTemplate(GetTemplateRequest)
 */
public class GetTemplateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name or the unique identifier associated with the stack.
     */
    private String stackName;

    /**
     * The name or the unique identifier associated with the stack.
     *
     * @return The name or the unique identifier associated with the stack.
     */
    public String getStackName() {
        return stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack.
     *
     * @param stackName The name or the unique identifier associated with the stack.
     */
    public void setStackName(String stackName) {
        this.stackName = stackName;
    }
    
    /**
     * The name or the unique identifier associated with the stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackName The name or the unique identifier associated with the stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetTemplateRequest withStackName(String stackName) {
        this.stackName = stackName;
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
        if (getStackName() != null) sb.append("StackName: " + getStackName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetTemplateRequest == false) return false;
        GetTemplateRequest other = (GetTemplateRequest)obj;
        
        if (other.getStackName() == null ^ this.getStackName() == null) return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false) return false; 
        return true;
    }
    
}
    