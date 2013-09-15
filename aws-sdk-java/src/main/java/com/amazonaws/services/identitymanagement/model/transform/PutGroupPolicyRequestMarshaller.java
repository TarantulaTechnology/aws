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
 * Put Group Policy Request Marshaller
 */
public class PutGroupPolicyRequestMarshaller implements Marshaller<Request<PutGroupPolicyRequest>, PutGroupPolicyRequest> {

    public Request<PutGroupPolicyRequest> marshall(PutGroupPolicyRequest putGroupPolicyRequest) {

        if (putGroupPolicyRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<PutGroupPolicyRequest> request = new DefaultRequest<PutGroupPolicyRequest>(putGroupPolicyRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "PutGroupPolicy");
        request.addParameter("Version", "2010-05-08");

        if (putGroupPolicyRequest.getGroupName() != null) {
            request.addParameter("GroupName", StringUtils.fromString(putGroupPolicyRequest.getGroupName()));
        }
        if (putGroupPolicyRequest.getPolicyName() != null) {
            request.addParameter("PolicyName", StringUtils.fromString(putGroupPolicyRequest.getPolicyName()));
        }
        if (putGroupPolicyRequest.getPolicyDocument() != null) {
            request.addParameter("PolicyDocument", StringUtils.fromString(putGroupPolicyRequest.getPolicyDocument()));
        }


        return request;
    }
}
