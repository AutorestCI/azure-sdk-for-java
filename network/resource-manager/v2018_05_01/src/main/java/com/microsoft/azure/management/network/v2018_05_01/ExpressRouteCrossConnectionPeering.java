/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_05_01.implementation.ExpressRouteCrossConnectionPeeringInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_05_01.implementation.NetworkManager;

/**
 * Type representing ExpressRouteCrossConnectionPeering.
 */
public interface ExpressRouteCrossConnectionPeering extends HasInner<ExpressRouteCrossConnectionPeeringInner>, Indexable, Refreshable<ExpressRouteCrossConnectionPeering>, Updatable<ExpressRouteCrossConnectionPeering.Update>, HasManager<NetworkManager> {
    /**
     * @return the azureASN value.
     */
    Integer azureASN();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the gatewayManagerEtag value.
     */
    String gatewayManagerEtag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ipv6PeeringConfig value.
     */
    Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig();

    /**
     * @return the lastModifiedBy value.
     */
    String lastModifiedBy();

    /**
     * @return the microsoftPeeringConfig value.
     */
    ExpressRouteCircuitPeeringConfig microsoftPeeringConfig();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the peerASN value.
     */
    Long peerASN();

    /**
     * @return the peeringType value.
     */
    ExpressRoutePeeringType peeringType();

    /**
     * @return the primaryAzurePort value.
     */
    String primaryAzurePort();

    /**
     * @return the primaryPeerAddressPrefix value.
     */
    String primaryPeerAddressPrefix();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the secondaryAzurePort value.
     */
    String secondaryAzurePort();

    /**
     * @return the secondaryPeerAddressPrefix value.
     */
    String secondaryPeerAddressPrefix();

    /**
     * @return the sharedKey value.
     */
    String sharedKey();

    /**
     * @return the state value.
     */
    ExpressRoutePeeringState state();

    /**
     * @return the vlanId value.
     */
    Integer vlanId();

    /**
     * The entirety of the ExpressRouteCrossConnectionPeering definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithExpressRouteCrossConnection, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ExpressRouteCrossConnectionPeering definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ExpressRouteCrossConnectionPeering definition.
         */
        interface Blank extends WithExpressRouteCrossConnection {
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify ExpressRouteCrossConnection.
         */
        interface WithExpressRouteCrossConnection {
           /**
            * Specifies resourceGroupName, crossConnectionName.
            */
            WithCreate withExistingExpressRouteCrossConnection(String resourceGroupName, String crossConnectionName);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             */
            WithCreate withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify Ipv6PeeringConfig.
         */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies ipv6PeeringConfig.
             */
            WithCreate withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify LastModifiedBy.
         */
        interface WithLastModifiedBy {
            /**
             * Specifies lastModifiedBy.
             */
            WithCreate withLastModifiedBy(String lastModifiedBy);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify MicrosoftPeeringConfig.
         */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies microsoftPeeringConfig.
             */
            WithCreate withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify PeerASN.
         */
        interface WithPeerASN {
            /**
             * Specifies peerASN.
             */
            WithCreate withPeerASN(Long peerASN);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify PeeringType.
         */
        interface WithPeeringType {
            /**
             * Specifies peeringType.
             */
            WithCreate withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify PrimaryPeerAddressPrefix.
         */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies primaryPeerAddressPrefix.
             */
            WithCreate withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify SecondaryPeerAddressPrefix.
         */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies secondaryPeerAddressPrefix.
             */
            WithCreate withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             */
            WithCreate withSharedKey(String sharedKey);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            WithCreate withState(ExpressRoutePeeringState state);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering definition allowing to specify VlanId.
         */
        interface WithVlanId {
            /**
             * Specifies vlanId.
             */
            WithCreate withVlanId(Integer vlanId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ExpressRouteCrossConnectionPeering>, DefinitionStages.WithGatewayManagerEtag, DefinitionStages.WithId, DefinitionStages.WithIpv6PeeringConfig, DefinitionStages.WithLastModifiedBy, DefinitionStages.WithMicrosoftPeeringConfig, DefinitionStages.WithName, DefinitionStages.WithPeerASN, DefinitionStages.WithPeeringType, DefinitionStages.WithPrimaryPeerAddressPrefix, DefinitionStages.WithSecondaryPeerAddressPrefix, DefinitionStages.WithSharedKey, DefinitionStages.WithState, DefinitionStages.WithVlanId {
        }
    }
    /**
     * The template for a ExpressRouteCrossConnectionPeering update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ExpressRouteCrossConnectionPeering>, UpdateStages.WithGatewayManagerEtag, UpdateStages.WithId, UpdateStages.WithIpv6PeeringConfig, UpdateStages.WithLastModifiedBy, UpdateStages.WithMicrosoftPeeringConfig, UpdateStages.WithName, UpdateStages.WithPeerASN, UpdateStages.WithPeeringType, UpdateStages.WithPrimaryPeerAddressPrefix, UpdateStages.WithSecondaryPeerAddressPrefix, UpdateStages.WithSharedKey, UpdateStages.WithState, UpdateStages.WithVlanId {
    }

    /**
     * Grouping of ExpressRouteCrossConnectionPeering update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify GatewayManagerEtag.
         */
        interface WithGatewayManagerEtag {
            /**
             * Specifies gatewayManagerEtag.
             */
            Update withGatewayManagerEtag(String gatewayManagerEtag);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify Ipv6PeeringConfig.
         */
        interface WithIpv6PeeringConfig {
            /**
             * Specifies ipv6PeeringConfig.
             */
            Update withIpv6PeeringConfig(Ipv6ExpressRouteCircuitPeeringConfig ipv6PeeringConfig);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify LastModifiedBy.
         */
        interface WithLastModifiedBy {
            /**
             * Specifies lastModifiedBy.
             */
            Update withLastModifiedBy(String lastModifiedBy);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify MicrosoftPeeringConfig.
         */
        interface WithMicrosoftPeeringConfig {
            /**
             * Specifies microsoftPeeringConfig.
             */
            Update withMicrosoftPeeringConfig(ExpressRouteCircuitPeeringConfig microsoftPeeringConfig);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify PeerASN.
         */
        interface WithPeerASN {
            /**
             * Specifies peerASN.
             */
            Update withPeerASN(Long peerASN);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify PeeringType.
         */
        interface WithPeeringType {
            /**
             * Specifies peeringType.
             */
            Update withPeeringType(ExpressRoutePeeringType peeringType);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify PrimaryPeerAddressPrefix.
         */
        interface WithPrimaryPeerAddressPrefix {
            /**
             * Specifies primaryPeerAddressPrefix.
             */
            Update withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify SecondaryPeerAddressPrefix.
         */
        interface WithSecondaryPeerAddressPrefix {
            /**
             * Specifies secondaryPeerAddressPrefix.
             */
            Update withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify SharedKey.
         */
        interface WithSharedKey {
            /**
             * Specifies sharedKey.
             */
            Update withSharedKey(String sharedKey);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify State.
         */
        interface WithState {
            /**
             * Specifies state.
             */
            Update withState(ExpressRoutePeeringState state);
        }

        /**
         * The stage of the expressroutecrossconnectionpeering update allowing to specify VlanId.
         */
        interface WithVlanId {
            /**
             * Specifies vlanId.
             */
            Update withVlanId(Integer vlanId);
        }

    }
}
