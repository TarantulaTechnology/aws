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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#deleteApp(DeleteAppRequest) DeleteApp operation}.
 * <p>
 * Deletes a specified app.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#deleteApp(DeleteAppRequest)
 */
public class DeleteAppRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The app ID.
     */
    private String appId;

    /**
     * The app ID.
     *
     * @return The app ID.
     */
    public String getAppId() {
        return appId;
    }
    
    /**
     * The app ID.
     *
     * @param appId The app ID.
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
    
    /**
     * The app ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appId The app ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteAppRequest withAppId(String appId) {
        this.appId = appId;
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
        if (getAppId() != null) sb.append("AppId: " + getAppId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteAppRequest == false) return false;
        DeleteAppRequest other = (DeleteAppRequest)obj;
        
        if (other.getAppId() == null ^ this.getAppId() == null) return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false) return false; 
        return true;
    }
    
}
    