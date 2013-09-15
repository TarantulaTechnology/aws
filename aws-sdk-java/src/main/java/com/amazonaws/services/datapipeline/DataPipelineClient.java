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
package com.amazonaws.services.datapipeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.json.JSONObject;

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.services.datapipeline.model.transform.*;


/**
 * Client for accessing DataPipeline.  All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <p>
 * This is the <i>AWS Data Pipeline API Reference</i> . This guide provides descriptions and samples of the AWS Data Pipeline API.
 * </p>
 * <p>
 * AWS Data Pipeline is a web service that configures and manages a data-driven workflow called a pipeline. AWS Data Pipeline handles the details of
 * scheduling and ensuring that data dependencies are met so your application can focus on processing the data.
 * </p>
 * <p>
 * The AWS Data Pipeline API implements two main sets of functionality. The first set of actions configure the pipeline in the web service. You call
 * these actions to create a pipeline and define data sources, schedules, dependencies, and the transforms to be performed on the data.
 * </p>
 * <p>
 * The second set of actions are used by a task runner application that calls the AWS Data Pipeline API to receive the next task ready for processing.
 * The logic for performing the task, such as querying the data, running data analysis, or converting the data from one format to another, is contained
 * within the task runner. The task runner performs the task assigned to it by the web service, reporting progress to the web service as it does so. When
 * the task is done, the task runner reports the final success or failure of the task to the web service.
 * </p>
 * <p>
 * AWS Data Pipeline provides an open-source implementation of a task runner called AWS Data Pipeline Task Runner. AWS Data Pipeline Task Runner
 * provides logic for common data management scenarios, such as performing database queries and running data analysis using Amazon Elastic MapReduce
 * (Amazon EMR). You can use AWS Data Pipeline Task Runner as your task runner, or you can write your own task runner to provide custom data management.
 * </p>
 * <p>
 * The AWS Data Pipeline API uses the Signature Version 4 protocol for signing requests. For more information about how to sign a request with this
 * protocol, see <a href="http://docs.amazonwebservices.com/general/latest/gr/signature-version-4.html"> Signature Version 4 Signing Process </a> . In
 * the code examples in this reference, the Signature Version 4 Request parameters are represented as AuthParams.
 * </p>
 */
public class DataPipelineClient extends AmazonWebServiceClient implements DataPipeline {

    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(DataPipeline.class);

    /**
     * List of exception unmarshallers for all DataPipeline exceptions.
     */
    protected List<Unmarshaller<AmazonServiceException, JSONObject>> exceptionUnmarshallers;

    
    /** AWS signer for authenticating requests. */
    private AWS4Signer signer;


    /**
     * Constructs a new client to invoke service methods on
     * DataPipeline.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @see DefaultAWSCredentialsProvider
     */
    public DataPipelineClient() {
        this(new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * DataPipeline.  A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     *  <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     *  <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     *  <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to DataPipeline
     *                       (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProvider
     */
    public DataPipelineClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on
     * DataPipeline using the specified AWS account credentials.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     */
    public DataPipelineClient(AWSCredentials awsCredentials) {
        this(awsCredentials, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * DataPipeline using the specified AWS account credentials
     * and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key) to use
     *                       when authenticating with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to DataPipeline
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public DataPipelineClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = new StaticCredentialsProvider(awsCredentials);
        
        init();
    }

    /**
     * Constructs a new client to invoke service methods on
     * DataPipeline using the specified AWS account credentials provider.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     */
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, new ClientConfiguration());
    }

    /**
     * Constructs a new client to invoke service methods on
     * DataPipeline using the specified AWS account credentials
     * provider and client configuration options.
     * 
     * <p>
     * All service calls made using this new client object are blocking, and will not
     * return until the service call completes.
     *
     * @param awsCredentialsProvider
     *            The AWS credentials provider which will provide credentials
     *            to authenticate requests with AWS services.
     * @param clientConfiguration The client configuration options controlling how this
     *                       client connects to DataPipeline
     *                       (ex: proxy settings, retry counts, etc.).
     */
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        
        this.awsCredentialsProvider = awsCredentialsProvider;
        
        init();
    }


