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
 * Describe Events Request Marshaller
 */
public class DescribeEventsRequestMarshaller implements Marshaller<Request<DescribeEventsRequest>, DescribeEventsRequest> {

    public Request<DescribeEventsRequest> marshall(DescribeEventsRequest describeEventsRequest) {

        if (describeEventsRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DescribeEventsRequest> request = new DefaultRequest<DescribeEventsRequest>(describeEventsRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DescribeEvents");
        request.addParameter("Version", "2010-12-01");

        if (describeEventsRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(describeEventsRequest.getApplicationName()));
        }
        if (describeEventsRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(describeEventsRequest.getVersionLabel()));
        }
        if (describeEventsRequest.getTemplateName() != null) {
            request.addParameter("TemplateName", StringUtils.fromString(describeEventsRequest.getTemplateName()));
        }
        if (describeEventsRequest.getEnvironmentId() != null) {
            request.addParameter("EnvironmentId", StringUtils.fromString(describeEventsRequest.getEnvironmentId()));
        }
        if (describeEventsRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(describeEventsRequest.getEnvironmentName()));
        }
        if (describeEventsRequest.getRequestId() != null) {
            request.addParameter("RequestId", StringUtils.fromString(describeEventsRequest.getRequestId()));
        }
        if (describeEventsRequest.getSeverity() != null) {
            request.addParameter("Severity", StringUtils.fromString(describeEventsRequest.getSeverity()));
        }
        if (describeEventsRequest.getStartTime() != null) {
            request.addParameter("StartTime", StringUtils.fromDate(describeEventsRequest.getStartTime()));
        }
        if (describeEventsRequest.getEndTime() != null) {
            request.addParameter("EndTime", StringUtils.fromDate(describeEventsRequest.getEndTime()));
        }
        if (describeEventsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeEventsRequest.getMaxRecords()));
        }
        if (describeEventsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeEventsRequest.getNextToken()));
        }


        return request;
    }
}
