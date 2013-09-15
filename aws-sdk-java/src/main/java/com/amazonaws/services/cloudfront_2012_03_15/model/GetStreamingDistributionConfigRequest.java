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
package com.amazonaws.services.cloudfront_2012_03_15.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront_2012_03_152012_03_15AmazonCloudFront#getStreamingDistributionConfig(GetStreamingDistributionConfigRequest) GetStreamingDistributionConfig operation}.
 * <p>
 * Get the configuration information about a streaming distribution.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront_2012_03_152012_03_15AmazonCloudFront#getStreamingDistributionConfig(GetStreamingDistributionConfigRequest)
 */
public class GetStreamingDistributionConfigRequest extends AmazonWebServiceRequest {

    /**
     * The streaming distribution's id.
     */
    private String id;

    /**
     * Default constructor for a new GetStreamingDistributionConfigRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetStreamingDistributionConfigRequest() {}
    
    /**
     * Constructs a new GetStreamingDistributionConfigRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param id The streaming distribution's id.
     */
    public GetStreamingDistributionConfigRequest(String id) {
        this.id = id;
    }

    
    
    /**
     * The streaming distribution's id.
     *
     * @return The streaming distribution's id.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The streaming distribution's id.
     *
     * @param id The streaming distribution's id.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The streaming distribution's id.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param id The streaming distribution's id.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetStreamingDistributionConfigRequest withId(String id) {
        this.id = id;
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
        if (id != null) sb.append("Id: " + id + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof GetStreamingDistributionConfigRequest == false) return false;
        GetStreamingDistributionConfigRequest other = (GetStreamingDistributionConfigRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        return true;
    }
    
}
    
