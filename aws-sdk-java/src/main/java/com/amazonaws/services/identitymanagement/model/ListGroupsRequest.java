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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listGroups(ListGroupsRequest) ListGroups operation}.
 * <p>
 * Lists the groups that have the specified path prefix.
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listGroups(ListGroupsRequest)
 */
public class ListGroupsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all
     * groups whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all groups.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     */
    private String pathPrefix;

    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of groups you want in the response. If there are additional groups
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * Default constructor for a new ListGroupsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListGroupsRequest() {}
    
    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all
     * groups whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all groups.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     *
     * @return The path prefix for filtering the results. For example:
     *         <code>/division_abc/subdivision_xyz/</code>, which would get all
     *         groups whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/), listing
     *         all groups.
     */
    public String getPathPrefix() {
        return pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all
     * groups whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all groups.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. For example:
     *         <code>/division_abc/subdivision_xyz/</code>, which would get all
     *         groups whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/), listing
     *         all groups.
     */
    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. For example:
     * <code>/division_abc/subdivision_xyz/</code>, which would get all
     * groups whose path starts with
     * <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     * optional. If it is not included, it defaults to a slash (/), listing
     * all groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>\u002F[\u0021-\u007F]*<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. For example:
     *         <code>/division_abc/subdivision_xyz/</code>, which would get all
     *         groups whose path starts with
     *         <code>/division_abc/subdivision_xyz/</code>. <p>This parameter is
     *         optional. If it is not included, it defaults to a slash (/), listing
     *         all groups.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGroupsRequest withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }
    
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this only when paginating results, and only in a subsequent
     * request after you've received a response where the results are
     * truncated. Set it to the value of the <code>Marker</code> element in
     * the response you just received.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker Use this only when paginating results, and only in a subsequent
     *         request after you've received a response where the results are
     *         truncated. Set it to the value of the <code>Marker</code> element in
     *         the response you just received.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGroupsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of groups you want in the response. If there are additional groups
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of groups you want in the response. If there are additional groups
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of groups you want in the response. If there are additional groups
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of groups you want in the response. If there are additional groups
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of groups you want in the response. If there are additional groups
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of groups you want in the response. If there are additional groups
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListGroupsRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
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
        if (getPathPrefix() != null) sb.append("PathPrefix: " + getPathPrefix() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListGroupsRequest == false) return false;
        ListGroupsRequest other = (ListGroupsRequest)obj;
        
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null) return false;
        if (other.getPathPrefix() != null && other.getPathPrefix().equals(this.getPathPrefix()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    