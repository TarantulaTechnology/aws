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

package com.amazonaws.services.cloudformation.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Stack Resource Detail StAX Unmarshaller
 */
public class StackResourceDetailStaxUnmarshaller implements Unmarshaller<StackResourceDetail, StaxUnmarshallerContext> {

    public StackResourceDetail unmarshall(StaxUnmarshallerContext context) throws Exception {
        StackResourceDetail stackResourceDetail = new StackResourceDetail();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return stackResourceDetail;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("StackName", targetDepth)) {
                    stackResourceDetail.setStackName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("StackId", targetDepth)) {
                    stackResourceDetail.setStackId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LogicalResourceId", targetDepth)) {
                    stackResourceDetail.setLogicalResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("PhysicalResourceId", targetDepth)) {
                    stackResourceDetail.setPhysicalResourceId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceType", targetDepth)) {
                    stackResourceDetail.setResourceType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("LastUpdatedTimestamp", targetDepth)) {
                    stackResourceDetail.setLastUpdatedTimestamp(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceStatus", targetDepth)) {
                    stackResourceDetail.setResourceStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourceStatusReason", targetDepth)) {
                    stackResourceDetail.setResourceStatusReason(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    stackResourceDetail.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Metadata", targetDepth)) {
                    stackResourceDetail.setMetadata(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return stackResourceDetail;
                }
            }
        }
    }

    private static StackResourceDetailStaxUnmarshaller instance;
    public static StackResourceDetailStaxUnmarshaller getInstance() {
        if (instance == null) instance = new StackResourceDetailStaxUnmarshaller();
        return instance;
    }
}
    