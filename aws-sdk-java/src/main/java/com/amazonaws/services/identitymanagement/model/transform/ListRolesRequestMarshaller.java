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
package com.amazonaws.services.identitymanagement.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.identitymanagement.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Roles Request Marshaller
 */
public class ListRolesRequestMarshaller implements Marshaller<Request<ListRolesRequest>, ListRolesRequest> {

    public Request<ListRolesRequest> marshall(ListRolesRequest listRolesRequest) {

        if (listRolesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ListRolesRequest> request = new DefaultRequest<ListRolesRequest>(listRolesRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "ListRoles");
        request.addParameter("Version", "2010-05-08");

        if (listRolesRequest.getPathPrefix() != null) {
            request.addParameter("PathPrefix", StringUtils.fromString(listRolesRequest.getPathPrefix()));
        }
        if (listRolesRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(listRolesRequest.getMarker()));
        }
        if (listRolesRequest.getMaxItems() != null) {
            request.addParameter("MaxItems", StringUtils.fromInteger(listRolesRequest.getMaxItems()));
        }


        return request;
    }
}
