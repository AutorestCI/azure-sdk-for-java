/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.IotHubSkuInfo;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubCapacity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SKU properties.
 */
public class IotHubSkuDescriptionInner {
    /**
     * The type of the resource.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The type of the resource.
     */
    @JsonProperty(value = "sku", required = true)
    private IotHubSkuInfo sku;

    /**
     * IotHub capacity.
     */
    @JsonProperty(value = "capacity", required = true)
    private IotHubCapacity capacity;

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public IotHubSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the IotHubSkuDescriptionInner object itself.
     */
    public IotHubSkuDescriptionInner withSku(IotHubSkuInfo sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public IotHubCapacity capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the IotHubSkuDescriptionInner object itself.
     */
    public IotHubSkuDescriptionInner withCapacity(IotHubCapacity capacity) {
        this.capacity = capacity;
        return this;
    }

}
