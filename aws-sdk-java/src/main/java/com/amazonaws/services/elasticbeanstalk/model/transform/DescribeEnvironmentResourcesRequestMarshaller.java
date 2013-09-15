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
package com.amazonaws.services.elasticbeanstalk.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticbeanstalk.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Environment Resources Request Marshaller
 */
public class DescribeEnvironmentResourcesRequestMarshaller implements Marshaller<Request<DescribeEnvironmentResourcesRequest>, DescribeEnvironmentResourcesRequest> {

    public Request<DescribeEnvironmentResourcesRequest> marshall(DescribeEnvironmentResourcesRequest describeEnvironmentResourcesRequest) {

        if (describeEnvironmentResourcesRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeEnvironmentResourcesRequest> request = new DefaultRequest<DescribeEnvironmentResourcesRequest>(describeEnvironmentResourcesRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEnvironmentResources");
        request.addParameter("Version", "2010-12-01");

        if (describeEnvironmentResourcesRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils.fromString(describeEnvironmentResourcesRequest.getEnvironmentId()));
        }
        if (describeEnvironmentResourcesRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(describeEnvironmentResourcesRequest.getEnvironmentName()));
        }


        return request;
    }
}
