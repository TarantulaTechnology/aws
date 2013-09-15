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

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.glacier.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

import com.amazonaws.util.ContentLengthValidationInputStream;


/**
 * Get Job Output Result JSON Unmarshaller
 */
public class GetJobOutputResultJsonUnmarshaller implements Unmarshaller<GetJobOutputResult, JsonUnmarshallerContext> {

    

    public GetJobOutputResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetJobOutputResult getJobOutputResult = new GetJobOutputResult();

        
        

        if (context.isStartOfDocument()) {
            if (context.getHeader("x-amz-sha256-tree-hash") != null)
                getJobOutputResult.setChecksum(context.getHeader("x-amz-sha256-tree-hash"));
            if (context.getHeader("Content-Range") != null)
                getJobOutputResult.setContentRange(context.getHeader("Content-Range"));
            if (context.getHeader("Accept-Ranges") != null)
                getJobOutputResult.setAcceptRanges(context.getHeader("Accept-Ranges"));
            if (context.getHeader("Content-Type") != null)
                getJobOutputResult.setContentType(context.getHeader("Content-Type"));
            if (context.getHeader("x-amz-archive-description") != null)
                getJobOutputResult.setArchiveDescription(context.getHeader("x-amz-archive-description"));
        }
        
        getJobOutputResult.setStatus(context.getHttpResponse().getStatusCode());getJobOutputResult.setBody(new ContentLengthValidationInputStream(context.getHttpResponse().getContent(),Long.parseLong(context.getHeader("Content-Length"))));
        	
        return getJobOutputResult;
    }

    private static GetJobOutputResultJsonUnmarshaller instance;
    public static GetJobOutputResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new GetJobOutputResultJsonUnmarshaller();
        return instance;
    }
}
    