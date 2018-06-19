/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import java.util.List;
import com.microsoft.azure.management.postgresql.v2017_12_01.PerformanceTierServiceLevelObjectives;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Performance tier properties.
 */
public class PerformanceTierPropertiesInner {
    /**
     * ID of the performance tier.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Service level objectives associated with the performance tier.
     */
    @JsonProperty(value = "serviceLevelObjectives")
    private List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the serviceLevelObjectives value.
     *
     * @return the serviceLevelObjectives value
     */
    public List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives() {
        return this.serviceLevelObjectives;
    }

    /**
     * Set the serviceLevelObjectives value.
     *
     * @param serviceLevelObjectives the serviceLevelObjectives value to set
     * @return the PerformanceTierPropertiesInner object itself.
     */
    public PerformanceTierPropertiesInner withServiceLevelObjectives(List<PerformanceTierServiceLevelObjectives> serviceLevelObjectives) {
        this.serviceLevelObjectives = serviceLevelObjectives;
        return this;
    }

}
