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
package com.amazonaws.services.sns.model;
import java.io.Serializable;

/**
 * <p>
 * Response for GetPlatformApplicationAttributes action.
 * </p>
 */
public class GetPlatformApplicationAttributesResult  implements Serializable  {

    /**
     * Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     * EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     * remove comments once it is available --> <!--
     * <li><code>AllowEndpointPolicies</code> true or false (default false) -
     * If true, then policies on endpoints will be evaluated to determine if
     * the topic or user has the rights to send messages to it. If false, the
     * endpoint policy will be ignored and only the mobile app policy will be
     * considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     * ARN to which EndpointCreated event notifications should be sent.</li>
     * <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     * EndpointDeleted event notifications should be sent.</li>
     * <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     * EndpointUpdate event notifications should be sent.</li> <!--
     * <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     * DeliveryAttemptFailure event notifications should be sent upon Direct
     * Publish delivery attempt failures to one of the application's
     * endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     * to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the
     * application's endpoints.</li> <!-- <li><code>Policy</code> Access
     * policy controlling who can send messages to endpoints under this
     * mobile app.</li> --> </ul>
     */
    private java.util.Map<String,String> attributes;

    /**
     * Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     * EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     * remove comments once it is available --> <!--
     * <li><code>AllowEndpointPolicies</code> true or false (default false) -
     * If true, then policies on endpoints will be evaluated to determine if
     * the topic or user has the rights to send messages to it. If false, the
     * endpoint policy will be ignored and only the mobile app policy will be
     * considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     * ARN to which EndpointCreated event notifications should be sent.</li>
     * <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     * EndpointDeleted event notifications should be sent.</li>
     * <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     * EndpointUpdate event notifications should be sent.</li> <!--
     * <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     * DeliveryAttemptFailure event notifications should be sent upon Direct
     * Publish delivery attempt failures to one of the application's
     * endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     * to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the
     * application's endpoints.</li> <!-- <li><code>Policy</code> Access
     * policy controlling who can send messages to endpoints under this
     * mobile app.</li> --> </ul>
     *
     * @return Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     *         EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     *         remove comments once it is available --> <!--
     *         <li><code>AllowEndpointPolicies</code> true or false (default false) -
     *         If true, then policies on endpoints will be evaluated to determine if
     *         the topic or user has the rights to send messages to it. If false, the
     *         endpoint policy will be ignored and only the mobile app policy will be
     *         considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     *         ARN to which EndpointCreated event notifications should be sent.</li>
     *         <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     *         EndpointDeleted event notifications should be sent.</li>
     *         <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     *         EndpointUpdate event notifications should be sent.</li> <!--
     *         <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     *         DeliveryAttemptFailure event notifications should be sent upon Direct
     *         Publish delivery attempt failures to one of the application's
     *         endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     *         to which DeliveryFailure event notifications should be sent upon
     *         Direct Publish delivery failure (permanent) to one of the
     *         application's endpoints.</li> <!-- <li><code>Policy</code> Access
     *         policy controlling who can send messages to endpoints under this
     *         mobile app.</li> --> </ul>
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;

    }
    
    /**
     * Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     * EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     * remove comments once it is available --> <!--
     * <li><code>AllowEndpointPolicies</code> true or false (default false) -
     * If true, then policies on endpoints will be evaluated to determine if
     * the topic or user has the rights to send messages to it. If false, the
     * endpoint policy will be ignored and only the mobile app policy will be
     * considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     * ARN to which EndpointCreated event notifications should be sent.</li>
     * <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     * EndpointDeleted event notifications should be sent.</li>
     * <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     * EndpointUpdate event notifications should be sent.</li> <!--
     * <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     * DeliveryAttemptFailure event notifications should be sent upon Direct
     * Publish delivery attempt failures to one of the application's
     * endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     * to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the
     * application's endpoints.</li> <!-- <li><code>Policy</code> Access
     * policy controlling who can send messages to endpoints under this
     * mobile app.</li> --> </ul>
     *
     * @param attributes Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     *         EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     *         remove comments once it is available --> <!--
     *         <li><code>AllowEndpointPolicies</code> true or false (default false) -
     *         If true, then policies on endpoints will be evaluated to determine if
     *         the topic or user has the rights to send messages to it. If false, the
     *         endpoint policy will be ignored and only the mobile app policy will be
     *         considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     *         ARN to which EndpointCreated event notifications should be sent.</li>
     *         <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     *         EndpointDeleted event notifications should be sent.</li>
     *         <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     *         EndpointUpdate event notifications should be sent.</li> <!--
     *         <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     *         DeliveryAttemptFailure event notifications should be sent upon Direct
     *         Publish delivery attempt failures to one of the application's
     *         endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     *         to which DeliveryFailure event notifications should be sent upon
     *         Direct Publish delivery failure (permanent) to one of the
     *         application's endpoints.</li> <!-- <li><code>Policy</code> Access
     *         policy controlling who can send messages to endpoints under this
     *         mobile app.</li> --> </ul>
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     * EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     * remove comments once it is available --> <!--
     * <li><code>AllowEndpointPolicies</code> true or false (default false) -
     * If true, then policies on endpoints will be evaluated to determine if
     * the topic or user has the rights to send messages to it. If false, the
     * endpoint policy will be ignored and only the mobile app policy will be
     * considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     * ARN to which EndpointCreated event notifications should be sent.</li>
     * <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     * EndpointDeleted event notifications should be sent.</li>
     * <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     * EndpointUpdate event notifications should be sent.</li> <!--
     * <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     * DeliveryAttemptFailure event notifications should be sent upon Direct
     * Publish delivery attempt failures to one of the application's
     * endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     * to which DeliveryFailure event notifications should be sent upon
     * Direct Publish delivery failure (permanent) to one of the
     * application's endpoints.</li> <!-- <li><code>Policy</code> Access
     * policy controlling who can send messages to endpoints under this
     * mobile app.</li> --> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes Attributes include the following: <ul> <!-- AllowEndpointPolicies,
     *         EventDeliveryAttemptFailure, and Policy are not yet supported. Will
     *         remove comments once it is available --> <!--
     *         <li><code>AllowEndpointPolicies</code> true or false (default false) -
     *         If true, then policies on endpoints will be evaluated to determine if
     *         the topic or user has the rights to send messages to it. If false, the
     *         endpoint policy will be ignored and only the mobile app policy will be
     *         considered.</li> --> <li><code>EventEndpointCreated</code> -- Topic
     *         ARN to which EndpointCreated event notifications should be sent.</li>
     *         <li><code>EventEndpointDeleted</code> -- Topic ARN to which
     *         EndpointDeleted event notifications should be sent.</li>
     *         <li><code>EventEndpointUpdated</code> -- Topic ARN to which
     *         EndpointUpdate event notifications should be sent.</li> <!--
     *         <li><code>EventDeliveryAttemptFailure</code> Topic ARN to which
     *         DeliveryAttemptFailure event notifications should be sent upon Direct
     *         Publish delivery attempt failures to one of the application's
     *         endpoints.</li> --> <li><code>EventDeliveryFailure</code> -- Topic ARN
     *         to which DeliveryFailure event notifications should be sent upon
     *         Direct Publish delivery failure (permanent) to one of the
     *         application's endpoints.</li> <!-- <li><code>Policy</code> Access
     *         policy controlling who can send messages to endpoints under this
     *         mobile app.</li> --> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public GetPlatformApplicationAttributesResult withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPlatformApplicationAttributesResult == false) return false;
        GetPlatformApplicationAttributesResult other = (GetPlatformApplicationAttributesResult)obj;
        
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        return true;
    }
    
}
    