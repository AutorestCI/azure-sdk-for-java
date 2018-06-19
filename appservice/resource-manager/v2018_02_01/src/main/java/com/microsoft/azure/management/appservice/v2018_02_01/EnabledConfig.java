/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Enabled configuration.
 */
public class EnabledConfig {
    /**
     * True if configuration is enabled, false if it is disabled and null if
     * configuration is not set.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the EnabledConfig object itself.
     */
    public EnabledConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

}
