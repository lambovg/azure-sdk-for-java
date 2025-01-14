// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.storage.models.ChangeFeed;
import com.azure.resourcemanager.storage.models.CorsRules;
import com.azure.resourcemanager.storage.models.DeleteRetentionPolicy;
import com.azure.resourcemanager.storage.models.LastAccessTimeTrackingPolicy;
import com.azure.resourcemanager.storage.models.RestorePolicyProperties;
import com.azure.resourcemanager.storage.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a storage account’s Blob service. */
@Fluent
public final class BlobServicePropertiesInner extends ProxyResource {
    /*
     * The properties of a storage account’s Blob service.
     */
    @JsonProperty(value = "properties")
    private BlobServicePropertiesProperties innerBlobServiceProperties;

    /*
     * Sku name and tier.
     */
    @JsonProperty(value = "sku", access = JsonProperty.Access.WRITE_ONLY)
    private Sku sku;

    /**
     * Get the innerBlobServiceProperties property: The properties of a storage account’s Blob service.
     *
     * @return the innerBlobServiceProperties value.
     */
    private BlobServicePropertiesProperties innerBlobServiceProperties() {
        return this.innerBlobServiceProperties;
    }

    /**
     * Get the sku property: Sku name and tier.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Get the cors property: Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the Blob service.
     *
     * @return the cors value.
     */
    public CorsRules cors() {
        return this.innerBlobServiceProperties() == null ? null : this.innerBlobServiceProperties().cors();
    }

    /**
     * Set the cors property: Specifies CORS rules for the Blob service. You can include up to five CorsRule elements in
     * the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS
     * will be disabled for the Blob service.
     *
     * @param cors the cors value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withCors(CorsRules cors) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withCors(cors);
        return this;
    }

    /**
     * Get the defaultServiceVersion property: DefaultServiceVersion indicates the default version to use for requests
     * to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27
     * and all more recent versions.
     *
     * @return the defaultServiceVersion value.
     */
    public String defaultServiceVersion() {
        return this.innerBlobServiceProperties() == null
            ? null
            : this.innerBlobServiceProperties().defaultServiceVersion();
    }

    /**
     * Set the defaultServiceVersion property: DefaultServiceVersion indicates the default version to use for requests
     * to the Blob service if an incoming request’s version is not specified. Possible values include version 2008-10-27
     * and all more recent versions.
     *
     * @param defaultServiceVersion the defaultServiceVersion value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withDefaultServiceVersion(String defaultServiceVersion) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withDefaultServiceVersion(defaultServiceVersion);
        return this;
    }

    /**
     * Get the deleteRetentionPolicy property: The blob service properties for blob soft delete.
     *
     * @return the deleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy deleteRetentionPolicy() {
        return this.innerBlobServiceProperties() == null
            ? null
            : this.innerBlobServiceProperties().deleteRetentionPolicy();
    }

    /**
     * Set the deleteRetentionPolicy property: The blob service properties for blob soft delete.
     *
     * @param deleteRetentionPolicy the deleteRetentionPolicy value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withDeleteRetentionPolicy(DeleteRetentionPolicy deleteRetentionPolicy) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withDeleteRetentionPolicy(deleteRetentionPolicy);
        return this;
    }

    /**
     * Get the isVersioningEnabled property: Versioning is enabled if set to true.
     *
     * @return the isVersioningEnabled value.
     */
    public Boolean isVersioningEnabled() {
        return this.innerBlobServiceProperties() == null
            ? null
            : this.innerBlobServiceProperties().isVersioningEnabled();
    }

    /**
     * Set the isVersioningEnabled property: Versioning is enabled if set to true.
     *
     * @param isVersioningEnabled the isVersioningEnabled value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withIsVersioningEnabled(Boolean isVersioningEnabled) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withIsVersioningEnabled(isVersioningEnabled);
        return this;
    }

    /**
     * Get the automaticSnapshotPolicyEnabled property: Deprecated in favor of isVersioningEnabled property.
     *
     * @return the automaticSnapshotPolicyEnabled value.
     */
    public Boolean automaticSnapshotPolicyEnabled() {
        return this.innerBlobServiceProperties() == null
            ? null
            : this.innerBlobServiceProperties().automaticSnapshotPolicyEnabled();
    }

    /**
     * Set the automaticSnapshotPolicyEnabled property: Deprecated in favor of isVersioningEnabled property.
     *
     * @param automaticSnapshotPolicyEnabled the automaticSnapshotPolicyEnabled value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withAutomaticSnapshotPolicyEnabled(Boolean automaticSnapshotPolicyEnabled) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withAutomaticSnapshotPolicyEnabled(automaticSnapshotPolicyEnabled);
        return this;
    }

    /**
     * Get the changeFeed property: The blob service properties for change feed events.
     *
     * @return the changeFeed value.
     */
    public ChangeFeed changeFeed() {
        return this.innerBlobServiceProperties() == null ? null : this.innerBlobServiceProperties().changeFeed();
    }

    /**
     * Set the changeFeed property: The blob service properties for change feed events.
     *
     * @param changeFeed the changeFeed value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withChangeFeed(ChangeFeed changeFeed) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withChangeFeed(changeFeed);
        return this;
    }

    /**
     * Get the restorePolicy property: The blob service properties for blob restore policy.
     *
     * @return the restorePolicy value.
     */
    public RestorePolicyProperties restorePolicy() {
        return this.innerBlobServiceProperties() == null ? null : this.innerBlobServiceProperties().restorePolicy();
    }

    /**
     * Set the restorePolicy property: The blob service properties for blob restore policy.
     *
     * @param restorePolicy the restorePolicy value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withRestorePolicy(RestorePolicyProperties restorePolicy) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withRestorePolicy(restorePolicy);
        return this;
    }

    /**
     * Get the containerDeleteRetentionPolicy property: The blob service properties for container soft delete.
     *
     * @return the containerDeleteRetentionPolicy value.
     */
    public DeleteRetentionPolicy containerDeleteRetentionPolicy() {
        return this.innerBlobServiceProperties() == null
            ? null
            : this.innerBlobServiceProperties().containerDeleteRetentionPolicy();
    }

    /**
     * Set the containerDeleteRetentionPolicy property: The blob service properties for container soft delete.
     *
     * @param containerDeleteRetentionPolicy the containerDeleteRetentionPolicy value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withContainerDeleteRetentionPolicy(
        DeleteRetentionPolicy containerDeleteRetentionPolicy) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withContainerDeleteRetentionPolicy(containerDeleteRetentionPolicy);
        return this;
    }

    /**
     * Get the lastAccessTimeTrackingPolicy property: The blob service property to configure last access time based
     * tracking policy.
     *
     * @return the lastAccessTimeTrackingPolicy value.
     */
    public LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy() {
        return this.innerBlobServiceProperties() == null
            ? null
            : this.innerBlobServiceProperties().lastAccessTimeTrackingPolicy();
    }

    /**
     * Set the lastAccessTimeTrackingPolicy property: The blob service property to configure last access time based
     * tracking policy.
     *
     * @param lastAccessTimeTrackingPolicy the lastAccessTimeTrackingPolicy value to set.
     * @return the BlobServicePropertiesInner object itself.
     */
    public BlobServicePropertiesInner withLastAccessTimeTrackingPolicy(
        LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy) {
        if (this.innerBlobServiceProperties() == null) {
            this.innerBlobServiceProperties = new BlobServicePropertiesProperties();
        }
        this.innerBlobServiceProperties().withLastAccessTimeTrackingPolicy(lastAccessTimeTrackingPolicy);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerBlobServiceProperties() != null) {
            innerBlobServiceProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
