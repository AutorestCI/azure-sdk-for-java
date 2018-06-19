/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.dns.v2016_04_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.dns.v2016_04_01.Zones;
import com.microsoft.azure.management.dns.v2016_04_01.Zone;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ZonesImpl extends GroupableResourcesCoreImpl<Zone, ZoneImpl, ZoneInner, ZonesInner, NetworkManager>  implements Zones {
    protected ZonesImpl(NetworkManager manager) {
        super(manager.inner().zones(), manager);
    }

    @Override
    protected Observable<ZoneInner> getInnerAsync(String resourceGroupName, String name) {
        ZonesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ZonesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Zone> listByResourceGroup(String resourceGroupName) {
        ZonesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<Zone> listByResourceGroupAsync(String resourceGroupName) {
        ZonesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<ZoneInner>, Iterable<ZoneInner>>() {
            @Override
            public Iterable<ZoneInner> call(Page<ZoneInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ZoneInner, Zone>() {
            @Override
            public Zone call(ZoneInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<Zone> list() {
        ZonesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<Zone> listAsync() {
        ZonesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<ZoneInner>, Iterable<ZoneInner>>() {
            @Override
            public Iterable<ZoneInner> call(Page<ZoneInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ZoneInner, Zone>() {
            @Override
            public Zone call(ZoneInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ZoneImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ZoneImpl wrapModel(ZoneInner inner) {
        return  new ZoneImpl(inner.name(), inner, manager());
    }

    @Override
    protected ZoneImpl wrapModel(String name) {
        return new ZoneImpl(name, new ZoneInner(), this.manager());
    }

}
