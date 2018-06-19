/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.ListContentKeysResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.StreamingLocatorContentKey;

class ListContentKeysResponseImpl extends WrapperImpl<ListContentKeysResponseInner> implements ListContentKeysResponse {
    private final MediaManager manager;
    ListContentKeysResponseImpl(ListContentKeysResponseInner inner, MediaManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public List<StreamingLocatorContentKey> contentKeys() {
        return this.inner().contentKeys();
    }

}
