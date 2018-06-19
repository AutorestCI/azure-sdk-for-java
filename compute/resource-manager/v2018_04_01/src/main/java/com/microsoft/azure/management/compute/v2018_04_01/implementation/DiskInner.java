/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2018_04_01.implementation;

import com.microsoft.azure.management.compute.v2018_04_01.DiskSku;
import java.util.List;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2018_04_01.OperatingSystemTypes;
import com.microsoft.azure.management.compute.v2018_04_01.CreationData;
import com.microsoft.azure.management.compute.v2018_04_01.EncryptionSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Disk resource.
 */
@JsonFlatten
public class DiskInner extends Resource {
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     */
    @JsonProperty(value = "managedBy", access = JsonProperty.Access.WRITE_ONLY)
    private String managedBy;

    /**
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private DiskSku sku;

    /**
     * The Logical zone list for Disk.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * The time when the disk was created.
     */
    @JsonProperty(value = "properties.timeCreated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timeCreated;

    /**
     * The Operating System type. Possible values include: 'Windows', 'Linux'.
     */
    @JsonProperty(value = "properties.osType")
    private OperatingSystemTypes osType;

    /**
     * Disk source information. CreationData information cannot be changed
     * after the disk has been created.
     */
    @JsonProperty(value = "properties.creationData", required = true)
    private CreationData creationData;

    /**
     * If creationData.createOption is Empty, this field is mandatory and it
     * indicates the size of the VHD to create. If this field is present for
     * updates or creation with other options, it indicates a resize. Resizes
     * are only allowed if the disk is not attached to a running VM, and can
     * only increase the disk's size.
     */
    @JsonProperty(value = "properties.diskSizeGB")
    private Integer diskSizeGB;

    /**
     * Encryption settings for disk or snapshot.
     */
    @JsonProperty(value = "properties.encryptionSettings")
    private EncryptionSettings encryptionSettings;

    /**
     * The disk provisioning state.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the managedBy value.
     *
     * @return the managedBy value
     */
    public String managedBy() {
        return this.managedBy;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public DiskSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withSku(DiskSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones value.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones value.
     *
     * @param zones the zones value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the timeCreated value.
     *
     * @return the timeCreated value
     */
    public DateTime timeCreated() {
        return this.timeCreated;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public OperatingSystemTypes osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withOsType(OperatingSystemTypes osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the creationData value.
     *
     * @return the creationData value
     */
    public CreationData creationData() {
        return this.creationData;
    }

    /**
     * Set the creationData value.
     *
     * @param creationData the creationData value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withCreationData(CreationData creationData) {
        this.creationData = creationData;
        return this;
    }

    /**
     * Get the diskSizeGB value.
     *
     * @return the diskSizeGB value
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB value.
     *
     * @param diskSizeGB the diskSizeGB value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the encryptionSettings value.
     *
     * @return the encryptionSettings value
     */
    public EncryptionSettings encryptionSettings() {
        return this.encryptionSettings;
    }

    /**
     * Set the encryptionSettings value.
     *
     * @param encryptionSettings the encryptionSettings value to set
     * @return the DiskInner object itself.
     */
    public DiskInner withEncryptionSettings(EncryptionSettings encryptionSettings) {
        this.encryptionSettings = encryptionSettings;
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

}
