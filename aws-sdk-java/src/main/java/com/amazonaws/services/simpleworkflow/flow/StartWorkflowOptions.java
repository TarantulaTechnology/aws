/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleworkflow.flow;

import java.util.List;

import com.amazonaws.services.simpleworkflow.model.ChildPolicy;

public class StartWorkflowOptions {
	
    private Long executionStartToCloseTimeoutSeconds;
	
    private Long taskStartToCloseTimeoutSeconds;
    
    private List<String> tagList;
	
    private String taskList;
	
    private ChildPolicy childPolicy;
    
    public ChildPolicy getChildPolicy() {
        return childPolicy;
    }
    
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    public Long getExecutionStartToCloseTimeoutSeconds() {
		return executionStartToCloseTimeoutSeconds;
	}
	
	public void setExecutionStartToCloseTimeoutSeconds(Long executionStartToCloseTimeoutSeconds) {
		this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
	}
	
	public StartWorkflowOptions withExecutionStartToCloseTimeoutSeconds(Long executionStartToCloseTimeoutSeconds) {
		this.executionStartToCloseTimeoutSeconds = executionStartToCloseTimeoutSeconds;
		return this;
	}
	
	public Long getTaskStartToCloseTimeoutSeconds() {
        return taskStartToCloseTimeoutSeconds;
    }

    public void setTaskStartToCloseTimeoutSeconds(Long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
    }
    
    public StartWorkflowOptions withTaskStartToCloseTimeoutSeconds(Long taskStartToCloseTimeoutSeconds) {
        this.taskStartToCloseTimeoutSeconds = taskStartToCloseTimeoutSeconds;
        return this;
    }
	
	public List<String> getTagList() {
		return tagList;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}
	
	public StartWorkflowOptions withTagList(List<String> tagList) {
		this.tagList = tagList;
		return this;
	}

	public String getTaskList() {
		return taskList;
	}

	public void setTaskList(String taskList) {
		this.taskList = taskList;
	}
	
	public StartWorkflowOptions withTaskList(String taskList) {
		this.taskList = taskList;
		return this;
	}
}
