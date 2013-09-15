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
package com.amazonaws.services.directconnect.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#createConnection(CreateConnectionRequest) CreateConnection operation}.
 * <p>
 * Creates a new network connection between the customer network and a specific AWS Direct Connect location.
 * </p>
 * <p>
 * A connection links your internal network to an AWS Direct Connect location over a standard 1 gigabit or 10 gigabit Ethernet fiber-optic cable. One end
 * of the cable is connected to your router, the other to an AWS Direct Connect router. A Direct Connect location provides access to Amazon Web Services
 * in the region it is associated with. You can establish connections with AWS Direct Connect locations in multiple regions, but a connection in one
 * region does not provide connectivity to other regions.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#createConnection(CreateConnectionRequest)
 */
public class CreateConnectionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     */
    private String offeringId;

    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     */
    private String connectionName;

    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     *
     * @return The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     *         None
     */
    public String getOfferingId() {
        return offeringId;
    }
    
    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     *
     * @param offeringId The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     *         None
     */
    public void setOfferingId(String offeringId) {
        this.offeringId = offeringId;
    }
    
    /**
     * The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     * None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param offeringId The ID of the offering. <p>Example: us-west-1_EqSV5_1G <p>Default:
     *         None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConnectionRequest withOfferingId(String offeringId) {
        this.offeringId = offeringId;
        return this;
    }
    
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     *
     * @return The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     */
    public String getConnectionName() {
        return connectionName;
    }
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     *
     * @param connectionName The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     */
    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }
    
    /**
     * The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionName The name of the connection. <p>Example: "<i>1G Connection to AWS</i>"
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateConnectionRequest withConnectionName(String connectionName) {
        this.connectionName = connectionName;
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
        if (getOfferingId() != null) sb.append("OfferingId: " + getOfferingId() + ",");
        if (getConnectionName() != null) sb.append("ConnectionName: " + getConnectionName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOfferingId() == null) ? 0 : getOfferingId().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateConnectionRequest == false) return false;
        CreateConnectionRequest other = (CreateConnectionRequest)obj;
        
        if (other.getOfferingId() == null ^ this.getOfferingId() == null) return false;
        if (other.getOfferingId() != null && other.getOfferingId().equals(this.getOfferingId()) == false) return false; 
        if (other.getConnectionName() == null ^ this.getConnectionName() == null) return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false) return false; 
        return true;
    }
    
}
    