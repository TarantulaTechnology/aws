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
 * Authorize Cluster Security Group Ingress Request Marshaller
 */
public class AuthorizeClusterSecurityGroupIngressRequestMarshaller implements Marshaller<Request<AuthorizeClusterSecurityGroupIngressRequest>, AuthorizeClusterSecurityGroupIngressRequest> {

    public Request<AuthorizeClusterSecurityGroupIngressRequest> marshall(AuthorizeClusterSecurityGroupIngressRequest authorizeClusterSecurityGroupIngressRequest) {

        if (authorizeClusterSecurityGroupIngressRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<AuthorizeClusterSecurityGroupIngressRequest> request = new DefaultRequest<AuthorizeClusterSecurityGroupIngressRequest>(authorizeClusterSecurityGroupIngressRequest, "AmazonRedshift");
        request.addParameter("Action", "AuthorizeClusterSecurityGroupIngress");
        request.addParameter("Version", "2012-12-01");

        if (authorizeClusterSecurityGroupIngressRequest.getClusterSecurityGroupName() != null) {
            request.addParameter("ClusterSecurityGroupName", StringUtils.fromString(authorizeClusterSecurityGroupIngressRequest.getClusterSecurityGroupName()));
        }
        if (authorizeClusterSecurityGroupIngressRequest.getCIDRIP() != null) {
            request.addParameter("CIDRIP", StringUtils.fromString(authorizeClusterSecurityGroupIngressRequest.getCIDRIP()));
        }
        if (authorizeClusterSecurityGroupIngressRequest.getEC2SecurityGroupName() != null) {
            request.addParameter("EC2SecurityGroupName", StringUtils.fromString(authorizeClusterSecurityGroupIngressRequest.getEC2SecurityGroupName()));
        }
        if (authorizeClusterSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId() != null) {
            request.addParameter("EC2SecurityGroupOwnerId", StringUtils.fromString(authorizeClusterSecurityGroupIngressRequest.getEC2SecurityGroupOwnerId()));
        }


        return request;
    }
}
