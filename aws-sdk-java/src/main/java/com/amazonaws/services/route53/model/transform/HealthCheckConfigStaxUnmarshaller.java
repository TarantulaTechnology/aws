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

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Health Check Config StAX Unmarshaller
 */
public class HealthCheckConfigStaxUnmarshaller implements Unmarshaller<HealthCheckConfig, StaxUnmarshallerContext> {

    public HealthCheckConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        HealthCheckConfig healthCheckConfig = new HealthCheckConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return healthCheckConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("IPAddress", targetDepth)) {
                    healthCheckConfig.setIPAddress(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    healthCheckConfig.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Type", targetDepth)) {
                    healthCheckConfig.setType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ResourcePath", targetDepth)) {
                    healthCheckConfig.setResourcePath(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("FullyQualifiedDomainName", targetDepth)) {
                    healthCheckConfig.setFullyQualifiedDomainName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return healthCheckConfig;
                }
            }
        }
    }

    private static HealthCheckConfigStaxUnmarshaller instance;
    public static HealthCheckConfigStaxUnmarshaller getInstance() {
        if (instance == null) instance = new HealthCheckConfigStaxUnmarshaller();
        return instance;
    }
}
    