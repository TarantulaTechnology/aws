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
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#deleteEventSubscription(DeleteEventSubscriptionRequest) DeleteEventSubscription operation}.
 * <p>
 * Deletes an RDS event notification subscription.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#deleteEventSubscription(DeleteEventSubscriptionRequest)
 */
public class DeleteEventSubscriptionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the RDS event notification subscription you want to
     * delete.
     */
    private String subscriptionName;

    /**
     * The name of the RDS event notification subscription you want to
     * delete.
     *
     * @return The name of the RDS event notification subscription you want to
     *         delete.
     */
    public String getSubscriptionName() {
        return subscriptionName;
    }
    
    /**
     * The name of the RDS event notification subscription you want to
     * delete.
     *
     * @param subscriptionName The name of the RDS event notification subscription you want to
     *         delete.
     */
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    /**
     * The name of the RDS event notification subscription you want to
     * delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param subscriptionName The name of the RDS event notification subscription you want to
     *         delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteEventSubscriptionRequest withSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
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
        if (getSubscriptionName() != null) sb.append("SubscriptionName: " + getSubscriptionName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSubscriptionName() == null) ? 0 : getSubscriptionName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteEventSubscriptionRequest == false) return false;
        DeleteEventSubscriptionRequest other = (DeleteEventSubscriptionRequest)obj;
        
        if (other.getSubscriptionName() == null ^ this.getSubscriptionName() == null) return false;
        if (other.getSubscriptionName() != null && other.getSubscriptionName().equals(this.getSubscriptionName()) == false) return false; 
        return true;
    }
    
}
    