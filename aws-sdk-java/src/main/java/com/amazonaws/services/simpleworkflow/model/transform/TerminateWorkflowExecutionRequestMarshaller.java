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
package com.amazonaws.services.simpleworkflow.model.transform;


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
import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;

/**
 * Terminate Workflow Execution Request Marshaller
 */
public class TerminateWorkflowExecutionRequestMarshaller implements Marshaller<Request<TerminateWorkflowExecutionRequest>, TerminateWorkflowExecutionRequest> {

    

    public Request<TerminateWorkflowExecutionRequest> marshall(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest) {
    if (terminateWorkflowExecutionRequest == null) {
        throw new AmazonClientException("Invalid argument passed to marshall(...)");
    }

        Request<TerminateWorkflowExecutionRequest> request = new DefaultRequest<TerminateWorkflowExecutionRequest>(terminateWorkflowExecutionRequest, "AmazonSimpleWorkflow");
        String target = "SimpleWorkflowService.TerminateWorkflowExecution";
        request.addHeader("X-Amz-Target", target);
        request.addHeader("Content-Type", "application/x-amz-json-1.0");

        
        request.setHttpMethod(HttpMethodName.POST);


        String uriResourcePath = ""; 

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


        
        try {
          StringWriter stringWriter = new StringWriter();
          JSONWriter jsonWriter = new JSONWriter(stringWriter);

          
            
          jsonWriter.object();
          
            if (terminateWorkflowExecutionRequest.getDomain() != null) {
                jsonWriter.key("domain").value(terminateWorkflowExecutionRequest.getDomain());
            }
            if (terminateWorkflowExecutionRequest.getWorkflowId() != null) {
                jsonWriter.key("workflowId").value(terminateWorkflowExecutionRequest.getWorkflowId());
            }
            if (terminateWorkflowExecutionRequest.getRunId() != null) {
                jsonWriter.key("runId").value(terminateWorkflowExecutionRequest.getRunId());
            }
            if (terminateWorkflowExecutionRequest.getReason() != null) {
                jsonWriter.key("reason").value(terminateWorkflowExecutionRequest.getReason());
            }
            if (terminateWorkflowExecutionRequest.getDetails() != null) {
                jsonWriter.key("details").value(terminateWorkflowExecutionRequest.getDetails());
            }
            if (terminateWorkflowExecutionRequest.getChildPolicy() != null) {
                jsonWriter.key("childPolicy").value(terminateWorkflowExecutionRequest.getChildPolicy());
            }

          jsonWriter.endObject();
          

          String snippet = stringWriter.toString();
          byte[] content = snippet.getBytes("UTF-8");
          request.setContent(new StringInputStream(snippet));
          request.addHeader("Content-Length", Integer.toString(content.length));
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
