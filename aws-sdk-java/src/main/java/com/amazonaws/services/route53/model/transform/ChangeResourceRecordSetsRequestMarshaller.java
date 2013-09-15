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

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Change Resource Record Sets Request Marshaller
 */
public class ChangeResourceRecordSetsRequestMarshaller implements Marshaller<Request<ChangeResourceRecordSetsRequest>, ChangeResourceRecordSetsRequest> {

    public Request<ChangeResourceRecordSetsRequest> marshall(ChangeResourceRecordSetsRequest changeResourceRecordSetsRequest) {
        if (changeResourceRecordSetsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<ChangeResourceRecordSetsRequest> request = new DefaultRequest<ChangeResourceRecordSetsRequest>(changeResourceRecordSetsRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/2012-12-12/hostedzone/{Id}/rrset/"; 
        uriResourcePath = uriResourcePath.replace("{Id}", getString(changeResourceRecordSetsRequest.getHostedZoneId())); 

        if (uriResourcePath.contains("?")) {
            String queryString = uriResourcePath.substring(uriResourcePath.indexOf("?") + 1);
            uriResourcePath    = uriResourcePath.substring(0, uriResourcePath.indexOf("?"));

            for (String s : queryString.split("[;&]")) {
                String[] nameValuePair = s.split("=");
                if (nameValuePair.length == 2) {
                    request.addParameter(nameValuePair[0], nameValuePair[1]);
                } else {
                    request.addParameter(s, null);
                }
            }
        }

        request.setResourcePath(uriResourcePath);

        
            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2012-12-12/");

            
            
            xmlWriter.startElement("ChangeResourceRecordSetsRequest");
                    if (changeResourceRecordSetsRequest != null) {
            ChangeBatch changeBatchChangeBatch = changeResourceRecordSetsRequest.getChangeBatch();
            if (changeBatchChangeBatch != null) {
                xmlWriter.startElement("ChangeBatch");
                if (changeBatchChangeBatch.getComment() != null) {
                    xmlWriter.startElement("Comment").value(changeBatchChangeBatch.getComment()).endElement();
                }

                if (changeBatchChangeBatch != null) {
                    java.util.List<Change> changeBatchChangeBatchchangesList = changeBatchChangeBatch.getChanges();
                    if (changeBatchChangeBatchchangesList != null && changeBatchChangeBatchchangesList.size() > 0) {
                        int changeBatchChangeBatchchangesListIndex = 1;
                        xmlWriter.startElement("Changes");
                        for (Change changeBatchChangeBatchchangesListValue : changeBatchChangeBatchchangesList) {

                        xmlWriter.startElement("Change");
                            if (changeBatchChangeBatchchangesListValue.getAction() != null) {
                                xmlWriter.startElement("Action").value(changeBatchChangeBatchchangesListValue.getAction()).endElement();
                            }
                            if (changeBatchChangeBatchchangesListValue != null) {
                                ResourceRecordSet resourceRecordSetResourceRecordSet = changeBatchChangeBatchchangesListValue.getResourceRecordSet();
                                if (resourceRecordSetResourceRecordSet != null) {
                                    xmlWriter.startElement("ResourceRecordSet");
                                    if (resourceRecordSetResourceRecordSet.getName() != null) {
                                        xmlWriter.startElement("Name").value(resourceRecordSetResourceRecordSet.getName()).endElement();
                                    }
                                    if (resourceRecordSetResourceRecordSet.getType() != null) {
                                        xmlWriter.startElement("Type").value(resourceRecordSetResourceRecordSet.getType()).endElement();
                                    }
                                    if (resourceRecordSetResourceRecordSet.getSetIdentifier() != null) {
                                        xmlWriter.startElement("SetIdentifier").value(resourceRecordSetResourceRecordSet.getSetIdentifier()).endElement();
                                    }
                                    if (resourceRecordSetResourceRecordSet.getWeight() != null) {
                                        xmlWriter.startElement("Weight").value(resourceRecordSetResourceRecordSet.getWeight()).endElement();
                                    }
                                    if (resourceRecordSetResourceRecordSet.getRegion() != null) {
                                        xmlWriter.startElement("Region").value(resourceRecordSetResourceRecordSet.getRegion()).endElement();
                                    }
                                    if (resourceRecordSetResourceRecordSet.getFailover() != null) {
                                        xmlWriter.startElement("Failover").value(resourceRecordSetResourceRecordSet.getFailover()).endElement();
                                    }
                                    if (resourceRecordSetResourceRecordSet.getTTL() != null) {
                                        xmlWriter.startElement("TTL").value(resourceRecordSetResourceRecordSet.getTTL()).endElement();
                                    }

                                    if (resourceRecordSetResourceRecordSet != null) {
                                        java.util.List<ResourceRecord> resourceRecordSetResourceRecordSetresourceRecordsList = resourceRecordSetResourceRecordSet.getResourceRecords();
                                        if (resourceRecordSetResourceRecordSetresourceRecordsList != null && resourceRecordSetResourceRecordSetresourceRecordsList.size() > 0) {
                                            int resourceRecordSetResourceRecordSetresourceRecordsListIndex = 1;
                                            xmlWriter.startElement("ResourceRecords");
                                            for (ResourceRecord resourceRecordSetResourceRecordSetresourceRecordsListValue : resourceRecordSetResourceRecordSetresourceRecordsList) {

                                            xmlWriter.startElement("ResourceRecord");
                                                if (resourceRecordSetResourceRecordSetresourceRecordsListValue.getValue() != null) {
                                                    xmlWriter.startElement("Value").value(resourceRecordSetResourceRecordSetresourceRecordsListValue.getValue()).endElement();
                                                }
                                            xmlWriter.endElement();


                                                resourceRecordSetResourceRecordSetresourceRecordsListIndex++;
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                    if (resourceRecordSetResourceRecordSet != null) {
                                        AliasTarget aliasTargetAliasTarget = resourceRecordSetResourceRecordSet.getAliasTarget();
                                        if (aliasTargetAliasTarget != null) {
                                            xmlWriter.startElement("AliasTarget");
                                            if (aliasTargetAliasTarget.getHostedZoneId() != null) {
                                                xmlWriter.startElement("HostedZoneId").value(aliasTargetAliasTarget.getHostedZoneId()).endElement();
                                            }
                                            if (aliasTargetAliasTarget.getDNSName() != null) {
                                                xmlWriter.startElement("DNSName").value(aliasTargetAliasTarget.getDNSName()).endElement();
                                            }
                                            if (aliasTargetAliasTarget.isEvaluateTargetHealth() != null) {
                                                xmlWriter.startElement("EvaluateTargetHealth").value(aliasTargetAliasTarget.isEvaluateTargetHealth()).endElement();
                                            }
                                            xmlWriter.endElement();
                                        }
                                    }
                                    if (resourceRecordSetResourceRecordSet.getHealthCheckId() != null) {
                                        xmlWriter.startElement("HealthCheckId").value(resourceRecordSetResourceRecordSet.getHealthCheckId()).endElement();
                                    }
                                    xmlWriter.endElement();
                                }
                            }
                        xmlWriter.endElement();


                            changeBatchChangeBatchchangesListIndex++;
                        }
                        xmlWriter.endElement();
                    }
                }
                xmlWriter.endElement();
            }
        }

            xmlWriter.endElement();
            

            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes("UTF-8").length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }
        

        return request;
    }

    private String getString(String s) {
        if (s == null) return "";
        return s;
    }
}
