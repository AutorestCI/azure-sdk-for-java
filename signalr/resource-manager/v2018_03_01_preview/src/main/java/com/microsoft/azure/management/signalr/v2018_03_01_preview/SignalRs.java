/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.signalr.v2018_03_01_preview.implementation.SignalRsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SignalRs.
 */
public interface SignalRs extends SupportsCreating<SignalRResource.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<SignalRResource>, SupportsListingByResourceGroup<SignalRResource>, SupportsListing<SignalRResource>, HasInner<SignalRsInner> {
    /**
     * Get the access keys of the SignalR resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SignalRKeys> listKeysAsync(String resourceGroupName, String resourceName);

    /**
     * Regenerate SignalR service access key. PrimaryKey and SecondaryKey cannot be regenerated at the same time.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param resourceName The name of the SignalR resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<SignalRKeys> regenerateKeyAsync(String resourceGroupName, String resourceName);

    /**
     * Checks that the SignalR name is valid and is not already in use.
     *
     * @param location the region
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NameAvailability> checkNameAvailabilityAsync(String location);

}
