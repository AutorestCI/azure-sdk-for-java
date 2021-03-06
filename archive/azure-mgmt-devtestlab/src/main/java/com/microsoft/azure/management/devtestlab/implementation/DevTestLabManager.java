/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.resources.fluentcore.arm.AzureConfigurable;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.implementation.Manager;
import com.microsoft.azure.management.resources.fluentcore.utils.ProviderRegistrationInterceptor;
import com.microsoft.azure.management.resources.fluentcore.utils.ResourceManagerThrottlingInterceptor;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;

/**
 * Entry point to Azure DevTestLab resource management.
 */
@Beta(Beta.SinceVersion.V1_2_0)
public final class DevTestLabManager extends Manager<DevTestLabManager, DevTestLabsClientImpl> {
    /**
    * Get a Configurable instance that can be used to create DevTestLabManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new DevTestLabManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of DevTestLabManager that exposes DevTestLab resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the DevTestLabManager
    */
    public static DevTestLabManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new DevTestLabManager(new RestClient.Builder()
                .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
                .withCredentials(credentials)
                .withSerializerAdapter(new AzureJacksonAdapter())
                .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
                .withInterceptor(new ProviderRegistrationInterceptor(credentials))
                .withInterceptor(new ResourceManagerThrottlingInterceptor())
                .build(), subscriptionId);
    }
    /**
    * Creates an instance of DevTestLabManager that exposes DevTestLab resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the DevTestLabManager
    */
    public static DevTestLabManager authenticate(RestClient restClient, String subscriptionId) {
        return new DevTestLabManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of DevTestLabManager that exposes DevTestLab management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing DevTestLab management API entry points that work across subscriptions
        */
        DevTestLabManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }
    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        public DevTestLabManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return DevTestLabManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private DevTestLabManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new DevTestLabsClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
