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
 * Describe Clusters Request Marshaller
 */
public class DescribeClustersRequestMarshaller implements Marshaller<Request<DescribeClustersRequest>, DescribeClustersRequest> {

    public Request<DescribeClustersRequest> marshall(DescribeClustersRequest describeClustersRequest) {

        if (describeClustersRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeClustersRequest> request = new DefaultRequest<DescribeClustersRequest>(describeClustersRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusters");
        request.addParameter("Version", "2012-12-01");

        if (describeClustersRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeClustersRequest.getClusterIdentifier()));
        }
        if (describeClustersRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClustersRequest.getMaxRecords()));
        }
        if (describeClustersRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClustersRequest.getMarker()));
        }


        return request;
    }
}
