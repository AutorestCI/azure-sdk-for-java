/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response for CheckIPAddressAvailability API service call.
 */
public class IPAddressAvailabilityResultInner {
    /**
     * Private IP address availability.
     */
    @JsonProperty(value = "available")
    private Boolean available;

    /**
     * Contains other available private IP addresses if the asked for address
     * is taken.
     */
    @JsonProperty(value = "availableIPAddresses")
    private List<String> availableIPAddresses;

    /**
     * Get the available value.
     *
     * @return the available value
     */
    public Boolean available() {
        return this.available;
    }

    /**
     * Set the available value.
     *
     * @param available the available value to set
     * @return the IPAddressAvailabilityResultInner object itself.
     */
    public IPAddressAvailabilityResultInner withAvailable(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Get the availableIPAddresses value.
     *
     * @return the availableIPAddresses value
     */
    public List<String> availableIPAddresses() {
        return this.availableIPAddresses;
    }

    /**
     * Set the availableIPAddresses value.
     *
     * @param availableIPAddresses the availableIPAddresses value to set
     * @return the IPAddressAvailabilityResultInner object itself.
     */
    public IPAddressAvailabilityResultInner withAvailableIPAddresses(List<String> availableIPAddresses) {
        this.availableIPAddresses = availableIPAddresses;
        return this;
    }

}
