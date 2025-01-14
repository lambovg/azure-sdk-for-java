// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ArmTemplateParameterProperties;
import com.azure.resourcemanager.devtestlabs.models.EnvironmentDeploymentProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class EnvironmentDeploymentPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        EnvironmentDeploymentProperties model =
            BinaryData
                .fromString(
                    "{\"armTemplateId\":\"tso\",\"parameters\":[{\"name\":\"enxpmyyefr\",\"value\":\"pdnqqskawaoqvmmb\"},{\"name\":\"qfr\",\"value\":\"lkzmegnitgvkxl\"}]}")
                .toObject(EnvironmentDeploymentProperties.class);
        Assertions.assertEquals("tso", model.armTemplateId());
        Assertions.assertEquals("enxpmyyefr", model.parameters().get(0).name());
        Assertions.assertEquals("pdnqqskawaoqvmmb", model.parameters().get(0).value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        EnvironmentDeploymentProperties model =
            new EnvironmentDeploymentProperties()
                .withArmTemplateId("tso")
                .withParameters(
                    Arrays
                        .asList(
                            new ArmTemplateParameterProperties().withName("enxpmyyefr").withValue("pdnqqskawaoqvmmb"),
                            new ArmTemplateParameterProperties().withName("qfr").withValue("lkzmegnitgvkxl")));
        model = BinaryData.fromObject(model).toObject(EnvironmentDeploymentProperties.class);
        Assertions.assertEquals("tso", model.armTemplateId());
        Assertions.assertEquals("enxpmyyefr", model.parameters().get(0).name());
        Assertions.assertEquals("pdnqqskawaoqvmmb", model.parameters().get(0).value());
    }
}
