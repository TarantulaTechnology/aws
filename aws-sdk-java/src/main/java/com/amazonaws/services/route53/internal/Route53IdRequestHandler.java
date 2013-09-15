/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.internal;

import com.amazonaws.Request;
import com.amazonaws.handlers.AbstractRequestHandler;
import com.amazonaws.services.route53.model.AliasTarget;
import com.amazonaws.services.route53.model.ChangeInfo;
import com.amazonaws.services.route53.model.ChangeResourceRecordSetsResult;
import com.amazonaws.services.route53.model.CreateHostedZoneResult;
import com.amazonaws.services.route53.model.DeleteHostedZoneResult;
import com.amazonaws.services.route53.model.GetChangeResult;
import com.amazonaws.services.route53.model.GetHostedZoneResult;
import com.amazonaws.services.route53.model.HostedZone;
import com.amazonaws.services.route53.model.ListHostedZonesResult;
import com.amazonaws.services.route53.model.ListResourceRecordSetsResult;
import com.amazonaws.services.route53.model.ResourceRecordSet;
import com.amazonaws.util.TimingInfo;

/**
 * Route 53 returns a portion of the URL resource path as the ID for a few
 * elements, but when the service accepts those IDs, the resource path portion
 * cannot be included, otherwise requests fail. This handler removes those
 * partial resource path elements from IDs returned by Route 53.
 */
public class Route53IdRequestHandler extends AbstractRequestHandler {

    @Override
    public void afterResponse(Request<?> request, Object obj, TimingInfo timingInfo) {
        if (obj instanceof ChangeResourceRecordSetsResult) {
            ChangeResourceRecordSetsResult result = (ChangeResourceRecordSetsResult)obj;
            removePrefix(result.getChangeInfo());
        } else if (obj instanceof CreateHostedZoneResult) {
            CreateHostedZoneResult result = (CreateHostedZoneResult)obj;
            removePrefix(result.getChangeInfo());
            removePrefix(result.getHostedZone());
        } else if (obj instanceof DeleteHostedZoneResult) {
            DeleteHostedZoneResult result = (DeleteHostedZoneResult)obj;
            removePrefix(result.getChangeInfo());
        } else if (obj instanceof GetChangeResult) {
            GetChangeResult result = (GetChangeResult)obj;
            removePrefix(result.getChangeInfo());
        } else if (obj instanceof GetHostedZoneResult) {
            GetHostedZoneResult result = (GetHostedZoneResult)obj;
            removePrefix(result.getHostedZone());
        } else if (obj instanceof ListHostedZonesResult) {
            ListHostedZonesResult result = (ListHostedZonesResult)obj;
            for (HostedZone zone : result.getHostedZones()) removePrefix(zone);
        } else if (obj instanceof ListResourceRecordSetsResult) {
            ListResourceRecordSetsResult result = (ListResourceRecordSetsResult)obj;
            for (ResourceRecordSet rrset : result.getResourceRecordSets()) removePrefix(rrset);
        }
    }

    private void removePrefix(ResourceRecordSet rrset) {
        if (rrset == null) return;

        removePrefix(rrset.getAliasTarget());
        rrset.setSetIdentifier(removePrefix(rrset.getSetIdentifier()));
    }

    private void removePrefix(AliasTarget aliasTarget) {
        if (aliasTarget == null) return;

        aliasTarget.setHostedZoneId(removePrefix(aliasTarget.getHostedZoneId()));
    }

    private void removePrefix(ChangeInfo changeInfo) {
        if (changeInfo == null) return;

        if (changeInfo.getId() != null) {
            changeInfo.setId(removePrefix(changeInfo.getId()));
        }
    }

    private void removePrefix(HostedZone hostedZone) {
        if (hostedZone == null) return;

        if (hostedZone.getId() != null) {
            hostedZone.setId(removePrefix(hostedZone.getId()));
        }
    }

    private String removePrefix(String s) {
        if (s == null) return null;

        int lastIndex = s.lastIndexOf("/");
        if (lastIndex > 0) {
            return s.substring(lastIndex + 1);
        }

        return s;
    }
}