    private void init() {
        exceptionUnmarshallers = new ArrayList<Unmarshaller<AmazonServiceException, JSONObject>>();
        exceptionUnmarshallers.add(new PipelineNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InternalServiceErrorExceptionUnmarshaller());
        exceptionUnmarshallers.add(new TaskNotFoundExceptionUnmarshaller());
        exceptionUnmarshallers.add(new PipelineDeletedExceptionUnmarshaller());
        exceptionUnmarshallers.add(new InvalidRequestExceptionUnmarshaller());
        
        exceptionUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("datapipeline.us-east-1.amazonaws.com");

        signer = new AWS4Signer();
        
        signer.setServiceName("datapipeline");
        

        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandlers.addAll(chainFactory.newRequestHandlerChain(
                "/com/amazonaws/services/datapipeline/request.handlers"));

        
    }

    
    /**
     * <p>
     * Validates a pipeline and initiates processing. If the pipeline does
     * not pass validation, activation fails.
     * </p>
     * <p>
     * Call this action to start processing pipeline tasks of a pipeline
     * you've created using the CreatePipeline and PutPipelineDefinition
     * actions. A pipeline cannot be modified after it has been successfully
     * activated.
     * </p>
     *
     * @param activatePipelineRequest Container for the necessary parameters
     *           to execute the ActivatePipeline service method on DataPipeline.
     * 
     * @return The response from the ActivatePipeline service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ActivatePipelineResult activatePipeline(ActivatePipelineRequest activatePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ActivatePipelineRequest> request = new ActivatePipelineRequestMarshaller().marshall(activatePipelineRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ActivatePipelineResult, JsonUnmarshallerContext> unmarshaller = new ActivatePipelineResultJsonUnmarshaller();
        
        JsonResponseHandler<ActivatePipelineResult> responseHandler = new JsonResponseHandler<ActivatePipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Returns a list of pipeline identifiers for all active pipelines.
     * Identifiers are returned only for pipelines you have permission to
     * access.
     * </p>
     *
     * @param listPipelinesRequest Container for the necessary parameters to
     *           execute the ListPipelines service method on DataPipeline.
     * 
     * @return The response from the ListPipelines service method, as
     *         returned by DataPipeline.
     * 
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPipelinesResult listPipelines(ListPipelinesRequest listPipelinesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ListPipelinesRequest> request = new ListPipelinesRequestMarshaller().marshall(listPipelinesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ListPipelinesResult, JsonUnmarshallerContext> unmarshaller = new ListPipelinesResultJsonUnmarshaller();
        
        JsonResponseHandler<ListPipelinesResult> responseHandler = new JsonResponseHandler<ListPipelinesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Updates the AWS Data Pipeline service on the progress of the calling
     * task runner. When the task runner is assigned a task, it should call
     * ReportTaskProgress to acknowledge that it has the task within 2
     * minutes. If the web service does not recieve this acknowledgement
     * within the 2 minute window, it will assign the task in a subsequent
     * PollForTask call. After this initial acknowledgement, the task runner
     * only needs to report progress every 15 minutes to maintain its
     * ownership of the task. You can change this reporting time from 15
     * minutes by specifying a <code>reportProgressTimeout</code> field in
     * your pipeline. If a task runner does not report its status after 5
     * minutes, AWS Data Pipeline will assume that the task runner is unable
     * to process the task and will reassign the task in a subsequent
     * response to PollForTask. task runners should call ReportTaskProgress
     * every 60 seconds.
     * </p>
     *
     * @param reportTaskProgressRequest Container for the necessary
     *           parameters to execute the ReportTaskProgress service method on
     *           DataPipeline.
     * 
     * @return The response from the ReportTaskProgress service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws TaskNotFoundException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReportTaskProgressResult reportTaskProgress(ReportTaskProgressRequest reportTaskProgressRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ReportTaskProgressRequest> request = new ReportTaskProgressRequestMarshaller().marshall(reportTaskProgressRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ReportTaskProgressResult, JsonUnmarshallerContext> unmarshaller = new ReportTaskProgressResultJsonUnmarshaller();
        
        JsonResponseHandler<ReportTaskProgressResult> responseHandler = new JsonResponseHandler<ReportTaskProgressResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Tests the pipeline definition with a set of validation checks to
     * ensure that it is well formed and can run without error.
     * </p>
     *
     * @param validatePipelineDefinitionRequest Container for the necessary
     *           parameters to execute the ValidatePipelineDefinition service method on
     *           DataPipeline.
     * 
     * @return The response from the ValidatePipelineDefinition service
     *         method, as returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ValidatePipelineDefinitionResult validatePipelineDefinition(ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ValidatePipelineDefinitionRequest> request = new ValidatePipelineDefinitionRequestMarshaller().marshall(validatePipelineDefinitionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ValidatePipelineDefinitionResult, JsonUnmarshallerContext> unmarshaller = new ValidatePipelineDefinitionResultJsonUnmarshaller();
        
        JsonResponseHandler<ValidatePipelineDefinitionResult> responseHandler = new JsonResponseHandler<ValidatePipelineDefinitionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Task runners call this action to receive a task to perform from AWS
     * Data Pipeline. The task runner specifies which tasks it can perform by
     * setting a value for the workerGroup parameter of the PollForTask call.
     * The task returned by PollForTask may come from any of the pipelines
     * that match the workerGroup value passed in by the task runner and that
     * was launched using the IAM user credentials specified by the task
     * runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, PollForTask returns a response
     * immediately. If no tasks are available in the queue, PollForTask uses
     * long-polling and holds on to a poll connection for up to a 90 seconds
     * during which time the first newly scheduled task is handed to the task
     * runner. To accomodate this, set the socket timeout in your task runner
     * to 90 seconds. The task runner should not call PollForTask again on
     * the same <code>workerGroup</code> until it receives a response, and
     * this may take up to 90 seconds.
     * </p>
     *
     * @param pollForTaskRequest Container for the necessary parameters to
     *           execute the PollForTask service method on DataPipeline.
     * 
     * @return The response from the PollForTask service method, as returned
     *         by DataPipeline.
     * 
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws TaskNotFoundException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PollForTaskResult pollForTask(PollForTaskRequest pollForTaskRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<PollForTaskRequest> request = new PollForTaskRequestMarshaller().marshall(pollForTaskRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<PollForTaskResult, JsonUnmarshallerContext> unmarshaller = new PollForTaskResultJsonUnmarshaller();
        
        JsonResponseHandler<PollForTaskResult> responseHandler = new JsonResponseHandler<PollForTaskResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Queries a pipeline for the names of objects that match a specified set
     * of conditions.
     * </p>
     * <p>
     * The objects returned by QueryObjects are paginated and then filtered
     * by the value you set for query. This means the action may return an
     * empty result set with a value set for marker. If
     * <code>HasMoreResults</code> is set to <code>True</code> , you should
     * continue to call QueryObjects, passing in the returned value for
     * marker, until <code>HasMoreResults</code> returns <code>False</code> .
     * </p>
     *
     * @param queryObjectsRequest Container for the necessary parameters to
     *           execute the QueryObjects service method on DataPipeline.
     * 
     * @return The response from the QueryObjects service method, as returned
     *         by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public QueryObjectsResult queryObjects(QueryObjectsRequest queryObjectsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<QueryObjectsRequest> request = new QueryObjectsRequestMarshaller().marshall(queryObjectsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<QueryObjectsResult, JsonUnmarshallerContext> unmarshaller = new QueryObjectsResultJsonUnmarshaller();
        
        JsonResponseHandler<QueryObjectsResult> responseHandler = new JsonResponseHandler<QueryObjectsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Requests that the status of an array of physical or logical pipeline
     * objects be updated in the pipeline. This update may not occur
     * immediately, but is eventually consistent. The status that can be set
     * depends on the type of object.
     * </p>
     *
     * @param setStatusRequest Container for the necessary parameters to
     *           execute the SetStatus service method on DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void setStatus(SetStatusRequest setStatusRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetStatusRequest> request = new SetStatusRequestMarshaller().marshall(setStatusRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Permanently deletes a pipeline, its pipeline definition and its run
     * history. You cannot query or restore a deleted pipeline. AWS Data
     * Pipeline will attempt to cancel instances associated with the pipeline
     * that are currently being processed by task runners. Deleting a
     * pipeline cannot be undone.
     * </p>
     * <p>
     * To temporarily pause a pipeline instead of deleting it, call
     * SetStatus with the status set to Pause on individual components.
     * Components that are paused by SetStatus can be resumed.
     * </p>
     *
     * @param deletePipelineRequest Container for the necessary parameters to
     *           execute the DeletePipeline service method on DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public void deletePipeline(DeletePipelineRequest deletePipelineRequest) 
            throws AmazonServiceException, AmazonClientException {
                                     
        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DeletePipelineRequest> request = new DeletePipelineRequestMarshaller().marshall(deletePipelineRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        JsonResponseHandler<Void> responseHandler = new JsonResponseHandler<Void>(null);
        invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Returns the definition of the specified pipeline. You can call
     * GetPipelineDefinition to retrieve the pipeline definition you provided
     * using PutPipelineDefinition.
     * </p>
     *
     * @param getPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the GetPipelineDefinition service method on
     *           DataPipeline.
     * 
     * @return The response from the GetPipelineDefinition service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public GetPipelineDefinitionResult getPipelineDefinition(GetPipelineDefinitionRequest getPipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<GetPipelineDefinitionRequest> request = new GetPipelineDefinitionRequestMarshaller().marshall(getPipelineDefinitionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<GetPipelineDefinitionResult, JsonUnmarshallerContext> unmarshaller = new GetPipelineDefinitionResultJsonUnmarshaller();
        
        JsonResponseHandler<GetPipelineDefinitionResult> responseHandler = new JsonResponseHandler<GetPipelineDefinitionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Notifies AWS Data Pipeline that a task is completed and provides
     * information about the final status. The task runner calls this action
     * regardless of whether the task was sucessful. The task runner does not
     * need to call SetTaskStatus for tasks that are canceled by the web
     * service during a call to ReportTaskProgress.
     * </p>
     *
     * @param setTaskStatusRequest Container for the necessary parameters to
     *           execute the SetTaskStatus service method on DataPipeline.
     * 
     * @return The response from the SetTaskStatus service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws TaskNotFoundException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public SetTaskStatusResult setTaskStatus(SetTaskStatusRequest setTaskStatusRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<SetTaskStatusRequest> request = new SetTaskStatusRequestMarshaller().marshall(setTaskStatusRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<SetTaskStatusResult, JsonUnmarshallerContext> unmarshaller = new SetTaskStatusResultJsonUnmarshaller();
        
        JsonResponseHandler<SetTaskStatusResult> responseHandler = new JsonResponseHandler<SetTaskStatusResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Evaluates a string in the context of a specified object. A task runner
     * can use this action to evaluate SQL queries stored in Amazon S3.
     * </p>
     *
     * @param evaluateExpressionRequest Container for the necessary
     *           parameters to execute the EvaluateExpression service method on
     *           DataPipeline.
     * 
     * @return The response from the EvaluateExpression service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws TaskNotFoundException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public EvaluateExpressionResult evaluateExpression(EvaluateExpressionRequest evaluateExpressionRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<EvaluateExpressionRequest> request = new EvaluateExpressionRequestMarshaller().marshall(evaluateExpressionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<EvaluateExpressionResult, JsonUnmarshallerContext> unmarshaller = new EvaluateExpressionResultJsonUnmarshaller();
        
        JsonResponseHandler<EvaluateExpressionResult> responseHandler = new JsonResponseHandler<EvaluateExpressionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Retrieve metadata about one or more pipelines. The information
     * retrieved includes the name of the pipeline, the pipeline identifier,
     * its current state, and the user account that owns the pipeline. Using
     * account credentials, you can retrieve metadata about pipelines that
     * you or your IAM users have created. If you are using an IAM user
     * account, you can retrieve metadata about only those pipelines you have
     * read permission for.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about
     * the pipeline, call the GetPipelineDefinition action.
     * </p>
     *
     * @param describePipelinesRequest Container for the necessary parameters
     *           to execute the DescribePipelines service method on DataPipeline.
     * 
     * @return The response from the DescribePipelines service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribePipelinesResult describePipelines(DescribePipelinesRequest describePipelinesRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribePipelinesRequest> request = new DescribePipelinesRequestMarshaller().marshall(describePipelinesRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribePipelinesResult, JsonUnmarshallerContext> unmarshaller = new DescribePipelinesResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribePipelinesResult> responseHandler = new JsonResponseHandler<DescribePipelinesResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Creates a new empty pipeline. When this action succeeds, you can then
     * use the PutPipelineDefinition action to populate the pipeline.
     * </p>
     *
     * @param createPipelineRequest Container for the necessary parameters to
     *           execute the CreatePipeline service method on DataPipeline.
     * 
     * @return The response from the CreatePipeline service method, as
     *         returned by DataPipeline.
     * 
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public CreatePipelineResult createPipeline(CreatePipelineRequest createPipelineRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<CreatePipelineRequest> request = new CreatePipelineRequestMarshaller().marshall(createPipelineRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<CreatePipelineResult, JsonUnmarshallerContext> unmarshaller = new CreatePipelineResultJsonUnmarshaller();
        
        JsonResponseHandler<CreatePipelineResult> responseHandler = new JsonResponseHandler<CreatePipelineResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Returns the object definitions for a set of objects associated with
     * the pipeline. Object definitions are composed of a set of fields that
     * define the properties of the object.
     * </p>
     *
     * @param describeObjectsRequest Container for the necessary parameters
     *           to execute the DescribeObjects service method on DataPipeline.
     * 
     * @return The response from the DescribeObjects service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public DescribeObjectsResult describeObjects(DescribeObjectsRequest describeObjectsRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<DescribeObjectsRequest> request = new DescribeObjectsRequestMarshaller().marshall(describeObjectsRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<DescribeObjectsResult, JsonUnmarshallerContext> unmarshaller = new DescribeObjectsResultJsonUnmarshaller();
        
        JsonResponseHandler<DescribeObjectsResult> responseHandler = new JsonResponseHandler<DescribeObjectsResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to
     * indicate that they are operational. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the
     * web service can use this call to detect when the task runner
     * application has failed and restart a new instance.
     * </p>
     *
     * @param reportTaskRunnerHeartbeatRequest Container for the necessary
     *           parameters to execute the ReportTaskRunnerHeartbeat service method on
     *           DataPipeline.
     * 
     * @return The response from the ReportTaskRunnerHeartbeat service
     *         method, as returned by DataPipeline.
     * 
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ReportTaskRunnerHeartbeatResult reportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<ReportTaskRunnerHeartbeatRequest> request = new ReportTaskRunnerHeartbeatRequestMarshaller().marshall(reportTaskRunnerHeartbeatRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<ReportTaskRunnerHeartbeatResult, JsonUnmarshallerContext> unmarshaller = new ReportTaskRunnerHeartbeatResultJsonUnmarshaller();
        
        JsonResponseHandler<ReportTaskRunnerHeartbeatResult> responseHandler = new JsonResponseHandler<ReportTaskRunnerHeartbeatResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Adds tasks, schedules, and preconditions that control the behavior of
     * the pipeline. You can use PutPipelineDefinition to populate a new
     * pipeline or to update an existing pipeline that has not yet been
     * activated.
     * </p>
     * <p>
     * PutPipelineDefinition also validates the configuration as it adds it
     * to the pipeline. Changes to the pipeline are saved unless one of the
     * following three validation errors exists in the pipeline. <ol> <li>An
     * object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * </ol>
     * </p>
     * <p>
     * Pipeline object definitions are passed to the PutPipelineDefinition
     * action and returned by the GetPipelineDefinition action.
     * </p>
     *
     * @param putPipelineDefinitionRequest Container for the necessary
     *           parameters to execute the PutPipelineDefinition service method on
     *           DataPipeline.
     * 
     * @return The response from the PutPipelineDefinition service method, as
     *         returned by DataPipeline.
     * 
     * @throws PipelineNotFoundException
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     * @throws PipelineDeletedException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public PutPipelineDefinitionResult putPipelineDefinition(PutPipelineDefinitionRequest putPipelineDefinitionRequest) 
            throws AmazonServiceException, AmazonClientException {

        /* Create execution context */
        ExecutionContext executionContext = createExecutionContext();
        
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.RequestMarshallTime.name());
        Request<PutPipelineDefinitionRequest> request = new PutPipelineDefinitionRequestMarshaller().marshall(putPipelineDefinitionRequest);
        awsRequestMetrics.endEvent(Field.RequestMarshallTime.name());

        Unmarshaller<PutPipelineDefinitionResult, JsonUnmarshallerContext> unmarshaller = new PutPipelineDefinitionResultJsonUnmarshaller();
        
        JsonResponseHandler<PutPipelineDefinitionResult> responseHandler = new JsonResponseHandler<PutPipelineDefinitionResult>(unmarshaller);

        

        return invoke(request, responseHandler, executionContext);
    }
    
    /**
     * <p>
     * Returns a list of pipeline identifiers for all active pipelines.
     * Identifiers are returned only for pipelines you have permission to
     * access.
     * </p>
     * 
     * @return The response from the ListPipelines service method, as
     *         returned by DataPipeline.
     * 
     * @throws InternalServiceErrorException
     * @throws InvalidRequestException
     *
     * @throws AmazonClientException
     *             If any internal errors are encountered inside the client while
     *             attempting to make the request or handle the response.  For example
     *             if a network connection is not available.
     * @throws AmazonServiceException
     *             If an error response is returned by DataPipeline indicating
     *             either a problem with the data in the request, or a server side issue.
     */
    public ListPipelinesResult listPipelines() throws AmazonServiceException, AmazonClientException {
        return listPipelines(new ListPipelinesRequest());
    }
    
    /**
     * Overrides the default endpoint for this client ("datapipeline.us-east-1.amazonaws.com") and explicitly provides
     * an AWS region ID and AWS service name to use when the client calculates a signature
     * for requests.  In almost all cases, this region ID and service name
     * are automatically determined from the endpoint, and callers should use the simpler
     * one-argument form of setEndpoint instead of this method.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "datapipeline.us-east-1.amazonaws.com") or a full
     * URL, including the protocol (ex: "datapipeline.us-east-1.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "datapipeline.us-east-1.amazonaws.com") or a full URL,
     *            including the protocol (ex: "datapipeline.us-east-1.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @param serviceName
     *            The name of the AWS service to use when signing requests.
     * @param regionId
     *            The ID of the region in which this service resides.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     * @see AmazonDynamoDB#setRegion(Region)     
     */
    public void setEndpoint(String endpoint, String serviceName, String regionId) throws IllegalArgumentException {
        setEndpoint(endpoint);
        signer.setServiceName(serviceName);
        signer.setRegionName(regionId);
    }
    
    @Override
    protected String getServiceAbbreviation() {
        return "datapipeline";
    }
    

    /**
     * Returns additional metadata for a previously executed successful, request, typically used for
     * debugging issues where a service isn't acting as expected.  This data isn't considered part
     * of the result data returned by an operation, so it's available through this separate,
     * diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access
     * this extra diagnostic information for an executed request, you should use this method
     * to retrieve it as soon as possible after executing the request.
     *
     * @param request
     *            The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> X invoke(Request<Y> request,
                                                                HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
                                                                ExecutionContext executionContext) throws AmazonClientException {

        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();

        awsRequestMetrics.startEvent(Field.CredentialsRequestTime.name());
        AWSCredentials credentials = awsCredentialsProvider.getCredentials();
        awsRequestMetrics.endEvent(Field.CredentialsRequestTime.name());

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setSigner(signer);
        executionContext.setCredentials(credentials);

        
        JsonErrorResponseHandler errorResponseHandler = new JsonErrorResponseHandler(exceptionUnmarshallers);

        awsRequestMetrics.startEvent(Field.ClientExecuteTime.name());
        X result = (X) client.execute(request, responseHandler, errorResponseHandler, executionContext);
        awsRequestMetrics.endEvent(Field.ClientExecuteTime.name());

        awsRequestMetrics.log();

        return result;
    }
}
        