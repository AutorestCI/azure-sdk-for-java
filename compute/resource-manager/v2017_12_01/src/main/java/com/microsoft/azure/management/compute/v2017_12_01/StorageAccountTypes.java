/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for StorageAccountTypes.
 */
public final class StorageAccountTypes extends ExpandableStringEnum<StorageAccountTypes> {
    /** Static value Standard_LRS for StorageAccountTypes. */
    public static final StorageAccountTypes STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Premium_LRS for StorageAccountTypes. */
    public static final StorageAccountTypes PREMIUM_LRS = fromString("Premium_LRS");

    /**
     * Creates or finds a StorageAccountTypes from its string representation.
     * @param name a name to look for
     * @return the corresponding StorageAccountTypes
     */
    @JsonCreator
    public static StorageAccountTypes fromString(String name) {
        return fromString(name, StorageAccountTypes.class);
    }

    /**
     * @return known StorageAccountTypes values
     */
    public static Collection<StorageAccountTypes> values() {
        return values(StorageAccountTypes.class);
    }
}
