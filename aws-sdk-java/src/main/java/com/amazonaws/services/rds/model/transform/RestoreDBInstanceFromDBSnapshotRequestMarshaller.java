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
package com.amazonaws.services.rds.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Restore D B Instance From D B Snapshot Request Marshaller
 */
public class RestoreDBInstanceFromDBSnapshotRequestMarshaller implements Marshaller<Request<RestoreDBInstanceFromDBSnapshotRequest>, RestoreDBInstanceFromDBSnapshotRequest> {

    public Request<RestoreDBInstanceFromDBSnapshotRequest> marshall(RestoreDBInstanceFromDBSnapshotRequest restoreDBInstanceFromDBSnapshotRequest) {

        if (restoreDBInstanceFromDBSnapshotRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RestoreDBInstanceFromDBSnapshotRequest> request = new DefaultRequest<RestoreDBInstanceFromDBSnapshotRequest>(restoreDBInstanceFromDBSnapshotRequest, "AmazonRDS");
        request.addParameter("Action", "RestoreDBInstanceFromDBSnapshot");
        request.addParameter("Version", "2013-05-15");

        if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier() != null) {
            request.addParameter("DBInstanceIdentifier", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBInstanceIdentifier()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier() != null) {
            request.addParameter("DBSnapshotIdentifier", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBSnapshotIdentifier()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass() != null) {
            request.addParameter("DBInstanceClass", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBInstanceClass()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getPort() != null) {
            request.addParameter("Port", StringUtils.fromInteger(restoreDBInstanceFromDBSnapshotRequest.getPort()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone() != null) {
            request.addParameter("AvailabilityZone", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getAvailabilityZone()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBSubnetGroupName() != null) {
            request.addParameter("DBSubnetGroupName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBSubnetGroupName()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.isMultiAZ() != null) {
            request.addParameter("MultiAZ", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.isMultiAZ()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.isPubliclyAccessible() != null) {
            request.addParameter("PubliclyAccessible", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.isPubliclyAccessible()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.isAutoMinorVersionUpgrade() != null) {
            request.addParameter("AutoMinorVersionUpgrade", StringUtils.fromBoolean(restoreDBInstanceFromDBSnapshotRequest.isAutoMinorVersionUpgrade()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getLicenseModel() != null) {
            request.addParameter("LicenseModel", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getLicenseModel()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getDBName() != null) {
            request.addParameter("DBName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getDBName()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getEngine() != null) {
            request.addParameter("Engine", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getEngine()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getIops() != null) {
            request.addParameter("Iops", StringUtils.fromInteger(restoreDBInstanceFromDBSnapshotRequest.getIops()));
        }
        if (restoreDBInstanceFromDBSnapshotRequest.getOptionGroupName() != null) {
            request.addParameter("OptionGroupName", StringUtils.fromString(restoreDBInstanceFromDBSnapshotRequest.getOptionGroupName()));
        }


        return request;
    }
}
