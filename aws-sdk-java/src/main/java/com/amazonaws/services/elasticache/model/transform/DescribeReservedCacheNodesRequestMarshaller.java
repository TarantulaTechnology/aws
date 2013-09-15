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
 * Describe Reserved Cache Nodes Request Marshaller
 */
public class DescribeReservedCacheNodesRequestMarshaller implements Marshaller<Request<DescribeReservedCacheNodesRequest>, DescribeReservedCacheNodesRequest> {

    public Request<DescribeReservedCacheNodesRequest> marshall(DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) {

        if (describeReservedCacheNodesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeReservedCacheNodesRequest> request = new DefaultRequest<DescribeReservedCacheNodesRequest>(describeReservedCacheNodesRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeReservedCacheNodes");
        request.addParameter("Version", "2013-06-15");

        if (describeReservedCacheNodesRequest.getReservedCacheNodeId() != null) {
            request.addParameter("ReservedCacheNodeId", StringUtils.fromString(describeReservedCacheNodesRequest.getReservedCacheNodeId()));
        }
        if (describeReservedCacheNodesRequest.getReservedCacheNodesOfferingId() != null) {
            request.addParameter("ReservedCacheNodesOfferingId", StringUtils.fromString(describeReservedCacheNodesRequest.getReservedCacheNodesOfferingId()));
        }
        if (describeReservedCacheNodesRequest.getCacheNodeType() != null) {
            request.addParameter("CacheNodeType", StringUtils.fromString(describeReservedCacheNodesRequest.getCacheNodeType()));
        }
        if (describeReservedCacheNodesRequest.getDuration() != null) {
            request.addParameter("Duration", StringUtils.fromString(describeReservedCacheNodesRequest.getDuration()));
        }
        if (describeReservedCacheNodesRequest.getProductDescription() != null) {
            request.addParameter("ProductDescription", StringUtils.fromString(describeReservedCacheNodesRequest.getProductDescription()));
        }
        if (describeReservedCacheNodesRequest.getOfferingType() != null) {
            request.addParameter("OfferingType", StringUtils.fromString(describeReservedCacheNodesRequest.getOfferingType()));
        }
        if (describeReservedCacheNodesRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeReservedCacheNodesRequest.getMaxRecords()));
        }
        if (describeReservedCacheNodesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeReservedCacheNodesRequest.getMarker()));
        }


        return request;
    }
}
