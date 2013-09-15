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
 * Modify Cluster Parameter Group Request Marshaller
 */
public class ModifyClusterParameterGroupRequestMarshaller implements Marshaller<Request<ModifyClusterParameterGroupRequest>, ModifyClusterParameterGroupRequest> {

    public Request<ModifyClusterParameterGroupRequest> marshall(ModifyClusterParameterGroupRequest modifyClusterParameterGroupRequest) {

        if (modifyClusterParameterGroupRequest == null) {
		    throw new AmazonClientException("Invalid argument passed to marshall(...)");
		}

        Request<ModifyClusterParameterGroupRequest> request = new DefaultRequest<ModifyClusterParameterGroupRequest>(modifyClusterParameterGroupRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyClusterParameterGroup");
        request.addParameter("Version", "2012-12-01");

        if (modifyClusterParameterGroupRequest.getParameterGroupName() != null) {
            request.addParameter("ParameterGroupName", StringUtils.fromString(modifyClusterParameterGroupRequest.getParameterGroupName()));
        }

        java.util.List<Parameter> parametersList = modifyClusterParameterGroupRequest.getParameters();
        int parametersListIndex = 1;

        for (Parameter parametersListValue : parametersList) {
            Parameter parameterMember = parametersListValue;
            if (parameterMember != null) {
                if (parameterMember.getParameterName() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".ParameterName", StringUtils.fromString(parameterMember.getParameterName()));
                }
                if (parameterMember.getParameterValue() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".ParameterValue", StringUtils.fromString(parameterMember.getParameterValue()));
                }
                if (parameterMember.getDescription() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".Description", StringUtils.fromString(parameterMember.getDescription()));
                }
                if (parameterMember.getSource() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".Source", StringUtils.fromString(parameterMember.getSource()));
                }
                if (parameterMember.getDataType() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".DataType", StringUtils.fromString(parameterMember.getDataType()));
                }
                if (parameterMember.getAllowedValues() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".AllowedValues", StringUtils.fromString(parameterMember.getAllowedValues()));
                }
                if (parameterMember.isModifiable() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".IsModifiable", StringUtils.fromBoolean(parameterMember.isModifiable()));
                }
                if (parameterMember.getMinimumEngineVersion() != null) {
                    request.addParameter("Parameters.Parameter." + parametersListIndex + ".MinimumEngineVersion", StringUtils.fromString(parameterMember.getMinimumEngineVersion()));
                }
            }

            parametersListIndex++;
        }


        return request;
    }
}
