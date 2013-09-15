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
 * Cluster Security Group StAX Unmarshaller
 */
public class ClusterSecurityGroupStaxUnmarshaller implements Unmarshaller<ClusterSecurityGroup, StaxUnmarshallerContext> {

    public ClusterSecurityGroup unmarshall(StaxUnmarshallerContext context) throws Exception {
        ClusterSecurityGroup clusterSecurityGroup = new ClusterSecurityGroup();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return clusterSecurityGroup;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("ClusterSecurityGroupName", targetDepth)) {
                    clusterSecurityGroup.setClusterSecurityGroupName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Description", targetDepth)) {
                    clusterSecurityGroup.setDescription(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EC2SecurityGroups/EC2SecurityGroup", targetDepth)) {
                    clusterSecurityGroup.getEC2SecurityGroups().add(EC2SecurityGroupStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("IPRanges/IPRange", targetDepth)) {
                    clusterSecurityGroup.getIPRanges().add(IPRangeStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return clusterSecurityGroup;
                }
            }
        }
    }

    private static ClusterSecurityGroupStaxUnmarshaller instance;
    public static ClusterSecurityGroupStaxUnmarshaller getInstance() {
        if (instance == null) instance = new ClusterSecurityGroupStaxUnmarshaller();
        return instance;
    }
}
    