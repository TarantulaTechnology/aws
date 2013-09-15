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
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest) SetTimeBasedAutoScaling operation}.
 * <p>
 * Specify the time-based auto scaling configuration for a specified instance. For more information, see <a
 * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workinginstances-autoscaling.html"> Managing Load with Time-based and Load-based Instances
 * </a> .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#setTimeBasedAutoScaling(SetTimeBasedAutoScalingRequest)
 */
public class SetTimeBasedAutoScalingRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The instance ID.
     */
    private String instanceId;

    /**
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     */
    private WeeklyAutoScalingSchedule autoScalingSchedule;

    /**
     * The instance ID.
     *
     * @return The instance ID.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID.
     *
     * @param instanceId The instance ID.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetTimeBasedAutoScalingRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    
    
    /**
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     *
     * @return An <code>AutoScalingSchedule</code> with the instance schedule.
     */
    public WeeklyAutoScalingSchedule getAutoScalingSchedule() {
        return autoScalingSchedule;
    }
    
    /**
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     *
     * @param autoScalingSchedule An <code>AutoScalingSchedule</code> with the instance schedule.
     */
    public void setAutoScalingSchedule(WeeklyAutoScalingSchedule autoScalingSchedule) {
        this.autoScalingSchedule = autoScalingSchedule;
    }
    
    /**
     * An <code>AutoScalingSchedule</code> with the instance schedule.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoScalingSchedule An <code>AutoScalingSchedule</code> with the instance schedule.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetTimeBasedAutoScalingRequest withAutoScalingSchedule(WeeklyAutoScalingSchedule autoScalingSchedule) {
        this.autoScalingSchedule = autoScalingSchedule;
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
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAutoScalingSchedule() != null) sb.append("AutoScalingSchedule: " + getAutoScalingSchedule() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getAutoScalingSchedule() == null) ? 0 : getAutoScalingSchedule().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetTimeBasedAutoScalingRequest == false) return false;
        SetTimeBasedAutoScalingRequest other = (SetTimeBasedAutoScalingRequest)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getAutoScalingSchedule() == null ^ this.getAutoScalingSchedule() == null) return false;
        if (other.getAutoScalingSchedule() != null && other.getAutoScalingSchedule().equals(this.getAutoScalingSchedule()) == false) return false; 
        return true;
    }
    
}
    