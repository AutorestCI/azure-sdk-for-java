/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for RollingUpgradeStatusCode.
 */
public enum RollingUpgradeStatusCode {
    /** Enum value RollingForward. */
    ROLLING_FORWARD("RollingForward"),

    /** Enum value Cancelled. */
    CANCELLED("Cancelled"),

    /** Enum value Completed. */
    COMPLETED("Completed"),

    /** Enum value Faulted. */
    FAULTED("Faulted");

    /** The actual serialized value for a RollingUpgradeStatusCode instance. */
    private String value;

    RollingUpgradeStatusCode(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a RollingUpgradeStatusCode instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed RollingUpgradeStatusCode object, or null if unable to parse.
     */
    @JsonCreator
    public static RollingUpgradeStatusCode fromString(String value) {
        RollingUpgradeStatusCode[] items = RollingUpgradeStatusCode.values();
        for (RollingUpgradeStatusCode item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
