// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CniBgpConfiguration represents the Calico BGP configuration. */
@Fluent
public final class CniBgpConfiguration {
    /*
     * The list of BgpPeer entities that the Hybrid AKS cluster will peer with in addition to peering that occurs
     * automatically with the switch fabric.
     */
    @JsonProperty(value = "bgpPeers")
    private List<BgpPeer> bgpPeers;

    /*
     * The list of prefix community advertisement properties. Each prefix community specifies a prefix, and the
     * communities that should be associated with that prefix when it is announced.
     */
    @JsonProperty(value = "communityAdvertisements")
    private List<CommunityAdvertisement> communityAdvertisements;

    /*
     * The password of the Calico node mesh. It defaults to a randomly-generated string when not provided.
     */
    @JsonProperty(value = "nodeMeshPassword")
    private String nodeMeshPassword;

    /*
     * The subnet blocks in CIDR format for Kubernetes service external IPs to be advertised over BGP.
     */
    @JsonProperty(value = "serviceExternalPrefixes")
    private List<String> serviceExternalPrefixes;

    /*
     * The subnet blocks in CIDR format for Kubernetes load balancers. Load balancer IPs will only be advertised if
     * they
     * are within one of these blocks.
     */
    @JsonProperty(value = "serviceLoadBalancerPrefixes")
    private List<String> serviceLoadBalancerPrefixes;

    /** Creates an instance of CniBgpConfiguration class. */
    public CniBgpConfiguration() {
    }

    /**
     * Get the bgpPeers property: The list of BgpPeer entities that the Hybrid AKS cluster will peer with in addition to
     * peering that occurs automatically with the switch fabric.
     *
     * @return the bgpPeers value.
     */
    public List<BgpPeer> bgpPeers() {
        return this.bgpPeers;
    }

    /**
     * Set the bgpPeers property: The list of BgpPeer entities that the Hybrid AKS cluster will peer with in addition to
     * peering that occurs automatically with the switch fabric.
     *
     * @param bgpPeers the bgpPeers value to set.
     * @return the CniBgpConfiguration object itself.
     */
    public CniBgpConfiguration withBgpPeers(List<BgpPeer> bgpPeers) {
        this.bgpPeers = bgpPeers;
        return this;
    }

    /**
     * Get the communityAdvertisements property: The list of prefix community advertisement properties. Each prefix
     * community specifies a prefix, and the communities that should be associated with that prefix when it is
     * announced.
     *
     * @return the communityAdvertisements value.
     */
    public List<CommunityAdvertisement> communityAdvertisements() {
        return this.communityAdvertisements;
    }

    /**
     * Set the communityAdvertisements property: The list of prefix community advertisement properties. Each prefix
     * community specifies a prefix, and the communities that should be associated with that prefix when it is
     * announced.
     *
     * @param communityAdvertisements the communityAdvertisements value to set.
     * @return the CniBgpConfiguration object itself.
     */
    public CniBgpConfiguration withCommunityAdvertisements(List<CommunityAdvertisement> communityAdvertisements) {
        this.communityAdvertisements = communityAdvertisements;
        return this;
    }

    /**
     * Get the nodeMeshPassword property: The password of the Calico node mesh. It defaults to a randomly-generated
     * string when not provided.
     *
     * @return the nodeMeshPassword value.
     */
    public String nodeMeshPassword() {
        return this.nodeMeshPassword;
    }

    /**
     * Set the nodeMeshPassword property: The password of the Calico node mesh. It defaults to a randomly-generated
     * string when not provided.
     *
     * @param nodeMeshPassword the nodeMeshPassword value to set.
     * @return the CniBgpConfiguration object itself.
     */
    public CniBgpConfiguration withNodeMeshPassword(String nodeMeshPassword) {
        this.nodeMeshPassword = nodeMeshPassword;
        return this;
    }

    /**
     * Get the serviceExternalPrefixes property: The subnet blocks in CIDR format for Kubernetes service external IPs to
     * be advertised over BGP.
     *
     * @return the serviceExternalPrefixes value.
     */
    public List<String> serviceExternalPrefixes() {
        return this.serviceExternalPrefixes;
    }

    /**
     * Set the serviceExternalPrefixes property: The subnet blocks in CIDR format for Kubernetes service external IPs to
     * be advertised over BGP.
     *
     * @param serviceExternalPrefixes the serviceExternalPrefixes value to set.
     * @return the CniBgpConfiguration object itself.
     */
    public CniBgpConfiguration withServiceExternalPrefixes(List<String> serviceExternalPrefixes) {
        this.serviceExternalPrefixes = serviceExternalPrefixes;
        return this;
    }

    /**
     * Get the serviceLoadBalancerPrefixes property: The subnet blocks in CIDR format for Kubernetes load balancers.
     * Load balancer IPs will only be advertised if they are within one of these blocks.
     *
     * @return the serviceLoadBalancerPrefixes value.
     */
    public List<String> serviceLoadBalancerPrefixes() {
        return this.serviceLoadBalancerPrefixes;
    }

    /**
     * Set the serviceLoadBalancerPrefixes property: The subnet blocks in CIDR format for Kubernetes load balancers.
     * Load balancer IPs will only be advertised if they are within one of these blocks.
     *
     * @param serviceLoadBalancerPrefixes the serviceLoadBalancerPrefixes value to set.
     * @return the CniBgpConfiguration object itself.
     */
    public CniBgpConfiguration withServiceLoadBalancerPrefixes(List<String> serviceLoadBalancerPrefixes) {
        this.serviceLoadBalancerPrefixes = serviceLoadBalancerPrefixes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (bgpPeers() != null) {
            bgpPeers().forEach(e -> e.validate());
        }
        if (communityAdvertisements() != null) {
            communityAdvertisements().forEach(e -> e.validate());
        }
    }
}
