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
package com.amazonaws.services.identitymanagement.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest) UpdateAssumeRolePolicy operation}.
 * <p>
 * Updates the policy that grants an entity permission to assume a role. Currently, only an Amazon EC2 instance can assume a role. For more information
 * about roles, go to <a href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest)
 */
public class UpdateAssumeRolePolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the role to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleName;

    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String policyDocument;

    /**
     * Name of the role to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the role to update.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * Name of the role to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to update.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * Name of the role to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to update.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAssumeRolePolicyRequest withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    
    
    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The policy that grants an entity permission to assume the role.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policyDocument The policy that grants an entity permission to assume the role.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The policy that grants an entity permission to assume the role.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 131072<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param policyDocument The policy that grants an entity permission to assume the role.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAssumeRolePolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
        if (getRoleName() != null) sb.append("RoleName: " + getRoleName() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAssumeRolePolicyRequest == false) return false;
        UpdateAssumeRolePolicyRequest other = (UpdateAssumeRolePolicyRequest)obj;
        
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        return true;
    }
    
}
    