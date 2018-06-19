/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.VnetRouteInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_09_01.implementation.AppServiceManager;

/**
 * Type representing VnetRoute.
 */
public interface VnetRoute extends HasInner<VnetRouteInner>, Indexable, Updatable<VnetRoute.Update>, HasManager<AppServiceManager> {
    /**
     * @return the endAddress value.
     */
    String endAddress();

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
     * @return the routeType value.
     */
    RouteType routeType();

    /**
     * @return the startAddress value.
     */
    String startAddress();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the vnetRouteName value.
     */
    String vnetRouteName();

    /**
     * The entirety of the VnetRoute definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithVirtualNetworkConnection, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of VnetRoute definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a VnetRoute definition.
         */
        interface Blank extends WithVirtualNetworkConnection {
        }

        /**
         * The stage of the vnetroute definition allowing to specify VirtualNetworkConnection.
         */
        interface WithVirtualNetworkConnection {
           /**
            * Specifies resourceGroupName, name, vnetName.
            */
            WithCreate withExistingVirtualNetworkConnection(String resourceGroupName, String name, String vnetName);
        }

        /**
         * The stage of the vnetroute definition allowing to specify EndAddress.
         */
        interface WithEndAddress {
            /**
             * Specifies endAddress.
             */
            WithCreate withEndAddress(String endAddress);
        }

        /**
         * The stage of the vnetroute definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the vnetroute definition allowing to specify RouteType.
         */
        interface WithRouteType {
            /**
             * Specifies routeType.
             */
            WithCreate withRouteType(RouteType routeType);
        }

        /**
         * The stage of the vnetroute definition allowing to specify StartAddress.
         */
        interface WithStartAddress {
            /**
             * Specifies startAddress.
             */
            WithCreate withStartAddress(String startAddress);
        }

        /**
         * The stage of the vnetroute definition allowing to specify VnetRouteName.
         */
        interface WithVnetRouteName {
            /**
             * Specifies vnetRouteName.
             */
            WithCreate withVnetRouteName(String vnetRouteName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<VnetRoute>, DefinitionStages.WithEndAddress, DefinitionStages.WithKind, DefinitionStages.WithRouteType, DefinitionStages.WithStartAddress, DefinitionStages.WithVnetRouteName {
        }
    }
    /**
     * The template for a VnetRoute update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<VnetRoute>, UpdateStages.WithEndAddress, UpdateStages.WithKind, UpdateStages.WithRouteType, UpdateStages.WithStartAddress, UpdateStages.WithVnetRouteName {
    }

    /**
     * Grouping of VnetRoute update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the vnetroute update allowing to specify EndAddress.
         */
        interface WithEndAddress {
            /**
             * Specifies endAddress.
             */
            Update withEndAddress(String endAddress);
        }

        /**
         * The stage of the vnetroute update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the vnetroute update allowing to specify RouteType.
         */
        interface WithRouteType {
            /**
             * Specifies routeType.
             */
            Update withRouteType(RouteType routeType);
        }

        /**
         * The stage of the vnetroute update allowing to specify StartAddress.
         */
        interface WithStartAddress {
            /**
             * Specifies startAddress.
             */
            Update withStartAddress(String startAddress);
        }

        /**
         * The stage of the vnetroute update allowing to specify VnetRouteName.
         */
        interface WithVnetRouteName {
            /**
             * Specifies vnetRouteName.
             */
            Update withVnetRouteName(String vnetRouteName);
        }

    }
}
