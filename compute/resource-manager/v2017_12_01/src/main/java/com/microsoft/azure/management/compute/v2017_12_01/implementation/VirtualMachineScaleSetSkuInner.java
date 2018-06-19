/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.management.compute.v2017_12_01.Sku;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetSkuCapacity;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes an available virtual machine scale set sku.
 */
public class VirtualMachineScaleSetSkuInner {
    /**
     * The type of resource the sku applies to.
     */
    @JsonProperty(value = "resourceType", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceType;

    /**
     * The Sku.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /**
     * Specifies the number of virtual machines in the scale set.
     */
    @JsonProperty(value = "capacity", access = JsonProperty.Access.WRITE_ONLY)
    private VirtualMachineScaleSetSkuCapacity capacity;

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
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public VirtualMachineScaleSetSkuCapacity capacity() {
        return this.capacity;
    }

}
