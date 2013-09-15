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

import javax.xml.stream.events.XMLEvent;

import com.amazonaws.services.cloudfront_2012_03_15.model.ActiveTrustedSigners;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;


/**
 * Active Trusted Signers StAX Unmarshaller
 */
public class ActiveTrustedSignersStaxUnmarshaller implements Unmarshaller<ActiveTrustedSigners, StaxUnmarshallerContext> {

    public ActiveTrustedSigners unmarshall(StaxUnmarshallerContext context) throws Exception {
        ActiveTrustedSigners activeTrustedSigners = new ActiveTrustedSigners();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;
        if (context.isStartOfDocument()) targetDepth += 1;


        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return activeTrustedSigners;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("Signer", targetDepth)) {
                    activeTrustedSigners.getSigners().add(SignerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return activeTrustedSigners;
                }
            }
        }
    }

    private static ActiveTrustedSignersStaxUnmarshaller instance;
    public static ActiveTrustedSignersStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ActiveTrustedSignersStaxUnmarshaller();
        return instance;
    }
}
