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
package com.amazonaws.services.cloudsearch.model;
import java.io.Serializable;

/**
 * <p>
 * The synonym options configured for this search domain and the current status of those options.
 * </p>
 */
public class SynonymOptionsStatus implements Serializable {

    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     */
    private String options;

    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     */
    private OptionStatus status;

    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     *
     * @return Maps terms to their synonyms, serialized as a JSON document. The
     *         document has a single object with one property "synonyms" whose value
     *         is an object mapping terms to their synonyms. Each synonym is a simple
     *         string or an array of strings. The maximum size of a stopwords
     *         document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     *         "kitten"], "puppy": "dog"} }</code>
     */
    public String getOptions() {
        return options;
    }
    
    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     *
     * @param options Maps terms to their synonyms, serialized as a JSON document. The
     *         document has a single object with one property "synonyms" whose value
     *         is an object mapping terms to their synonyms. Each synonym is a simple
     *         string or an array of strings. The maximum size of a stopwords
     *         document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     *         "kitten"], "puppy": "dog"} }</code>
     */
    public void setOptions(String options) {
        this.options = options;
    }
    
    /**
     * Maps terms to their synonyms, serialized as a JSON document. The
     * document has a single object with one property "synonyms" whose value
     * is an object mapping terms to their synonyms. Each synonym is a simple
     * string or an array of strings. The maximum size of a stopwords
     * document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     * "kitten"], "puppy": "dog"} }</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options Maps terms to their synonyms, serialized as a JSON document. The
     *         document has a single object with one property "synonyms" whose value
     *         is an object mapping terms to their synonyms. Each synonym is a simple
     *         string or an array of strings. The maximum size of a stopwords
     *         document is 100KB. Example: <code>{ "synonyms": {"cat": ["feline",
     *         "kitten"], "puppy": "dog"} }</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SynonymOptionsStatus withOptions(String options) {
        this.options = options;
        return this;
    }
    
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     *
     * @return The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     */
    public OptionStatus getStatus() {
        return status;
    }
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     *
     * @param status The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }
    
    /**
     * The status of an option, including when it was last updated and
     * whether it is actively in use for searches.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of an option, including when it was last updated and
     *         whether it is actively in use for searches.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SynonymOptionsStatus withStatus(OptionStatus status) {
        this.status = status;
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
        if (getOptions() != null) sb.append("Options: " + getOptions() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SynonymOptionsStatus == false) return false;
        SynonymOptionsStatus other = (SynonymOptionsStatus)obj;
        
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    