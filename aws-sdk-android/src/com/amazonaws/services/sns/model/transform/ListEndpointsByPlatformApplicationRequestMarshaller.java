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
package com.amazonaws.services.sns.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * List Endpoints By Platform Application Request Marshaller
 */
public class ListEndpointsByPlatformApplicationRequestMarshaller implements Marshaller<Request<ListEndpointsByPlatformApplicationRequest>, ListEndpointsByPlatformApplicationRequest> {

    public Request<ListEndpointsByPlatformApplicationRequest> marshall(ListEndpointsByPlatformApplicationRequest listEndpointsByPlatformApplicationRequest) {

        if (listEndpointsByPlatformApplicationRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ListEndpointsByPlatformApplicationRequest> request = new DefaultRequest<ListEndpointsByPlatformApplicationRequest>(listEndpointsByPlatformApplicationRequest, "AmazonSNS");
        request.addParameter("Action", "ListEndpointsByPlatformApplication");
        request.addParameter("Version", "2010-03-31");

        if (listEndpointsByPlatformApplicationRequest.getPlatformApplicationArn() != null) {
            request.addParameter("PlatformApplicationArn", StringUtils.fromString(listEndpointsByPlatformApplicationRequest.getPlatformApplicationArn()));
        }
        if (listEndpointsByPlatformApplicationRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(listEndpointsByPlatformApplicationRequest.getNextToken()));
        }


        return request;
    }
}
