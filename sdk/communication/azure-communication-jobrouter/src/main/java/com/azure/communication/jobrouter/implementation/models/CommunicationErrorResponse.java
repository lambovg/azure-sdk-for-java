// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.communication.jobrouter.models.JobRouterError;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Communication Services error. */
@Fluent
public final class CommunicationErrorResponse {
    /*
     * The Communication Services error.
     */
    @JsonProperty(value = "error", required = true)
    private JobRouterError error;

    /**
     * Get the error property: The Communication Services error.
     *
     * @return the error value.
     */
    public JobRouterError getError() {
        return this.error;
    }

    /**
     * Set the error property: The Communication Services error.
     *
     * @param error the error value to set.
     * @return the CommunicationErrorResponse object itself.
     */
    public CommunicationErrorResponse setError(JobRouterError error) {
        this.error = error;
        return this;
    }
}
