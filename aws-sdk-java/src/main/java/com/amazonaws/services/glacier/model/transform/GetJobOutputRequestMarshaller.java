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
package com.amazonaws.services.glacier.model.transform;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Get Job Output Request Marshaller
 */
public class GetJobOutputRequestMarshaller implements Marshaller<Request<GetJobOutputRequest>, GetJobOutputRequest> {

    

    public Request<GetJobOutputRequest> marshall(GetJobOutputRequest getJobOutputRequest) {
    if (getJobOutputRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<GetJobOutputRequest> request = new DefaultRequest<GetJobOutputRequest>(getJobOutputRequest, "AmazonGlacier");
        String target = "Glacier.GetJobOutput";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.GET);
        if (getJobOutputRequest.getRange() != null)
          request.addHeader("Range", StringUtils.fromString(getJobOutputRequest.getRange()));
        


        String uriResourcePath = "/{accountId}/vaults/{vaultName}/jobs/{jobId}/output"; 
        uriResourcePath = uriResourcePath.replace("{accountId}", getString(getJobOutputRequest.getAccountId())); 
        uriResourcePath = uriResourcePath.replace("{vaultName}", getString(getJobOutputRequest.getVaultName())); 
        uriResourcePath = uriResourcePath.replace("{jobId}", getString(getJobOutputRequest.getJobId())); 

        uriResourcePath = uriResourcePath.replaceAll("//", "/");

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);


        
        request.setContent(new ByteArrayInputStream(new byte[0]));
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
