/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IoTHubManager;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IotHubNameAvailabilityInfoInner;

/**
 * Type representing IotHubNameAvailabilityInfo.
 */
public interface IotHubNameAvailabilityInfo extends HasInner<IotHubNameAvailabilityInfoInner>, HasManager<IoTHubManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    IotHubNameUnavailabilityReason reason();

}
