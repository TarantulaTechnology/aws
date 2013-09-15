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
 * Delete Access Key Request Marshaller
 */
public class DeleteAccessKeyRequestMarshaller implements Marshaller<Request<DeleteAccessKeyRequest>, DeleteAccessKeyRequest> {

    public Request<DeleteAccessKeyRequest> marshall(DeleteAccessKeyRequest deleteAccessKeyRequest) {

        if (deleteAccessKeyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DeleteAccessKeyRequest> request = new DefaultRequest<DeleteAccessKeyRequest>(deleteAccessKeyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "DeleteAccessKey");
        request.addParameter("Version", "2010-05-08");

        if (deleteAccessKeyRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(deleteAccessKeyRequest.getUserName()));
        }
        if (deleteAccessKeyRequest.getAccessKeyId() != null) {
            request.addParameter("AccessKeyId", StringUtils.fromString(deleteAccessKeyRequest.getAccessKeyId()));
        }


        return request;
    }
}
