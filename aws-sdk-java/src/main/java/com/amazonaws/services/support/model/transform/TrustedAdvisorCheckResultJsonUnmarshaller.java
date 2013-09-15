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

package com.amazonaws.services.support.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.support.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Trusted Advisor Check Result JSON Unmarshaller
 */
public class TrustedAdvisorCheckResultJsonUnmarshaller implements Unmarshaller<TrustedAdvisorCheckResult, JsonUnmarshallerContext> {

    

    public TrustedAdvisorCheckResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        TrustedAdvisorCheckResult trustedAdvisorCheckResult = new TrustedAdvisorCheckResult();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("checkId", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckResult.setCheckId(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("timestamp", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckResult.setTimestamp(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("status", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckResult.setStatus(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("resourcesSummary", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckResult.setResourcesSummary(TrustedAdvisorResourcesSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("categorySpecificSummary", targetDepth)) {
                    context.nextToken();
                    trustedAdvisorCheckResult.setCategorySpecificSummary(TrustedAdvisorCategorySpecificSummaryJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("flaggedResources", targetDepth)) {
                    trustedAdvisorCheckResult.setFlaggedResources(new ListUnmarshaller<TrustedAdvisorResourceDetail>(TrustedAdvisorResourceDetailJsonUnmarshaller.getInstance()).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return trustedAdvisorCheckResult;
    }

    private static TrustedAdvisorCheckResultJsonUnmarshaller instance;
    public static TrustedAdvisorCheckResultJsonUnmarshaller getInstance() {
        if (instance == null) instance = new TrustedAdvisorCheckResultJsonUnmarshaller();
        return instance;
    }
}
    