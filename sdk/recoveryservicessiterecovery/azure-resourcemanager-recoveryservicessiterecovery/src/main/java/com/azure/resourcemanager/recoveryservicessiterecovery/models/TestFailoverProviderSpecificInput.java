// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Provider specific test failover input. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "instanceType",
    defaultImpl = TestFailoverProviderSpecificInput.class)
@JsonTypeName("TestFailoverProviderSpecificInput")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "A2A", value = A2ATestFailoverInput.class),
    @JsonSubTypes.Type(name = "HyperVReplicaAzure", value = HyperVReplicaAzureTestFailoverInput.class),
    @JsonSubTypes.Type(name = "InMageAzureV2", value = InMageAzureV2TestFailoverInput.class),
    @JsonSubTypes.Type(name = "InMageRcm", value = InMageRcmTestFailoverInput.class),
    @JsonSubTypes.Type(name = "InMage", value = InMageTestFailoverInput.class)
})
@Immutable
public class TestFailoverProviderSpecificInput {
    /** Creates an instance of TestFailoverProviderSpecificInput class. */
    public TestFailoverProviderSpecificInput() {
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
