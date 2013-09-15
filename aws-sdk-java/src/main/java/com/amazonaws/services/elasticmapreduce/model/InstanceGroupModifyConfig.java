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
package com.amazonaws.services.elasticmapreduce.model;
import java.io.Serializable;

/**
 * <p>
 * Modify an instance group size.
 * </p>
 */
public class InstanceGroupModifyConfig implements Serializable {

    /**
     * Unique ID of the instance group to expand or shrink.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String instanceGroupId;

    /**
     * Target size for the instance group.
     */
    private Integer instanceCount;

    /**
     * Default constructor for a new InstanceGroupModifyConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public InstanceGroupModifyConfig() {}
    


    /**
     * Constructs a new InstanceGroupModifyConfig object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceGroupId Unique ID of the instance group to expand or
     * shrink.
     * @param instanceCount Target size for the instance group.
     */
    public InstanceGroupModifyConfig(String instanceGroupId, Integer instanceCount) {
        setInstanceGroupId(instanceGroupId);
        setInstanceCount(instanceCount);
    }

    
    
    /**
     * Unique ID of the instance group to expand or shrink.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Unique ID of the instance group to expand or shrink.
     */
    public String getInstanceGroupId() {
        return instanceGroupId;
    }
    
    /**
     * Unique ID of the instance group to expand or shrink.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceGroupId Unique ID of the instance group to expand or shrink.
     */
    public void setInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
    }
    
    /**
     * Unique ID of the instance group to expand or shrink.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param instanceGroupId Unique ID of the instance group to expand or shrink.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupModifyConfig withInstanceGroupId(String instanceGroupId) {
        this.instanceGroupId = instanceGroupId;
        return this;
    }
    
    
    /**
     * Target size for the instance group.
     *
     * @return Target size for the instance group.
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }
    
    /**
     * Target size for the instance group.
     *
     * @param instanceCount Target size for the instance group.
     */
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    
    /**
     * Target size for the instance group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceCount Target size for the instance group.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceGroupModifyConfig withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
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
        if (getInstanceGroupId() != null) sb.append("InstanceGroupId: " + getInstanceGroupId() + ",");
        if (getInstanceCount() != null) sb.append("InstanceCount: " + getInstanceCount() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceGroupId() == null) ? 0 : getInstanceGroupId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceGroupModifyConfig == false) return false;
        InstanceGroupModifyConfig other = (InstanceGroupModifyConfig)obj;
        
        if (other.getInstanceGroupId() == null ^ this.getInstanceGroupId() == null) return false;
        if (other.getInstanceGroupId() != null && other.getInstanceGroupId().equals(this.getInstanceGroupId()) == false) return false; 
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null) return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false) return false; 
        return true;
    }
    
}
    