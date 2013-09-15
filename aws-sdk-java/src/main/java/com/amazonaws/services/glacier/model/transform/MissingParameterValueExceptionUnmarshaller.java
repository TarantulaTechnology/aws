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

import com.amazonaws.AmazonServiceException;
import com.amazonaws.transform.GlacierErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.glacier.model.MissingParameterValueException;

public class MissingParameterValueExceptionUnmarshaller extends GlacierErrorUnmarshaller {

    public MissingParameterValueExceptionUnmarshaller() {
        super(MissingParameterValueException.class);
    }

    public AmazonServiceException unmarshall(JSONObject json) throws Exception {
        // Bail out if this isn't the right error code that this
        // marshaller understands.
        String errorCode = parseErrorCode(json);
        if (errorCode == null || !errorCode.equals("MissingParameterValueException"))
            return null;

        MissingParameterValueException e = (MissingParameterValueException)super.unmarshall(json);
        
        
        e.setType(parseMember("Type", json));
        
        e.setCode(parseMember("Code", json));
        
        return e;
    }
}
    