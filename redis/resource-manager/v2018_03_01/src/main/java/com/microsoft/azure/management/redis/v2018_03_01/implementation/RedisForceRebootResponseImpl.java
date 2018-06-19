/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01.implementation;

import com.microsoft.azure.management.redis.v2018_03_01.RedisForceRebootResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RedisForceRebootResponseImpl extends WrapperImpl<RedisForceRebootResponseInner> implements RedisForceRebootResponse {
    private final RedisManager manager;
    RedisForceRebootResponseImpl(RedisForceRebootResponseInner inner, RedisManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RedisManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

}
