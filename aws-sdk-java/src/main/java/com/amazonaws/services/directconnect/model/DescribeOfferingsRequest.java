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
package com.amazonaws.services.directconnect.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.directconnect.AmazonDirectConnect#describeOfferings(DescribeOfferingsRequest) DescribeOfferings operation}.
 * <p>
 * Describes one or more of the offerings that are currently available for creating new connections. The results include offerings for all regions.
 * </p>
 * <p>
 * To order a new connection you need to select a specific offering ID.
 * </p>
 *
 * @see com.amazonaws.services.directconnect.AmazonDirectConnect#describeOfferings(DescribeOfferingsRequest)
 */
public class DescribeOfferingsRequest extends AmazonWebServiceRequest implements Serializable {

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
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeOfferingsRequest == false) return false;
        DescribeOfferingsRequest other = (DescribeOfferingsRequest)obj;
        
        return true;
    }
    
}
    