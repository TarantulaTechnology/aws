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
 * Container for the parameters to the {@link com.amazonaws.services.cloudfront_2012_03_152012_03_15AmazonCloudFront#listDistributions(ListDistributionsRequest) ListDistributions operation}.
 * <p>
 * List distributions.
 * </p>
 *
 * @see com.amazonaws.services.cloudfront_2012_03_152012_03_15AmazonCloudFront#listDistributions(ListDistributionsRequest)
 */
public class ListDistributionsRequest extends AmazonWebServiceRequest {

    /**
     * Use this when paginating results to indicate where to begin in your
     * list of distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     */
    private String marker;

    /**
     * The maximum number of distributions you want in the response body.
     */
    private String maxItems;

    /**
     * Default constructor for a new ListDistributionsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListDistributionsRequest() {}
    
    /**
     * Use this when paginating results to indicate where to begin in your
     * list of distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     *
     * @return Use this when paginating results to indicate where to begin in your
     *         list of distributions. The results include distributions in the list
     *         that occur after the marker. To get the next page of results, set the
     *         Marker to the value of the NextMarker from the current page's response
     *         (which is also the ID of the last distribution on that page).
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this when paginating results to indicate where to begin in your
     * list of distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     *
     * @param marker Use this when paginating results to indicate where to begin in your
     *         list of distributions. The results include distributions in the list
     *         that occur after the marker. To get the next page of results, set the
     *         Marker to the value of the NextMarker from the current page's response
     *         (which is also the ID of the last distribution on that page).
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this when paginating results to indicate where to begin in your
     * list of distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Use this when paginating results to indicate where to begin in your
     *         list of distributions. The results include distributions in the list
     *         that occur after the marker. To get the next page of results, set the
     *         Marker to the value of the NextMarker from the current page's response
     *         (which is also the ID of the last distribution on that page).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDistributionsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * The maximum number of distributions you want in the response body.
     *
     * @return The maximum number of distributions you want in the response body.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of distributions you want in the response body.
     *
     * @param maxItems The maximum number of distributions you want in the response body.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of distributions you want in the response body.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of distributions you want in the response body.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListDistributionsRequest withMaxItems(String maxItems) {
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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (maxItems != null) sb.append("MaxItems: " + maxItems + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof ListDistributionsRequest == false) return false;
        ListDistributionsRequest other = (ListDistributionsRequest)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    
