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
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Reserved Cache Nodes Offerings Request Marshaller
 */
public class DescribeReservedCacheNodesOfferingsRequestMarshaller implements Marshaller<Request<DescribeReservedCacheNodesOfferingsRequest>, DescribeReservedCacheNodesOfferingsRequest> {

    public Request<DescribeReservedCacheNodesOfferingsRequest> marshall(DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) {

        if (describeReservedCacheNodesOfferingsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeReservedCacheNodesOfferingsRequest> request = new DefaultRequest<DescribeReservedCacheNodesOfferingsRequest>(describeReservedCacheNodesOfferingsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeReservedCacheNodesOfferings");
        request.addParameter("Version", "2013-06-15");

        if (describeReservedCacheNodesOfferingsRequest.getReservedCacheNodesOfferingId() != null) {
            request.addParameter("ReservedCacheNodesOfferingId", StringUtils.fromString(describeReservedCacheNodesOfferingsRequest.getReservedCacheNodesOfferingId()));
        }
        if (describeReservedCacheNodesOfferingsRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(describeReservedCacheNodesOfferingsRequest.getCacheNodeType()));
        }
        if (describeReservedCacheNodesOfferingsRequest.getDuration() != null) {
            request.addParameter("Duration", StringUtils.fromString(describeReservedCacheNodesOfferingsRequest.getDuration()));
        }
        if (describeReservedCacheNodesOfferingsRequest.getProductDescription() != null) {
            request.addParameter("ProductDescription", StringUtils.fromString(describeReservedCacheNodesOfferingsRequest.getProductDescription()));
        }
        if (describeReservedCacheNodesOfferingsRequest.getOfferingType() != null) {
            request.addParameter("OfferingType", StringUtils.fromString(describeReservedCacheNodesOfferingsRequest.getOfferingType()));
        }
        if (describeReservedCacheNodesOfferingsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeReservedCacheNodesOfferingsRequest.getMaxRecords()));
        }
        if (describeReservedCacheNodesOfferingsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeReservedCacheNodesOfferingsRequest.getMarker()));
        }


        return request;
    }
}
