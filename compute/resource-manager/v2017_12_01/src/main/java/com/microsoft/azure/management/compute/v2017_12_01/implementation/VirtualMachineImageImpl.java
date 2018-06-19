/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineImage;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.DataDiskImage;
import com.microsoft.azure.management.compute.v2017_12_01.OSDiskImage;
import com.microsoft.azure.management.compute.v2017_12_01.PurchasePlan;
import java.util.Map;

class VirtualMachineImageImpl extends IndexableRefreshableWrapperImpl<VirtualMachineImage, VirtualMachineImageInner> implements VirtualMachineImage {
    private final ComputeManager manager;
    private String location;
    private String publisherName;
    private String offer;
    private String skus;
    private String version;

    VirtualMachineImageImpl(VirtualMachineImageInner inner,  ComputeManager manager) {
        super(null, inner);
        this.manager = manager;
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.publisherName = IdParsingUtils.getValueFromIdByName(inner.id(), "publishers");
        this.offer = IdParsingUtils.getValueFromIdByName(inner.id(), "offers");
        this.skus = IdParsingUtils.getValueFromIdByName(inner.id(), "skus");
        this.version = IdParsingUtils.getValueFromIdByName(inner.id(), "versions");
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VirtualMachineImageInner> getInnerAsync() {
        VirtualMachineImagesInner client = this.manager().inner().virtualMachineImages();
        return client.getAsync(this.location, this.publisherName, this.offer, this.skus, this.version);
    }



    @Override
    public List<DataDiskImage> dataDiskImages() {
        return this.inner().dataDiskImages();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public OSDiskImage osDiskImage() {
        return this.inner().osDiskImage();
    }

    @Override
    public PurchasePlan plan() {
        return this.inner().plan();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().tags();
    }

}
