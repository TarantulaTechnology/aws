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
package com.amazonaws.services.storagegateway;
            
import java.util.concurrent.Future;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.handlers.AsyncHandler;
import com.amazonaws.services.storagegateway.model.*;

/**
 * Interface for accessing AWSStorageGateway asynchronously.
 * Each asynchronous method will return a Java Future object, and users are also allowed
 * to provide a callback handler.
 * AWS Storage Gateway Service <p>
 * AWS Storage Gateway is a service that connects an on-premises software appliance with cloud-based storage to provide seamless and secure integration
 * between an organization's on-premises IT environment and AWS's storage infrastructure. The service enables you to securely upload data to the AWS
 * cloud for cost effective backup and rapid disaster recovery.
 * </p>
 * <p>
 * Use the following links to get started using the <i>AWS Storage Gateway Service API Reference</i> :
 * </p>
 * 
 * <ul>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/AWSStorageGatewayHTTPRequestsHeaders.html"> AWS Storage Gateway
 * Required Request Headers </a> : Describes the required headers that you must send with every POST request to AWS Storage Gateway.</li>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/AWSStorageGatewaySigningRequests.html"> Signing Requests </a> : AWS
 * Storage Gateway requires that you authenticate every request you send; this topic describes how sign such a request.</li>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/APIErrorResponses.html"> Error Responses </a> : Provides reference
 * information about AWS Storage Gateway errors.</li>
 * <li> <a href="http://docs.amazonwebservices.com/storagegateway/latest/userguide/AWSStorageGatewayAPIOperations.html"> Operations in AWS Storage
 * Gateway </a> : Contains detailed descriptions of all AWS Storage Gateway operations, their request parameters, response elements, possible errors, and
 * examples of requests and responses.</li>
 * <li> <a href="http://docs.amazonwebservices.com/general/latest/gr/index.html?rande.html"> AWS Storage Gateway Regions and Endpoints </a> : Provides a
 * list of each of the regions and endpoints available for use with AWS Storage Gateway. </li>
 * 
 * </ul> 
 */       
