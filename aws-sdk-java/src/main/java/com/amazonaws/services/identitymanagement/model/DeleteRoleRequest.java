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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteRole(DeleteRoleRequest) DeleteRole operation}.
 * <p>
 * Deletes the specified role. The role must not have any policies attached. For more information about roles, go to <a
 * href="http://docs.amazonwebservices.com/IAM/latest/UserGuide/WorkingWithRoles.html"> Working with Roles </a> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b>Make sure you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile
 * that is associated with a running instance will break any applications running on the instance.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#deleteRole(DeleteRoleRequest)
 */
public class DeleteRoleRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the role to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String roleName;

    /**
     * Name of the role to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the role to delete.
     */
    public String getRoleName() {
        return roleName;
    }
    
    /**
     * Name of the role to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to delete.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    /**
     * Name of the role to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param roleName Name of the role to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteRoleRequest withRoleName(String roleName) {
        this.roleName = roleName;
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
        if (getRoleName() != null) sb.append("RoleName: " + getRoleName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteRoleRequest == false) return false;
        DeleteRoleRequest other = (DeleteRoleRequest)obj;
        
        if (other.getRoleName() == null ^ this.getRoleName() == null) return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false) return false; 
        return true;
    }
    
}
    