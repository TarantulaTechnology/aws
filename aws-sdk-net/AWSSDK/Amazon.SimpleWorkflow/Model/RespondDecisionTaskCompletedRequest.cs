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
using System;
using System.Collections.Generic;
using System.Xml.Serialization;
using System.Text;
using System.IO;

using Amazon.Runtime;
using Amazon.Runtime.Internal;

namespace Amazon.SimpleWorkflow.Model
{
    /// <summary>
    /// Container for the parameters to the RespondDecisionTaskCompleted operation.
    /// <para> Used by deciders to tell the service that the DecisionTask identified by the <c>taskToken</c> has successfully completed. The
    /// <c>decisions</c> argument specifies the list of decisions made while processing the task. </para> <para> A
    /// <c>DecisionTaskCompleted</c> event is added to the workflow history. The <c>executionContext</c> specified is attached
    /// to the event in the workflow execution history. </para> <para> <b>Access Control</b> </para> <para>If an IAM policy grants permission to use
    /// <c>RespondDecisionTaskCompleted</c> , it can express permissions for the list of decisions in the <c>decisions</c> parameter in the same way
    /// as for the regular API. This approach maintains a uniform conceptual model and helps keep policies readable. For more information, see Using
    /// IAM to Manage Access to Amazon SWF Workflows.</para>
    /// </summary>
    /// <seealso cref="Amazon.SimpleWorkflow.AmazonSimpleWorkflow.RespondDecisionTaskCompleted"/>
    public class RespondDecisionTaskCompletedRequest : AmazonWebServiceRequest
    {
        private string taskToken;
        private List<Decision> decisions = new List<Decision>();
        private string executionContext;

        /// <summary>
        /// The <c>taskToken</c> from the <a>DecisionTask</a>. <important> The <c>taskToken</c> is generated by the service and should be treated as an
        /// opaque value. If the task is passed to another process, its <c>taskToken</c> must also be passed. This enables it to provide its progress
        /// and respond with results. </important>
        ///  
        /// <para>
        /// <b>Constraints:</b>
        /// <list type="definition">
        ///     <item>
        ///         <term>Length</term>
        ///         <description>1 - 1024</description>
        ///     </item>
        /// </list>
        /// </para>
        /// </summary>
        public string TaskToken
        {
            get { return this.taskToken; }
            set { this.taskToken = value; }
        }

        /// <summary>
        /// Sets the TaskToken property
        /// </summary>
        /// <param name="taskToken">The value to set for the TaskToken property </param>
        /// <returns>this instance</returns>
        [Obsolete("The With methods are obsolete and will be removed in version 2 of the AWS SDK for .NET. See http://aws.amazon.com/sdkfornet/#version2 for more information.")]
        public RespondDecisionTaskCompletedRequest WithTaskToken(string taskToken)
        {
            this.taskToken = taskToken;
            return this;
        }
            

        // Check to see if TaskToken property is set
        internal bool IsSetTaskToken()
        {
            return this.taskToken != null;
        }

        /// <summary>
        /// The list of decisions (possibly empty) made by the decider while processing this decision task. See the docs for the <a>Decision</a>
        /// structure for details.
        ///  
        /// </summary>
        public List<Decision> Decisions
        {
            get { return this.decisions; }
            set { this.decisions = value; }
        }
        /// <summary>
        /// Adds elements to the Decisions collection
        /// </summary>
        /// <param name="decisions">The values to add to the Decisions collection </param>
        /// <returns>this instance</returns>
        [Obsolete("The With methods are obsolete and will be removed in version 2 of the AWS SDK for .NET. See http://aws.amazon.com/sdkfornet/#version2 for more information.")]
        public RespondDecisionTaskCompletedRequest WithDecisions(params Decision[] decisions)
        {
            foreach (Decision element in decisions)
            {
                this.decisions.Add(element);
            }

            return this;
        }

        /// <summary>
        /// Adds elements to the Decisions collection
        /// </summary>
        /// <param name="decisions">The values to add to the Decisions collection </param>
        /// <returns>this instance</returns>
        [Obsolete("The With methods are obsolete and will be removed in version 2 of the AWS SDK for .NET. See http://aws.amazon.com/sdkfornet/#version2 for more information.")]
        public RespondDecisionTaskCompletedRequest WithDecisions(IEnumerable<Decision> decisions)
        {
            foreach (Decision element in decisions)
            {
                this.decisions.Add(element);
            }

            return this;
        }

        // Check to see if Decisions property is set
        internal bool IsSetDecisions()
        {
            return this.decisions.Count > 0;
        }

        /// <summary>
        /// User defined context to add to workflow execution.
        ///  
        /// <para>
        /// <b>Constraints:</b>
        /// <list type="definition">
        ///     <item>
        ///         <term>Length</term>
        ///         <description>0 - 32768</description>
        ///     </item>
        /// </list>
        /// </para>
        /// </summary>
        public string ExecutionContext
        {
            get { return this.executionContext; }
            set { this.executionContext = value; }
        }

        /// <summary>
        /// Sets the ExecutionContext property
        /// </summary>
        /// <param name="executionContext">The value to set for the ExecutionContext property </param>
        /// <returns>this instance</returns>
        [Obsolete("The With methods are obsolete and will be removed in version 2 of the AWS SDK for .NET. See http://aws.amazon.com/sdkfornet/#version2 for more information.")]
        public RespondDecisionTaskCompletedRequest WithExecutionContext(string executionContext)
        {
            this.executionContext = executionContext;
            return this;
        }
            

        // Check to see if ExecutionContext property is set
        internal bool IsSetExecutionContext()
        {
            return this.executionContext != null;
        }
    }
}
    
