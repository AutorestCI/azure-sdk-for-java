/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.List;
import org.joda.time.DateTime;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Process Information.
 */
@JsonFlatten
public class ProcessInfoInner extends ProxyOnlyResource {
    /**
     * ARM Identifier for deployment.
     */
    @JsonProperty(value = "properties.identifier", access = JsonProperty.Access.WRITE_ONLY)
    private Integer identifier;

    /**
     * Deployment name.
     */
    @JsonProperty(value = "properties.deployment_name")
    private String deploymentName;

    /**
     * HRef URI.
     */
    @JsonProperty(value = "properties.href")
    private String href;

    /**
     * Minidump URI.
     */
    @JsonProperty(value = "properties.minidump")
    private String minidump;

    /**
     * Is profile running?.
     */
    @JsonProperty(value = "properties.is_profile_running")
    private Boolean isProfileRunning;

    /**
     * Is the IIS Profile running?.
     */
    @JsonProperty(value = "properties.is_iis_profile_running")
    private Boolean isIisProfileRunning;

    /**
     * IIS Profile timeout (seconds).
     */
    @JsonProperty(value = "properties.iis_profile_timeout_in_seconds")
    private Double iisProfileTimeoutInSeconds;

    /**
     * Parent process.
     */
    @JsonProperty(value = "properties.parent")
    private String parent;

    /**
     * Child process list.
     */
    @JsonProperty(value = "properties.children")
    private List<String> children;

    /**
     * Thread list.
     */
    @JsonProperty(value = "properties.threads")
    private List<ProcessThreadInfoInner> threads;

    /**
     * List of open files.
     */
    @JsonProperty(value = "properties.open_file_handles")
    private List<String> openFileHandles;

    /**
     * List of modules.
     */
    @JsonProperty(value = "properties.modules")
    private List<ProcessModuleInfoInner> modules;

    /**
     * File name of this process.
     */
    @JsonProperty(value = "properties.file_name")
    private String fileName;

    /**
     * Command line.
     */
    @JsonProperty(value = "properties.command_line")
    private String commandLine;

    /**
     * User name.
     */
    @JsonProperty(value = "properties.user_name")
    private String userName;

    /**
     * Handle count.
     */
    @JsonProperty(value = "properties.handle_count")
    private Integer handleCount;

    /**
     * Module count.
     */
    @JsonProperty(value = "properties.module_count")
    private Integer moduleCount;

    /**
     * Thread count.
     */
    @JsonProperty(value = "properties.thread_count")
    private Integer threadCount;

    /**
     * Start time.
     */
    @JsonProperty(value = "properties.start_time")
    private DateTime startTime;

    /**
     * Total CPU time.
     */
    @JsonProperty(value = "properties.total_cpu_time")
    private String totalCpuTime;

    /**
     * User CPU time.
     */
    @JsonProperty(value = "properties.user_cpu_time")
    private String userCpuTime;

    /**
     * Privileged CPU time.
     */
    @JsonProperty(value = "properties.privileged_cpu_time")
    private String privilegedCpuTime;

    /**
     * Working set.
     */
    @JsonProperty(value = "properties.working_set")
    private Long workingSet;

    /**
     * Peak working set.
     */
    @JsonProperty(value = "properties.peak_working_set")
    private Long peakWorkingSet;

    /**
     * Private memory size.
     */
    @JsonProperty(value = "properties.private_memory")
    private Long privateMemory;

    /**
     * Virtual memory size.
     */
    @JsonProperty(value = "properties.virtual_memory")
    private Long virtualMemory;

    /**
     * Peak virtual memory usage.
     */
    @JsonProperty(value = "properties.peak_virtual_memory")
    private Long peakVirtualMemory;

    /**
     * Paged system memory.
     */
    @JsonProperty(value = "properties.paged_system_memory")
    private Long pagedSystemMemory;

    /**
     * Non-paged system memory.
     */
    @JsonProperty(value = "properties.non_paged_system_memory")
    private Long nonPagedSystemMemory;

    /**
     * Paged memory.
     */
    @JsonProperty(value = "properties.paged_memory")
    private Long pagedMemory;

