/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.ProcessModuleInfo;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class ProcessModuleInfoImpl extends IndexableRefreshableWrapperImpl<ProcessModuleInfo, ProcessModuleInfoInner> implements ProcessModuleInfo {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String processId;
    private String baseAddress;
    private String instanceId;

    ProcessModuleInfoImpl(ProcessModuleInfoInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.processId = IdParsingUtils.getValueFromIdByName(inner.id(), "processes");
        this.baseAddress = IdParsingUtils.getValueFromIdByName(inner.id(), "modules");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "instances");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProcessModuleInfoInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getInstanceProcessModuleAsync(this.resourceGroupName, this.name, this.processId, this.baseAddress, this.instanceId);
    }



    @Override
    public String baseAddress() {
        return this.inner().baseAddress();
    }

    @Override
    public String fileDescription() {
        return this.inner().fileDescription();
    }

    @Override
    public String fileName() {
        return this.inner().fileName();
    }

    @Override
    public String filePath() {
        return this.inner().filePath();
    }

    @Override
    public String fileVersion() {
        return this.inner().fileVersion();
    }

    @Override
    public String href() {
        return this.inner().href();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isDebug() {
        return this.inner().isDebug();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String language() {
        return this.inner().language();
    }

    @Override
    public Integer moduleMemorySize() {
        return this.inner().moduleMemorySize();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String product() {
        return this.inner().product();
    }

    @Override
    public String productVersion() {
        return this.inner().productVersion();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
