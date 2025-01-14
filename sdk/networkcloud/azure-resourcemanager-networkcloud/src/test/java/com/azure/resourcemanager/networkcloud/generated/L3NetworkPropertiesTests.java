// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.L3NetworkProperties;
import com.azure.resourcemanager.networkcloud.models.HybridAksIpamEnabled;
import com.azure.resourcemanager.networkcloud.models.HybridAksPluginType;
import com.azure.resourcemanager.networkcloud.models.IpAllocationType;
import org.junit.jupiter.api.Assertions;

public final class L3NetworkPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        L3NetworkProperties model =
            BinaryData
                .fromString(
                    "{\"clusterId\":\"pwijnhy\",\"detailedStatus\":\"Provisioning\",\"detailedStatusMessage\":\"ycxzbfvoo\",\"hybridAksClustersAssociatedIds\":[\"vmtgjqppy\",\"s\"],\"hybridAksIpamEnabled\":\"True\",\"hybridAksPluginType\":\"SRIOV\",\"interfaceName\":\"yhgfipnsx\",\"ipAllocationType\":\"DualStack\",\"ipv4ConnectedPrefix\":\"a\",\"ipv6ConnectedPrefix\":\"rrjreafxtsgu\",\"l3IsolationDomainId\":\"hjglikk\",\"provisioningState\":\"Succeeded\",\"virtualMachinesAssociatedIds\":[\"lbqpvuzlmvfelf\"],\"vlan\":2987544483281649366}")
                .toObject(L3NetworkProperties.class);
        Assertions.assertEquals(HybridAksIpamEnabled.TRUE, model.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, model.hybridAksPluginType());
        Assertions.assertEquals("yhgfipnsx", model.interfaceName());
        Assertions.assertEquals(IpAllocationType.DUAL_STACK, model.ipAllocationType());
        Assertions.assertEquals("a", model.ipv4ConnectedPrefix());
        Assertions.assertEquals("rrjreafxtsgu", model.ipv6ConnectedPrefix());
        Assertions.assertEquals("hjglikk", model.l3IsolationDomainId());
        Assertions.assertEquals(2987544483281649366L, model.vlan());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        L3NetworkProperties model =
            new L3NetworkProperties()
                .withHybridAksIpamEnabled(HybridAksIpamEnabled.TRUE)
                .withHybridAksPluginType(HybridAksPluginType.SRIOV)
                .withInterfaceName("yhgfipnsx")
                .withIpAllocationType(IpAllocationType.DUAL_STACK)
                .withIpv4ConnectedPrefix("a")
                .withIpv6ConnectedPrefix("rrjreafxtsgu")
                .withL3IsolationDomainId("hjglikk")
                .withVlan(2987544483281649366L);
        model = BinaryData.fromObject(model).toObject(L3NetworkProperties.class);
        Assertions.assertEquals(HybridAksIpamEnabled.TRUE, model.hybridAksIpamEnabled());
        Assertions.assertEquals(HybridAksPluginType.SRIOV, model.hybridAksPluginType());
        Assertions.assertEquals("yhgfipnsx", model.interfaceName());
        Assertions.assertEquals(IpAllocationType.DUAL_STACK, model.ipAllocationType());
        Assertions.assertEquals("a", model.ipv4ConnectedPrefix());
        Assertions.assertEquals("rrjreafxtsgu", model.ipv6ConnectedPrefix());
        Assertions.assertEquals("hjglikk", model.l3IsolationDomainId());
        Assertions.assertEquals(2987544483281649366L, model.vlan());
    }
}
