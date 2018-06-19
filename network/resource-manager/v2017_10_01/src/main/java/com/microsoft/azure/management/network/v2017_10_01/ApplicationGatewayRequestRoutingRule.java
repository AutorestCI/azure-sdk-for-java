/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Request routing rule of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewayRequestRoutingRule extends SubResource {
    /**
     * Rule type. Possible values include: 'Basic', 'PathBasedRouting'.
     */
    @JsonProperty(value = "properties.ruleType")
    private ApplicationGatewayRequestRoutingRuleType ruleType;

    /**
     * Backend address pool resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Frontend port resource of the application gateway.
     */
    @JsonProperty(value = "properties.backendHttpSettings")
    private SubResource backendHttpSettings;

    /**
     * Http listener resource of the application gateway.
     */
    @JsonProperty(value = "properties.httpListener")
    private SubResource httpListener;

    /**
     * URL path map resource of the application gateway.
     */
    @JsonProperty(value = "properties.urlPathMap")
    private SubResource urlPathMap;

    /**
     * Redirect configuration resource of the application gateway.
     */
    @JsonProperty(value = "properties.redirectConfiguration")
    private SubResource redirectConfiguration;

    /**
     * Provisioning state of the request routing rule resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the ruleType value.
     *
     * @return the ruleType value
     */
    public ApplicationGatewayRequestRoutingRuleType ruleType() {
        return this.ruleType;
    }

    /**
     * Set the ruleType value.
     *
     * @param ruleType the ruleType value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRuleType(ApplicationGatewayRequestRoutingRuleType ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * Get the backendAddressPool value.
     *
     * @return the backendAddressPool value
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool value.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettings value.
     *
     * @return the backendHttpSettings value
     */
    public SubResource backendHttpSettings() {
        return this.backendHttpSettings;
    }

    /**
     * Set the backendHttpSettings value.
     *
     * @param backendHttpSettings the backendHttpSettings value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withBackendHttpSettings(SubResource backendHttpSettings) {
        this.backendHttpSettings = backendHttpSettings;
        return this;
    }

    /**
     * Get the httpListener value.
     *
     * @return the httpListener value
     */
    public SubResource httpListener() {
        return this.httpListener;
    }

    /**
     * Set the httpListener value.
     *
     * @param httpListener the httpListener value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withHttpListener(SubResource httpListener) {
        this.httpListener = httpListener;
        return this;
    }

    /**
     * Get the urlPathMap value.
     *
     * @return the urlPathMap value
     */
    public SubResource urlPathMap() {
        return this.urlPathMap;
    }

    /**
     * Set the urlPathMap value.
     *
     * @param urlPathMap the urlPathMap value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withUrlPathMap(SubResource urlPathMap) {
        this.urlPathMap = urlPathMap;
        return this;
    }

    /**
     * Get the redirectConfiguration value.
     *
     * @return the redirectConfiguration value
     */
    public SubResource redirectConfiguration() {
        return this.redirectConfiguration;
    }

    /**
     * Set the redirectConfiguration value.
     *
     * @param redirectConfiguration the redirectConfiguration value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withRedirectConfiguration(SubResource redirectConfiguration) {
        this.redirectConfiguration = redirectConfiguration;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the ApplicationGatewayRequestRoutingRule object itself.
     */
    public ApplicationGatewayRequestRoutingRule withType(String type) {
        this.type = type;
        return this;
    }

}
