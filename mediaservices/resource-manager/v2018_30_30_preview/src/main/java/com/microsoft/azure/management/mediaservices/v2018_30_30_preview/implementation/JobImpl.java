/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview.implementation;

import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.Job;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.JobState;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.JobInput;
import java.util.List;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.JobOutput;
import com.microsoft.azure.management.mediaservices.v2018_30_30_preview.Priority;

class JobImpl extends CreatableUpdatableImpl<Job, JobInner, JobImpl> implements Job, Job.Definition, Job.Update {
    private final MediaManager manager;
    private String resourceGroupName;
    private String accountName;
    private String transformName;
    private String jobName;

    JobImpl(String name, MediaManager manager) {
        super(name, new JobInner());
        this.manager = manager;
        // Set resource name
        this.jobName = name;
        //
    }

    JobImpl(JobInner inner, MediaManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.jobName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "mediaServices");
        this.transformName = IdParsingUtils.getValueFromIdByName(inner.id(), "transforms");
        this.jobName = IdParsingUtils.getValueFromIdByName(inner.id(), "jobs");
        //
    }

    @Override
    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Job> createResourceAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.createAsync(this.resourceGroupName, this.accountName, this.transformName, this.jobName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Job> updateResourceAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.createAsync(this.resourceGroupName, this.accountName, this.transformName, this.jobName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<JobInner> getInnerAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.getAsync(this.resourceGroupName, this.accountName, this.transformName, this.jobName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime created() {
        return this.inner().created();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public JobInput input() {
        return this.inner().input();
    }

    @Override
    public DateTime lastModified() {
        return this.inner().lastModified();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<JobOutput> outputs() {
        return this.inner().outputs();
    }

    @Override
    public Priority priority() {
        return this.inner().priority();
    }

    @Override
    public JobState state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public JobImpl withExistingTransform(String resourceGroupName, String accountName, String transformName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.transformName = transformName;
        return this;
    }

    @Override
    public JobImpl withInput(JobInput input) {
        this.inner().withInput(input);
        return this;
    }

    @Override
    public JobImpl withOutputs(List<JobOutput> outputs) {
        this.inner().withOutputs(outputs);
        return this;
    }

    @Override
    public JobImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public JobImpl withPriority(Priority priority) {
        this.inner().withPriority(priority);
        return this;
    }

}
