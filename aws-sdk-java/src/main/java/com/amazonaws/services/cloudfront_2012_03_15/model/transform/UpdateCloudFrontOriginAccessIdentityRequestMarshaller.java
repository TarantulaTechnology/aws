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
package com.amazonaws.services.cloudfront_2012_03_15.model.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudfront_2012_03_15.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Update Cloud Front Origin Access Identity Request Marshaller
 */
public class UpdateCloudFrontOriginAccessIdentityRequestMarshaller implements Marshaller<Request<UpdateCloudFrontOriginAccessIdentityRequest>, UpdateCloudFrontOriginAccessIdentityRequest> {

    public Request<UpdateCloudFrontOriginAccessIdentityRequest> marshall(UpdateCloudFrontOriginAccessIdentityRequest updateCloudFrontOriginAccessIdentityRequest) {
        if (updateCloudFrontOriginAccessIdentityRequest == null) { 
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<UpdateCloudFrontOriginAccessIdentityRequest> request = new DefaultRequest<UpdateCloudFrontOriginAccessIdentityRequest>(updateCloudFrontOriginAccessIdentityRequest, "AmazonCloudFront");
        request.setHttpMethod(HttpMethodName.PUT);
        if (updateCloudFrontOriginAccessIdentityRequest.getIfMatch() != null) 
        	request.addHeader("If-Match", updateCloudFrontOriginAccessIdentityRequest.getIfMatch());
        

        String uriResourcePath = "2012-03-15/origin-access-identity/cloudfront/{Id}/config"; 
        uriResourcePath = uriResourcePath.replace("{Id}", getString(updateCloudFrontOriginAccessIdentityRequest.getId())); 

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

        
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "http://cloudfront.amazonaws.com/doc/2012-03-15/");

                    if (updateCloudFrontOriginAccessIdentityRequest != null) {
            CloudFrontOriginAccessIdentityConfig cloudFrontOriginAccessIdentityConfigCloudFrontOriginAccessIdentityConfig = updateCloudFrontOriginAccessIdentityRequest.getCloudFrontOriginAccessIdentityConfig();
            if (cloudFrontOriginAccessIdentityConfigCloudFrontOriginAccessIdentityConfig != null) {
                xmlWriter.startElement("CloudFrontOriginAccessIdentityConfig");
                if (cloudFrontOriginAccessIdentityConfigCloudFrontOriginAccessIdentityConfig.getCallerReference() != null) {
                    xmlWriter.startElement("CallerReference").value(cloudFrontOriginAccessIdentityConfigCloudFrontOriginAccessIdentityConfig.getCallerReference()).endElement();
                }
                if (cloudFrontOriginAccessIdentityConfigCloudFrontOriginAccessIdentityConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(cloudFrontOriginAccessIdentityConfigCloudFrontOriginAccessIdentityConfig.getComment()).endElement();
                }
                xmlWriter.endElement();
            }
        }


            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes().length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
