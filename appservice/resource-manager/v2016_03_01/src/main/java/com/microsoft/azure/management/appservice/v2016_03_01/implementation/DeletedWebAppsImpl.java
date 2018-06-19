/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appservice.v2016_03_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2016_03_01.DeletedWebApps;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.appservice.v2016_03_01.DeletedSite;

class DeletedWebAppsImpl extends WrapperImpl<DeletedWebAppsInner> implements DeletedWebApps {
    private final AppServiceManager manager;

    DeletedWebAppsImpl(AppServiceManager manager) {
        super(manager.inner().deletedWebApps());
        this.manager = manager;
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DeletedSite> listAsync() {
        DeletedWebAppsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<DeletedSiteInner>, Iterable<DeletedSiteInner>>() {
            @Override
            public Iterable<DeletedSiteInner> call(Page<DeletedSiteInner> page) {
                return page.items();
            }
        })    .map(new Func1<DeletedSiteInner, DeletedSite>() {
            @Override
            public DeletedSite call(DeletedSiteInner inner) {
                return new DeletedSiteImpl(inner, manager());
            }
        });
    }

}
