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
package com.amazonaws.services.directconnect.model;
import java.io.Serializable;

/**
 * <p>
 * A virtual interface (VLAN) transmits the traffic between the Direct Connect location and the customer.
 * </p>
 */
public class CreatePrivateVirtualInterfaceResult implements Serializable {

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     */
    private String virtualInterfaceId;

    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     */
    private String location;

    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    private String connectionId;

    /**
     * The type of virtual interface <p>Example: Private (Amazon VPC) or
     * public (Amazon S3, Amazon DynamoDB, etc.)
     */
    private String virtualInterfaceType;

    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     */
    private String virtualInterfaceName;

    /**
     * VLAN ID <p>Example: 101
     */
    private Integer vlan;

    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     */
    private Integer asn;

    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     */
    private String authKey;

    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     */
    private String amazonAddress;

    /**
     * IP address assigned to the customer interface. <p>Example: 192.168.1.2
     */
    private String customerAddress;

    /**
     * State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     * only applies to public virtual interfaces. Each public virtual
     * interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     */
    private String virtualInterfaceState;

    /**
     * Information for generating the customer router configuration.
     */
    private String customerRouterConfig;

    /**
     * Virtual private gateway to a VPC. <p>Example: vgw-123er56
     */
    private String virtualGatewayId;

