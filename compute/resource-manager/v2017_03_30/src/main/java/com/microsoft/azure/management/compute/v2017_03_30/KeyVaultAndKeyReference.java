/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Key Vault Key Url and vault id of KeK, KeK is optional and when provided is
 * used to unwrap the encryptionKey.
 */
public class KeyVaultAndKeyReference {
    /**
     * Resource id of the KeyVault containing the key or secret.
     */
    @JsonProperty(value = "sourceVault", required = true)
    private SourceVault sourceVault;

    /**
     * Url pointing to a key or secret in KeyVault.
     */
    @JsonProperty(value = "keyUrl", required = true)
    private String keyUrl;

    /**
     * Get the sourceVault value.
     *
     * @return the sourceVault value
     */
    public SourceVault sourceVault() {
        return this.sourceVault;
    }

    /**
     * Set the sourceVault value.
     *
     * @param sourceVault the sourceVault value to set
     * @return the KeyVaultAndKeyReference object itself.
     */
    public KeyVaultAndKeyReference withSourceVault(SourceVault sourceVault) {
        this.sourceVault = sourceVault;
        return this;
    }

    /**
     * Get the keyUrl value.
     *
     * @return the keyUrl value
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set the keyUrl value.
     *
     * @param keyUrl the keyUrl value to set
     * @return the KeyVaultAndKeyReference object itself.
     */
    public KeyVaultAndKeyReference withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

}