    /**
     * Peak paged memory.
     */
    @JsonProperty(value = "properties.peak_paged_memory")
    private Long peakPagedMemory;

    /**
     * Time stamp.
     */
    @JsonProperty(value = "properties.time_stamp")
    private DateTime timeStamp;

    /**
     * List of environment variables.
     */
    @JsonProperty(value = "properties.environment_variables")
    private Map<String, String> environmentVariables;

    /**
     * Is this the SCM site?.
     */
    @JsonProperty(value = "properties.is_scm_site")
    private Boolean isScmSite;

    /**
     * Is this a Web Job?.
     */
    @JsonProperty(value = "properties.is_webjob")
    private Boolean isWebjob;

    /**
     * Description of process.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the identifier value.
     *
     * @return the identifier value
     */
    public Integer identifier() {
        return this.identifier;
    }

    /**
     * Get the deploymentName value.
     *
     * @return the deploymentName value
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName value.
     *
     * @param deploymentName the deploymentName value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

    /**
     * Get the href value.
     *
     * @return the href value
     */
    public String href() {
        return this.href;
    }

    /**
     * Set the href value.
     *
     * @param href the href value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * Get the minidump value.
     *
     * @return the minidump value
     */
    public String minidump() {
        return this.minidump;
    }

    /**
     * Set the minidump value.
     *
     * @param minidump the minidump value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withMinidump(String minidump) {
        this.minidump = minidump;
        return this;
    }

    /**
     * Get the isProfileRunning value.
     *
     * @return the isProfileRunning value
     */
    public Boolean isProfileRunning() {
        return this.isProfileRunning;
    }

    /**
     * Set the isProfileRunning value.
     *
     * @param isProfileRunning the isProfileRunning value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsProfileRunning(Boolean isProfileRunning) {
        this.isProfileRunning = isProfileRunning;
        return this;
    }

    /**
     * Get the isIisProfileRunning value.
     *
     * @return the isIisProfileRunning value
     */
    public Boolean isIisProfileRunning() {
        return this.isIisProfileRunning;
    }

    /**
     * Set the isIisProfileRunning value.
     *
     * @param isIisProfileRunning the isIisProfileRunning value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsIisProfileRunning(Boolean isIisProfileRunning) {
        this.isIisProfileRunning = isIisProfileRunning;
        return this;
    }

    /**
     * Get the iisProfileTimeoutInSeconds value.
     *
     * @return the iisProfileTimeoutInSeconds value
     */
    public Double iisProfileTimeoutInSeconds() {
        return this.iisProfileTimeoutInSeconds;
    }

    /**
     * Set the iisProfileTimeoutInSeconds value.
     *
     * @param iisProfileTimeoutInSeconds the iisProfileTimeoutInSeconds value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIisProfileTimeoutInSeconds(Double iisProfileTimeoutInSeconds) {
        this.iisProfileTimeoutInSeconds = iisProfileTimeoutInSeconds;
        return this;
    }

    /**
     * Get the parent value.
     *
     * @return the parent value
     */
    public String parent() {
        return this.parent;
    }

    /**
     * Set the parent value.
     *
     * @param parent the parent value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withParent(String parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get the children value.
     *
     * @return the children value
     */
    public List<String> children() {
        return this.children;
    }

    /**
     * Set the children value.
     *
     * @param children the children value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withChildren(List<String> children) {
        this.children = children;
        return this;
    }

    /**
     * Get the threads value.
     *
     * @return the threads value
     */
    public List<ProcessThreadInfoInner> threads() {
        return this.threads;
    }

    /**
     * Set the threads value.
     *
     * @param threads the threads value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withThreads(List<ProcessThreadInfoInner> threads) {
        this.threads = threads;
        return this;
    }

    /**
     * Get the openFileHandles value.
     *
     * @return the openFileHandles value
     */
    public List<String> openFileHandles() {
        return this.openFileHandles;
    }