    /**
     * A list of route filter prefixes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix> routeFilterPrefixes;

    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     *
     * @return ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     */
    public String getVirtualInterfaceId() {
        return virtualInterfaceId;
    }
    
    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     *
     * @param virtualInterfaceId ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     */
    public void setVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
    }
    
    /**
     * ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     * None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceId ID of the virtual interface. <p>Example: dxvif-123dfg56 <p>Default:
     *         None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withVirtualInterfaceId(String virtualInterfaceId) {
        this.virtualInterfaceId = virtualInterfaceId;
        return this;
    }
    
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     *
     * @return Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     */
    public String getLocation() {
        return location;
    }
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     *
     * @param location Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     */
    public void setLocation(String location) {
        this.location = location;
    }
    
    /**
     * Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     * <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param location Where the AWS Direct Connect offering is located. <p>Example: EqSV5
     *         <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withLocation(String location) {
        this.location = location;
        return this;
    }
    
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public String getConnectionId() {
        return connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    
    /**
     * ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param connectionId ID of the connection. <p>Example: dxcon-fg5678gh <p>Default: None
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    
    /**
     * The type of virtual interface <p>Example: Private (Amazon VPC) or
     * public (Amazon S3, Amazon DynamoDB, etc.)
     *
     * @return The type of virtual interface <p>Example: Private (Amazon VPC) or
     *         public (Amazon S3, Amazon DynamoDB, etc.)
     */
    public String getVirtualInterfaceType() {
        return virtualInterfaceType;
    }
    
    /**
     * The type of virtual interface <p>Example: Private (Amazon VPC) or
     * public (Amazon S3, Amazon DynamoDB, etc.)
     *
     * @param virtualInterfaceType The type of virtual interface <p>Example: Private (Amazon VPC) or
     *         public (Amazon S3, Amazon DynamoDB, etc.)
     */
    public void setVirtualInterfaceType(String virtualInterfaceType) {
        this.virtualInterfaceType = virtualInterfaceType;
    }
    
    /**
     * The type of virtual interface <p>Example: Private (Amazon VPC) or
     * public (Amazon S3, Amazon DynamoDB, etc.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceType The type of virtual interface <p>Example: Private (Amazon VPC) or
     *         public (Amazon S3, Amazon DynamoDB, etc.)
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withVirtualInterfaceType(String virtualInterfaceType) {
        this.virtualInterfaceType = virtualInterfaceType;
        return this;
    }
    
    
    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     *
     * @return The name of the virtual interface assigned by the customer <p>Example:
     *         "Dev VPC"
     */
    public String getVirtualInterfaceName() {
        return virtualInterfaceName;
    }
    
    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     *
     * @param virtualInterfaceName The name of the virtual interface assigned by the customer <p>Example:
     *         "Dev VPC"
     */
    public void setVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
    }
    
    /**
     * The name of the virtual interface assigned by the customer <p>Example:
     * "Dev VPC"
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualInterfaceName The name of the virtual interface assigned by the customer <p>Example:
     *         "Dev VPC"
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withVirtualInterfaceName(String virtualInterfaceName) {
        this.virtualInterfaceName = virtualInterfaceName;
        return this;
    }
    
    
    /**
     * VLAN ID <p>Example: 101
     *
     * @return VLAN ID <p>Example: 101
     */
    public Integer getVlan() {
        return vlan;
    }
    
    /**
     * VLAN ID <p>Example: 101
     *
     * @param vlan VLAN ID <p>Example: 101
     */
    public void setVlan(Integer vlan) {
        this.vlan = vlan;
    }
    
    /**
     * VLAN ID <p>Example: 101
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vlan VLAN ID <p>Example: 101
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withVlan(Integer vlan) {
        this.vlan = vlan;
        return this;
    }
    
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     *
     * @return Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration <p>Example: 65000
     */
    public Integer getAsn() {
        return asn;
    }
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     *
     * @param asn Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration <p>Example: 65000
     */
    public void setAsn(Integer asn) {
        this.asn = asn;
    }
    
    /**
     * Autonomous system (AS) number for Border Gateway Protocol (BGP)
     * configuration <p>Example: 65000
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param asn Autonomous system (AS) number for Border Gateway Protocol (BGP)
     *         configuration <p>Example: 65000
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withAsn(Integer asn) {
        this.asn = asn;
        return this;
    }
    
    
    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     *
     * @return Authentication key for BGP configuration <p>Example: asdf34example
     */
    public String getAuthKey() {
        return authKey;
    }
    
    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     *
     * @param authKey Authentication key for BGP configuration <p>Example: asdf34example
     */
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }
    
    /**
     * Authentication key for BGP configuration <p>Example: asdf34example
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param authKey Authentication key for BGP configuration <p>Example: asdf34example
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withAuthKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    
    
    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     *
     * @return IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     */
    public String getAmazonAddress() {
        return amazonAddress;
    }
    
    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     *
     * @param amazonAddress IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     */
    public void setAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
    }
    
    /**
     * IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param amazonAddress IP address assigned to the Amazon interface. <p>Example: 192.168.1.1
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withAmazonAddress(String amazonAddress) {
        this.amazonAddress = amazonAddress;
        return this;
    }
    
    
    /**
     * IP address assigned to the customer interface. <p>Example: 192.168.1.2
     *
     * @return IP address assigned to the customer interface. <p>Example: 192.168.1.2
     */
    public String getCustomerAddress() {
        return customerAddress;
    }
    
    /**
     * IP address assigned to the customer interface. <p>Example: 192.168.1.2
     *
     * @param customerAddress IP address assigned to the customer interface. <p>Example: 192.168.1.2
     */
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    
    /**
     * IP address assigned to the customer interface. <p>Example: 192.168.1.2
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerAddress IP address assigned to the customer interface. <p>Example: 192.168.1.2
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }
    
    
    /**
     * State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     * only applies to public virtual interfaces. Each public virtual
     * interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @return State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     *         only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> </ul>
     *
     * @see VirtualInterfaceState
     */
    public String getVirtualInterfaceState() {
        return virtualInterfaceState;
    }
    
    /**
     * State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     * only applies to public virtual interfaces. Each public virtual
     * interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     *         only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> </ul>
     *
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }
    
    /**
     * State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     * only applies to public virtual interfaces. Each public virtual
     * interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     *         only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VirtualInterfaceState
     */
    public CreatePrivateVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
        return this;
    }
    
    
    /**
     * State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     * only applies to public virtual interfaces. Each public virtual
     * interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     *         only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> </ul>
     *
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
    }
    
    /**
     * State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     * only applies to public virtual interfaces. Each public virtual
     * interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>verifying, pending, available, deleting, deleted
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Verifying</b>: This state
     *         only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VirtualInterfaceState
     */
    public CreatePrivateVirtualInterfaceResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
        return this;
    }
    
    /**
     * Information for generating the customer router configuration.
     *
     * @return Information for generating the customer router configuration.
     */
    public String getCustomerRouterConfig() {
        return customerRouterConfig;
    }
    
    /**
     * Information for generating the customer router configuration.
     *
     * @param customerRouterConfig Information for generating the customer router configuration.
     */
    public void setCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
    }
    
    /**
     * Information for generating the customer router configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param customerRouterConfig Information for generating the customer router configuration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withCustomerRouterConfig(String customerRouterConfig) {
        this.customerRouterConfig = customerRouterConfig;
        return this;
    }
    
    
    /**
     * Virtual private gateway to a VPC. <p>Example: vgw-123er56
     *
     * @return Virtual private gateway to a VPC. <p>Example: vgw-123er56
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }
    
    /**
     * Virtual private gateway to a VPC. <p>Example: vgw-123er56
     *
     * @param virtualGatewayId Virtual private gateway to a VPC. <p>Example: vgw-123er56
     */
    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }
    
    /**
     * Virtual private gateway to a VPC. <p>Example: vgw-123er56
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param virtualGatewayId Virtual private gateway to a VPC. <p>Example: vgw-123er56
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }
    
    
    /**
     * A list of route filter prefixes.
     *
     * @return A list of route filter prefixes.
     */
    public java.util.List<RouteFilterPrefix> getRouteFilterPrefixes() {
        
        if (routeFilterPrefixes == null) {
              routeFilterPrefixes = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix>();
              routeFilterPrefixes.setAutoConstruct(true);
        }
        return routeFilterPrefixes;
    }
    
    /**
     * A list of route filter prefixes.
     *
     * @param routeFilterPrefixes A list of route filter prefixes.
     */
    public void setRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix> routeFilterPrefixesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix>(routeFilterPrefixes.size());
        routeFilterPrefixesCopy.addAll(routeFilterPrefixes);
        this.routeFilterPrefixes = routeFilterPrefixesCopy;
    }
    
    /**
     * A list of route filter prefixes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeFilterPrefixes A list of route filter prefixes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withRouteFilterPrefixes(RouteFilterPrefix... routeFilterPrefixes) {
        if (getRouteFilterPrefixes() == null) setRouteFilterPrefixes(new java.util.ArrayList<RouteFilterPrefix>(routeFilterPrefixes.length));
        for (RouteFilterPrefix value : routeFilterPrefixes) {
            getRouteFilterPrefixes().add(value);
        }
        return this;
    }
    
    /**
     * A list of route filter prefixes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param routeFilterPrefixes A list of route filter prefixes.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreatePrivateVirtualInterfaceResult withRouteFilterPrefixes(java.util.Collection<RouteFilterPrefix> routeFilterPrefixes) {
        if (routeFilterPrefixes == null) {
            this.routeFilterPrefixes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix> routeFilterPrefixesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<RouteFilterPrefix>(routeFilterPrefixes.size());
            routeFilterPrefixesCopy.addAll(routeFilterPrefixes);
            this.routeFilterPrefixes = routeFilterPrefixesCopy;
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
        if (getVirtualInterfaceId() != null) sb.append("VirtualInterfaceId: " + getVirtualInterfaceId() + ",");
        if (getLocation() != null) sb.append("Location: " + getLocation() + ",");
        if (getConnectionId() != null) sb.append("ConnectionId: " + getConnectionId() + ",");
        if (getVirtualInterfaceType() != null) sb.append("VirtualInterfaceType: " + getVirtualInterfaceType() + ",");
        if (getVirtualInterfaceName() != null) sb.append("VirtualInterfaceName: " + getVirtualInterfaceName() + ",");
        if (getVlan() != null) sb.append("Vlan: " + getVlan() + ",");
        if (getAsn() != null) sb.append("Asn: " + getAsn() + ",");
        if (getAuthKey() != null) sb.append("AuthKey: " + getAuthKey() + ",");
        if (getAmazonAddress() != null) sb.append("AmazonAddress: " + getAmazonAddress() + ",");
        if (getCustomerAddress() != null) sb.append("CustomerAddress: " + getCustomerAddress() + ",");
        if (getVirtualInterfaceState() != null) sb.append("VirtualInterfaceState: " + getVirtualInterfaceState() + ",");
        if (getCustomerRouterConfig() != null) sb.append("CustomerRouterConfig: " + getCustomerRouterConfig() + ",");
        if (getVirtualGatewayId() != null) sb.append("VirtualGatewayId: " + getVirtualGatewayId() + ",");
        if (getRouteFilterPrefixes() != null) sb.append("RouteFilterPrefixes: " + getRouteFilterPrefixes() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualInterfaceId() == null) ? 0 : getVirtualInterfaceId().hashCode()); 
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode()); 
        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualInterfaceType() == null) ? 0 : getVirtualInterfaceType().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualInterfaceName() == null) ? 0 : getVirtualInterfaceName().hashCode()); 
        hashCode = prime * hashCode + ((getVlan() == null) ? 0 : getVlan().hashCode()); 
        hashCode = prime * hashCode + ((getAsn() == null) ? 0 : getAsn().hashCode()); 
        hashCode = prime * hashCode + ((getAuthKey() == null) ? 0 : getAuthKey().hashCode()); 
        hashCode = prime * hashCode + ((getAmazonAddress() == null) ? 0 : getAmazonAddress().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerAddress() == null) ? 0 : getCustomerAddress().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode()); 
        hashCode = prime * hashCode + ((getCustomerRouterConfig() == null) ? 0 : getCustomerRouterConfig().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualGatewayId() == null) ? 0 : getVirtualGatewayId().hashCode()); 
        hashCode = prime * hashCode + ((getRouteFilterPrefixes() == null) ? 0 : getRouteFilterPrefixes().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePrivateVirtualInterfaceResult == false) return false;
        CreatePrivateVirtualInterfaceResult other = (CreatePrivateVirtualInterfaceResult)obj;
        
        if (other.getVirtualInterfaceId() == null ^ this.getVirtualInterfaceId() == null) return false;
        if (other.getVirtualInterfaceId() != null && other.getVirtualInterfaceId().equals(this.getVirtualInterfaceId()) == false) return false; 
        if (other.getLocation() == null ^ this.getLocation() == null) return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false) return false; 
        if (other.getConnectionId() == null ^ this.getConnectionId() == null) return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false) return false; 
        if (other.getVirtualInterfaceType() == null ^ this.getVirtualInterfaceType() == null) return false;
        if (other.getVirtualInterfaceType() != null && other.getVirtualInterfaceType().equals(this.getVirtualInterfaceType()) == false) return false; 
        if (other.getVirtualInterfaceName() == null ^ this.getVirtualInterfaceName() == null) return false;
        if (other.getVirtualInterfaceName() != null && other.getVirtualInterfaceName().equals(this.getVirtualInterfaceName()) == false) return false; 
        if (other.getVlan() == null ^ this.getVlan() == null) return false;
        if (other.getVlan() != null && other.getVlan().equals(this.getVlan()) == false) return false; 
        if (other.getAsn() == null ^ this.getAsn() == null) return false;
        if (other.getAsn() != null && other.getAsn().equals(this.getAsn()) == false) return false; 
        if (other.getAuthKey() == null ^ this.getAuthKey() == null) return false;
        if (other.getAuthKey() != null && other.getAuthKey().equals(this.getAuthKey()) == false) return false; 
        if (other.getAmazonAddress() == null ^ this.getAmazonAddress() == null) return false;
        if (other.getAmazonAddress() != null && other.getAmazonAddress().equals(this.getAmazonAddress()) == false) return false; 
        if (other.getCustomerAddress() == null ^ this.getCustomerAddress() == null) return false;
        if (other.getCustomerAddress() != null && other.getCustomerAddress().equals(this.getCustomerAddress()) == false) return false; 
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null) return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false) return false; 
        if (other.getCustomerRouterConfig() == null ^ this.getCustomerRouterConfig() == null) return false;
        if (other.getCustomerRouterConfig() != null && other.getCustomerRouterConfig().equals(this.getCustomerRouterConfig()) == false) return false; 
        if (other.getVirtualGatewayId() == null ^ this.getVirtualGatewayId() == null) return false;
        if (other.getVirtualGatewayId() != null && other.getVirtualGatewayId().equals(this.getVirtualGatewayId()) == false) return false; 
        if (other.getRouteFilterPrefixes() == null ^ this.getRouteFilterPrefixes() == null) return false;
        if (other.getRouteFilterPrefixes() != null && other.getRouteFilterPrefixes().equals(this.getRouteFilterPrefixes()) == false) return false; 
        return true;
    }
    
}
    