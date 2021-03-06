/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request to create a new streaming distribution with tags.
 */
public class CreateStreamingDistributionWithTagsRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The streaming distribution's configuration information. */
    private StreamingDistributionConfigWithTags streamingDistributionConfigWithTags;

    /**
     * The streaming distribution's configuration information.
     * 
     * @param streamingDistributionConfigWithTags
     *        The streaming distribution's configuration information.
     */

    public void setStreamingDistributionConfigWithTags(
            StreamingDistributionConfigWithTags streamingDistributionConfigWithTags) {
        this.streamingDistributionConfigWithTags = streamingDistributionConfigWithTags;
    }

    /**
     * The streaming distribution's configuration information.
     * 
     * @return The streaming distribution's configuration information.
     */

    public StreamingDistributionConfigWithTags getStreamingDistributionConfigWithTags() {
        return this.streamingDistributionConfigWithTags;
    }

    /**
     * The streaming distribution's configuration information.
     * 
     * @param streamingDistributionConfigWithTags
     *        The streaming distribution's configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateStreamingDistributionWithTagsRequest withStreamingDistributionConfigWithTags(
            StreamingDistributionConfigWithTags streamingDistributionConfigWithTags) {
        setStreamingDistributionConfigWithTags(streamingDistributionConfigWithTags);
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
        if (getStreamingDistributionConfigWithTags() != null)
            sb.append("StreamingDistributionConfigWithTags: "
                    + getStreamingDistributionConfigWithTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingDistributionWithTagsRequest == false)
            return false;
        CreateStreamingDistributionWithTagsRequest other = (CreateStreamingDistributionWithTagsRequest) obj;
        if (other.getStreamingDistributionConfigWithTags() == null
                ^ this.getStreamingDistributionConfigWithTags() == null)
            return false;
        if (other.getStreamingDistributionConfigWithTags() != null
                && other.getStreamingDistributionConfigWithTags().equals(
                        this.getStreamingDistributionConfigWithTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingDistributionConfigWithTags() == null) ? 0
                        : getStreamingDistributionConfigWithTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingDistributionWithTagsRequest clone() {
        return (CreateStreamingDistributionWithTagsRequest) super.clone();
    }
}
