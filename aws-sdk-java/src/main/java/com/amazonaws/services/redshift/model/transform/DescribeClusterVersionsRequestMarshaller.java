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
package com.amazonaws.services.redshift.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Cluster Versions Request Marshaller
 */
public class DescribeClusterVersionsRequestMarshaller implements Marshaller<Request<DescribeClusterVersionsRequest>, DescribeClusterVersionsRequest> {

    public Request<DescribeClusterVersionsRequest> marshall(DescribeClusterVersionsRequest describeClusterVersionsRequest) {

        if (describeClusterVersionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeClusterVersionsRequest> request = new DefaultRequest<DescribeClusterVersionsRequest>(describeClusterVersionsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterVersions");
        request.addParameter("Version", "2012-12-01");

        if (describeClusterVersionsRequest.getClusterVersion() != null) {
            request.addParameter("ClusterVersion", StringUtils.fromString(describeClusterVersionsRequest.getClusterVersion()));
        }
        if (describeClusterVersionsRequest.getClusterParameterGroupFamily() != null) {
            request.addParameter("ClusterParameterGroupFamily", StringUtils.fromString(describeClusterVersionsRequest.getClusterParameterGroupFamily()));
        }
        if (describeClusterVersionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClusterVersionsRequest.getMaxRecords()));
        }
        if (describeClusterVersionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClusterVersionsRequest.getMarker()));
        }


        return request;
    }
}
