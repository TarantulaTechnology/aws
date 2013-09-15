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
 * Snapshot StAX Unmarshaller
 */
public class SnapshotStaxUnmarshaller implements Unmarshaller<Snapshot, StaxUnmarshallerContext> {

    public Snapshot unmarshall(StaxUnmarshallerContext context) throws Exception {
        Snapshot snapshot = new Snapshot();
        int originalDepth = context.getCurrentDepth();
        int targetDepth = originalDepth + 1;

        
        if (context.isStartOfDocument()) targetDepth += 2;
        

        if (context.isStartOfDocument()) targetDepth++;
        

        while (true) {
            XMLEvent xmlEvent = context.nextEvent();
            if (xmlEvent.isEndDocument()) return snapshot;

            if (xmlEvent.isAttribute() || xmlEvent.isStartElement()) {
                if (context.testExpression("SnapshotIdentifier", targetDepth)) {
                    snapshot.setSnapshotIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterIdentifier", targetDepth)) {
                    snapshot.setClusterIdentifier(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotCreateTime", targetDepth)) {
                    snapshot.setSnapshotCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Status", targetDepth)) {
                    snapshot.setStatus(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Port", targetDepth)) {
                    snapshot.setPort(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AvailabilityZone", targetDepth)) {
                    snapshot.setAvailabilityZone(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterCreateTime", targetDepth)) {
                    snapshot.setClusterCreateTime(DateStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("MasterUsername", targetDepth)) {
                    snapshot.setMasterUsername(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ClusterVersion", targetDepth)) {
                    snapshot.setClusterVersion(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("SnapshotType", targetDepth)) {
                    snapshot.setSnapshotType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NodeType", targetDepth)) {
                    snapshot.setNodeType(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("NumberOfNodes", targetDepth)) {
                    snapshot.setNumberOfNodes(IntegerStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("DBName", targetDepth)) {
                    snapshot.setDBName(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("VpcId", targetDepth)) {
                    snapshot.setVpcId(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("Encrypted", targetDepth)) {
                    snapshot.setEncrypted(BooleanStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("AccountsWithRestoreAccess/AccountWithRestoreAccess", targetDepth)) {
                    snapshot.getAccountsWithRestoreAccess().add(AccountWithRestoreAccessStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("OwnerAccount", targetDepth)) {
                    snapshot.setOwnerAccount(StringStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("TotalBackupSizeInMegaBytes", targetDepth)) {
                    snapshot.setTotalBackupSizeInMegaBytes(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ActualIncrementalBackupSizeInMegaBytes", targetDepth)) {
                    snapshot.setActualIncrementalBackupSizeInMegaBytes(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("BackupProgressInMegaBytes", targetDepth)) {
                    snapshot.setBackupProgressInMegaBytes(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("CurrentBackupRateInMegaBytesPerSecond", targetDepth)) {
                    snapshot.setCurrentBackupRateInMegaBytesPerSecond(DoubleStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("EstimatedSecondsToCompletion", targetDepth)) {
                    snapshot.setEstimatedSecondsToCompletion(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
                if (context.testExpression("ElapsedTimeInSeconds", targetDepth)) {
                    snapshot.setElapsedTimeInSeconds(LongStaxUnmarshaller.getInstance().unmarshall(context));
                    continue;
                }
            } else if (xmlEvent.isEndElement()) {
                if (context.getCurrentDepth() < originalDepth) {
                    return snapshot;
                }
            }
        }
    }

    private static SnapshotStaxUnmarshaller instance;
    public static SnapshotStaxUnmarshaller getInstance() {
        if (instance == null) instance = new SnapshotStaxUnmarshaller();
        return instance;
    }
}
    