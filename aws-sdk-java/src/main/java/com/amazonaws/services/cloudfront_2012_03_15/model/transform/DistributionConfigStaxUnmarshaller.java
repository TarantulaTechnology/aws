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

package com.amazonaws.services.cloudfront_2012_03_15.model.transform;

import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront_2012_03_15.model.*;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.MapEntry;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeStaxUnmarshallers.*;


/**
 * Distribution Config StAX Unmarshaller
 */
public class DistributionConfigStaxUnmarshaller implements Unmarshaller<DistributionConfig, StaxUnmarshallerContext> {

    public DistributionConfig unmarshall(StaxUnmarshallerContext context) throws Exception {
        DistributionConfig distributionConfig = new DistributionConfig();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return distributionConfig;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("S3Origin", targetDepth)) {
                    distributionConfig.setS3Origin(S3OriginStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CustomOrigin", targetDepth)) {
                    distributionConfig.setCustomOrigin(CustomOriginStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CallerReference", targetDepth)) {
                    distributionConfig.setCallerReference(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CNAME", targetDepth)) {
                    distributionConfig.getCNAME().add(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Comment", targetDepth)) {
                    distributionConfig.setComment(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Enabled", targetDepth)) {
                    distributionConfig.setEnabled(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Logging", targetDepth)) {
                    distributionConfig.setLogging(LoggingConfigStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TrustedSigners", targetDepth)) {
                    distributionConfig.setTrustedSigners(TrustedSignersStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("RequiredProtocols", targetDepth)) {
                    distributionConfig.setRequiredProtocols(RequiredProtocolsStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DefaultRootObject", targetDepth)) {
                    distributionConfig.setDefaultRootObject(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CachingBehavior", targetDepth)) {
                    distributionConfig.setCachingBehavior(CachingBehaviorStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return distributionConfig;
                }
            }
        }
    }

    private static DistributionConfigStaxUnmarshaller instance;
    public static DistributionConfigStaxUnmarshaller getInstance() {
        if (instance == null) instance = new DistributionConfigStaxUnmarshaller();
        return instance;
    }
}
    
