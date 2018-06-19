/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings used to provision or configure the resource.
 */
public class SignalRCreateOrUpdateProperties {
    /**
     * Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format:
     * &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     */
    @JsonProperty(value = "hostNamePrefix")
    private String hostNamePrefix;

    /**
     * Get the hostNamePrefix value.
     *
     * @return the hostNamePrefix value
     */
    public String hostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * Set the hostNamePrefix value.
     *
     * @param hostNamePrefix the hostNamePrefix value to set
     * @return the SignalRCreateOrUpdateProperties object itself.
     */
    public SignalRCreateOrUpdateProperties withHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }

}
