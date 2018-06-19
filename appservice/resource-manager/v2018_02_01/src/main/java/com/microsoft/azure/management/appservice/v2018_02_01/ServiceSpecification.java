/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource metrics service provided by Microsoft.Insights resource provider.
 */
public class ServiceSpecification {
    /**
     * The metricSpecifications property.
     */
    @JsonProperty(value = "metricSpecifications")
    private List<MetricSpecification> metricSpecifications;

    /**
     * Get the metricSpecifications value.
     *
     * @return the metricSpecifications value
     */
    public List<MetricSpecification> metricSpecifications() {
        return this.metricSpecifications;
    }

    /**
     * Set the metricSpecifications value.
     *
     * @param metricSpecifications the metricSpecifications value to set
     * @return the ServiceSpecification object itself.
     */
    public ServiceSpecification withMetricSpecifications(List<MetricSpecification> metricSpecifications) {
        this.metricSpecifications = metricSpecifications;
        return this;
    }

}
