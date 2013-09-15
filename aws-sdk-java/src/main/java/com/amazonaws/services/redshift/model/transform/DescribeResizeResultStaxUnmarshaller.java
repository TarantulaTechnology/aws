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

package com.amazonaws.services.redshift.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Describe Resize Result StAX Unmarshaller
 */
public class DescribeResizeResultStaxUnmarshaller implements Unmarshaller<DescribeResizeResult, StaxUnmarshallerContext> {

    public DescribeResizeResult unmarshall(StaxUnmarshallerContext context) throws Exception {
        DescribeResizeResult describeResizeResult = new DescribeResizeResult();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return describeResizeResult;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("TargetNodeType", targetDepth)) {
                    describeResizeResult.setTargetNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetNumberOfNodes", targetDepth)) {
                    describeResizeResult.setTargetNumberOfNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TargetClusterType", targetDepth)) {
                    describeResizeResult.setTargetClusterType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    describeResizeResult.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ImportTablesCompleted/member", targetDepth)) {
                    describeResizeResult.getImportTablesCompleted().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ImportTablesInProgress/member", targetDepth)) {
                    describeResizeResult.getImportTablesInProgress().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ImportTablesNotStarted/member", targetDepth)) {
                    describeResizeResult.getImportTablesNotStarted().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return describeResizeResult;
                }
            }
        }
    }

    private static DescribeResizeResultStaxUnmarshaller instance;
    public static DescribeResizeResultStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DescribeResizeResultStaxUnmarshaller();
        return instance;
    }
}
    