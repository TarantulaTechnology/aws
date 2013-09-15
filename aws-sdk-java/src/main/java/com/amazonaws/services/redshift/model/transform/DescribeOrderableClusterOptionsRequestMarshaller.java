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
 * Describe Orderable Cluster Options Request Marshaller
 */
public class DescribeOrderableClusterOptionsRequestMarshaller implements Marshaller<Request<DescribeOrderableClusterOptionsRequest>, DescribeOrderableClusterOptionsRequest> {

    public Request<DescribeOrderableClusterOptionsRequest> marshall(DescribeOrderableClusterOptionsRequest describeOrderableClusterOptionsRequest) {

        if (describeOrderableClusterOptionsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeOrderableClusterOptionsRequest> request = new DefaultRequest<DescribeOrderableClusterOptionsRequest>(describeOrderableClusterOptionsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeOrderableClusterOptions");
        request.addParameter("Version", "2012-12-01");

        if (describeOrderableClusterOptionsRequest.getClusterVersion() != null) {
            request.addParameter("ClusterVersion", StringUtils.fromString(describeOrderableClusterOptionsRequest.getClusterVersion()));
        }
        if (describeOrderableClusterOptionsRequest.getNodeType() != null) {
            request.addParameter("NodeType", StringUtils.fromString(describeOrderableClusterOptionsRequest.getNodeType()));
        }
        if (describeOrderableClusterOptionsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeOrderableClusterOptionsRequest.getMaxRecords()));
        }
        if (describeOrderableClusterOptionsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeOrderableClusterOptionsRequest.getMarker()));
        }


        return request;
    }
}
