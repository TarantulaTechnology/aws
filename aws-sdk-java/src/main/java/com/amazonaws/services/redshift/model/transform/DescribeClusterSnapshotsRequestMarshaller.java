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
 * Describe Cluster Snapshots Request Marshaller
 */
public class DescribeClusterSnapshotsRequestMarshaller implements Marshaller<Request<DescribeClusterSnapshotsRequest>, DescribeClusterSnapshotsRequest> {

    public Request<DescribeClusterSnapshotsRequest> marshall(DescribeClusterSnapshotsRequest describeClusterSnapshotsRequest) {

        if (describeClusterSnapshotsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeClusterSnapshotsRequest> request = new DefaultRequest<DescribeClusterSnapshotsRequest>(describeClusterSnapshotsRequest, "AmazonRedshift");
        request.addParameter("Action", "DescribeClusterSnapshots");
        request.addParameter("Version", "2012-12-01");

        if (describeClusterSnapshotsRequest.getClusterIdentifier() != null) {
            request.addParameter("ClusterIdentifier", StringUtils.fromString(describeClusterSnapshotsRequest.getClusterIdentifier()));
        }
        if (describeClusterSnapshotsRequest.getSnapshotIdentifier() != null) {
            request.addParameter("SnapshotIdentifier", StringUtils.fromString(describeClusterSnapshotsRequest.getSnapshotIdentifier()));
        }
        if (describeClusterSnapshotsRequest.getSnapshotType() != null) {
            request.addParameter("SnapshotType", StringUtils.fromString(describeClusterSnapshotsRequest.getSnapshotType()));
        }
        if (describeClusterSnapshotsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeClusterSnapshotsRequest.getStartTime()));
        }
        if (describeClusterSnapshotsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeClusterSnapshotsRequest.getEndTime()));
        }
        if (describeClusterSnapshotsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeClusterSnapshotsRequest.getMaxRecords()));
        }
        if (describeClusterSnapshotsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeClusterSnapshotsRequest.getMarker()));
        }
        if (describeClusterSnapshotsRequest.getOwnerAccount() != null) {
            request.addParameter("OwnerAccount", StringUtils.fromString(describeClusterSnapshotsRequest.getOwnerAccount()));
        }


        return request;
    }
}
