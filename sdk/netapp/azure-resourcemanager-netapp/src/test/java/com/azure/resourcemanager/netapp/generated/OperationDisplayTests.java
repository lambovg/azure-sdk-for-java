// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.OperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class OperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"mrqobmtukknr\",\"resource\":\"tihfx\",\"operation\":\"jbpzvgnwzsymg\",\"description\":\"uf\"}")
                .toObject(OperationDisplay.class);
        Assertions.assertEquals("mrqobmtukknr", model.provider());
        Assertions.assertEquals("tihfx", model.resource());
        Assertions.assertEquals("jbpzvgnwzsymg", model.operation());
        Assertions.assertEquals("uf", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationDisplay model =
            new OperationDisplay()
                .withProvider("mrqobmtukknr")
                .withResource("tihfx")
                .withOperation("jbpzvgnwzsymg")
                .withDescription("uf");
        model = BinaryData.fromObject(model).toObject(OperationDisplay.class);
        Assertions.assertEquals("mrqobmtukknr", model.provider());
        Assertions.assertEquals("tihfx", model.resource());
        Assertions.assertEquals("jbpzvgnwzsymg", model.operation());
        Assertions.assertEquals("uf", model.description());
    }
}
