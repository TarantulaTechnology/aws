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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#resetDBParameterGroup(ResetDBParameterGroupRequest) ResetDBParameterGroup operation}.
 * <p>
 * Modifies the parameters of a DBParameterGroup to the engine/system default value. To reset specific parameters submit a list of the following:
 * ParameterName and ApplyMethod. To reset the entire DBParameterGroup specify the DBParameterGroup name and ResetAllParameters parameters. When
 * resetting the entire group, dynamic parameters are updated immediately and static parameters are set to pending-reboot to take effect on the next DB
 * instance restart or RebootDBInstance request.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#resetDBParameterGroup(ResetDBParameterGroupRequest)
 */
public class ResetDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     * to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     */
    private String dBParameterGroupName;

    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB Parameter Group to default values.
     * <p>Default: <code>true</code>
     */
    private Boolean resetAllParameters;

    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p><b>MySQL</b>
     * <p>Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code> <p>You can use the immediate value with
     * dynamic parameters only. You can use the <code>pending-reboot</code>
     * value for both dynamic and static parameters, and changes are applied
     * when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     * method): <code>pending-reboot</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parameters;

    /**
     * Default constructor for a new ResetDBParameterGroupRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ResetDBParameterGroupRequest() {}
    


    /**
     * Constructs a new ResetDBParameterGroupRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param dBParameterGroupName The name of the DB Parameter Group.
     * <p>Constraints: <ul> <li>Must be 1 to 255 alphanumeric characters</li>
     * <li>First character must be a letter</li> <li>Cannot end with a hyphen
     * or contain two consecutive hyphens</li> </ul>
     */
    public ResetDBParameterGroupRequest(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
    }

    
    
    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     * to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @return The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     *         to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     * to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     *
     * @param dBParameterGroupName The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     *         to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }
    
    /**
     * The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     * to 255 alphanumeric characters</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBParameterGroupName The name of the DB Parameter Group. <p>Constraints: <ul> <li>Must be 1
     *         to 255 alphanumeric characters</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB Parameter Group to default values.
     * <p>Default: <code>true</code>
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         reset all parameters in the DB Parameter Group to default values.
     *         <p>Default: <code>true</code>
     */
    public Boolean isResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB Parameter Group to default values.
     * <p>Default: <code>true</code>
     *
     * @param resetAllParameters Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         reset all parameters in the DB Parameter Group to default values.
     *         <p>Default: <code>true</code>
     */
    public void setResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
    }
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB Parameter Group to default values.
     * <p>Default: <code>true</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resetAllParameters Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         reset all parameters in the DB Parameter Group to default values.
     *         <p>Default: <code>true</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetDBParameterGroupRequest withResetAllParameters(Boolean resetAllParameters) {
        this.resetAllParameters = resetAllParameters;
        return this;
    }
    
    
    /**
     * Specifies whether (<code>true</code>) or not (<code>false</code>) to
     * reset all parameters in the DB Parameter Group to default values.
     * <p>Default: <code>true</code>
     *
     * @return Specifies whether (<code>true</code>) or not (<code>false</code>) to
     *         reset all parameters in the DB Parameter Group to default values.
     *         <p>Default: <code>true</code>
     */
    public Boolean getResetAllParameters() {
        return resetAllParameters;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p><b>MySQL</b>
     * <p>Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code> <p>You can use the immediate value with
     * dynamic parameters only. You can use the <code>pending-reboot</code>
     * value for both dynamic and static parameters, and changes are applied
     * when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     * method): <code>pending-reboot</code>
     *
     * @return An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p><b>MySQL</b>
     *         <p>Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code> <p>You can use the immediate value with
     *         dynamic parameters only. You can use the <code>pending-reboot</code>
     *         value for both dynamic and static parameters, and changes are applied
     *         when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     *         method): <code>pending-reboot</code>
     */
    public java.util.List<Parameter> getParameters() {
        
        if (parameters == null) {
              parameters = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>();
              parameters.setAutoConstruct(true);
        }
        return parameters;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p><b>MySQL</b>
     * <p>Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code> <p>You can use the immediate value with
     * dynamic parameters only. You can use the <code>pending-reboot</code>
     * value for both dynamic and static parameters, and changes are applied
     * when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     * method): <code>pending-reboot</code>
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p><b>MySQL</b>
     *         <p>Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code> <p>You can use the immediate value with
     *         dynamic parameters only. You can use the <code>pending-reboot</code>
     *         value for both dynamic and static parameters, and changes are applied
     *         when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     *         method): <code>pending-reboot</code>
     */
    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
        parametersCopy.addAll(parameters);
        this.parameters = parametersCopy;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p><b>MySQL</b>
     * <p>Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code> <p>You can use the immediate value with
     * dynamic parameters only. You can use the <code>pending-reboot</code>
     * value for both dynamic and static parameters, and changes are applied
     * when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     * method): <code>pending-reboot</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p><b>MySQL</b>
     *         <p>Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code> <p>You can use the immediate value with
     *         dynamic parameters only. You can use the <code>pending-reboot</code>
     *         value for both dynamic and static parameters, and changes are applied
     *         when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     *         method): <code>pending-reboot</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetDBParameterGroupRequest withParameters(Parameter... parameters) {
        if (getParameters() == null) setParameters(new java.util.ArrayList<Parameter>(parameters.length));
        for (Parameter value : parameters) {
            getParameters().add(value);
        }
        return this;
    }
    
    /**
     * An array of parameter names, values, and the apply method for the
     * parameter update. At least one parameter name, value, and apply method
     * must be supplied; subsequent arguments are optional. A maximum of 20
     * parameters may be modified in a single request. <p><b>MySQL</b>
     * <p>Valid Values (for Apply method): <code>immediate</code> |
     * <code>pending-reboot</code> <p>You can use the immediate value with
     * dynamic parameters only. You can use the <code>pending-reboot</code>
     * value for both dynamic and static parameters, and changes are applied
     * when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     * method): <code>pending-reboot</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param parameters An array of parameter names, values, and the apply method for the
     *         parameter update. At least one parameter name, value, and apply method
     *         must be supplied; subsequent arguments are optional. A maximum of 20
     *         parameters may be modified in a single request. <p><b>MySQL</b>
     *         <p>Valid Values (for Apply method): <code>immediate</code> |
     *         <code>pending-reboot</code> <p>You can use the immediate value with
     *         dynamic parameters only. You can use the <code>pending-reboot</code>
     *         value for both dynamic and static parameters, and changes are applied
     *         when DB Instance reboots. <p><b>Oracle</b> <p>Valid Values (for Apply
     *         method): <code>pending-reboot</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ResetDBParameterGroupRequest withParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Parameter> parametersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Parameter>(parameters.size());
            parametersCopy.addAll(parameters);
            this.parameters = parametersCopy;
        }

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
        if (getDBParameterGroupName() != null) sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (isResetAllParameters() != null) sb.append("ResetAllParameters: " + isResetAllParameters() + ",");
        if (getParameters() != null) sb.append("Parameters: " + getParameters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode()); 
        hashCode = prime * hashCode + ((isResetAllParameters() == null) ? 0 : isResetAllParameters().hashCode()); 
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ResetDBParameterGroupRequest == false) return false;
        ResetDBParameterGroupRequest other = (ResetDBParameterGroupRequest)obj;
        
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null) return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false) return false; 
        if (other.isResetAllParameters() == null ^ this.isResetAllParameters() == null) return false;
        if (other.isResetAllParameters() != null && other.isResetAllParameters().equals(this.isResetAllParameters()) == false) return false; 
        if (other.getParameters() == null ^ this.getParameters() == null) return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false) return false; 
        return true;
    }
    
}
    