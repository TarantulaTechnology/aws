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

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.simpleworkflow.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Decision Task Timed Out Event Attributes JSON Unmarshaller
 */
public class DecisionTaskTimedOutEventAttributesJsonUnmarshaller implements Unmarshaller<DecisionTaskTimedOutEventAttributes, JsonUnmarshallerContext> {

    

    public DecisionTaskTimedOutEventAttributes unmarshall(JsonUnmarshallerContext context) throws Exception {
        DecisionTaskTimedOutEventAttributes decisionTaskTimedOutEventAttributes = new DecisionTaskTimedOutEventAttributes();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("timeoutType", targetDepth)) {
                    context.nextToken();
                    decisionTaskTimedOutEventAttributes.setTimeoutType(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("scheduledEventId", targetDepth)) {
                    context.nextToken();
                    decisionTaskTimedOutEventAttributes.setScheduledEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("startedEventId", targetDepth)) {
                    context.nextToken();
                    decisionTaskTimedOutEventAttributes.setStartedEventId(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return decisionTaskTimedOutEventAttributes;
    }

    private static DecisionTaskTimedOutEventAttributesJsonUnmarshaller instance;
    public static DecisionTaskTimedOutEventAttributesJsonUnmarshaller getInstance() {
        if (instance == null) instance = new DecisionTaskTimedOutEventAttributesJsonUnmarshaller();
        return instance;
    }
}
    