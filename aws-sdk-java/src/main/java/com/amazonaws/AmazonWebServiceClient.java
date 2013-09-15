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
package com.amazonaws;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.http.HttpRequest;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.ServiceAbbreviations;

/**
 * Abstract base class for Amazon Web Service Java clients.
 * <p>
 * Responsible for basic client capabilities that are the same across all AWS
 * SDK Java clients (ex: setting the client endpoint).
 */
public abstract class AmazonWebServiceClient {

    /** The service endpoint to which this client will send requests. */
    protected URI endpoint;

    /** The client configuration */
    protected ClientConfiguration clientConfiguration;

    /** Low level client for sending requests to AWS services. */
    protected AmazonHttpClient client;

    /** Optional request handlers for additional request processing. */
    protected final List<RequestHandler> requestHandlers;
    
    /** Optional offset (in seconds) to use when signing requests */
    protected int timeOffset;


    /**
     * Constructs a new AmazonWebServiceClient object using the specified
     * configuration.
     *
     * @param clientConfiguration
     *            The client configuration for this client.
     */
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
        client = new AmazonHttpClient(clientConfiguration);
        requestHandlers = new CopyOnWriteArrayList<RequestHandler>();
    }

    /**
     * Overrides the default endpoint for this client. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: 
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * 
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws IllegalArgumentException {
        /*
         * If the endpoint doesn't explicitly specify a protocol to use, then
         * we'll defer to the default protocol specified in the client
         * configuration.
         */
        if (endpoint.contains("://") == false) {
            endpoint = clientConfiguration.getProtocol().toString() + "://" + endpoint;
        }

        try {
            this.endpoint = new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new IllegalArgumentException(e);
        }
    }
    
    /**
     * An alternative to {@link AmazonWebServiceClient#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * 
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't
     *             available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws IllegalArgumentException {
        if ( region == null )
            throw new IllegalArgumentException("No region provided");
        if ( !region.isServiceSupported(getServiceAbbreviation()) )
            throw new IllegalArgumentException(getServiceAbbreviation() + " isn't supported in region "
                    + region.getName());
        String serviceEndpoint = region.getServiceEndpoint(getServiceAbbreviation());
        int protocolIdx = serviceEndpoint.indexOf("://");
        // Strip off the protocol to allow the client config to specify it
        if ( protocolIdx >= 0 ) {
            serviceEndpoint = serviceEndpoint.substring(protocolIdx + "://".length());
        }
        setEndpoint(serviceEndpoint);
    }
    
    /**
     * Returns the service abbreviation for this service, used for identifying
     * service endpoints by region.
     * 
     * @see ServiceAbbreviations
     */
    protected String getServiceAbbreviation() {
        return "NO_SERVICE_ABBREVIATION_SPECIFIED";
    }

    public void setConfiguration(ClientConfiguration clientConfiguration) {
        this.clientConfiguration = clientConfiguration;
        client = new AmazonHttpClient(clientConfiguration);
    }

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown() {
        client.shutdown();
    }

    /**
     * Converts a Request<T> object into an HttpRequest object. Copies all the
     * headers, parameters, etc. from the Request into the new HttpRequest.
     *
     * @param request
     *            The request to convert.
     * @param methodName
     *            The HTTP method (GET, PUT, DELETE, HEAD) to use in the
     *            converted HttpRequest object.
     *
     * @return A new HttpRequest object created from the details of the
     *         specified Request<T> object.
     */
    @Deprecated
    protected <T> HttpRequest convertToHttpRequest(Request<T> request, HttpMethodName methodName) {
        HttpRequest httpRequest = new HttpRequest(methodName);
        for (Entry<String, String> parameter : request.getParameters().entrySet()) {
            httpRequest.addParameter(parameter.getKey(), parameter.getValue());
        }

        for (Entry<String, String> parameter : request.getHeaders().entrySet()) {
            httpRequest.addHeader(parameter.getKey(), parameter.getValue());
        }

        httpRequest.setServiceName(request.getServiceName());
        httpRequest.setEndpoint(request.getEndpoint());
        httpRequest.setResourcePath(request.getResourcePath());
        httpRequest.setOriginalRequest(request.getOriginalRequest());

        return httpRequest;
    }

    /**
     * Appends a request handler to the list of registered handlers that are run
     * as part of a request's lifecycle.
     *
     * @param requestHandler
     *            The new handler to add to the current list of request
     *            handlers.
     */
    public void addRequestHandler(RequestHandler requestHandler) {
    	requestHandlers.add(requestHandler);
    }

    /**
     * Removes a request handler from the list of registered handlers that are run
     * as part of a request's lifecycle.
     *
     * @param requestHandler
     *            The handler to remove from the current list of request
     *            handlers.
     */
    public void removeRequestHandler(RequestHandler requestHandler) {
        requestHandlers.remove(requestHandler);
    }

    protected ExecutionContext createExecutionContext() {
        ExecutionContext executionContext = new ExecutionContext(requestHandlers);
        return executionContext;
    }
    
    /**
     * Sets the optional value for time offset for this client.  This
     * value will be applied to all requests processed through this client.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @param timeOffset
     *            The optional value for time offset (in seconds) for this client.
     */
    public void setTimeOffset(int timeOffset) {
        this.timeOffset = timeOffset;
    }
    
    /**
     * Sets the optional value for time offset for this client.  This
     * value will be applied to all requests processed through this client.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @param timeOffset
     *            The optional value for time offset (in seconds) for this client.
     * 
     * @return the updated web service client
     */
    public AmazonWebServiceClient withTimeOffset(int timeOffset) {
        setTimeOffset(timeOffset);
        return this;
    }
    
    /**
     * Returns the optional value for time offset for this client.  This
     * value will be applied to all requests processed through this client.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @return The optional value for time offset (in seconds) for this client.
     */
    public int getTimeOffset() {
        return timeOffset;
    }

}
