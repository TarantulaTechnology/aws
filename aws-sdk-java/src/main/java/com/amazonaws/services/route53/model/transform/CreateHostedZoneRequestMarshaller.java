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
package com.amazonaws.services.route53.model.transform;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Create Hosted Zone Request Marshaller
 */
public class CreateHostedZoneRequestMarshaller implements Marshaller<Request<CreateHostedZoneRequest>, CreateHostedZoneRequest> {

    public Request<CreateHostedZoneRequest> marshall(CreateHostedZoneRequest createHostedZoneRequest) {
        if (createHostedZoneRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<CreateHostedZoneRequest> request = new DefaultRequest<CreateHostedZoneRequest>(createHostedZoneRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2012-12-12/hostedzone"; 

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
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2012-12-12/");

            
            
            xmlWriter.startElement("CreateHostedZoneRequest");
                    if (createHostedZoneRequest.getName() != null) {
            xmlWriter.startElement("Name").value(createHostedZoneRequest.getName()).endElement();
        }
        if (createHostedZoneRequest.getCallerReference() != null) {
            xmlWriter.startElement("CallerReference").value(createHostedZoneRequest.getCallerReference()).endElement();
        }
        if (createHostedZoneRequest != null) {
            HostedZoneConfig hostedZoneConfigHostedZoneConfig = createHostedZoneRequest.getHostedZoneConfig();
            if (hostedZoneConfigHostedZoneConfig != null) {
                xmlWriter.startElement("HostedZoneConfig");
                if (hostedZoneConfigHostedZoneConfig.getComment() != null) {
                    xmlWriter.startElement("Comment").value(hostedZoneConfigHostedZoneConfig.getComment()).endElement();
                }
                xmlWriter.endElement();
            }
        }

            xmlWriter.endElement();
            

            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes("UTF-8").length));
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
