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
 * Container for the parameters to the {@link com.amazonaws.services.rds.AmazonRDS#describeDBSnapshots(DescribeDBSnapshotsRequest) DescribeDBSnapshots operation}.
 * <p>
 * Returns information about DBSnapshots. This API supports pagination.
 * </p>
 *
 * @see com.amazonaws.services.rds.AmazonRDS#describeDBSnapshots(DescribeDBSnapshotsRequest)
 */
public class DescribeDBSnapshotsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A DB Instance Identifier to retrieve the list of DB Snapshots for.
     * Cannot be used in conjunction with DBSnapshotIdentifier. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     */
    private String dBInstanceIdentifier;

    /**
     * A specific DB Snapshot Identifier to describe. Cannot be used in
     * conjunction with DBInstanceIdentifier. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     */
    private String dBSnapshotIdentifier;

    /**
     * An optional snapshot type for which snapshots will be returned. If not
     * specified, the returned results will include snapshots of all types.
     */
    private String snapshotType;

    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     */
    private Integer maxRecords;

    /**
     * An optional pagination token provided by a previous
     * DescribeDBSnapshots request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeDBSnapshotsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeDBSnapshotsRequest() {}
    
    /**
     * A DB Instance Identifier to retrieve the list of DB Snapshots for.
     * Cannot be used in conjunction with DBSnapshotIdentifier. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @return A DB Instance Identifier to retrieve the list of DB Snapshots for.
     *         Cannot be used in conjunction with DBSnapshotIdentifier. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }
    
    /**
     * A DB Instance Identifier to retrieve the list of DB Snapshots for.
     * Cannot be used in conjunction with DBSnapshotIdentifier. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     *
     * @param dBInstanceIdentifier A DB Instance Identifier to retrieve the list of DB Snapshots for.
     *         Cannot be used in conjunction with DBSnapshotIdentifier. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }
    
    /**
     * A DB Instance Identifier to retrieve the list of DB Snapshots for.
     * Cannot be used in conjunction with DBSnapshotIdentifier. This
     * parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     * from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     * character must be a letter</li> <li>Cannot end with a hyphen or
     * contain two consecutive hyphens</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBInstanceIdentifier A DB Instance Identifier to retrieve the list of DB Snapshots for.
     *         Cannot be used in conjunction with DBSnapshotIdentifier. This
     *         parameter isn't case sensitive. <p>Constraints: <ul> <li>Must contain
     *         from 1 to 63 alphanumeric characters or hyphens</li> <li>First
     *         character must be a letter</li> <li>Cannot end with a hyphen or
     *         contain two consecutive hyphens</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }
    
    
    /**
     * A specific DB Snapshot Identifier to describe. Cannot be used in
     * conjunction with DBInstanceIdentifier. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     *
     * @return A specific DB Snapshot Identifier to describe. Cannot be used in
     *         conjunction with DBInstanceIdentifier. This value is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>If this is the identifier of an automated snapshot, the
     *         <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }
    
    /**
     * A specific DB Snapshot Identifier to describe. Cannot be used in
     * conjunction with DBInstanceIdentifier. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     *
     * @param dBSnapshotIdentifier A specific DB Snapshot Identifier to describe. Cannot be used in
     *         conjunction with DBInstanceIdentifier. This value is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>If this is the identifier of an automated snapshot, the
     *         <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }
    
    /**
     * A specific DB Snapshot Identifier to describe. Cannot be used in
     * conjunction with DBInstanceIdentifier. This value is stored as a
     * lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     * alphanumeric characters</li> <li>First character must be a letter</li>
     * <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     * <li>If this is the identifier of an automated snapshot, the
     * <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBSnapshotIdentifier A specific DB Snapshot Identifier to describe. Cannot be used in
     *         conjunction with DBInstanceIdentifier. This value is stored as a
     *         lowercase string. <p>Constraints: <ul> <li>Must be 1 to 255
     *         alphanumeric characters</li> <li>First character must be a letter</li>
     *         <li>Cannot end with a hyphen or contain two consecutive hyphens</li>
     *         <li>If this is the identifier of an automated snapshot, the
     *         <code>SnapshotType</code> parameter must also be specified.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }
    
    
    /**
     * An optional snapshot type for which snapshots will be returned. If not
     * specified, the returned results will include snapshots of all types.
     *
     * @return An optional snapshot type for which snapshots will be returned. If not
     *         specified, the returned results will include snapshots of all types.
     */
    public String getSnapshotType() {
        return snapshotType;
    }
    
    /**
     * An optional snapshot type for which snapshots will be returned. If not
     * specified, the returned results will include snapshots of all types.
     *
     * @param snapshotType An optional snapshot type for which snapshots will be returned. If not
     *         specified, the returned results will include snapshots of all types.
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }
    
    /**
     * An optional snapshot type for which snapshots will be returned. If not
     * specified, the returned results will include snapshots of all types.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param snapshotType An optional snapshot type for which snapshots will be returned. If not
     *         specified, the returned results will include snapshots of all types.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsRequest withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }
    
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @return The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results may be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results may be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to include in the response. If more
     * records exist than the specified <code>MaxRecords</code> value, a
     * pagination token called a marker is included in the response so that
     * the remaining results may be retrieved. <p>Default: 100
     * <p>Constraints: minimum 20, maximum 100
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxRecords The maximum number of records to include in the response. If more
     *         records exist than the specified <code>MaxRecords</code> value, a
     *         pagination token called a marker is included in the response so that
     *         the remaining results may be retrieved. <p>Default: 100
     *         <p>Constraints: minimum 20, maximum 100
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
        return this;
    }
    
    
    /**
     * An optional pagination token provided by a previous
     * DescribeDBSnapshots request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous
     *         DescribeDBSnapshots request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DescribeDBSnapshots request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous
     *         DescribeDBSnapshots request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous
     * DescribeDBSnapshots request. If this parameter is specified, the
     * response includes only records beyond the marker, up to the value
     * specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous
     *         DescribeDBSnapshots request. If this parameter is specified, the
     *         response includes only records beyond the marker, up to the value
     *         specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeDBSnapshotsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getDBSnapshotIdentifier() != null) sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getSnapshotType() != null) sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBSnapshotsRequest == false) return false;
        DescribeDBSnapshotsRequest other = (DescribeDBSnapshotsRequest)obj;
        
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null) return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false) return false; 
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null) return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false) return false; 
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null) return false;
        if (other.getSnapshotType() != null && other.getSnapshotType().equals(this.getSnapshotType()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    