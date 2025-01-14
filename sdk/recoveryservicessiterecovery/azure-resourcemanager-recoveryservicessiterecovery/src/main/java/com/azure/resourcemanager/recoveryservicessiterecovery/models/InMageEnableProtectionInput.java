// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** VMware Azure specific enable protection input. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMage")
@Fluent
public final class InMageEnableProtectionInput extends EnableProtectionProviderSpecificInput {
    /*
     * The VM Name.
     */
    @JsonProperty(value = "vmFriendlyName")
    private String vmFriendlyName;

    /*
     * The Master Target Id.
     */
    @JsonProperty(value = "masterTargetId", required = true)
    private String masterTargetId;

    /*
     * The Process Server Id.
     */
    @JsonProperty(value = "processServerId", required = true)
    private String processServerId;

    /*
     * The retention drive to use on the MT.
     */
    @JsonProperty(value = "retentionDrive", required = true)
    private String retentionDrive;

    /*
     * The CS account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /*
     * The multi VM group Id.
     */
    @JsonProperty(value = "multiVmGroupId", required = true)
    private String multiVmGroupId;

    /*
     * The multi VM group name.
     */
    @JsonProperty(value = "multiVmGroupName", required = true)
    private String multiVmGroupName;

    /*
     * The target datastore name.
     */
    @JsonProperty(value = "datastoreName")
    private String datastoreName;

    /*
     * The enable disk exclusion input.
     */
    @JsonProperty(value = "diskExclusionInput")
    private InMageDiskExclusionInput diskExclusionInput;

    /*
     * The disks to include list.
     */
    @JsonProperty(value = "disksToInclude")
    private List<String> disksToInclude;

    /** Creates an instance of InMageEnableProtectionInput class. */
    public InMageEnableProtectionInput() {
    }

    /**
     * Get the vmFriendlyName property: The VM Name.
     *
     * @return the vmFriendlyName value.
     */
    public String vmFriendlyName() {
        return this.vmFriendlyName;
    }

    /**
     * Set the vmFriendlyName property: The VM Name.
     *
     * @param vmFriendlyName the vmFriendlyName value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withVmFriendlyName(String vmFriendlyName) {
        this.vmFriendlyName = vmFriendlyName;
        return this;
    }

    /**
     * Get the masterTargetId property: The Master Target Id.
     *
     * @return the masterTargetId value.
     */
    public String masterTargetId() {
        return this.masterTargetId;
    }

    /**
     * Set the masterTargetId property: The Master Target Id.
     *
     * @param masterTargetId the masterTargetId value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withMasterTargetId(String masterTargetId) {
        this.masterTargetId = masterTargetId;
        return this;
    }

    /**
     * Get the processServerId property: The Process Server Id.
     *
     * @return the processServerId value.
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the processServerId property: The Process Server Id.
     *
     * @param processServerId the processServerId value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the retentionDrive property: The retention drive to use on the MT.
     *
     * @return the retentionDrive value.
     */
    public String retentionDrive() {
        return this.retentionDrive;
    }

    /**
     * Set the retentionDrive property: The retention drive to use on the MT.
     *
     * @param retentionDrive the retentionDrive value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withRetentionDrive(String retentionDrive) {
        this.retentionDrive = retentionDrive;
        return this;
    }

    /**
     * Get the runAsAccountId property: The CS account Id.
     *
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: The CS account Id.
     *
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

    /**
     * Get the multiVmGroupId property: The multi VM group Id.
     *
     * @return the multiVmGroupId value.
     */
    public String multiVmGroupId() {
        return this.multiVmGroupId;
    }

    /**
     * Set the multiVmGroupId property: The multi VM group Id.
     *
     * @param multiVmGroupId the multiVmGroupId value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withMultiVmGroupId(String multiVmGroupId) {
        this.multiVmGroupId = multiVmGroupId;
        return this;
    }

    /**
     * Get the multiVmGroupName property: The multi VM group name.
     *
     * @return the multiVmGroupName value.
     */
    public String multiVmGroupName() {
        return this.multiVmGroupName;
    }

    /**
     * Set the multiVmGroupName property: The multi VM group name.
     *
     * @param multiVmGroupName the multiVmGroupName value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withMultiVmGroupName(String multiVmGroupName) {
        this.multiVmGroupName = multiVmGroupName;
        return this;
    }

    /**
     * Get the datastoreName property: The target datastore name.
     *
     * @return the datastoreName value.
     */
    public String datastoreName() {
        return this.datastoreName;
    }

    /**
     * Set the datastoreName property: The target datastore name.
     *
     * @param datastoreName the datastoreName value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withDatastoreName(String datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    /**
     * Get the diskExclusionInput property: The enable disk exclusion input.
     *
     * @return the diskExclusionInput value.
     */
    public InMageDiskExclusionInput diskExclusionInput() {
        return this.diskExclusionInput;
    }

    /**
     * Set the diskExclusionInput property: The enable disk exclusion input.
     *
     * @param diskExclusionInput the diskExclusionInput value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withDiskExclusionInput(InMageDiskExclusionInput diskExclusionInput) {
        this.diskExclusionInput = diskExclusionInput;
        return this;
    }

    /**
     * Get the disksToInclude property: The disks to include list.
     *
     * @return the disksToInclude value.
     */
    public List<String> disksToInclude() {
        return this.disksToInclude;
    }

    /**
     * Set the disksToInclude property: The disks to include list.
     *
     * @param disksToInclude the disksToInclude value to set.
     * @return the InMageEnableProtectionInput object itself.
     */
    public InMageEnableProtectionInput withDisksToInclude(List<String> disksToInclude) {
        this.disksToInclude = disksToInclude;
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
        if (masterTargetId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property masterTargetId in model InMageEnableProtectionInput"));
        }
        if (processServerId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property processServerId in model InMageEnableProtectionInput"));
        }
        if (retentionDrive() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property retentionDrive in model InMageEnableProtectionInput"));
        }
        if (multiVmGroupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property multiVmGroupId in model InMageEnableProtectionInput"));
        }
        if (multiVmGroupName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property multiVmGroupName in model InMageEnableProtectionInput"));
        }
        if (diskExclusionInput() != null) {
            diskExclusionInput().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InMageEnableProtectionInput.class);
}
