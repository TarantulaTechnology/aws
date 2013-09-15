/*
 * Copyright 2011-2012 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.eclipse.explorer.rds;

import static com.amazonaws.eclipse.explorer.rds.RDSExplorerNodes.RDS_ROOT_NODE;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.eclipse.core.AwsToolkitCore;
import com.amazonaws.eclipse.core.regions.ServiceAbbreviations;
import com.amazonaws.eclipse.explorer.AWSResourcesRootElement;
import com.amazonaws.eclipse.explorer.AbstractContentProvider;
import com.amazonaws.eclipse.explorer.Loading;
import com.amazonaws.eclipse.explorer.rds.RDSExplorerNodes.DatabaseNode;
import com.amazonaws.services.rds.AmazonRDS;
import com.amazonaws.services.rds.model.DBInstance;

public class RDSContentProvider extends AbstractContentProvider {

    public boolean hasChildren(Object element) {
        return (element instanceof AWSResourcesRootElement ||
                element == RDS_ROOT_NODE);
    }

    @Override
    public Object[] loadChildren(Object parentElement) {
        if ( parentElement instanceof AWSResourcesRootElement) {
            return new Object[] { RDS_ROOT_NODE };
        }

        if ( parentElement == RDS_ROOT_NODE) {
            new DataLoaderThread(parentElement) {
                @Override
                public Object[] loadData() {
                    AmazonRDS rds = AwsToolkitCore.getClientFactory().getRDSClient();
                    List<DBInstance> dbInstances = rds.describeDBInstances().getDBInstances();
                    List<DatabaseNode> databaseNodes = new ArrayList<DatabaseNode>();
                    for (DBInstance dbInstance : dbInstances) {
                        databaseNodes.add(new DatabaseNode(dbInstance));
                    }
                    return databaseNodes.toArray();
                }
            }.start();
        }

        return Loading.LOADING;
    }

    @Override
    public String getServiceAbbreviation() {
        return ServiceAbbreviations.RDS;
    }
}
