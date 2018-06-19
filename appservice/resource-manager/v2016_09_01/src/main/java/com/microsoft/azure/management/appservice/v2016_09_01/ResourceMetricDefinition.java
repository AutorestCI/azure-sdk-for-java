/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.ResourceMetricDefinitionInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.AppServiceManager;
import java.util.List;
import java.util.Map;

/**
 * Type representing ResourceMetricDefinition.
 */
public interface ResourceMetricDefinition extends HasInner<ResourceMetricDefinitionInner>, HasManager<AppServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the metricAvailabilities value.
     */
    List<ResourceMetricAvailability> metricAvailabilities();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the primaryAggregationType value.
     */
    String primaryAggregationType();

    /**
     * @return the properties value.
     */
    Map<String, String> properties();

    /**
     * @return the resourceMetricDefinitionId value.
     */
    String resourceMetricDefinitionId();

    /**
     * @return the resourceMetricDefinitionName value.
     */
    ResourceMetricName resourceMetricDefinitionName();

    /**
     * @return the resourceUri value.
     */
    String resourceUri();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the unit value.
     */
    String unit();

}
