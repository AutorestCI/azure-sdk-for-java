/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.VnetGatewayInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.AppServiceManager;

/**
 * Type representing VnetGateway.
 */
public interface VnetGateway extends HasInner<VnetGatewayInner>, Indexable, Refreshable<VnetGateway>, Updatable<VnetGateway.Update>, HasManager<AppServiceManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vnetName value.
     */
    String vnetName();

    /**
     * @return the vpnPackageUri value.
     */
    String vpnPackageUri();

    /**
     * The template for a VnetGateway update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VnetGateway>, UpdateStages.WithKind, UpdateStages.WithVnetName {
    }

    /**
     * Grouping of VnetGateway update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vnetgateway update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the vnetgateway update allowing to specify VnetName.
         */
        interface WithVnetName {
            /**
             * Specifies vnetName.
             */
            Update withVnetName(String vnetName);
        }

    }
}
