/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of an event published to an Event Grid topic.
 */
public class EventGridEvent {
    /**
     * An unique identifier for the event.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The resource path of the event source.
     */
    @JsonProperty(value = "topic")
    private String topic;

    /**
     * A resource path relative to the topic path.
     */
    @JsonProperty(value = "subject", required = true)
    private String subject;

    /**
     * Event data specific to the event type.
     */
    @JsonProperty(value = "data", required = true)
    private Object data;

    /**
     * The type of the event that occurred.
     */
    @JsonProperty(value = "eventType", required = true)
    private String eventType;

    /**
     * The time (in UTC) the event was generated.
     */
    @JsonProperty(value = "eventTime", required = true)
    private DateTime eventTime;

    /**
     * The schema version of the event metadata.
     */
    @JsonProperty(value = "metadataVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String metadataVersion;

    /**
     * The schema version of the data object.
     */
    @JsonProperty(value = "dataVersion", required = true)
    private String dataVersion;

    /**
     * Creates an instance of EventGridEvent class.
     */
    public EventGridEvent(String id, String subject, Object data, String eventType, DateTime eventTime, String dataVersion) {
        this.id = id;
        this.subject = subject;
        this.data = data;
        this.eventType = eventType;
        this.eventTime = eventTime;
        this.dataVersion = dataVersion;
    }

    /**
     * Private constructor for deserialization.
     */
    private EventGridEvent() {
    }

    /**
     * Get an unique identifier for the event.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the resource path of the event source.
     *
     * @return the topic value
     */
    public String topic() {
        return this.topic;
    }

    /**
     * Set the resource path of the event source.
     *
     * @param topic the topic value to set
     * @return the EventGridEvent object itself.
     */
    public EventGridEvent withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * Get a resource path relative to the topic path.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get event data specific to the event type.
     *
     * @return the data value
     */
    public Object data() {
        return this.data;
    }

    /**
     * Get the type of the event that occurred.
     *
     * @return the eventType value
     */
    public String eventType() {
        return this.eventType;
    }

    /**
     * Get the time (in UTC) the event was generated.
     *
     * @return the eventTime value
     */
    public DateTime eventTime() {
        return this.eventTime;
    }

    /**
     * Get the schema version of the event metadata.
     *
     * @return the metadataVersion value
     */
    public String metadataVersion() {
        return this.metadataVersion;
    }

    /**
     * Get the schema version of the data object.
     *
     * @return the dataVersion value
     */
    public String dataVersion() {
        return this.dataVersion;
    }

}