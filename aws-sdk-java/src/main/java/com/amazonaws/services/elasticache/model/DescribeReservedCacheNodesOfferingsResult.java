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
import java.io.Serializable;

/**
 * <p>
 * Represents the output of a <i>DescribeReservedCacheNodesOfferings</i> operation.
 * </p>
 */
public class DescribeReservedCacheNodesOfferingsResult implements Serializable {

    /**
     * Provides an identifier to allow retrieval of paginated results.
     */
    private String marker;

    /**
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNodesOffering> reservedCacheNodesOfferings;

    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @return Provides an identifier to allow retrieval of paginated results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Provides an identifier to allow retrieval of paginated results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker Provides an identifier to allow retrieval of paginated results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesOfferingsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     *
     * @return A list of reserved cache node offerings. Each element in the list
     *         contains detailed information about one offering.
     */
    public java.util.List<ReservedCacheNodesOffering> getReservedCacheNodesOfferings() {
        
        if (reservedCacheNodesOfferings == null) {
              reservedCacheNodesOfferings = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNodesOffering>();
              reservedCacheNodesOfferings.setAutoConstruct(true);
        }
        return reservedCacheNodesOfferings;
    }
    
    /**
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     *
     * @param reservedCacheNodesOfferings A list of reserved cache node offerings. Each element in the list
     *         contains detailed information about one offering.
     */
    public void setReservedCacheNodesOfferings(java.util.Collection<ReservedCacheNodesOffering> reservedCacheNodesOfferings) {
        if (reservedCacheNodesOfferings == null) {
            this.reservedCacheNodesOfferings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNodesOffering> reservedCacheNodesOfferingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNodesOffering>(reservedCacheNodesOfferings.size());
        reservedCacheNodesOfferingsCopy.addAll(reservedCacheNodesOfferings);
        this.reservedCacheNodesOfferings = reservedCacheNodesOfferingsCopy;
    }
    
    /**
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodesOfferings A list of reserved cache node offerings. Each element in the list
     *         contains detailed information about one offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesOfferingsResult withReservedCacheNodesOfferings(ReservedCacheNodesOffering... reservedCacheNodesOfferings) {
        if (getReservedCacheNodesOfferings() == null) setReservedCacheNodesOfferings(new java.util.ArrayList<ReservedCacheNodesOffering>(reservedCacheNodesOfferings.length));
        for (ReservedCacheNodesOffering value : reservedCacheNodesOfferings) {
            getReservedCacheNodesOfferings().add(value);
        }
        return this;
    }
    
    /**
     * A list of reserved cache node offerings. Each element in the list
     * contains detailed information about one offering.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param reservedCacheNodesOfferings A list of reserved cache node offerings. Each element in the list
     *         contains detailed information about one offering.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeReservedCacheNodesOfferingsResult withReservedCacheNodesOfferings(java.util.Collection<ReservedCacheNodesOffering> reservedCacheNodesOfferings) {
        if (reservedCacheNodesOfferings == null) {
            this.reservedCacheNodesOfferings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNodesOffering> reservedCacheNodesOfferingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ReservedCacheNodesOffering>(reservedCacheNodesOfferings.size());
            reservedCacheNodesOfferingsCopy.addAll(reservedCacheNodesOfferings);
            this.reservedCacheNodesOfferings = reservedCacheNodesOfferingsCopy;
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getReservedCacheNodesOfferings() != null) sb.append("ReservedCacheNodesOfferings: " + getReservedCacheNodesOfferings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getReservedCacheNodesOfferings() == null) ? 0 : getReservedCacheNodesOfferings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeReservedCacheNodesOfferingsResult == false) return false;
        DescribeReservedCacheNodesOfferingsResult other = (DescribeReservedCacheNodesOfferingsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getReservedCacheNodesOfferings() == null ^ this.getReservedCacheNodesOfferings() == null) return false;
        if (other.getReservedCacheNodesOfferings() != null && other.getReservedCacheNodesOfferings().equals(this.getReservedCacheNodesOfferings()) == false) return false; 
        return true;
    }
    
}
    