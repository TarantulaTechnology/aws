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
package com.amazonaws.services.elasticbeanstalk.model;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteConfigurationTemplate(DeleteConfigurationTemplateRequest) DeleteConfigurationTemplate operation}.
 * <p>
 * Deletes the specified configuration template.
 * </p>
 * <p>
 * <b>NOTE:</b>When you launch an environment using a configuration template, the environment gets a copy of the template. You can delete or modify the
 * environment's copy of the template without affecting the running environment.
 * </p>
 *
 * @see com.amazonaws.services.elasticbeanstalk.AWSElasticBeanstalk#deleteConfigurationTemplate(DeleteConfigurationTemplateRequest)
 */
public class DeleteConfigurationTemplateRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the application to delete the configuration template from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The name of the configuration template to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * Default constructor for a new DeleteConfigurationTemplateRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeleteConfigurationTemplateRequest() {}
    


    /**
     * Constructs a new DeleteConfigurationTemplateRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param applicationName The name of the application to delete the
     * configuration template from.
     * @param templateName The name of the configuration template to delete.
     */
    public DeleteConfigurationTemplateRequest(String applicationName, String templateName) {
        setApplicationName(applicationName);
        setTemplateName(templateName);
    }

    
    
    /**
     * The name of the application to delete the configuration template from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the application to delete the configuration template from.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The name of the application to delete the configuration template from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete the configuration template from.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The name of the application to delete the configuration template from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The name of the application to delete the configuration template from.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteConfigurationTemplateRequest withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }
    
    
    /**
     * The name of the configuration template to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration template to delete.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration template to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to delete.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration template to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration template to delete.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeleteConfigurationTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
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
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getTemplateName() != null) sb.append("TemplateName: " + getTemplateName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode()); 
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteConfigurationTemplateRequest == false) return false;
        DeleteConfigurationTemplateRequest other = (DeleteConfigurationTemplateRequest)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getTemplateName() == null ^ this.getTemplateName() == null) return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false) return false; 
        return true;
    }
    
}
    