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
 * Create Application Version Request Marshaller
 */
public class CreateApplicationVersionRequestMarshaller implements Marshaller<Request<CreateApplicationVersionRequest>, CreateApplicationVersionRequest> {

    public Request<CreateApplicationVersionRequest> marshall(CreateApplicationVersionRequest createApplicationVersionRequest) {

        if (createApplicationVersionRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<CreateApplicationVersionRequest> request = new DefaultRequest<CreateApplicationVersionRequest>(createApplicationVersionRequest, "AWSElasticBeanstalk");
        request.addParameter("Action", "CreateApplicationVersion");
        request.addParameter("Version", "2010-12-01");

        if (createApplicationVersionRequest.getApplicationName() != null) {
            request.addParameter("ApplicationName", StringUtils.fromString(createApplicationVersionRequest.getApplicationName()));
        }
        if (createApplicationVersionRequest.getVersionLabel() != null) {
            request.addParameter("VersionLabel", StringUtils.fromString(createApplicationVersionRequest.getVersionLabel()));
        }
        if (createApplicationVersionRequest.getDescription() != null) {
            request.addParameter("Description", StringUtils.fromString(createApplicationVersionRequest.getDescription()));
        }
        S3Location s3LocationSourceBundle = createApplicationVersionRequest.getSourceBundle();
        if (s3LocationSourceBundle != null) {
            if (s3LocationSourceBundle.getS3Bucket() != null) {
                request.addParameter("SourceBundle.S3Bucket", StringUtils.fromString(s3LocationSourceBundle.getS3Bucket()));
            }
            if (s3LocationSourceBundle.getS3Key() != null) {
                request.addParameter("SourceBundle.S3Key", StringUtils.fromString(s3LocationSourceBundle.getS3Key()));
            }
        }
        if (createApplicationVersionRequest.isAutoCreateApplication() != null) {
            request.addParameter("AutoCreateApplication", StringUtils.fromBoolean(createApplicationVersionRequest.isAutoCreateApplication()));
        }


        return request;
    }
}
