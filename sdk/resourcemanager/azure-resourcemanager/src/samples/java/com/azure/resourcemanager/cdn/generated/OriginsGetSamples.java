// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.generated;

import com.azure.core.util.Context;

/** Samples for Origins Get. */
public final class OriginsGetSamples {
    /*
     * x-ms-original-file: specification/cdn/resource-manager/Microsoft.Cdn/stable/2021-06-01/examples/Origins_Get.json
     */
    /**
     * Sample code: Origins_Get.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void originsGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .cdnProfiles()
            .manager()
            .serviceClient()
            .getOrigins()
            .getWithResponse("RG", "profile1", "endpoint1", "www-someDomain-net", Context.NONE);
    }
}