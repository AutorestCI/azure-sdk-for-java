/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource group filter.
 */
public class ResourceGroupFilter {
    /**
     * The tag name.
     */
    @JsonProperty(value = "tagName")
    private String tagName;

    /**
     * The tag value.
     */
    @JsonProperty(value = "tagValue")
    private String tagValue;

    /**
     * Get the tagName value.
     *
     * @return the tagName value
     */
    public String tagName() {
        return this.tagName;
    }

    /**
     * Set the tagName value.
     *
     * @param tagName the tagName value to set
     * @return the ResourceGroupFilter object itself.
     */
    public ResourceGroupFilter withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * Get the tagValue value.
     *
     * @return the tagValue value
     */
    public String tagValue() {
        return this.tagValue;
    }

    /**
     * Set the tagValue value.
     *
     * @param tagValue the tagValue value to set
     * @return the ResourceGroupFilter object itself.
     */
    public ResourceGroupFilter withTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }

}
