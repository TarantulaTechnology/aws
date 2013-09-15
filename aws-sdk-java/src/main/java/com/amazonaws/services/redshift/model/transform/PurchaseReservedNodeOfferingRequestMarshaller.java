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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.redshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Purchase Reserved Node Offering Request Marshaller
 */
public class PurchaseReservedNodeOfferingRequestMarshaller implements Marshaller<Request<PurchaseReservedNodeOfferingRequest>, PurchaseReservedNodeOfferingRequest> {

    public Request<PurchaseReservedNodeOfferingRequest> marshall(PurchaseReservedNodeOfferingRequest purchaseReservedNodeOfferingRequest) {

        if (purchaseReservedNodeOfferingRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<PurchaseReservedNodeOfferingRequest> request = new DefaultRequest<PurchaseReservedNodeOfferingRequest>(purchaseReservedNodeOfferingRequest, "AmazonRedshift");
        request.addParameter("Action", "PurchaseReservedNodeOffering");
        request.addParameter("Version", "2012-12-01");

        if (purchaseReservedNodeOfferingRequest.getReservedNodeOfferingId() != null) {
            request.addParameter("ReservedNodeOfferingId", StringUtils.fromString(purchaseReservedNodeOfferingRequest.getReservedNodeOfferingId()));
        }
        if (purchaseReservedNodeOfferingRequest.getNodeCount() != null) {
            request.addParameter("NodeCount", StringUtils.fromInteger(purchaseReservedNodeOfferingRequest.getNodeCount()));
        }


        return request;
    }
}
