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
 * Delete Environment Configuration Request Marshaller
 */
public class DeleteEnvironmentConfigurationRequestMarshaller implements Marshaller<Request<DeleteEnvironmentConfigurationRequest>, DeleteEnvironmentConfigurationRequest> {

    public Request<DeleteEnvironmentConfigurationRequest> marshall(DeleteEnvironmentConfigurationRequest deleteEnvironmentConfigurationRequest) {

        if (deleteEnvironmentConfigurationRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteEnvironmentConfigurationRequest> request = new DefaultRequest<DeleteEnvironmentConfigurationRequest>(deleteEnvironmentConfigurationRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "DeleteEnvironmentConfiguration");
        request.addParameter("Version", "2010-12-01");

        if (deleteEnvironmentConfigurationRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(deleteEnvironmentConfigurationRequest.getApplicationName()));
        }
        if (deleteEnvironmentConfigurationRequest.getEnvironmentName() != null) {
            request.addParameter("EnvironmentName", StringUtils.fromString(deleteEnvironmentConfigurationRequest.getEnvironmentName()));
        }


        return request;
    }
}
