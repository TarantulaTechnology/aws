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

package com.amazonaws.services.elasticache.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Modify Cache Parameter Group Result StAX Unmarshaller
 */
public class ModifyCacheParameterGroupResultStaxUnmarshaller implements Unmarshaller<ModifyCacheParameterGroupResult, StaxUnmarshallerContext> {

    public ModifyCacheParameterGroupResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        ModifyCacheParameterGroupResult modifyCacheParameterGroupResult = new ModifyCacheParameterGroupResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return modifyCacheParameterGroupResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("CacheParameterGroupName", targetDepth)) {
                    modifyCacheParameterGroupResult.setCacheParameterGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return modifyCacheParameterGroupResult;
                }
            }
        }
    }

    private static ModifyCacheParameterGroupResultStaxUnmarshaller instance;
    public static ModifyCacheParameterGroupResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ModifyCacheParameterGroupResultStaxUnmarshaller();
        return instance;
    }
}
    