    /**
     * Set the openFileHandles value.
     *
     * @param openFileHandles the openFileHandles value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withOpenFileHandles(List<String> openFileHandles) {
        this.openFileHandles = openFileHandles;
        return this;
    }

    /**
     * Get the modules value.
     *
     * @return the modules value
     */
    public List<ProcessModuleInfoInner> modules() {
        return this.modules;
    }

    /**
     * Set the modules value.
     *
     * @param modules the modules value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withModules(List<ProcessModuleInfoInner> modules) {
        this.modules = modules;
        return this;
    }

    /**
     * Get the fileName value.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName value.
     *
     * @param fileName the fileName value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the commandLine value.
     *
     * @return the commandLine value
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the commandLine value.
     *
     * @param commandLine the commandLine value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Get the userName value.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the userName value.
     *
     * @param userName the userName value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the handleCount value.
     *
     * @return the handleCount value
     */
    public Integer handleCount() {
        return this.handleCount;
    }

    /**
     * Set the handleCount value.
     *
     * @param handleCount the handleCount value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withHandleCount(Integer handleCount) {
        this.handleCount = handleCount;
        return this;
    }

    /**
     * Get the moduleCount value.
     *
     * @return the moduleCount value
     */
    public Integer moduleCount() {
        return this.moduleCount;
    }

    /**
     * Set the moduleCount value.
     *
     * @param moduleCount the moduleCount value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withModuleCount(Integer moduleCount) {
        this.moduleCount = moduleCount;
        return this;
    }

    /**
     * Get the threadCount value.
     *
     * @return the threadCount value
     */
    public Integer threadCount() {
        return this.threadCount;
    }

    /**
     * Set the threadCount value.
     *
     * @param threadCount the threadCount value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withThreadCount(Integer threadCount) {
        this.threadCount = threadCount;
        return this;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime value.
     *
     * @param startTime the startTime value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the totalCpuTime value.
     *
     * @return the totalCpuTime value
     */
    public String totalCpuTime() {
        return this.totalCpuTime;
    }

    /**
     * Set the totalCpuTime value.
     *
     * @param totalCpuTime the totalCpuTime value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withTotalCpuTime(String totalCpuTime) {
        this.totalCpuTime = totalCpuTime;
        return this;
    }

    /**
     * Get the userCpuTime value.
     *
     * @return the userCpuTime value
     */
    public String userCpuTime() {
        return this.userCpuTime;
    }

    /**
     * Set the userCpuTime value.
     *
     * @param userCpuTime the userCpuTime value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withUserCpuTime(String userCpuTime) {
        this.userCpuTime = userCpuTime;
        return this;
    }

    /**
     * Get the privilegedCpuTime value.
     *
     * @return the privilegedCpuTime value
     */
    public String privilegedCpuTime() {
        return this.privilegedCpuTime;
    }

    /**
     * Set the privilegedCpuTime value.
     *
     * @param privilegedCpuTime the privilegedCpuTime value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPrivilegedCpuTime(String privilegedCpuTime) {
        this.privilegedCpuTime = privilegedCpuTime;
        return this;
    }

    /**
     * Get the workingSet value.
     *
     * @return the workingSet value
     */
    public Long workingSet() {
        return this.workingSet;
    }

    /**
     * Set the workingSet value.
     *
     * @param workingSet the workingSet value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withWorkingSet(Long workingSet) {
        this.workingSet = workingSet;
        return this;
    }

    /**
     * Get the peakWorkingSet value.
     *
     * @return the peakWorkingSet value
     */
    public Long peakWorkingSet() {
        return this.peakWorkingSet;
    }

    /**
     * Set the peakWorkingSet value.
     *
     * @param peakWorkingSet the peakWorkingSet value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPeakWorkingSet(Long peakWorkingSet) {
        this.peakWorkingSet = peakWorkingSet;
        return this;
    }

    /**
     * Get the privateMemory value.
     *
     * @return the privateMemory value
     */
    public Long privateMemory() {
        return this.privateMemory;
    }

