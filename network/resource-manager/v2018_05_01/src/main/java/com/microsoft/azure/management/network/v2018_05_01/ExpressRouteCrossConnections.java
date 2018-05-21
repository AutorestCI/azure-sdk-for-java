/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.network.v2018_05_01.implementation.ExpressRouteCrossConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteCrossConnections.
 */
public interface ExpressRouteCrossConnections extends SupportsCreating<ExpressRouteCrossConnection.DefinitionStages.Blank>, SupportsGettingByResourceGroup<ExpressRouteCrossConnection>, SupportsListingByResourceGroup<ExpressRouteCrossConnection>, SupportsListing<ExpressRouteCrossConnection>, HasInner<ExpressRouteCrossConnectionsInner> {
    /**
     * Gets the currently advertised ARP table associated with the express route cross connection in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitsArpTableListResult> listArpTableAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath);

    /**
     * Gets the route table summary associated with the express route cross connection in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCrossConnectionsRoutesTableSummaryListResult> listRoutesTableSummaryAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route cross connection in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitsRoutesTableListResult> listRoutesTableAsync(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath);

}
