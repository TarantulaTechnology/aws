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
package com.amazonaws.services.elasticache.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest) DescribeCacheSecurityGroups operation}.
 * <p>
 * The <i>DescribeCacheSecurityGroups</i> operation returns a list of cache security group descriptions. If a cache security group name is specified, the
 * list will contain only the description of that group.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#describeCacheSecurityGroups(DescribeCacheSecurityGroupsRequest)
 */
public class DescribeCacheSecurityGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the cache security group to return details for.
     */
    private String cacheSecurityGroupName;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    private Integer maxRecords;

    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeCacheSecurityGroupsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeCacheSecurityGroupsRequest() {}
    


    /**
     * Constructs a new DescribeCacheSecurityGroupsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param cacheSecurityGroupName The name of the cache security group to
     * return details for.
     */
    public DescribeCacheSecurityGroupsRequest(String cacheSecurityGroupName) {
        setCacheSecurityGroupName(cacheSecurityGroupName);
    }

    
    
    /**
     * The name of the cache security group to return details for.
     *
     * @return The name of the cache security group to return details for.
     */
    public String getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }
    
    /**
     * The name of the cache security group to return details for.
     *
     * @param cacheSecurityGroupName The name of the cache security group to return details for.
     */
    public void setCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }
    
    /**
     * The name of the cache security group to return details for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cacheSecurityGroupName The name of the cache security group to return details for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSecurityGroupsRequest withCacheSecurityGroupName(String cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * marker is included in the response so that the remaining results can
     * be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         marker is included in the response so that the remaining results can
     *         be retrieved. <p>Default: 100<p>Constraints: minimum 20; maximum 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSecurityGroupsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @return An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional marker returned from a prior request. Use this marker for
     * pagination of results from this operation. If this parameter is
     * specified, the response includes only records beyond the marker, up to
     * the value specified by <i>MaxRecords</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional marker returned from a prior request. Use this marker for
     *         pagination of results from this operation. If this parameter is
     *         specified, the response includes only records beyond the marker, up to
     *         the value specified by <i>MaxRecords</i>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeCacheSecurityGroupsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getCacheSecurityGroupName() != null) sb.append("CacheSecurityGroupName: " + getCacheSecurityGroupName() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCacheSecurityGroupName() == null) ? 0 : getCacheSecurityGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeCacheSecurityGroupsRequest == false) return false;
        DescribeCacheSecurityGroupsRequest other = (DescribeCacheSecurityGroupsRequest)obj;
        
        if (other.getCacheSecurityGroupName() == null ^ this.getCacheSecurityGroupName() == null) return false;
        if (other.getCacheSecurityGroupName() != null && other.getCacheSecurityGroupName().equals(this.getCacheSecurityGroupName()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    