/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import org.joda.time.Period;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.Hls;
import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.LiveOutputResourceState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * The Live Output.
 */
@JsonFlatten
public class LiveOutputInner extends ProxyResource {
    /**
     * The description of the Live Output.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The asset name.
     */
    @JsonProperty(value = "properties.assetName", required = true)
    private String assetName;

    /**
     * ISO 8601 timespan duration of the archive window length. This is
     * duration that customer want to retain the recorded content.
     */
    @JsonProperty(value = "properties.archiveWindowLength", required = true)
    private Period archiveWindowLength;

    /**
     * The manifest file name.
     */
    @JsonProperty(value = "properties.manifestName")
    private String manifestName;

    /**
     * The HLS configuration.
     */
    @JsonProperty(value = "properties.hls")
    private Hls hls;

    /**
     * The output snapshot time.
     */
    @JsonProperty(value = "properties.outputSnapTime")
    private Long outputSnapTime;

    /**
     * The exact time the Live Output was created.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The exact time the Live Output was last modified.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModified;

    /**
     * The provisioning state of the Live Output.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The resource state of the Live Output. Possible values include:
     * 'Creating', 'Running', 'Deleting'.
     */
    @JsonProperty(value = "properties.resourceState", access = JsonProperty.Access.WRITE_ONLY)
    private LiveOutputResourceState resourceState;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the assetName value.
     *
     * @return the assetName value
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the assetName value.
     *
     * @param assetName the assetName value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * Get the archiveWindowLength value.
     *
     * @return the archiveWindowLength value
     */
    public Period archiveWindowLength() {
        return this.archiveWindowLength;
    }

    /**
     * Set the archiveWindowLength value.
     *
     * @param archiveWindowLength the archiveWindowLength value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withArchiveWindowLength(Period archiveWindowLength) {
        this.archiveWindowLength = archiveWindowLength;
        return this;
    }

    /**
     * Get the manifestName value.
     *
     * @return the manifestName value
     */
    public String manifestName() {
        return this.manifestName;
    }

    /**
     * Set the manifestName value.
     *
     * @param manifestName the manifestName value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }

    /**
     * Get the hls value.
     *
     * @return the hls value
     */
    public Hls hls() {
        return this.hls;
    }

    /**
     * Set the hls value.
     *
     * @param hls the hls value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withHls(Hls hls) {
        this.hls = hls;
        return this;
    }

    /**
     * Get the outputSnapTime value.
     *
     * @return the outputSnapTime value
     */
    public Long outputSnapTime() {
        return this.outputSnapTime;
    }

    /**
     * Set the outputSnapTime value.
     *
     * @param outputSnapTime the outputSnapTime value to set
     * @return the LiveOutputInner object itself.
     */
    public LiveOutputInner withOutputSnapTime(Long outputSnapTime) {
        this.outputSnapTime = outputSnapTime;
        return this;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value
     */
    public DateTime lastModified() {
        return this.lastModified;
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
     * Get the resourceState value.
     *
     * @return the resourceState value
     */
    public LiveOutputResourceState resourceState() {
        return this.resourceState;
    }

}
