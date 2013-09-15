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
 * Revoke Cluster Security Group Ingress Request Marshaller
 */
public class RevokeClusterSecurityGroupIngressRequestMarshaller implements Marshaller<Request<RevokeClusterSecurityGroupIngressRequest>, RevokeClusterSecurityGroupIngressRequest> {

    public Request<RevokeClusterSecurityGroupIngressRequest> marshall(RevokeClusterSecurityGroupIngressRequest revokeClusterSecurityGroupIngressRequest) {

        if (revokeClusterSecurityGroupIngressRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<RevokeClusterSecurityGroupIngressRequest> request = new DefaultRequest<RevokeClusterSecurityGroupIngressRequest>(revokeClusterSecurityGroupIngressRequest, "AmazonRedshift");
        request.addParameter("Action", "RevokeClusterSecurityGroupIngress");
        request.addParameter("Version", "2012-12-01");

        if (revokeClusterSecurityGroupIngressRequest.getClusterSecurityGroupName() != null) {
            request.addParameter("ClusterSecurityGroupName", StringUtils.fromString(revokeClusterSecurityGroupIngressRequest.getClusterSecurityGroupName()));
        }
        if (revokeClusterSecurityGroupIngressRequest.getCIDRIP() != null) {
            request.addParameter("CIDRIP", StringUtils.fromString(revokeClusterSecurityGroupIngressRequest.getCIDRIP()));
        }
        if (revokeClusterSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            request.addParameter("EC2SecurityGroupName", StringUtils.fromString(revokeClusterSecurityGroupIngressRequest.getEC2SecurityGroupName()));
        }
        if (revokeClusterSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            request.addParameter("EC2SecurityGroupOwnerId", StringUtils.fromString(revokeClusterSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId()));
        }


        return request;
    }
}
