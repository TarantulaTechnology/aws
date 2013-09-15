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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Disassociate Address Request Marshaller
 */
public class DisassociateAddressRequestMarshaller implements Marshaller<Request<DisassociateAddressRequest>, DisassociateAddressRequest> {

    public Request<DisassociateAddressRequest> marshall(DisassociateAddressRequest disassociateAddressRequest) {

        if (disassociateAddressRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<DisassociateAddressRequest> request = new DefaultRequest<DisassociateAddressRequest>(disassociateAddressRequest, "AmazonEC2");
        request.addParameter("Action", "DisassociateAddress");
        request.addParameter("Version", "2013-06-15");

        if (disassociateAddressRequest.getPublicIp() != null) {
            request.addParameter("PublicIp", StringUtils.fromString(disassociateAddressRequest.getPublicIp()));
        }
        if (disassociateAddressRequest.getAssociationId() != null) {
            request.addParameter("AssociationId", StringUtils.fromString(disassociateAddressRequest.getAssociationId()));
        }


        return request;
    }
}