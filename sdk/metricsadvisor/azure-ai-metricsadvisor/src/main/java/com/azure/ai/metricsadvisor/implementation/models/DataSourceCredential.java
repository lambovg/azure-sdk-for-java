// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.UUID;

/** The DataSourceCredential model. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "dataSourceCredentialType",
        defaultImpl = DataSourceCredential.class)
@JsonTypeName("DataSourceCredential")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureSQLConnectionString", value = AzureSQLConnectionStringCredential.class),
    @JsonSubTypes.Type(name = "DataLakeGen2SharedKey", value = DataLakeGen2SharedKeyCredential.class),
    @JsonSubTypes.Type(name = "ServicePrincipal", value = ServicePrincipalCredential.class),
    @JsonSubTypes.Type(name = "ServicePrincipalInKV", value = ServicePrincipalInKVCredential.class)
})
@Fluent
public class DataSourceCredential {
    /*
     * Unique id of data source credential
     */
    @JsonProperty(value = "dataSourceCredentialId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataSourceCredentialId;

    /*
     * Name of data source credential
     */
    @JsonProperty(value = "dataSourceCredentialName", required = true)
    private String dataSourceCredentialName;

    /*
     * Description of data source credential
     */
    @JsonProperty(value = "dataSourceCredentialDescription")
    private String dataSourceCredentialDescription;

    /** Creates an instance of DataSourceCredential class. */
    public DataSourceCredential() {}

    /**
     * Get the dataSourceCredentialId property: Unique id of data source credential.
     *
     * @return the dataSourceCredentialId value.
     */
    public UUID getDataSourceCredentialId() {
        return this.dataSourceCredentialId;
    }

    /**
     * Get the dataSourceCredentialName property: Name of data source credential.
     *
     * @return the dataSourceCredentialName value.
     */
    public String getDataSourceCredentialName() {
        return this.dataSourceCredentialName;
    }

    /**
     * Set the dataSourceCredentialName property: Name of data source credential.
     *
     * @param dataSourceCredentialName the dataSourceCredentialName value to set.
     * @return the DataSourceCredential object itself.
     */
    public DataSourceCredential setDataSourceCredentialName(String dataSourceCredentialName) {
        this.dataSourceCredentialName = dataSourceCredentialName;
        return this;
    }

    /**
     * Get the dataSourceCredentialDescription property: Description of data source credential.
     *
     * @return the dataSourceCredentialDescription value.
     */
    public String getDataSourceCredentialDescription() {
        return this.dataSourceCredentialDescription;
    }

    /**
     * Set the dataSourceCredentialDescription property: Description of data source credential.
     *
     * @param dataSourceCredentialDescription the dataSourceCredentialDescription value to set.
     * @return the DataSourceCredential object itself.
     */
    public DataSourceCredential setDataSourceCredentialDescription(String dataSourceCredentialDescription) {
        this.dataSourceCredentialDescription = dataSourceCredentialDescription;
        return this;
    }
}
