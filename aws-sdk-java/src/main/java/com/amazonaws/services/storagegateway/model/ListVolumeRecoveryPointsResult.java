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
package com.amazonaws.services.storagegateway.model;
import java.io.Serializable;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> ListVolumeRecoveryPointsOutput$GatewayARN </li>
 * <li> ListVolumeRecoveryPointsOutput$VolumeRecoveryPointInfos </li>
 * 
 * </ul>
 */
public class ListVolumeRecoveryPointsResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the activated gateway whose local
     * disk information is returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     * describes a recovery point. If no recovery points are defined for the
     * volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<VolumeRecoveryPointInfo> volumeRecoveryPointInfos;

    /**
     * The Amazon Resource Name (ARN) of the activated gateway whose local
     * disk information is returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the activated gateway whose local
     *         disk information is returned.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the activated gateway whose local
     * disk information is returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the activated gateway whose local
     *         disk information is returned.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the activated gateway whose local
     * disk information is returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the activated gateway whose local
     *         disk information is returned.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVolumeRecoveryPointsResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     * describes a recovery point. If no recovery points are defined for the
     * volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     *
     * @return An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     *         describes a recovery point. If no recovery points are defined for the
     *         volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     */
    public java.util.List<VolumeRecoveryPointInfo> getVolumeRecoveryPointInfos() {
        
        if (volumeRecoveryPointInfos == null) {
              volumeRecoveryPointInfos = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeRecoveryPointInfo>();
              volumeRecoveryPointInfos.setAutoConstruct(true);
        }
        return volumeRecoveryPointInfos;
    }
    
    /**
     * An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     * describes a recovery point. If no recovery points are defined for the
     * volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     *
     * @param volumeRecoveryPointInfos An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     *         describes a recovery point. If no recovery points are defined for the
     *         volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     */
    public void setVolumeRecoveryPointInfos(java.util.Collection<VolumeRecoveryPointInfo> volumeRecoveryPointInfos) {
        if (volumeRecoveryPointInfos == null) {
            this.volumeRecoveryPointInfos = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<VolumeRecoveryPointInfo> volumeRecoveryPointInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeRecoveryPointInfo>(volumeRecoveryPointInfos.size());
        volumeRecoveryPointInfosCopy.addAll(volumeRecoveryPointInfos);
        this.volumeRecoveryPointInfos = volumeRecoveryPointInfosCopy;
    }
    
    /**
     * An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     * describes a recovery point. If no recovery points are defined for the
     * volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeRecoveryPointInfos An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     *         describes a recovery point. If no recovery points are defined for the
     *         volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVolumeRecoveryPointsResult withVolumeRecoveryPointInfos(VolumeRecoveryPointInfo... volumeRecoveryPointInfos) {
        if (getVolumeRecoveryPointInfos() == null) setVolumeRecoveryPointInfos(new java.util.ArrayList<VolumeRecoveryPointInfo>(volumeRecoveryPointInfos.length));
        for (VolumeRecoveryPointInfo value : volumeRecoveryPointInfos) {
            getVolumeRecoveryPointInfos().add(value);
        }
        return this;
    }
    
    /**
     * An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     * describes a recovery point. If no recovery points are defined for the
     * volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param volumeRecoveryPointInfos An array of <a>VolumeRecoveryPointInfo</a> objects, where each object
     *         describes a recovery point. If no recovery points are defined for the
     *         volume, then <i>VolumeRecoveryPointInfos</i> is an empty array "[]"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListVolumeRecoveryPointsResult withVolumeRecoveryPointInfos(java.util.Collection<VolumeRecoveryPointInfo> volumeRecoveryPointInfos) {
        if (volumeRecoveryPointInfos == null) {
            this.volumeRecoveryPointInfos = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<VolumeRecoveryPointInfo> volumeRecoveryPointInfosCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<VolumeRecoveryPointInfo>(volumeRecoveryPointInfos.size());
            volumeRecoveryPointInfosCopy.addAll(volumeRecoveryPointInfos);
            this.volumeRecoveryPointInfos = volumeRecoveryPointInfosCopy;
        }

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
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getVolumeRecoveryPointInfos() != null) sb.append("VolumeRecoveryPointInfos: " + getVolumeRecoveryPointInfos() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getVolumeRecoveryPointInfos() == null) ? 0 : getVolumeRecoveryPointInfos().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListVolumeRecoveryPointsResult == false) return false;
        ListVolumeRecoveryPointsResult other = (ListVolumeRecoveryPointsResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getVolumeRecoveryPointInfos() == null ^ this.getVolumeRecoveryPointInfos() == null) return false;
        if (other.getVolumeRecoveryPointInfos() != null && other.getVolumeRecoveryPointInfos().equals(this.getVolumeRecoveryPointInfos()) == false) return false; 
        return true;
    }
    
}
    