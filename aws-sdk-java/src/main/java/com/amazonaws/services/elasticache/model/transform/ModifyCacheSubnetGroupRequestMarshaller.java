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
 * Modify Cache Subnet Group Request Marshaller
 */
public class ModifyCacheSubnetGroupRequestMarshaller implements Marshaller<Request<ModifyCacheSubnetGroupRequest>, ModifyCacheSubnetGroupRequest> {

    public Request<ModifyCacheSubnetGroupRequest> marshall(ModifyCacheSubnetGroupRequest modifyCacheSubnetGroupRequest) {

        if (modifyCacheSubnetGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyCacheSubnetGroupRequest> request = new DefaultRequest<ModifyCacheSubnetGroupRequest>(modifyCacheSubnetGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheSubnetGroup");
        request.addParameter("Version", "2013-06-15");

        if (modifyCacheSubnetGroupRequest.getCacheSubnetGroupName() != null) {
            request.addParameter("CacheSubnetGroupName", StringUtils.fromString(modifyCacheSubnetGroupRequest.getCacheSubnetGroupName()));
        }
        if (modifyCacheSubnetGroupRequest.getCacheSubnetGroupDescription() != null) {
            request.addParameter("CacheSubnetGroupDescription", StringUtils.fromString(modifyCacheSubnetGroupRequest.getCacheSubnetGroupDescription()));
        }

        java.util.List<String> subnetIdsList = modifyCacheSubnetGroupRequest.getSubnetIds();
        int subnetIdsListIndex = 1;

        for (String subnetIdsListValue : subnetIdsList) {
            if (subnetIdsListValue != null) {
                request.addParameter("SubnetIds.SubnetIdentifier." + subnetIdsListIndex, StringUtils.fromString(subnetIdsListValue));
            }

            subnetIdsListIndex++;
        }


        return request;
    }
}
