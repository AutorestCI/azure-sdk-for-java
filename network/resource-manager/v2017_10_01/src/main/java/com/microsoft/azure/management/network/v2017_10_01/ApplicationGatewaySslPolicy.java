/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2017_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application Gateway Ssl policy.
 */
public class ApplicationGatewaySslPolicy {
    /**
     * Ssl protocols to be disabled on application gateway.
     */
    @JsonProperty(value = "disabledSslProtocols")
    private List<ApplicationGatewaySslProtocol> disabledSslProtocols;

    /**
     * Type of Ssl Policy. Possible values include: 'Predefined', 'Custom'.
     */
    @JsonProperty(value = "policyType")
    private ApplicationGatewaySslPolicyType policyType;

    /**
     * Name of Ssl predefined policy. Possible values include:
     * 'AppGwSslPolicy20150501', 'AppGwSslPolicy20170401',
     * 'AppGwSslPolicy20170401S'.
     */
    @JsonProperty(value = "policyName")
    private ApplicationGatewaySslPolicyName policyName;

    /**
     * Ssl cipher suites to be enabled in the specified order to application
     * gateway.
     */
    @JsonProperty(value = "cipherSuites")
    private List<ApplicationGatewaySslCipherSuite> cipherSuites;

    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * Possible values include: 'TLSv1_0', 'TLSv1_1', 'TLSv1_2'.
     */
    @JsonProperty(value = "minProtocolVersion")
    private ApplicationGatewaySslProtocol minProtocolVersion;

    /**
     * Get the disabledSslProtocols value.
     *
     * @return the disabledSslProtocols value
     */
    public List<ApplicationGatewaySslProtocol> disabledSslProtocols() {
        return this.disabledSslProtocols;
    }

    /**
     * Set the disabledSslProtocols value.
     *
     * @param disabledSslProtocols the disabledSslProtocols value to set
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withDisabledSslProtocols(List<ApplicationGatewaySslProtocol> disabledSslProtocols) {
        this.disabledSslProtocols = disabledSslProtocols;
        return this;
    }

    /**
     * Get the policyType value.
     *
     * @return the policyType value
     */
    public ApplicationGatewaySslPolicyType policyType() {
        return this.policyType;
    }

    /**
     * Set the policyType value.
     *
     * @param policyType the policyType value to set
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withPolicyType(ApplicationGatewaySslPolicyType policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * Get the policyName value.
     *
     * @return the policyName value
     */
    public ApplicationGatewaySslPolicyName policyName() {
        return this.policyName;
    }

    /**
     * Set the policyName value.
     *
     * @param policyName the policyName value to set
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withPolicyName(ApplicationGatewaySslPolicyName policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * Get the cipherSuites value.
     *
     * @return the cipherSuites value
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Set the cipherSuites value.
     *
     * @param cipherSuites the cipherSuites value to set
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withCipherSuites(List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }

    /**
     * Get the minProtocolVersion value.
     *
     * @return the minProtocolVersion value
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.minProtocolVersion;
    }

    /**
     * Set the minProtocolVersion value.
     *
     * @param minProtocolVersion the minProtocolVersion value to set
     * @return the ApplicationGatewaySslPolicy object itself.
     */
    public ApplicationGatewaySslPolicy withMinProtocolVersion(ApplicationGatewaySslProtocol minProtocolVersion) {
        this.minProtocolVersion = minProtocolVersion;
        return this;
    }

}
