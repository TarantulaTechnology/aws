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
 * Upload Server Certificate Request Marshaller
 */
public class UploadServerCertificateRequestMarshaller implements Marshaller<Request<UploadServerCertificateRequest>, UploadServerCertificateRequest> {

    public Request<UploadServerCertificateRequest> marshall(UploadServerCertificateRequest uploadServerCertificateRequest) {

        if (uploadServerCertificateRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<UploadServerCertificateRequest> request = new DefaultRequest<UploadServerCertificateRequest>(uploadServerCertificateRequest, "AmazonIdentityManagement");
        request.addParameter("Action", "UploadServerCertificate");
        request.addParameter("Version", "2010-05-08");

        if (uploadServerCertificateRequest.getPath() != null) {
            request.addParameter("Path", StringUtils.fromString(uploadServerCertificateRequest.getPath()));
        }
        if (uploadServerCertificateRequest.getServerCertificateName() != null) {
            request.addParameter("ServerCertificateName", StringUtils.fromString(uploadServerCertificateRequest.getServerCertificateName()));
        }
        if (uploadServerCertificateRequest.getCertificateBody() != null) {
            request.addParameter("CertificateBody", StringUtils.fromString(uploadServerCertificateRequest.getCertificateBody()));
        }
        if (uploadServerCertificateRequest.getPrivateKey() != null) {
            request.addParameter("PrivateKey", StringUtils.fromString(uploadServerCertificateRequest.getPrivateKey()));
        }
        if (uploadServerCertificateRequest.getCertificateChain() != null) {
            request.addParameter("CertificateChain", StringUtils.fromString(uploadServerCertificateRequest.getCertificateChain()));
        }


        return request;
    }
}