    /**
     * Set the privateMemory value.
     *
     * @param privateMemory the privateMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPrivateMemory(Long privateMemory) {
        this.privateMemory = privateMemory;
        return this;
    }

    /**
     * Get the virtualMemory value.
     *
     * @return the virtualMemory value
     */
    public Long virtualMemory() {
        return this.virtualMemory;
    }

    /**
     * Set the virtualMemory value.
     *
     * @param virtualMemory the virtualMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withVirtualMemory(Long virtualMemory) {
        this.virtualMemory = virtualMemory;
        return this;
    }

    /**
     * Get the peakVirtualMemory value.
     *
     * @return the peakVirtualMemory value
     */
    public Long peakVirtualMemory() {
        return this.peakVirtualMemory;
    }

    /**
     * Set the peakVirtualMemory value.
     *
     * @param peakVirtualMemory the peakVirtualMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPeakVirtualMemory(Long peakVirtualMemory) {
        this.peakVirtualMemory = peakVirtualMemory;
        return this;
    }

    /**
     * Get the pagedSystemMemory value.
     *
     * @return the pagedSystemMemory value
     */
    public Long pagedSystemMemory() {
        return this.pagedSystemMemory;
    }

    /**
     * Set the pagedSystemMemory value.
     *
     * @param pagedSystemMemory the pagedSystemMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPagedSystemMemory(Long pagedSystemMemory) {
        this.pagedSystemMemory = pagedSystemMemory;
        return this;
    }

    /**
     * Get the nonPagedSystemMemory value.
     *
     * @return the nonPagedSystemMemory value
     */
    public Long nonPagedSystemMemory() {
        return this.nonPagedSystemMemory;
    }

    /**
     * Set the nonPagedSystemMemory value.
     *
     * @param nonPagedSystemMemory the nonPagedSystemMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withNonPagedSystemMemory(Long nonPagedSystemMemory) {
        this.nonPagedSystemMemory = nonPagedSystemMemory;
        return this;
    }

    /**
     * Get the pagedMemory value.
     *
     * @return the pagedMemory value
     */
    public Long pagedMemory() {
        return this.pagedMemory;
    }

    /**
     * Set the pagedMemory value.
     *
     * @param pagedMemory the pagedMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPagedMemory(Long pagedMemory) {
        this.pagedMemory = pagedMemory;
        return this;
    }

    /**
     * Get the peakPagedMemory value.
     *
     * @return the peakPagedMemory value
     */
    public Long peakPagedMemory() {
        return this.peakPagedMemory;
    }

    /**
     * Set the peakPagedMemory value.
     *
     * @param peakPagedMemory the peakPagedMemory value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withPeakPagedMemory(Long peakPagedMemory) {
        this.peakPagedMemory = peakPagedMemory;
        return this;
    }

    /**
     * Get the timeStamp value.
     *
     * @return the timeStamp value
     */
    public DateTime timeStamp() {
        return this.timeStamp;
    }

    /**
     * Set the timeStamp value.
     *
     * @param timeStamp the timeStamp value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withTimeStamp(DateTime timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * Get the environmentVariables value.
     *
     * @return the environmentVariables value
     */
    public Map<String, String> environmentVariables() {
        return this.environmentVariables;
    }

    /**
     * Set the environmentVariables value.
     *
     * @param environmentVariables the environmentVariables value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withEnvironmentVariables(Map<String, String> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * Get the isScmSite value.
     *
     * @return the isScmSite value
     */
    public Boolean isScmSite() {
        return this.isScmSite;
    }

    /**
     * Set the isScmSite value.
     *
     * @param isScmSite the isScmSite value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsScmSite(Boolean isScmSite) {
        this.isScmSite = isScmSite;
        return this;
    }

    /**
     * Get the isWebjob value.
     *
     * @return the isWebjob value
     */
    public Boolean isWebjob() {
        return this.isWebjob;
    }

    /**
     * Set the isWebjob value.
     *
     * @param isWebjob the isWebjob value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withIsWebjob(Boolean isWebjob) {
        this.isWebjob = isWebjob;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the ProcessInfoInner object itself.
     */
    public ProcessInfoInner withDescription(String description) {
        this.description = description;
        return this;
    }

}