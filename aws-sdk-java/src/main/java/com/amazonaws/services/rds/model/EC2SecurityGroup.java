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
import java.io.Serializable;

/**
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * 
 * <ul>
 * <li> AuthorizeDBSecurityGroupIngress </li>
 * <li> DescribeDBSecurityGroups </li>
 * <li> RevokeDBSecurityGroupIngress </li>
 * 
 * </ul>
 */
public class EC2SecurityGroup implements Serializable {

    /**
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     */
    private String status;

    /**
     * Specifies the name of the EC2 Security Group.
     */
    private String eC2SecurityGroupName;

    /**
     * Specifies the id of the EC2 Security Group.
     */
    private String eC2SecurityGroupId;

    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <code>EC2SecurityGroupName</code> field.
     */
    private String eC2SecurityGroupOwnerId;

    /**
     * Default constructor for a new EC2SecurityGroup object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EC2SecurityGroup() {}
    
    /**
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     *
     * @return Provides the status of the EC2 security group. Status can be
     *         "authorizing", "authorized", "revoking", and "revoked".
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     *
     * @param status Provides the status of the EC2 security group. Status can be
     *         "authorizing", "authorized", "revoking", and "revoked".
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Provides the status of the EC2 security group. Status can be
     * "authorizing", "authorized", "revoking", and "revoked".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Provides the status of the EC2 security group. Status can be
     *         "authorizing", "authorized", "revoking", and "revoked".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EC2SecurityGroup withStatus(String status) {
        this.status = status;
        return this;
    }
    
    
    /**
     * Specifies the name of the EC2 Security Group.
     *
     * @return Specifies the name of the EC2 Security Group.
     */
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }
    
    /**
     * Specifies the name of the EC2 Security Group.
     *
     * @param eC2SecurityGroupName Specifies the name of the EC2 Security Group.
     */
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }
    
    /**
     * Specifies the name of the EC2 Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupName Specifies the name of the EC2 Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EC2SecurityGroup withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }
    
    
    /**
     * Specifies the id of the EC2 Security Group.
     *
     * @return Specifies the id of the EC2 Security Group.
     */
    public String getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }
    
    /**
     * Specifies the id of the EC2 Security Group.
     *
     * @param eC2SecurityGroupId Specifies the id of the EC2 Security Group.
     */
    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }
    
    /**
     * Specifies the id of the EC2 Security Group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupId Specifies the id of the EC2 Security Group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EC2SecurityGroup withEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }
    
    
    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <code>EC2SecurityGroupName</code> field.
     *
     * @return Specifies the AWS ID of the owner of the EC2 security group specified
     *         in the <code>EC2SecurityGroupName</code> field.
     */
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }
    
    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <code>EC2SecurityGroupName</code> field.
     *
     * @param eC2SecurityGroupOwnerId Specifies the AWS ID of the owner of the EC2 security group specified
     *         in the <code>EC2SecurityGroupName</code> field.
     */
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }
    
    /**
     * Specifies the AWS ID of the owner of the EC2 security group specified
     * in the <code>EC2SecurityGroupName</code> field.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eC2SecurityGroupOwnerId Specifies the AWS ID of the owner of the EC2 security group specified
     *         in the <code>EC2SecurityGroupName</code> field.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EC2SecurityGroup withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
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
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getEC2SecurityGroupName() != null) sb.append("EC2SecurityGroupName: " + getEC2SecurityGroupName() + ",");
        if (getEC2SecurityGroupId() != null) sb.append("EC2SecurityGroupId: " + getEC2SecurityGroupId() + ",");
        if (getEC2SecurityGroupOwnerId() != null) sb.append("EC2SecurityGroupOwnerId: " + getEC2SecurityGroupOwnerId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupName() == null) ? 0 : getEC2SecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupId() == null) ? 0 : getEC2SecurityGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getEC2SecurityGroupOwnerId() == null) ? 0 : getEC2SecurityGroupOwnerId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EC2SecurityGroup == false) return false;
        EC2SecurityGroup other = (EC2SecurityGroup)obj;
        
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getEC2SecurityGroupName() == null ^ this.getEC2SecurityGroupName() == null) return false;
        if (other.getEC2SecurityGroupName() != null && other.getEC2SecurityGroupName().equals(this.getEC2SecurityGroupName()) == false) return false; 
        if (other.getEC2SecurityGroupId() == null ^ this.getEC2SecurityGroupId() == null) return false;
        if (other.getEC2SecurityGroupId() != null && other.getEC2SecurityGroupId().equals(this.getEC2SecurityGroupId()) == false) return false; 
        if (other.getEC2SecurityGroupOwnerId() == null ^ this.getEC2SecurityGroupOwnerId() == null) return false;
        if (other.getEC2SecurityGroupOwnerId() != null && other.getEC2SecurityGroupOwnerId().equals(this.getEC2SecurityGroupOwnerId()) == false) return false; 
        return true;
    }
    
}
    