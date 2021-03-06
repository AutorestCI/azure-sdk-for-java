/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Localized display information of an operation.
 */
public class ClientDiscoveryDisplay {
    /**
     * Name of the resource provider.
     */
    @JsonProperty(value = "Provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "Resource", access = JsonProperty.Access.WRITE_ONLY)
    private String resource;

    /**
     * Name of the operation.
     */
    @JsonProperty(value = "Operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Operation description.
     */
    @JsonProperty(value = "Description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the provider value.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation value.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

}
