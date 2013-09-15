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
 * Update Signing Certificate Request Marshaller
 */
public class UpdateSigningCertificateRequestMarshaller implements Marshaller<Request<UpdateSigningCertificateRequest>, UpdateSigningCertificateRequest> {

    public Request<UpdateSigningCertificateRequest> marshall(UpdateSigningCertificateRequest updateSigningCertificateRequest) {

        if (updateSigningCertificateRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<UpdateSigningCertificateRequest> request = new DefaultRequest<UpdateSigningCertificateRequest>(updateSigningCertificateRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "UpdateSigningCertificate");
        request.addParameter("Version", "2010-05-08");

        if (updateSigningCertificateRequest.getUserName() != null) {
            request.addParameter("UserName", StringUtils.fromString(updateSigningCertificateRequest.getUserName()));
        }
        if (updateSigningCertificateRequest.getCertificateId() != null) {
            request.addParameter("CertificateId", StringUtils.fromString(updateSigningCertificateRequest.getCertificateId()));
        }
        if (updateSigningCertificateRequest.getStatus() != null) {
            request.addParameter("Status", StringUtils.fromString(updateSigningCertificateRequest.getStatus()));
        }


        return request;
    }
}
