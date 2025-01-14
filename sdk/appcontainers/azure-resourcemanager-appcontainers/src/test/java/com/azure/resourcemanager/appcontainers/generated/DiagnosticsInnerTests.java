// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.models.DiagnosticDataProviderMetadata;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDataApiResponse;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsDefinition;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsProperties;
import com.azure.resourcemanager.appcontainers.models.DiagnosticsStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DiagnosticsInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DiagnosticsInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"metadata\":{\"id\":\"btgkbugrjqctoj\",\"name\":\"isofieypefojyqd\",\"description\":\"u\",\"author\":\"cp\",\"category\":\"wkhihihlhzdsqt\",\"supportTopicList\":[],\"analysisTypes\":[\"nowc\",\"hfgmvecactxm\",\"oteyowc\",\"uqovekqvgqouwif\"],\"type\":\"pjwyiv\",\"score\":50.420834},\"dataset\":[{},{}],\"status\":{\"message\":\"phuagrttikteusq\",\"statusId\":1626546819},\"dataProviderMetadata\":{\"providerName\":\"klxubyja\",\"propertyBag\":[]}},\"id\":\"fblcq\",\"name\":\"u\",\"type\":\"bgq\"}")
                .toObject(DiagnosticsInner.class);
        Assertions.assertEquals("nowc", model.properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("phuagrttikteusq", model.properties().status().message());
        Assertions.assertEquals(1626546819, model.properties().status().statusId());
        Assertions.assertEquals("klxubyja", model.properties().dataProviderMetadata().providerName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DiagnosticsInner model =
            new DiagnosticsInner()
                .withProperties(
                    new DiagnosticsProperties()
                        .withMetadata(
                            new DiagnosticsDefinition()
                                .withSupportTopicList(Arrays.asList())
                                .withAnalysisTypes(Arrays.asList("nowc", "hfgmvecactxm", "oteyowc", "uqovekqvgqouwif")))
                        .withDataset(Arrays.asList(new DiagnosticsDataApiResponse(), new DiagnosticsDataApiResponse()))
                        .withStatus(new DiagnosticsStatus().withMessage("phuagrttikteusq").withStatusId(1626546819))
                        .withDataProviderMetadata(
                            new DiagnosticDataProviderMetadata()
                                .withProviderName("klxubyja")
                                .withPropertyBag(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(DiagnosticsInner.class);
        Assertions.assertEquals("nowc", model.properties().metadata().analysisTypes().get(0));
        Assertions.assertEquals("phuagrttikteusq", model.properties().status().message());
        Assertions.assertEquals(1626546819, model.properties().status().statusId());
        Assertions.assertEquals("klxubyja", model.properties().dataProviderMetadata().providerName());
    }
}
