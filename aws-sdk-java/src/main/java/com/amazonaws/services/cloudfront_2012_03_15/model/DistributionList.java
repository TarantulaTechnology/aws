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

/**
 * <p>
 * A distribution list.
 * </p>
 */
public class DistributionList {

    /**
     * The value you provided for the Marker request parameter.
     */
    private String marker;

    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * distributions where they left off.
     */
    private String nextMarker;

    /**
     * The value you provided for the MaxItems request parameter.
     */
    private Integer maxItems;

    /**
     * A flag that indicates whether more distributions remain to be listed.
     * If your results were truncated, you can make a follow-up pagination
     * request using the Marker request parameter to retrieve more
     * distributions in the list.
     */
    private Boolean isTruncated;

    /**
     * An XML structure containing a summary of the distribution.
     */
    private java.util.List<DistributionSummary> distributionSummaries;

    /**
     * Default constructor for a new DistributionList object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DistributionList() {}
    
    /**
     * The value you provided for the Marker request parameter.
     *
     * @return The value you provided for the Marker request parameter.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The value you provided for the Marker request parameter.
     *
     * @param marker The value you provided for the Marker request parameter.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The value you provided for the Marker request parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker The value you provided for the Marker request parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionList withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * distributions where they left off.
     *
     * @return If IsTruncated is true, this element is present and contains the value
     *         you can use for the Marker request parameter to continue listing your
     *         distributions where they left off.
     */
    public String getNextMarker() {
        return nextMarker;
    }
    
    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * distributions where they left off.
     *
     * @param nextMarker If IsTruncated is true, this element is present and contains the value
     *         you can use for the Marker request parameter to continue listing your
     *         distributions where they left off.
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }
    
    /**
     * If IsTruncated is true, this element is present and contains the value
     * you can use for the Marker request parameter to continue listing your
     * distributions where they left off.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextMarker If IsTruncated is true, this element is present and contains the value
     *         you can use for the Marker request parameter to continue listing your
     *         distributions where they left off.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionList withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }
    
    
    /**
     * The value you provided for the MaxItems request parameter.
     *
     * @return The value you provided for the MaxItems request parameter.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * The value you provided for the MaxItems request parameter.
     *
     * @param maxItems The value you provided for the MaxItems request parameter.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The value you provided for the MaxItems request parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The value you provided for the MaxItems request parameter.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionList withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    
    
    /**
     * A flag that indicates whether more distributions remain to be listed.
     * If your results were truncated, you can make a follow-up pagination
     * request using the Marker request parameter to retrieve more
     * distributions in the list.
     *
     * @return A flag that indicates whether more distributions remain to be listed.
     *         If your results were truncated, you can make a follow-up pagination
     *         request using the Marker request parameter to retrieve more
     *         distributions in the list.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether more distributions remain to be listed.
     * If your results were truncated, you can make a follow-up pagination
     * request using the Marker request parameter to retrieve more
     * distributions in the list.
     *
     * @param isTruncated A flag that indicates whether more distributions remain to be listed.
     *         If your results were truncated, you can make a follow-up pagination
     *         request using the Marker request parameter to retrieve more
     *         distributions in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether more distributions remain to be listed.
     * If your results were truncated, you can make a follow-up pagination
     * request using the Marker request parameter to retrieve more
     * distributions in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether more distributions remain to be listed.
     *         If your results were truncated, you can make a follow-up pagination
     *         request using the Marker request parameter to retrieve more
     *         distributions in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionList withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether more distributions remain to be listed.
     * If your results were truncated, you can make a follow-up pagination
     * request using the Marker request parameter to retrieve more
     * distributions in the list.
     *
     * @return A flag that indicates whether more distributions remain to be listed.
     *         If your results were truncated, you can make a follow-up pagination
     *         request using the Marker request parameter to retrieve more
     *         distributions in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * An XML structure containing a summary of the distribution.
     *
     * @return An XML structure containing a summary of the distribution.
     */
    public java.util.List<DistributionSummary> getDistributionSummaries() {
        
        if (distributionSummaries == null) {
            distributionSummaries = new java.util.ArrayList<DistributionSummary>();
        }
        return distributionSummaries;
    }
    
    /**
     * An XML structure containing a summary of the distribution.
     *
     * @param distributionSummaries An XML structure containing a summary of the distribution.
     */
    public void setDistributionSummaries(java.util.Collection<DistributionSummary> distributionSummaries) {
        if (distributionSummaries == null) {
            this.distributionSummaries = null;
            return;
        }

        java.util.List<DistributionSummary> distributionSummariesCopy = new java.util.ArrayList<DistributionSummary>(distributionSummaries.size());
        distributionSummariesCopy.addAll(distributionSummaries);
        this.distributionSummaries = distributionSummariesCopy;
    }
    
    /**
     * An XML structure containing a summary of the distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionSummaries An XML structure containing a summary of the distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionList withDistributionSummaries(DistributionSummary... distributionSummaries) {
        if (getDistributionSummaries() == null) setDistributionSummaries(new java.util.ArrayList<DistributionSummary>(distributionSummaries.length));
        for (DistributionSummary value : distributionSummaries) {
            getDistributionSummaries().add(value);
        }
        return this;
    }
    
    /**
     * An XML structure containing a summary of the distribution.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param distributionSummaries An XML structure containing a summary of the distribution.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DistributionList withDistributionSummaries(java.util.Collection<DistributionSummary> distributionSummaries) {
        if (distributionSummaries == null) {
            this.distributionSummaries = null;
        } else {
            java.util.List<DistributionSummary> distributionSummariesCopy = new java.util.ArrayList<DistributionSummary>(distributionSummaries.size());
            distributionSummariesCopy.addAll(distributionSummaries);
            this.distributionSummaries = distributionSummariesCopy;
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
        if (marker != null) sb.append("Marker: " + marker + ", ");
        if (nextMarker != null) sb.append("NextMarker: " + nextMarker + ", ");
        if (maxItems != null) sb.append("MaxItems: " + maxItems + ", ");
        if (isTruncated != null) sb.append("IsTruncated: " + isTruncated + ", ");
        if (distributionSummaries != null) sb.append("DistributionSummaries: " + distributionSummaries + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getDistributionSummaries() == null) ? 0 : getDistributionSummaries().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DistributionList == false) return false;
        DistributionList other = (DistributionList)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getNextMarker() == null ^ this.getNextMarker() == null) return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getDistributionSummaries() == null ^ this.getDistributionSummaries() == null) return false;
        if (other.getDistributionSummaries() != null && other.getDistributionSummaries().equals(this.getDistributionSummaries()) == false) return false; 
        return true;
    }
    
}
    
