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

package com.amazonaws.services.dynamodbv2.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;


/**
 * Local Secondary Index Description JSON Unmarshaller
 */
public class LocalSecondaryIndexDescriptionJsonUnmarshaller implements Unmarshaller<LocalSecondaryIndexDescription, JsonUnmarshallerContext> {

    

    public LocalSecondaryIndexDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        LocalSecondaryIndexDescription localSecondaryIndexDescription = new LocalSecondaryIndexDescription();

        
        
        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.currentToken;
        if (token == null) token = context.nextToken();

        while (true) {
            if (token == null) break;

            
            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("IndexName", targetDepth)) {
                    context.nextToken();
                    localSecondaryIndexDescription.setIndexName(StringJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("KeySchema", targetDepth)) {
                    localSecondaryIndexDescription.setKeySchema(new ListUnmarshaller<KeySchemaElement>(KeySchemaElementJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("Projection", targetDepth)) {
                    context.nextToken();
                    localSecondaryIndexDescription.setProjection(ProjectionJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("IndexSizeBytes", targetDepth)) {
                    context.nextToken();
                    localSecondaryIndexDescription.setIndexSizeBytes(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("ItemCount", targetDepth)) {
                    context.nextToken();
                    localSecondaryIndexDescription.setItemCount(LongJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth) break;
                }
            }
            

            token = context.nextToken();
        }
        
        return localSecondaryIndexDescription;
    }

    private static LocalSecondaryIndexDescriptionJsonUnmarshaller instance;
    public static LocalSecondaryIndexDescriptionJsonUnmarshaller getInstance() {
        if (instance == null) instance = new LocalSecondaryIndexDescriptionJsonUnmarshaller();
        return instance;
    }
}
    