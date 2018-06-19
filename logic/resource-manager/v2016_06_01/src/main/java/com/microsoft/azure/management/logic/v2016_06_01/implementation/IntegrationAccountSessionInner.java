/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The integration account session.
 */
@JsonFlatten
@SkipParentValidation
public class IntegrationAccountSessionInner extends Resource {
    /**
     * The created time.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * The changed time.
     */
    @JsonProperty(value = "properties.changedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime changedTime;

    /**
     * The session content.
     */
    @JsonProperty(value = "properties.content")
    private Object content;

    /**
     * Get the createdTime value.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime value.
     *
     * @return the changedTime value
     */
    public DateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the content value.
     *
     * @return the content value
     */
    public Object content() {
        return this.content;
    }

    /**
     * Set the content value.
     *
     * @param content the content value to set
     * @return the IntegrationAccountSessionInner object itself.
     */
    public IntegrationAccountSessionInner withContent(Object content) {
        this.content = content;
        return this;
    }

}
