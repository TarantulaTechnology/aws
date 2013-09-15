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
package com.amazonaws.services.rds.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#promoteReadReplica(PromoteReadReplicaRequest) PromoteReadReplica operation}.
 * <p>
 * Promotes a Read Replica DB Instance to a standalone DB Instance.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#promoteReadReplica(PromoteReadReplicaRequest)
 */
public class PromoteReadReplicaRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     */
    private String dBInstanceIdentifier;

    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 0 to 8</li> </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. The
     * following list shows the time blocks for each region from which the
     * default backup windows are assigned. <ul> <li><b>US-East (Northern
     * Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     * California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     * Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     * Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     * </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     * <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     * Coordinated (UTC). Must not conflict with the preferred maintenance
     * window. Must be at least 30 minutes.
     */
    private String preferredBackupWindow;

    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     *
     * @return The DB Instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * The DB Instance identifier. This value is stored as a lowercase
     * string. <p>Constraints: <ul> <li>Must be the identifier for an
     * existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     * alphanumeric characters or hyphens</li> <li>First character must be a
     * letter</li> <li>Cannot end with a hyphen or contain two consecutive
     * hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier The DB Instance identifier. This value is stored as a lowercase
     *         string. <p>Constraints: <ul> <li>Must be the identifier for an
     *         existing Read Replica DB Instance</li> <li>Must contain from 1 to 63
     *         alphanumeric characters or hyphens</li> <li>First character must be a
     *         letter</li> <li>Cannot end with a hyphen or contain two consecutive
     *         hyphens</li> </ul> <p>Example: <copy>mydbinstance</copy>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PromoteReadReplicaRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 0 to 8</li> </ul>
     *
     * @return The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 0 to 8</li> </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 0 to 8</li> </ul>
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 0 to 8</li> </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }
    
    /**
     * The number of days to retain automated backups. Setting this parameter
     * to a positive number enables backups. Setting this parameter to 0
     * disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     * <li>Must be a value from 0 to 8</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param backupRetentionPeriod The number of days to retain automated backups. Setting this parameter
     *         to a positive number enables backups. Setting this parameter to 0
     *         disables automated backups. <p> Default: 1 <p>Constraints: <ul>
     *         <li>Must be a value from 0 to 8</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PromoteReadReplicaRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }
    
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. The
     * following list shows the time blocks for each region from which the
     * default backup windows are assigned. <ul> <li><b>US-East (Northern
     * Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     * California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     * Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     * Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     * </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     * <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     * Coordinated (UTC). Must not conflict with the preferred maintenance
     * window. Must be at least 30 minutes.
     *
     * @return The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. The
     *         following list shows the time blocks for each region from which the
     *         default backup windows are assigned. <ul> <li><b>US-East (Northern
     *         Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     *         California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     *         Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     *         Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     *         </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     *         <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     *         Coordinated (UTC). Must not conflict with the preferred maintenance
     *         window. Must be at least 30 minutes.
     */
    public String getPreferredBackupWindow() {
        return preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. The
     * following list shows the time blocks for each region from which the
     * default backup windows are assigned. <ul> <li><b>US-East (Northern
     * Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     * California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     * Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     * Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     * </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     * <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     * Coordinated (UTC). Must not conflict with the preferred maintenance
     * window. Must be at least 30 minutes.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. The
     *         following list shows the time blocks for each region from which the
     *         default backup windows are assigned. <ul> <li><b>US-East (Northern
     *         Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     *         California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     *         Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     *         Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     *         </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     *         <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     *         Coordinated (UTC). Must not conflict with the preferred maintenance
     *         window. Must be at least 30 minutes.
     */
    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }
    
    /**
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     * window selected at random from an 8-hour block of time per region. The
     * following list shows the time blocks for each region from which the
     * default backup windows are assigned. <ul> <li><b>US-East (Northern
     * Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     * California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     * Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     * Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     * </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     * <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     * Coordinated (UTC). Must not conflict with the preferred maintenance
     * window. Must be at least 30 minutes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param preferredBackupWindow The daily time range during which automated backups are created if
     *         automated backups are enabled, using the
     *         <code>BackupRetentionPeriod</code> parameter. <p> Default: A 30-minute
     *         window selected at random from an 8-hour block of time per region. The
     *         following list shows the time blocks for each region from which the
     *         default backup windows are assigned. <ul> <li><b>US-East (Northern
     *         Virginia) Region:</b> 03:00-11:00 UTC</li> <li><b>US-West (Northern
     *         California) Region:</b> 06:00-14:00 UTC</li> <li><b>EU (Ireland)
     *         Region:</b> 22:00-06:00 UTC</li> <li><b>Asia Pacific (Singapore)
     *         Region:</b> 14:00-22:00 UTC</li> <li><b>Asia Pacific (Tokyo) Region:
     *         </b> 17:00-03:00 UTC</li> </ul> <p> Constraints: Must be in the format
     *         <code>hh24:mi-hh24:mi</code>. Times should be Universal Time
     *         Coordinated (UTC). Must not conflict with the preferred maintenance
     *         window. Must be at least 30 minutes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public PromoteReadReplicaRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
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
        if (getDBInstanceIdentifier() != null) sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getBackupRetentionPeriod() != null) sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getPreferredBackupWindow() != null) sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode()); 
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PromoteReadReplicaRequest == false) return false;
        PromoteReadReplicaRequest other = (PromoteReadReplicaRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null) return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false) return false; 
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null) return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false) return false; 
        return true;
    }
    
}
    