/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01.implementation;

import com.microsoft.azure.management.redis.v2018_03_01.RedisLinkedServerWithProperties;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.redis.v2018_03_01.RedisLinkedServerCreateParameters;
import com.microsoft.azure.management.redis.v2018_03_01.ReplicationRole;
import rx.functions.Func1;

class RedisLinkedServerWithPropertiesImpl extends CreatableUpdatableImpl<RedisLinkedServerWithProperties, RedisLinkedServerWithPropertiesInner, RedisLinkedServerWithPropertiesImpl> implements RedisLinkedServerWithProperties, RedisLinkedServerWithProperties.Definition, RedisLinkedServerWithProperties.Update {
    private final RedisManager manager;
    private String resourceGroupName;
    private String name;
    private String linkedServerName;
    private RedisLinkedServerCreateParameters createOrUpdateParameter;

    RedisLinkedServerWithPropertiesImpl(String name, RedisManager manager) {
        super(name, new RedisLinkedServerWithPropertiesInner());
        this.manager = manager;
        // Set resource name
        this.linkedServerName = name;
        //
        this.createOrUpdateParameter = new RedisLinkedServerCreateParameters();
    }

    RedisLinkedServerWithPropertiesImpl(RedisLinkedServerWithPropertiesInner inner, RedisManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.linkedServerName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "Redis");
        this.linkedServerName = IdParsingUtils.getValueFromIdByName(inner.id(), "linkedServers");
        //
        this.createOrUpdateParameter = new RedisLinkedServerCreateParameters();
    }

    @Override
    public RedisManager manager() {
        return this.manager;
    }

    @Override
    public Observable<RedisLinkedServerWithProperties> createResourceAsync() {
        LinkedServersInner client = this.manager().inner().linkedServers();
        return client.createAsync(this.resourceGroupName, this.name, this.linkedServerName, this.createOrUpdateParameter)
            .map(new Func1<RedisLinkedServerWithPropertiesInner, RedisLinkedServerWithPropertiesInner>() {
               @Override
               public RedisLinkedServerWithPropertiesInner call(RedisLinkedServerWithPropertiesInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RedisLinkedServerWithProperties> updateResourceAsync() {
        LinkedServersInner client = this.manager().inner().linkedServers();
        return client.createAsync(this.resourceGroupName, this.name, this.linkedServerName, this.createOrUpdateParameter)
            .map(new Func1<RedisLinkedServerWithPropertiesInner, RedisLinkedServerWithPropertiesInner>() {
               @Override
               public RedisLinkedServerWithPropertiesInner call(RedisLinkedServerWithPropertiesInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RedisLinkedServerWithPropertiesInner> getInnerAsync() {
        LinkedServersInner client = this.manager().inner().linkedServers();
        return client.getAsync(this.resourceGroupName, this.name, this.linkedServerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new RedisLinkedServerCreateParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String linkedRedisCacheId() {
        return this.inner().linkedRedisCacheId();
    }

    @Override
    public String linkedRedisCacheLocation() {
        return this.inner().linkedRedisCacheLocation();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public ReplicationRole serverRole() {
        return this.inner().serverRole();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RedisLinkedServerWithPropertiesImpl withExistingRedis(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    @Override
    public RedisLinkedServerWithPropertiesImpl withLinkedRedisCacheId(String linkedRedisCacheId) {
        this.createOrUpdateParameter.withLinkedRedisCacheId(linkedRedisCacheId);
        return this;
    }

    @Override
    public RedisLinkedServerWithPropertiesImpl withLinkedRedisCacheLocation(String linkedRedisCacheLocation) {
        this.createOrUpdateParameter.withLinkedRedisCacheLocation(linkedRedisCacheLocation);
        return this;
    }

    @Override
    public RedisLinkedServerWithPropertiesImpl withServerRole(ReplicationRole serverRole) {
        this.createOrUpdateParameter.withServerRole(serverRole);
        return this;
    }

}
