/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.network.v2018_05_01.PcStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2018_05_01.PcError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Status of packet capture session.
 */
public class PacketCaptureQueryStatusResultInner {
    /**
     * The name of the packet capture resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The ID of the packet capture resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The start time of the packet capture session.
     */
    @JsonProperty(value = "captureStartTime")
    private DateTime captureStartTime;

    /**
     * The status of the packet capture session. Possible values include:
     * 'NotStarted', 'Running', 'Stopped', 'Error', 'Unknown'.
     */
    @JsonProperty(value = "packetCaptureStatus")
    private PcStatus packetCaptureStatus;

    /**
     * The reason the current packet capture session was stopped.
     */
    @JsonProperty(value = "stopReason")
    private String stopReason;

    /**
     * List of errors of packet capture session.
     */
    @JsonProperty(value = "packetCaptureError")
    private List<PcError> packetCaptureError;

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
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the captureStartTime value.
     *
     * @return the captureStartTime value
     */
    public DateTime captureStartTime() {
        return this.captureStartTime;
    }

    /**
     * Set the captureStartTime value.
     *
     * @param captureStartTime the captureStartTime value to set
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withCaptureStartTime(DateTime captureStartTime) {
        this.captureStartTime = captureStartTime;
        return this;
    }

    /**
     * Get the packetCaptureStatus value.
     *
     * @return the packetCaptureStatus value
     */
    public PcStatus packetCaptureStatus() {
        return this.packetCaptureStatus;
    }

    /**
     * Set the packetCaptureStatus value.
     *
     * @param packetCaptureStatus the packetCaptureStatus value to set
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withPacketCaptureStatus(PcStatus packetCaptureStatus) {
        this.packetCaptureStatus = packetCaptureStatus;
        return this;
    }

    /**
     * Get the stopReason value.
     *
     * @return the stopReason value
     */
    public String stopReason() {
        return this.stopReason;
    }

    /**
     * Set the stopReason value.
     *
     * @param stopReason the stopReason value to set
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withStopReason(String stopReason) {
        this.stopReason = stopReason;
        return this;
    }

    /**
     * Get the packetCaptureError value.
     *
     * @return the packetCaptureError value
     */
    public List<PcError> packetCaptureError() {
        return this.packetCaptureError;
    }

    /**
     * Set the packetCaptureError value.
     *
     * @param packetCaptureError the packetCaptureError value to set
     * @return the PacketCaptureQueryStatusResultInner object itself.
     */
    public PacketCaptureQueryStatusResultInner withPacketCaptureError(List<PcError> packetCaptureError) {
        this.packetCaptureError = packetCaptureError;
        return this;
    }

}
