// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/** Azure IaaS VM workload-specific job object. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobType")
@JsonTypeName("AzureIaaSVMJobV2")
@Fluent
public final class AzureIaaSvmJobV2 extends Job {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureIaaSvmJobV2.class);

    /*
     * Gets or sets the state/actions applicable on this job like cancel/retry.
     */
    @JsonProperty(value = "actionsInfo")
    private List<JobSupportedAction> actionsInfo;

    /*
     * Container name of the entity on which the current job is executing.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * Time elapsed during the execution of this job.
     */
    @JsonProperty(value = "duration")
    private Duration duration;

    /*
     * Error details on execution of this job.
     */
    @JsonProperty(value = "errorDetails")
    private List<AzureIaaSvmErrorInfo> errorDetails;

    /*
     * Specifies whether the backup item is a Classic or an Azure Resource
     * Manager VM.
     */
    @JsonProperty(value = "virtualMachineVersion")
    private String virtualMachineVersion;

    /*
     * Additional information for this job.
     */
    @JsonProperty(value = "extendedInfo")
    private AzureIaaSvmJobExtendedInfo extendedInfo;

    /**
     * Get the actionsInfo property: Gets or sets the state/actions applicable on this job like cancel/retry.
     *
     * @return the actionsInfo value.
     */
    public List<JobSupportedAction> actionsInfo() {
        return this.actionsInfo;
    }

    /**
     * Set the actionsInfo property: Gets or sets the state/actions applicable on this job like cancel/retry.
     *
     * @param actionsInfo the actionsInfo value to set.
     * @return the AzureIaaSvmJobV2 object itself.
     */
    public AzureIaaSvmJobV2 withActionsInfo(List<JobSupportedAction> actionsInfo) {
        this.actionsInfo = actionsInfo;
        return this;
    }

    /**
     * Get the containerName property: Container name of the entity on which the current job is executing.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Container name of the entity on which the current job is executing.
     *
     * @param containerName the containerName value to set.
     * @return the AzureIaaSvmJobV2 object itself.
     */
    public AzureIaaSvmJobV2 withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the duration property: Time elapsed during the execution of this job.
     *
     * @return the duration value.
     */
    public Duration duration() {
        return this.duration;
    }

    /**
     * Set the duration property: Time elapsed during the execution of this job.
     *
     * @param duration the duration value to set.
     * @return the AzureIaaSvmJobV2 object itself.
     */
    public AzureIaaSvmJobV2 withDuration(Duration duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get the errorDetails property: Error details on execution of this job.
     *
     * @return the errorDetails value.
     */
    public List<AzureIaaSvmErrorInfo> errorDetails() {
        return this.errorDetails;
    }

    /**
     * Set the errorDetails property: Error details on execution of this job.
     *
     * @param errorDetails the errorDetails value to set.
     * @return the AzureIaaSvmJobV2 object itself.
     */
    public AzureIaaSvmJobV2 withErrorDetails(List<AzureIaaSvmErrorInfo> errorDetails) {
        this.errorDetails = errorDetails;
        return this;
    }

    /**
     * Get the virtualMachineVersion property: Specifies whether the backup item is a Classic or an Azure Resource
     * Manager VM.
     *
     * @return the virtualMachineVersion value.
     */
    public String virtualMachineVersion() {
        return this.virtualMachineVersion;
    }

    /**
     * Set the virtualMachineVersion property: Specifies whether the backup item is a Classic or an Azure Resource
     * Manager VM.
     *
     * @param virtualMachineVersion the virtualMachineVersion value to set.
     * @return the AzureIaaSvmJobV2 object itself.
     */
    public AzureIaaSvmJobV2 withVirtualMachineVersion(String virtualMachineVersion) {
        this.virtualMachineVersion = virtualMachineVersion;
        return this;
    }

    /**
     * Get the extendedInfo property: Additional information for this job.
     *
     * @return the extendedInfo value.
     */
    public AzureIaaSvmJobExtendedInfo extendedInfo() {
        return this.extendedInfo;
    }

    /**
     * Set the extendedInfo property: Additional information for this job.
     *
     * @param extendedInfo the extendedInfo value to set.
     * @return the AzureIaaSvmJobV2 object itself.
     */
    public AzureIaaSvmJobV2 withExtendedInfo(AzureIaaSvmJobExtendedInfo extendedInfo) {
        this.extendedInfo = extendedInfo;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withEntityFriendlyName(String entityFriendlyName) {
        super.withEntityFriendlyName(entityFriendlyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withOperation(String operation) {
        super.withOperation(operation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withStatus(String status) {
        super.withStatus(status);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withStartTime(OffsetDateTime startTime) {
        super.withStartTime(startTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withEndTime(OffsetDateTime endTime) {
        super.withEndTime(endTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureIaaSvmJobV2 withActivityId(String activityId) {
        super.withActivityId(activityId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (errorDetails() != null) {
            errorDetails().forEach(e -> e.validate());
        }
        if (extendedInfo() != null) {
            extendedInfo().validate();
        }
    }
}