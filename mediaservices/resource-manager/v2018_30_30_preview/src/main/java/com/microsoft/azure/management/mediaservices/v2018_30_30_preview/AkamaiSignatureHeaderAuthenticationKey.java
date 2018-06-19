/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Akamai Signature Header authentication key.
 */
public class AkamaiSignatureHeaderAuthenticationKey {
    /**
     * identifier of the key.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /**
     * authentication key.
     */
    @JsonProperty(value = "base64Key")
    private String base64Key;

    /**
     * The exact time the authentication key.
     */
    @JsonProperty(value = "expiration")
    private DateTime expiration;

    /**
     * Get the identifier value.
     *
     * @return the identifier value
     */
    public String identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier value.
     *
     * @param identifier the identifier value to set
     * @return the AkamaiSignatureHeaderAuthenticationKey object itself.
     */
    public AkamaiSignatureHeaderAuthenticationKey withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the base64Key value.
     *
     * @return the base64Key value
     */
    public String base64Key() {
        return this.base64Key;
    }

    /**
     * Set the base64Key value.
     *
     * @param base64Key the base64Key value to set
     * @return the AkamaiSignatureHeaderAuthenticationKey object itself.
     */
    public AkamaiSignatureHeaderAuthenticationKey withBase64Key(String base64Key) {
        this.base64Key = base64Key;
        return this;
    }

    /**
     * Get the expiration value.
     *
     * @return the expiration value
     */
    public DateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration value.
     *
     * @param expiration the expiration value to set
     * @return the AkamaiSignatureHeaderAuthenticationKey object itself.
     */
    public AkamaiSignatureHeaderAuthenticationKey withExpiration(DateTime expiration) {
        this.expiration = expiration;
        return this;
    }

}
