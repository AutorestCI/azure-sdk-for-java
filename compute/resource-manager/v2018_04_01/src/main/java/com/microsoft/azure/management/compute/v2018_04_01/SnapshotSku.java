/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The snapshots sku name. Can be Standard_LRS, Premium_LRS, or Standard_ZRS.
 */
public class SnapshotSku {
    /**
     * The sku name. Possible values include: 'Standard_LRS', 'Premium_LRS',
     * 'Standard_ZRS'.
     */
    @JsonProperty(value = "name")
    private SnapshotStorageAccountTypes name;

    /**
     * The sku tier.
     */
    @JsonProperty(value = "tier", access = JsonProperty.Access.WRITE_ONLY)
    private String tier;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public SnapshotStorageAccountTypes name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SnapshotSku object itself.
     */
    public SnapshotSku withName(SnapshotStorageAccountTypes name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tier value.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

}