public interface AWSStorageGatewayAsync extends AWSStorageGateway {
    /**
     * <p>
     * This operation deletes the bandwidth rate limits of a gateway. You can
     * delete either the upload and download bandwidth rate limit, or you can
     * delete both. If you delete only one of the limits, the other limit
     * remains unchanged. To specify which gateway to work with, use the
     * Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param deleteBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the DeleteBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes the bandwidth rate limits of a gateway. You can
     * delete either the upload and download bandwidth rate limit, or you can
     * delete both. If you delete only one of the limits, the other limit
     * remains unchanged. To specify which gateway to work with, use the
     * Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param deleteBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the DeleteBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteBandwidthRateLimitResult> deleteBandwidthRateLimitAsync(DeleteBandwidthRateLimitRequest deleteBandwidthRateLimitRequest,
            AsyncHandler<DeleteBandwidthRateLimitRequest, DeleteBandwidthRateLimitResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch
     * the next page of gateways.
     * </p>
     *
     * @param listGatewaysRequest Container for the necessary parameters to
     *           execute the ListGateways operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListGateways service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation lists gateways owned by an AWS account in a region
     * specified in the request. The returned list is ordered by gateway
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * By default, the operation returns a maximum of 100 gateways. This
     * operation supports pagination that allows you to optionally reduce the
     * number of gateways returned in a response.
     * </p>
     * <p>
     * If you have more gateways than are returned in a response-that is, the
     * response returns only a truncated list of your gateways-the response
     * contains a marker that you can specify in your next request to fetch
     * the next page of gateways.
     * </p>
     *
     * @param listGatewaysRequest Container for the necessary parameters to
     *           execute the ListGateways operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListGateways service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListGatewaysResult> listGatewaysAsync(ListGatewaysRequest listGatewaysRequest,
            AsyncHandler<ListGatewaysRequest, ListGatewaysResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target and initiator pair.
     * </p>
     *
     * @param deleteChapCredentialsRequest Container for the necessary
     *           parameters to execute the DeleteChapCredentials operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteChapCredentials service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(DeleteChapCredentialsRequest deleteChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target and initiator pair.
     * </p>
     *
     * @param deleteChapCredentialsRequest Container for the necessary
     *           parameters to execute the DeleteChapCredentials operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteChapCredentials service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteChapCredentialsResult> deleteChapCredentialsAsync(DeleteChapCredentialsRequest deleteChapCredentialsRequest,
            AsyncHandler<DeleteChapCredentialsRequest, DeleteChapCredentialsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation creates a volume on a specified gateway. This operation
     * is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You
     * can choose to preserve existing data on the disk, create volume from
     * an existing snapshot, or create an empty volume. If you choose to
     * create an empty gateway volume, then any existing data on the disk is
     * erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information
     * on which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     *
     * @param createStorediSCSIVolumeRequest Container for the necessary
     *           parameters to execute the CreateStorediSCSIVolume operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStorediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation creates a volume on a specified gateway. This operation
     * is supported only for the gateway-cached volume architecture.
     * </p>
     * <p>
     * The size of the volume to create is inferred from the disk size. You
     * can choose to preserve existing data on the disk, create volume from
     * an existing snapshot, or create an empty volume. If you choose to
     * create an empty gateway volume, then any existing data on the disk is
     * erased.
     * </p>
     * <p>
     * In the request you must specify the gateway and the disk information
     * on which you are creating the volume. In response, AWS Storage Gateway
     * creates the volume and returns volume information such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     *
     * @param createStorediSCSIVolumeRequest Container for the necessary
     *           parameters to execute the CreateStorediSCSIVolume operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateStorediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateStorediSCSIVolumeResult> createStorediSCSIVolumeAsync(CreateStorediSCSIVolumeRequest createStorediSCSIVolumeRequest,
            AsyncHandler<CreateStorediSCSIVolumeRequest, CreateStorediSCSIVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the
     * gateway's name and time zone. To specify which gateway to update, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param updateGatewayInformationRequest Container for the necessary
     *           parameters to execute the UpdateGatewayInformation operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest updateGatewayInformationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates a gateway's metadata, which includes the
     * gateway's name and time zone. To specify which gateway to update, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param updateGatewayInformationRequest Container for the necessary
     *           parameters to execute the UpdateGatewayInformation operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewayInformationResult> updateGatewayInformationAsync(UpdateGatewayInformationRequest updateGatewayInformationRequest,
            AsyncHandler<UpdateGatewayInformationRequest, UpdateGatewayInformationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation starts a gateway that you previously shut down (see
     * ShutdownGateway). After the gateway starts, you can then make other
     * API calls, your applications can read from or write to the gateway's
     * storage volumes and you will be able to take snapshot backups.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make a request, you will get a 200 OK success
     * response immediately. However, it might take some time for the gateway
     * to be ready. You should call DescribeGatewayInformation and check the
     * status before making any additional API calls. For more information,
     * see ActivateGateway.
     * </p>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param startGatewayRequest Container for the necessary parameters to
     *           execute the StartGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         StartGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartGatewayResult> startGatewayAsync(StartGatewayRequest startGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation starts a gateway that you previously shut down (see
     * ShutdownGateway). After the gateway starts, you can then make other
     * API calls, your applications can read from or write to the gateway's
     * storage volumes and you will be able to take snapshot backups.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make a request, you will get a 200 OK success
     * response immediately. However, it might take some time for the gateway
     * to be ready. You should call DescribeGatewayInformation and check the
     * status before making any additional API calls. For more information,
     * see ActivateGateway.
     * </p>
     * <p>
     * To specify which gateway to start, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param startGatewayRequest Container for the necessary parameters to
     *           execute the StartGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         StartGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<StartGatewayResult> startGatewayAsync(StartGatewayRequest startGatewayRequest,
            AsyncHandler<StartGatewayRequest, StartGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time
     * is the time in your gateway's time zone.
     * </p>
     *
     * @param updateMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the UpdateMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates a gateway's weekly maintenance start time
     * information, including day and time of the week. The maintenance time
     * is the time in your gateway's time zone.
     * </p>
     *
     * @param updateMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the UpdateMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateMaintenanceStartTimeResult> updateMaintenanceStartTimeAsync(UpdateMaintenanceStartTimeRequest updateMaintenanceStartTimeRequest,
            AsyncHandler<UpdateMaintenanceStartTimeRequest, UpdateMaintenanceStartTimeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation lists the iSCSI stored volumes of a gateway. Results
     * are sorted by volume ARN. The response includes only the volume ARNs.
     * If you want additional volume information, use the
     * DescribeStorediSCSIVolumes API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this
     * Marker value in your subsequent request to retrieve the next set of
     * volumes.
     * </p>
     *
     * @param listVolumesRequest Container for the necessary parameters to
     *           execute the ListVolumes operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumes service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumesResult> listVolumesAsync(ListVolumesRequest listVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation lists the iSCSI stored volumes of a gateway. Results
     * are sorted by volume ARN. The response includes only the volume ARNs.
     * If you want additional volume information, use the
     * DescribeStorediSCSIVolumes API.
     * </p>
     * <p>
     * The operation supports pagination. By default, the operation returns a
     * maximum of up to 100 volumes. You can optionally specify the
     * <code>Limit</code> field in the body to limit the number of volumes in
     * the response. If the number of volumes returned in the response is
     * truncated, the response includes a Marker field. You can use this
     * Marker value in your subsequent request to retrieve the next set of
     * volumes.
     * </p>
     *
     * @param listVolumesRequest Container for the necessary parameters to
     *           execute the ListVolumes operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumes service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumesResult> listVolumesAsync(ListVolumesRequest listVolumesRequest,
            AsyncHandler<ListVolumesRequest, ListVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns a list of the local disks of a gateway. To
     * specify which gateway to describe you use the Amazon Resource Name
     * (ARN) of the gateway in the body of the request.
     * </p>
     * <p>
     * The request returns all disks, specifying which are configured as
     * working storage, stored volume or not configured at all.
     * </p>
     *
     * @param listLocalDisksRequest Container for the necessary parameters to
     *           execute the ListLocalDisks operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListLocalDisks service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLocalDisksResult> listLocalDisksAsync(ListLocalDisksRequest listLocalDisksRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns a list of the local disks of a gateway. To
     * specify which gateway to describe you use the Amazon Resource Name
     * (ARN) of the gateway in the body of the request.
     * </p>
     * <p>
     * The request returns all disks, specifying which are configured as
     * working storage, stored volume or not configured at all.
     * </p>
     *
     * @param listLocalDisksRequest Container for the necessary parameters to
     *           execute the ListLocalDisks operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListLocalDisks service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListLocalDisksResult> listLocalDisksAsync(ListLocalDisksRequest listLocalDisksRequest,
            AsyncHandler<ListLocalDisksRequest, ListLocalDisksResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns description of the gateway volumes specified in
     * the request. The list of gateway volumes in the request must be from
     * one gateway. In the response Amazon Storage Gateway returns volume
     * information sorted by volume ARNs.
     * </p>
     *
     * @param describeStorediSCSIVolumesRequest Container for the necessary
     *           parameters to execute the DescribeStorediSCSIVolumes operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStorediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns description of the gateway volumes specified in
     * the request. The list of gateway volumes in the request must be from
     * one gateway. In the response Amazon Storage Gateway returns volume
     * information sorted by volume ARNs.
     * </p>
     *
     * @param describeStorediSCSIVolumesRequest Container for the necessary
     *           parameters to execute the DescribeStorediSCSIVolumes operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeStorediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeStorediSCSIVolumesResult> describeStorediSCSIVolumesAsync(DescribeStorediSCSIVolumesRequest describeStorediSCSIVolumesRequest,
            AsyncHandler<DescribeStorediSCSIVolumesRequest, DescribeStorediSCSIVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation delete the specified gateway volume that you previously
     * created using the CreateStorediSCSIVolume API. For gateway-stored
     * volumes, the local disk that was configured as the storage volume is
     * not deleted. You can reuse the local disk to create another storage
     * volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic
     * Compute Cloud (Amazon EC2) API to query snapshots on the volume you
     * are deleting and check the snapshot status. For more information, go
     * to <a
     * AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots </a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i> .
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation delete the specified gateway volume that you previously
     * created using the CreateStorediSCSIVolume API. For gateway-stored
     * volumes, the local disk that was configured as the storage volume is
     * not deleted. You can reuse the local disk to create another storage
     * volume.
     * </p>
     * <p>
     * Before you delete a gateway volume, make sure there are no iSCSI
     * connections to the volume you are deleting. You should also make sure
     * there is no snapshot in progress. You can use the Amazon Elastic
     * Compute Cloud (Amazon EC2) API to query snapshots on the volume you
     * are deleting and check the snapshot status. For more information, go
     * to <a
     * AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html">
     * DescribeSnapshots </a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i> .
     * </p>
     * <p>
     * In the request, you must provide the Amazon Resource Name (ARN) of the
     * storage volume you want to delete.
     * </p>
     *
     * @param deleteVolumeRequest Container for the necessary parameters to
     *           execute the DeleteVolume operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteVolume service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteVolumeResult> deleteVolumeAsync(DeleteVolumeRequest deleteVolumeRequest,
            AsyncHandler<DeleteVolumeRequest, DeleteVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the bandwidth rate limits of a gateway. By
     * default, these limits are not set, which means no bandwidth rate
     * limiting is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To
     * specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param describeBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the DescribeBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns the bandwidth rate limits of a gateway. By
     * default, these limits are not set, which means no bandwidth rate
     * limiting is in effect.
     * </p>
     * <p>
     * This operation only returns a value for a bandwidth rate limit only if
     * the limit is set. If no limits are set for the gateway, then this
     * operation returns only the gateway ARN in the response body. To
     * specify which gateway to describe, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param describeBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the DescribeBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeBandwidthRateLimitResult> describeBandwidthRateLimitAsync(DescribeBandwidthRateLimitRequest describeBandwidthRateLimitRequest,
            AsyncHandler<DescribeBandwidthRateLimitRequest, DescribeBandwidthRateLimitResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms
     * of the gateway's time zone.
     * </p>
     *
     * @param describeMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the DescribeMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns your gateway's weekly maintenance start time
     * including the day and time of the week. Note that values are in terms
     * of the gateway's time zone.
     * </p>
     *
     * @param describeMaintenanceStartTimeRequest Container for the necessary
     *           parameters to execute the DescribeMaintenanceStartTime operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeMaintenanceStartTime service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeMaintenanceStartTimeResult> describeMaintenanceStartTimeAsync(DescribeMaintenanceStartTimeRequest describeMaintenanceStartTimeRequest,
            AsyncHandler<DescribeMaintenanceStartTimeRequest, DescribeMaintenanceStartTimeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (S3) for durable
     * off-site recovery, as well as import the data to an Amazon Elastic
     * Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You
     * can take snapshots of your gateway volume on a scheduled or ad-hoc
     * basis. This API enables you to take ad-hoc snapshot. For more
     * information, see Working With Snapshots in the AWS Storage Gateway
     * Console.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage
     * Gateway Console. In response, AWS Storage Gateway returns you a
     * snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a
     * snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b>To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in the Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation initiates a snapshot of a volume.
     * </p>
     * <p>
     * AWS Storage Gateway provides the ability to back up point-in-time
     * snapshots of your data to Amazon Simple Storage (S3) for durable
     * off-site recovery, as well as import the data to an Amazon Elastic
     * Block Store (EBS) volume in Amazon Elastic Compute Cloud (EC2). You
     * can take snapshots of your gateway volume on a scheduled or ad-hoc
     * basis. This API enables you to take ad-hoc snapshot. For more
     * information, see Working With Snapshots in the AWS Storage Gateway
     * Console.
     * </p>
     * <p>
     * In the CreateSnapshot request you identify the volume by providing its
     * Amazon Resource Name (ARN). You must also provide description for the
     * snapshot. When AWS Storage Gateway takes the snapshot of specified
     * volume, the snapshot and description appears in the AWS Storage
     * Gateway Console. In response, AWS Storage Gateway returns you a
     * snapshot ID. You can use this snapshot ID to check the snapshot
     * progress or later use it when you want to create a volume from a
     * snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b>To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in the Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param createSnapshotRequest Container for the necessary parameters to
     *           execute the CreateSnapshot operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshot service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target,
     * one for each target-initiator pair.
     * </p>
     *
     * @param describeChapCredentialsRequest Container for the necessary
     *           parameters to execute the DescribeChapCredentials operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeChapCredentials service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(DescribeChapCredentialsRequest describeChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns an array of Challenge-Handshake Authentication
     * Protocol (CHAP) credentials information for a specified iSCSI target,
     * one for each target-initiator pair.
     * </p>
     *
     * @param describeChapCredentialsRequest Container for the necessary
     *           parameters to execute the DescribeChapCredentials operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeChapCredentials service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeChapCredentialsResult> describeChapCredentialsAsync(DescribeChapCredentialsRequest describeChapCredentialsRequest,
            AsyncHandler<DescribeChapCredentialsRequest, DescribeChapCredentialsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about the cache of a gateway. This
     * operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     *
     * @param describeCacheRequest Container for the necessary parameters to
     *           execute the DescribeCache operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCache service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheResult> describeCacheAsync(DescribeCacheRequest describeCacheRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about the cache of a gateway. This
     * operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as cache, and it
     * includes the amount of cache allocated and used.
     * </p>
     *
     * @param describeCacheRequest Container for the necessary parameters to
     *           execute the DescribeCache operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCache service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCacheResult> describeCacheAsync(DescribeCacheRequest describeCacheRequest,
            AsyncHandler<DescribeCacheRequest, DescribeCacheResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation describes the snapshot schedule for the specified
     * gateway volume. The snapshot schedule information includes intervals
     * at which snapshots are automatically initiated on the volume.
     * </p>
     *
     * @param describeSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotSchedule operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation describes the snapshot schedule for the specified
     * gateway volume. The snapshot schedule information includes intervals
     * at which snapshots are automatically initiated on the volume.
     * </p>
     *
     * @param describeSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DescribeSnapshotSchedule operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeSnapshotScheduleResult> describeSnapshotScheduleAsync(DescribeSnapshotScheduleRequest describeSnapshotScheduleRequest,
            AsyncHandler<DescribeSnapshotScheduleRequest, DescribeSnapshotScheduleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation creates a cached volume on a specified cached gateway.
     * This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * <b>NOTE:</b>Cache storage must be allocated to the gateway before you
     * can create a cached volume. Use the AddCache operation to add cache
     * storage to a gateway.
     * </p>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, AWS Storage Gateway
     * creates the volume and returns information about it such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     *
     * @param createCachediSCSIVolumeRequest Container for the necessary
     *           parameters to execute the CreateCachediSCSIVolume operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCachediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation creates a cached volume on a specified cached gateway.
     * This operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * <b>NOTE:</b>Cache storage must be allocated to the gateway before you
     * can create a cached volume. Use the AddCache operation to add cache
     * storage to a gateway.
     * </p>
     * <p>
     * In the request, you must specify the gateway, size of the volume in
     * bytes, the iSCSI target name, an IP address on which to expose the
     * target, and a unique client token. In response, AWS Storage Gateway
     * creates the volume and returns information about it such as the volume
     * Amazon Resource Name (ARN), its size, and the iSCSI target ARN that
     * initiators can use to connect to the volume target.
     * </p>
     *
     * @param createCachediSCSIVolumeRequest Container for the necessary
     *           parameters to execute the CreateCachediSCSIVolume operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateCachediSCSIVolume service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateCachediSCSIVolumeResult> createCachediSCSIVolumeAsync(CreateCachediSCSIVolumeRequest createCachediSCSIVolumeRequest,
            AsyncHandler<CreateCachediSCSIVolumeRequest, CreateCachediSCSIVolumeResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation shuts down a gateway. To specify which gateway to shut
     * down, use the Amazon Resource Name (ARN) of the gateway in the body of
     * your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * storage gateway's virtual machine (VM) and not the VM.
     * </p>
     * <p>
     * <b>NOTE:</b>If you want to shut down the VM, it is recommended that
     * you first shut down the gateway component in the VM to avoid
     * unpredictable conditions.
     * </p>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * StartGateway, DescribeGatewayInformation, and ListGateways. For more
     * information, see ActivateGateway. Your applications cannot read from
     * or write to the gateway's storage volumes, and there are no snapshots
     * taken.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make a shutdown request, you will get a 200 OK
     * success response immediately. However, it might take some time for the
     * gateway to shut down. You can call the DescribeGatewayInformation API
     * to check the status. For more information, see ActivateGateway.
     * </p>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using DeleteGateway) to no longer pay software charges associated
     * with the gateway.
     * </p>
     *
     * @param shutdownGatewayRequest Container for the necessary parameters
     *           to execute the ShutdownGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ShutdownGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ShutdownGatewayResult> shutdownGatewayAsync(ShutdownGatewayRequest shutdownGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation shuts down a gateway. To specify which gateway to shut
     * down, use the Amazon Resource Name (ARN) of the gateway in the body of
     * your request.
     * </p>
     * <p>
     * The operation shuts down the gateway service component running in the
     * storage gateway's virtual machine (VM) and not the VM.
     * </p>
     * <p>
     * <b>NOTE:</b>If you want to shut down the VM, it is recommended that
     * you first shut down the gateway component in the VM to avoid
     * unpredictable conditions.
     * </p>
     * <p>
     * After the gateway is shutdown, you cannot call any other API except
     * StartGateway, DescribeGatewayInformation, and ListGateways. For more
     * information, see ActivateGateway. Your applications cannot read from
     * or write to the gateway's storage volumes, and there are no snapshots
     * taken.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make a shutdown request, you will get a 200 OK
     * success response immediately. However, it might take some time for the
     * gateway to shut down. You can call the DescribeGatewayInformation API
     * to check the status. For more information, see ActivateGateway.
     * </p>
     * <p>
     * If do not intend to use the gateway again, you must delete the gateway
     * (using DeleteGateway) to no longer pay software charges associated
     * with the gateway.
     * </p>
     *
     * @param shutdownGatewayRequest Container for the necessary parameters
     *           to execute the ShutdownGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ShutdownGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ShutdownGatewayResult> shutdownGatewayAsync(ShutdownGatewayRequest shutdownGatewayRequest,
            AsyncHandler<ShutdownGatewayRequest, ShutdownGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make this request, you get a 200 OK success
     * response immediately. However, it might take some time for the update
     * to complete. You can call DescribeGatewayInformation to verify the
     * gateway is in the STATE_RUNNING state.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>A software update forces a system restart of your
     * gateway. You can minimize the chance of any disruption to your
     * applications by increasing your iSCSI Initiators' timeouts. For more
     * information about increasing iSCSI Initiator timeouts for Windows and
     * Linux, see Customizing Your Windows iSCSI Settings and Customizing
     * Your Linux iSCSI Settings, respectively.
     * </p>
     *
     * @param updateGatewaySoftwareNowRequest Container for the necessary
     *           parameters to execute the UpdateGatewaySoftwareNow operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewaySoftwareNow service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the gateway virtual machine (VM) software. The
     * request immediately triggers the software update.
     * </p>
     * <p>
     * <b>NOTE:</b>When you make this request, you get a 200 OK success
     * response immediately. However, it might take some time for the update
     * to complete. You can call DescribeGatewayInformation to verify the
     * gateway is in the STATE_RUNNING state.
     * </p>
     * <p>
     * <b>IMPORTANT:</b>A software update forces a system restart of your
     * gateway. You can minimize the chance of any disruption to your
     * applications by increasing your iSCSI Initiators' timeouts. For more
     * information about increasing iSCSI Initiator timeouts for Windows and
     * Linux, see Customizing Your Windows iSCSI Settings and Customizing
     * Your Linux iSCSI Settings, respectively.
     * </p>
     *
     * @param updateGatewaySoftwareNowRequest Container for the necessary
     *           parameters to execute the UpdateGatewaySoftwareNow operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateGatewaySoftwareNow service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateGatewaySoftwareNowResult> updateGatewaySoftwareNowAsync(UpdateGatewaySoftwareNowRequest updateGatewaySoftwareNowRequest,
            AsyncHandler<UpdateGatewaySoftwareNowRequest, UpdateGatewaySoftwareNowResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. This operation is supported only for the gateway-stored
     * volume architecture.
     * </p>
     * <p>
     * <b>NOTE:</b> Working storage is also referred to as upload buffer. You
     * can also use the DescribeUploadBuffer operation to add upload buffer
     * to a stored-volume gateway.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     *
     * @param describeWorkingStorageRequest Container for the necessary
     *           parameters to execute the DescribeWorkingStorage operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkingStorage service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(DescribeWorkingStorageRequest describeWorkingStorageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about the working storage of a
     * gateway. This operation is supported only for the gateway-stored
     * volume architecture.
     * </p>
     * <p>
     * <b>NOTE:</b> Working storage is also referred to as upload buffer. You
     * can also use the DescribeUploadBuffer operation to add upload buffer
     * to a stored-volume gateway.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as working storage,
     * and it includes the amount of working storage allocated and used.
     * </p>
     *
     * @param describeWorkingStorageRequest Container for the necessary
     *           parameters to execute the DescribeWorkingStorage operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeWorkingStorage service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeWorkingStorageResult> describeWorkingStorageAsync(DescribeWorkingStorageRequest describeWorkingStorageRequest,
            AsyncHandler<DescribeWorkingStorageRequest, DescribeWorkingStorageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures one or more gateway local disks as cache for
     * a cached-volume gateway. This operation is supported only for the
     * gateway-cached volume architecture (see <a
     * ices.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">
     * Storage Gateway Concepts </a> ).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     *
     * @param addCacheRequest Container for the necessary parameters to
     *           execute the AddCache operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the AddCache
     *         service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCacheResult> addCacheAsync(AddCacheRequest addCacheRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures one or more gateway local disks as cache for
     * a cached-volume gateway. This operation is supported only for the
     * gateway-cached volume architecture (see <a
     * ices.com/storagegateway/latest/userguide/StorageGatewayConcepts.html">
     * Storage Gateway Concepts </a> ).
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add cache, and one or more disk IDs that you want to
     * configure as cache.
     * </p>
     *
     * @param addCacheRequest Container for the necessary parameters to
     *           execute the AddCache operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the AddCache
     *         service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddCacheResult> addCacheAsync(AddCacheRequest addCacheRequest,
            AsyncHandler<AddCacheRequest, AddCacheResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes a gateway. To specify which gateway to delete,
     * use the Amazon Resource Name (ARN) of the gateway in your request. The
     * operation deletes the gateway; however, it does not delete the gateway
     * virtual machine (VM) from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed
     * snapshots of the gateway volumes are not deleted upon deleting the
     * gateway, however, pending snapshots will not complete. After you
     * delete a gateway, your next step is to remove it from your
     * environment.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You no longer pay software charges after the gateway
     * is deleted; however, your existing Amazon EBS snapshots persist and
     * you will continue to be billed for these snapshots.??You can choose to
     * remove all remaining Amazon EBS snapshots by canceling your Amazon EC2
     * subscription.?? If you prefer not to cancel your Amazon EC2
     * subscription, you can delete your snapshots using the Amazon EC2
     * console. For more information, see the AWS Storage Gateway Detail
     * Page.
     * </p>
     *
     * @param deleteGatewayRequest Container for the necessary parameters to
     *           execute the DeleteGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes a gateway. To specify which gateway to delete,
     * use the Amazon Resource Name (ARN) of the gateway in your request. The
     * operation deletes the gateway; however, it does not delete the gateway
     * virtual machine (VM) from your host computer.
     * </p>
     * <p>
     * After you delete a gateway, you cannot reactivate it. Completed
     * snapshots of the gateway volumes are not deleted upon deleting the
     * gateway, however, pending snapshots will not complete. After you
     * delete a gateway, your next step is to remove it from your
     * environment.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> You no longer pay software charges after the gateway
     * is deleted; however, your existing Amazon EBS snapshots persist and
     * you will continue to be billed for these snapshots.??You can choose to
     * remove all remaining Amazon EBS snapshots by canceling your Amazon EC2
     * subscription.?? If you prefer not to cancel your Amazon EC2
     * subscription, you can delete your snapshots using the Amazon EC2
     * console. For more information, see the AWS Storage Gateway Detail
     * Page.
     * </p>
     *
     * @param deleteGatewayRequest Container for the necessary parameters to
     *           execute the DeleteGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteGatewayResult> deleteGatewayAsync(DeleteGatewayRequest deleteGatewayRequest,
            AsyncHandler<DeleteGatewayRequest, DeleteGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation initiates a snapshot of a gateway from a volume
     * recovery point. This operation is supported only for the
     * gateway-cached volume architecture (see StorageGatewayConcepts).
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get
     * a list of volume recovery point for gateway-cached volumes, use
     * ListVolumeRecoveryPoints.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You
     * must also provide a description for the snapshot. When AWS Storage
     * Gateway takes a snapshot of the specified volume, the snapshot and its
     * description appear in the AWS Storage Gateway console. In response,
     * AWS Storage Gateway returns you a snapshot ID. You can use this
     * snapshot ID to check the snapshot progress or later use it when you
     * want to create a volume from a snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param createSnapshotFromVolumeRecoveryPointRequest Container for the
     *           necessary parameters to execute the
     *           CreateSnapshotFromVolumeRecoveryPoint operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshotFromVolumeRecoveryPoint service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation initiates a snapshot of a gateway from a volume
     * recovery point. This operation is supported only for the
     * gateway-cached volume architecture (see StorageGatewayConcepts).
     * </p>
     * <p>
     * A volume recovery point is a point in time at which all data of the
     * volume is consistent and from which you can create a snapshot. To get
     * a list of volume recovery point for gateway-cached volumes, use
     * ListVolumeRecoveryPoints.
     * </p>
     * <p>
     * In the <code>CreateSnapshotFromVolumeRecoveryPoint</code> request, you
     * identify the volume by providing its Amazon Resource Name (ARN). You
     * must also provide a description for the snapshot. When AWS Storage
     * Gateway takes a snapshot of the specified volume, the snapshot and its
     * description appear in the AWS Storage Gateway console. In response,
     * AWS Storage Gateway returns you a snapshot ID. You can use this
     * snapshot ID to check the snapshot progress or later use it when you
     * want to create a volume from a snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param createSnapshotFromVolumeRecoveryPointRequest Container for the
     *           necessary parameters to execute the
     *           CreateSnapshotFromVolumeRecoveryPoint operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         CreateSnapshotFromVolumeRecoveryPoint service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<CreateSnapshotFromVolumeRecoveryPointResult> createSnapshotFromVolumeRecoveryPointAsync(CreateSnapshotFromVolumeRecoveryPointRequest createSnapshotFromVolumeRecoveryPointRequest,
            AsyncHandler<CreateSnapshotFromVolumeRecoveryPointRequest, CreateSnapshotFromVolumeRecoveryPointResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours,
     * starting at the creation time of the volume. You can use this API to
     * change the shapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including
     * when you want the snapshot to begin on a day and the frequency (in
     * hours) of snapshots.
     * </p>
     *
     * @param updateSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the UpdateSnapshotSchedule operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates a snapshot schedule configured for a gateway
     * volume.
     * </p>
     * <p>
     * The default snapshot schedule for volume is once every 24 hours,
     * starting at the creation time of the volume. You can use this API to
     * change the shapshot schedule configured for the volume.
     * </p>
     * <p>
     * In the request you must identify the gateway volume whose snapshot
     * schedule you want to update, and the schedule information, including
     * when you want the snapshot to begin on a day and the frequency (in
     * hours) of snapshots.
     * </p>
     *
     * @param updateSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the UpdateSnapshotSchedule operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateSnapshotScheduleResult> updateSnapshotScheduleAsync(UpdateSnapshotScheduleRequest updateSnapshotScheduleRequest,
            AsyncHandler<UpdateSnapshotScheduleRequest, UpdateSnapshotScheduleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * VMware host. For more information, see <a
     * bservices.com/storagegateway/latest/userguide/DownloadAndDeploy.html">
     * Downloading and Deploying AWS Storage Gateway VM </a> . In the
     * activation process you specify information such as the region you want
     * to use for storing snapshots, the time zone for scheduled snapshots
     * and the gateway schedule window, an activation key, and a name for
     * your gateway. The activation process also associates your gateway with
     * your account (see UpdateGatewayInformation).
     * </p>
     * <p>
     * <b>NOTE:</b>You must power on the gateway VM before you can activate
     * your gateway.
     * </p>
     *
     * @param activateGatewayRequest Container for the necessary parameters
     *           to execute the ActivateGateway operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ActivateGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivateGatewayResult> activateGatewayAsync(ActivateGatewayRequest activateGatewayRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation activates the gateway you previously deployed on your
     * VMware host. For more information, see <a
     * bservices.com/storagegateway/latest/userguide/DownloadAndDeploy.html">
     * Downloading and Deploying AWS Storage Gateway VM </a> . In the
     * activation process you specify information such as the region you want
     * to use for storing snapshots, the time zone for scheduled snapshots
     * and the gateway schedule window, an activation key, and a name for
     * your gateway. The activation process also associates your gateway with
     * your account (see UpdateGatewayInformation).
     * </p>
     * <p>
     * <b>NOTE:</b>You must power on the gateway VM before you can activate
     * your gateway.
     * </p>
     *
     * @param activateGatewayRequest Container for the necessary parameters
     *           to execute the ActivateGateway operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ActivateGateway service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ActivateGatewayResult> activateGatewayAsync(ActivateGatewayRequest activateGatewayRequest,
            AsyncHandler<ActivateGatewayRequest, ActivateGatewayResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the bandwidth rate limits of a gateway. You can
     * update both the upload and download bandwidth rate limit or specify
     * only one of the two. If you don't set a bandwidth rate limit, the
     * existing rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you
     * don't set any limit, the gateway does not have any limitations on its
     * bandwidth usage and could potentially use the maximum available
     * bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param updateBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the UpdateBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the bandwidth rate limits of a gateway. You can
     * update both the upload and download bandwidth rate limit or specify
     * only one of the two. If you don't set a bandwidth rate limit, the
     * existing rate limit remains.
     * </p>
     * <p>
     * By default, a gateway's bandwidth rate limits are not set. If you
     * don't set any limit, the gateway does not have any limitations on its
     * bandwidth usage and could potentially use the maximum available
     * bandwidth.
     * </p>
     * <p>
     * To specify which gateway to update, use the Amazon Resource Name (ARN)
     * of the gateway in your request.
     * </p>
     *
     * @param updateBandwidthRateLimitRequest Container for the necessary
     *           parameters to execute the UpdateBandwidthRateLimit operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateBandwidthRateLimit service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateBandwidthRateLimitResult> updateBandwidthRateLimitAsync(UpdateBandwidthRateLimitRequest updateBandwidthRateLimitRequest,
            AsyncHandler<UpdateBandwidthRateLimitRequest, UpdateBandwidthRateLimitResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or
     * ad-hoc basis. This API enables you to delete a snapshot schedule for a
     * volume. For more information, see <a
     * rvices.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">
     * Working with Snapshots </a> . In the
     * <code>DeleteSnapshotSchedule</code> request, you identify the volume
     * by providing its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param deleteSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DeleteSnapshotSchedule operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation deletes a snapshot of a volume.
     * </p>
     * <p>
     * You can take snapshots of your gateway volumes on a scheduled or
     * ad-hoc basis. This API enables you to delete a snapshot schedule for a
     * volume. For more information, see <a
     * rvices.com/storagegateway/latest/userguide/WorkingWithSnapshots.html">
     * Working with Snapshots </a> . In the
     * <code>DeleteSnapshotSchedule</code> request, you identify the volume
     * by providing its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> To list or delete a snapshot, you must use the Amazon EC2
     * API. For more information, go to DeleteSnapshot and DescribeSnapshots
     * in Amazon Elastic Compute Cloud API Reference.
     * </p>
     *
     * @param deleteSnapshotScheduleRequest Container for the necessary
     *           parameters to execute the DeleteSnapshotSchedule operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DeleteSnapshotSchedule service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DeleteSnapshotScheduleResult> deleteSnapshotScheduleAsync(DeleteSnapshotScheduleRequest deleteSnapshotScheduleRequest,
            AsyncHandler<DeleteSnapshotScheduleRequest, DeleteSnapshotScheduleResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> When you update CHAP credentials, all existing
     * connections on the target are closed and initiators must reconnect
     * with the new credentials.
     * </p>
     *
     * @param updateChapCredentialsRequest Container for the necessary
     *           parameters to execute the UpdateChapCredentials operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateChapCredentials service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(UpdateChapCredentialsRequest updateChapCredentialsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation updates the Challenge-Handshake Authentication Protocol
     * (CHAP) credentials for a specified iSCSI target. By default, a gateway
     * does not have CHAP enabled; however, for added security, you might use
     * it.
     * </p>
     * <p>
     * <b>IMPORTANT:</b> When you update CHAP credentials, all existing
     * connections on the target are closed and initiators must reconnect
     * with the new credentials.
     * </p>
     *
     * @param updateChapCredentialsRequest Container for the necessary
     *           parameters to execute the UpdateChapCredentials operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         UpdateChapCredentials service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<UpdateChapCredentialsResult> updateChapCredentialsAsync(UpdateChapCredentialsRequest updateChapCredentialsRequest,
            AsyncHandler<UpdateChapCredentialsRequest, UpdateChapCredentialsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures one or more gateway local disks as upload
     * buffer for a specified gateway. This operation is supported for both
     * the gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     *
     * @param addUploadBufferRequest Container for the necessary parameters
     *           to execute the AddUploadBuffer operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         AddUploadBuffer service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddUploadBufferResult> addUploadBufferAsync(AddUploadBufferRequest addUploadBufferRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures one or more gateway local disks as upload
     * buffer for a specified gateway. This operation is supported for both
     * the gateway-stored and gateway-cached volume architectures.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add upload buffer, and one or more disk IDs that you
     * want to configure as upload buffer.
     * </p>
     *
     * @param addUploadBufferRequest Container for the necessary parameters
     *           to execute the AddUploadBuffer operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddUploadBuffer service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddUploadBufferResult> addUploadBufferAsync(AddUploadBufferRequest addUploadBufferRequest,
            AsyncHandler<AddUploadBufferRequest, AddUploadBufferResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation lists the recovery points for a specified gateway. This
     * operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery
     * point is a point in time at which all data of the volume is consistent
     * and from which you can create a snapshot. To create a snapshot from a
     * volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint
     * operation.
     * </p>
     *
     * @param listVolumeRecoveryPointsRequest Container for the necessary
     *           parameters to execute the ListVolumeRecoveryPoints operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumeRecoveryPoints service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation lists the recovery points for a specified gateway. This
     * operation is supported only for the gateway-cached volume
     * architecture.
     * </p>
     * <p>
     * Each gateway-cached volume has one recovery point. A volume recovery
     * point is a point in time at which all data of the volume is consistent
     * and from which you can create a snapshot. To create a snapshot from a
     * volume recovery point use the CreateSnapshotFromVolumeRecoveryPoint
     * operation.
     * </p>
     *
     * @param listVolumeRecoveryPointsRequest Container for the necessary
     *           parameters to execute the ListVolumeRecoveryPoints operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         ListVolumeRecoveryPoints service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<ListVolumeRecoveryPointsResult> listVolumeRecoveryPointsAsync(ListVolumeRecoveryPointsRequest listVolumeRecoveryPointsRequest,
            AsyncHandler<ListVolumeRecoveryPointsRequest, ListVolumeRecoveryPointsResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about the upload buffer of a
     * gateway. This operation is supported for both the gateway-stored and
     * gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     *
     * @param describeUploadBufferRequest Container for the necessary
     *           parameters to execute the DescribeUploadBuffer operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUploadBuffer service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUploadBufferResult> describeUploadBufferAsync(DescribeUploadBufferRequest describeUploadBufferRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns information about the upload buffer of a
     * gateway. This operation is supported for both the gateway-stored and
     * gateway-cached volume architectures.
     * </p>
     * <p>
     * The response includes disk IDs that are configured as upload buffer
     * space, and it includes the amount of upload buffer space allocated and
     * used.
     * </p>
     *
     * @param describeUploadBufferRequest Container for the necessary
     *           parameters to execute the DescribeUploadBuffer operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeUploadBuffer service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeUploadBufferResult> describeUploadBufferAsync(DescribeUploadBufferRequest describeUploadBufferRequest,
            AsyncHandler<DescribeUploadBufferRequest, DescribeUploadBufferResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage for a gateway. This operation is supported only for the
     * gateway-stored volume architecture.
     * </p>
     * <p>
     * <b>NOTE:</b> Working storage is also referred to as upload buffer. You
     * can also use the AddUploadBuffer operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that
     * you want to configure as working storage.
     * </p>
     *
     * @param addWorkingStorageRequest Container for the necessary parameters
     *           to execute the AddWorkingStorage operation on AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         AddWorkingStorage service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddWorkingStorageResult> addWorkingStorageAsync(AddWorkingStorageRequest addWorkingStorageRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation configures one or more gateway local disks as working
     * storage for a gateway. This operation is supported only for the
     * gateway-stored volume architecture.
     * </p>
     * <p>
     * <b>NOTE:</b> Working storage is also referred to as upload buffer. You
     * can also use the AddUploadBuffer operation to add upload buffer to a
     * stored-volume gateway.
     * </p>
     * <p>
     * In the request, you specify the gateway Amazon Resource Name (ARN) to
     * which you want to add working storage, and one or more disk IDs that
     * you want to configure as working storage.
     * </p>
     *
     * @param addWorkingStorageRequest Container for the necessary parameters
     *           to execute the AddWorkingStorage operation on AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         AddWorkingStorage service method, as returned by AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<AddWorkingStorageResult> addWorkingStorageAsync(AddWorkingStorageRequest addWorkingStorageRequest,
            AsyncHandler<AddWorkingStorageRequest, AddWorkingStorageResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns a description of the gateway volumes specified
     * in the request. This operation is supported only for the
     * gateway-cached volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway.
     * In the response Amazon Storage Gateway returns volume information
     * sorted by volume Amazon Resource Name (ARN).
     * </p>
     *
     * @param describeCachediSCSIVolumesRequest Container for the necessary
     *           parameters to execute the DescribeCachediSCSIVolumes operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCachediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns a description of the gateway volumes specified
     * in the request. This operation is supported only for the
     * gateway-cached volume architecture.
     * </p>
     * <p>
     * The list of gateway volumes in the request must be from one gateway.
     * In the response Amazon Storage Gateway returns volume information
     * sorted by volume Amazon Resource Name (ARN).
     * </p>
     *
     * @param describeCachediSCSIVolumesRequest Container for the necessary
     *           parameters to execute the DescribeCachediSCSIVolumes operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeCachediSCSIVolumes service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeCachediSCSIVolumesResult> describeCachediSCSIVolumesAsync(DescribeCachediSCSIVolumesRequest describeCachediSCSIVolumesRequest,
            AsyncHandler<DescribeCachediSCSIVolumesRequest, DescribeCachediSCSIVolumesResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns metadata about a gateway such as its name,
     * network interfaces, configured time zone, and the state (whether the
     * gateway is running or not). To specify which gateway to describe, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param describeGatewayInformationRequest Container for the necessary
     *           parameters to execute the DescribeGatewayInformation operation on
     *           AWSStorageGateway.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(DescribeGatewayInformationRequest describeGatewayInformationRequest) 
            throws AmazonServiceException, AmazonClientException;

    /**
     * <p>
     * This operation returns metadata about a gateway such as its name,
     * network interfaces, configured time zone, and the state (whether the
     * gateway is running or not). To specify which gateway to describe, use
     * the Amazon Resource Name (ARN) of the gateway in your request.
     * </p>
     *
     * @param describeGatewayInformationRequest Container for the necessary
     *           parameters to execute the DescribeGatewayInformation operation on
     *           AWSStorageGateway.
     * @param asyncHandler Asynchronous callback handler for events in the
     *           life-cycle of the request. Users could provide the implementation of
     *           the four callback methods in this interface to process the operation
     *           result or handle the exception.
     * 
     * @return A Java Future object containing the response from the
     *         DescribeGatewayInformation service method, as returned by
     *         AWSStorageGateway.
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by AWSStorageGateway indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public Future<DescribeGatewayInformationResult> describeGatewayInformationAsync(DescribeGatewayInformationRequest describeGatewayInformationRequest,
            AsyncHandler<DescribeGatewayInformationRequest, DescribeGatewayInformationResult> asyncHandler)
                    throws AmazonServiceException, AmazonClientException;

}
        