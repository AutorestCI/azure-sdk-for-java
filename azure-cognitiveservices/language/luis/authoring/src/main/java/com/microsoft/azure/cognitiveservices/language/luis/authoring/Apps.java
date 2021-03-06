/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring;

import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ListAppsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ImportMethodAppsOptionalParameter;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.UpdateSettingsOptionalParameter;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ApplicationCreateObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ApplicationInfoResponse;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ApplicationPublishObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ApplicationSettings;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ApplicationUpdateObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.AvailableCulture;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.LuisApp;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.OperationStatus;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PersonalAssistantsResponse;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PrebuiltDomain;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PrebuiltDomainCreateObject;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.ProductionOrStagingEndpointInfo;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PublishSettings;
import com.microsoft.azure.cognitiveservices.language.luis.authoring.models.PublishSettingUpdateObject;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Apps.
 */
public interface Apps {

    /**
     * Creates a new LUIS app.
     *
     * @param applicationCreateObject A model containing Name, Description (optional), Culture, Usage Scenario (optional), Domain
      *  (optional) and initial version ID (optional) of the application. Default value for the version ID
      *  is 0.1. Note: the culture cannot be changed after the app is created.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UUID object if successful.
     */
    UUID add(ApplicationCreateObject applicationCreateObject);

    /**
     * Creates a new LUIS app.
     *
     * @param applicationCreateObject A model containing Name, Description (optional), Culture, Usage Scenario (optional), Domain
      *  (optional) and initial version ID (optional) of the application. Default value for the version ID
      *  is 0.1. Note: the culture cannot be changed after the app is created.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UUID object
     */
    Observable<UUID> addAsync(ApplicationCreateObject applicationCreateObject);


    /**
     * Lists all of the user applications.
     *
     * @param listOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ApplicationInfoResponse&gt; object if successful.
     */
    
    List<ApplicationInfoResponse> list(ListAppsOptionalParameter listOptionalParameter);

    /**
     * Lists all of the user applications.
     *
     * @param listOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ApplicationInfoResponse&gt; object
     */
    
    Observable<List<ApplicationInfoResponse>> listAsync(ListAppsOptionalParameter listOptionalParameter);

    /**
     * Lists all of the user applications.
     *
     * @return the first stage of the list call
     */
    AppsListDefinitionStages.WithExecute list();

    /**
     * Grouping of list definition stages.
     */
    interface AppsListDefinitionStages {

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The number of entries to skip. Default value is 0.
             *
             * @return next definition stage
             */
            AppsListDefinitionStages.WithExecute withSkip(Integer skip);

            /**
             * The number of entries to return. Maximum page size is 500. Default is 100.
             *
             * @return next definition stage
             */
            AppsListDefinitionStages.WithExecute withTake(Integer take);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AppsListDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the List&lt;ApplicationInfoResponse&gt; object if successful.
             */
            List<ApplicationInfoResponse> execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the List&lt;ApplicationInfoResponse&gt; object
             */
            Observable<List<ApplicationInfoResponse>> executeAsync();
        }
    }

    /**
     * The entirety of list definition.
     */
    interface AppsListDefinition extends
        AppsListDefinitionStages.WithExecute {
    }

    /**
     * Imports an application to LUIS, the application's structure should be included in in the request body.
     *
     * @param luisApp A LUIS application structure.
     * @param importMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UUID object if successful.
     */
    
    UUID importMethod(LuisApp luisApp, ImportMethodAppsOptionalParameter importMethodOptionalParameter);

    /**
     * Imports an application to LUIS, the application's structure should be included in in the request body.
     *
     * @param luisApp A LUIS application structure.
     * @param importMethodOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UUID object
     */
    
    Observable<UUID> importMethodAsync(LuisApp luisApp, ImportMethodAppsOptionalParameter importMethodOptionalParameter);

    /**
     * Imports an application to LUIS, the application's structure should be included in in the request body.
     *
     * @return the first stage of the importMethod call
     */
    AppsImportMethodDefinitionStages.WithLuisApp importMethod();

    /**
     * Grouping of importMethod definition stages.
     */
    interface AppsImportMethodDefinitionStages {
        /**
         * The stage of the definition to be specify luisApp.
         */
        interface WithLuisApp {
            /**
             * A LUIS application structure.
             *
             * @return next definition stage
             */
            AppsImportMethodDefinitionStages.WithExecute withLuisApp(LuisApp luisApp);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * The application name to create. If not specified, the application name will be read from the imported
             *   object.
             *
             * @return next definition stage
             */
            AppsImportMethodDefinitionStages.WithExecute withAppName(String appName);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AppsImportMethodDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the UUID object if successful.
             */
            UUID execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the UUID object
             */
            Observable<UUID> executeAsync();
        }
    }

    /**
     * The entirety of importMethod definition.
     */
    interface AppsImportMethodDefinition extends
        AppsImportMethodDefinitionStages.WithLuisApp,
        AppsImportMethodDefinitionStages.WithExecute {
    }


    /**
     * Gets the endpoint URLs for the prebuilt Cortana applications.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PersonalAssistantsResponse object if successful.
     */
    PersonalAssistantsResponse listCortanaEndpoints();

    /**
     * Gets the endpoint URLs for the prebuilt Cortana applications.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PersonalAssistantsResponse object
     */
    Observable<PersonalAssistantsResponse> listCortanaEndpointsAsync();



    /**
     * Gets the available application domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> listDomains();

    /**
     * Gets the available application domains.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    Observable<List<String>> listDomainsAsync();



    /**
     * Gets the application available usage scenarios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;String&gt; object if successful.
     */
    List<String> listUsageScenarios();

    /**
     * Gets the application available usage scenarios.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;String&gt; object
     */
    Observable<List<String>> listUsageScenariosAsync();



    /**
     * Gets the supported application cultures.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;AvailableCulture&gt; object if successful.
     */
    List<AvailableCulture> listSupportedCultures();

    /**
     * Gets the supported application cultures.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;AvailableCulture&gt; object
     */
    Observable<List<AvailableCulture>> listSupportedCulturesAsync();



    /**
     * Gets the query logs of the past month for the application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InputStream object if successful.
     */
    InputStream downloadQueryLogs(UUID appId);

    /**
     * Gets the query logs of the past month for the application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InputStream object
     */
    Observable<InputStream> downloadQueryLogsAsync(UUID appId);



    /**
     * Gets the application info.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationInfoResponse object if successful.
     */
    ApplicationInfoResponse get(UUID appId);

    /**
     * Gets the application info.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationInfoResponse object
     */
    Observable<ApplicationInfoResponse> getAsync(UUID appId);



    /**
     * Updates the name or description of the application.
     *
     * @param appId The application ID.
     * @param applicationUpdateObject A model containing Name and Description of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus update(UUID appId, ApplicationUpdateObject applicationUpdateObject);

    /**
     * Updates the name or description of the application.
     *
     * @param appId The application ID.
     * @param applicationUpdateObject A model containing Name and Description of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> updateAsync(UUID appId, ApplicationUpdateObject applicationUpdateObject);



    /**
     * Deletes an application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus delete(UUID appId);

    /**
     * Deletes an application.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> deleteAsync(UUID appId);



    /**
     * Publishes a specific version of the application.
     *
     * @param appId The application ID.
     * @param applicationPublishObject The application publish object. The region is the target region that the application is published
      *  to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProductionOrStagingEndpointInfo object if successful.
     */
    ProductionOrStagingEndpointInfo publish(UUID appId, ApplicationPublishObject applicationPublishObject);

    /**
     * Publishes a specific version of the application.
     *
     * @param appId The application ID.
     * @param applicationPublishObject The application publish object. The region is the target region that the application is published
      *  to.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductionOrStagingEndpointInfo object
     */
    Observable<ProductionOrStagingEndpointInfo> publishAsync(UUID appId, ApplicationPublishObject applicationPublishObject);



    /**
     * Get the application settings.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ApplicationSettings object if successful.
     */
    ApplicationSettings getSettings(UUID appId);

    /**
     * Get the application settings.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ApplicationSettings object
     */
    Observable<ApplicationSettings> getSettingsAsync(UUID appId);


    /**
     * Updates the application settings.
     *
     * @param appId The application ID.
     * @param updateSettingsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    
    OperationStatus updateSettings(UUID appId, UpdateSettingsOptionalParameter updateSettingsOptionalParameter);

    /**
     * Updates the application settings.
     *
     * @param appId The application ID.
     * @param updateSettingsOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    
    Observable<OperationStatus> updateSettingsAsync(UUID appId, UpdateSettingsOptionalParameter updateSettingsOptionalParameter);

    /**
     * Updates the application settings.
     *
     * @return the first stage of the updateSettings call
     */
    AppsUpdateSettingsDefinitionStages.WithAppId updateSettings();

    /**
     * Grouping of updateSettings definition stages.
     */
    interface AppsUpdateSettingsDefinitionStages {
        /**
         * The stage of the definition to be specify appId.
         */
        interface WithAppId {
            /**
             * The application ID.
             *
             * @return next definition stage
             */
            AppsUpdateSettingsDefinitionStages.WithExecute withAppId(UUID appId);
        }

        /**
         * The stage of the definition which allows for any other optional settings to be specified.
         */
        interface WithAllOptions {
            /**
             * Setting your application as public allows other people to use your application's endpoint using their own
             *   keys.
             *
             * @return next definition stage
             */
            AppsUpdateSettingsDefinitionStages.WithExecute withPublicParameter(boolean publicParameter);

        }

        /**
         * The last stage of the definition which will make the operation call.
        */
        interface WithExecute extends AppsUpdateSettingsDefinitionStages.WithAllOptions {
            /**
             * Execute the request.
             *
             * @return the OperationStatus object if successful.
             */
            OperationStatus execute();

            /**
             * Execute the request asynchronously.
             *
             * @return the observable to the OperationStatus object
             */
            Observable<OperationStatus> executeAsync();
        }
    }

    /**
     * The entirety of updateSettings definition.
     */
    interface AppsUpdateSettingsDefinition extends
        AppsUpdateSettingsDefinitionStages.WithAppId,
        AppsUpdateSettingsDefinitionStages.WithExecute {
    }


    /**
     * Get the application publish settings.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PublishSettings object if successful.
     */
    PublishSettings getPublishSettings(UUID appId);

    /**
     * Get the application publish settings.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PublishSettings object
     */
    Observable<PublishSettings> getPublishSettingsAsync(UUID appId);



    /**
     * Updates the application publish settings.
     *
     * @param appId The application ID.
     * @param publishSettingUpdateObject An object containing the new publish application settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    OperationStatus updatePublishSettings(UUID appId, PublishSettingUpdateObject publishSettingUpdateObject);

    /**
     * Updates the application publish settings.
     *
     * @param appId The application ID.
     * @param publishSettingUpdateObject An object containing the new publish application settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    Observable<OperationStatus> updatePublishSettingsAsync(UUID appId, PublishSettingUpdateObject publishSettingUpdateObject);



    /**
     * Returns the available endpoint deployment regions and URLs.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Map&lt;String, String&gt; object if successful.
     */
    Map<String, String> listEndpoints(UUID appId);

    /**
     * Returns the available endpoint deployment regions and URLs.
     *
     * @param appId The application ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Map&lt;String, String&gt; object
     */
    Observable<Map<String, String>> listEndpointsAsync(UUID appId);



    /**
     * Gets all the available custom prebuilt domains for all cultures.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PrebuiltDomain&gt; object if successful.
     */
    List<PrebuiltDomain> listAvailableCustomPrebuiltDomains();

    /**
     * Gets all the available custom prebuilt domains for all cultures.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrebuiltDomain&gt; object
     */
    Observable<List<PrebuiltDomain>> listAvailableCustomPrebuiltDomainsAsync();



    /**
     * Adds a prebuilt domain along with its models as a new application.
     *
     * @param prebuiltDomainCreateObject A prebuilt domain create object containing the name and culture of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the UUID object if successful.
     */
    UUID addCustomPrebuiltDomain(PrebuiltDomainCreateObject prebuiltDomainCreateObject);

    /**
     * Adds a prebuilt domain along with its models as a new application.
     *
     * @param prebuiltDomainCreateObject A prebuilt domain create object containing the name and culture of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the UUID object
     */
    Observable<UUID> addCustomPrebuiltDomainAsync(PrebuiltDomainCreateObject prebuiltDomainCreateObject);



    /**
     * Gets all the available custom prebuilt domains for a specific culture.
     *
     * @param culture Culture.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;PrebuiltDomain&gt; object if successful.
     */
    List<PrebuiltDomain> listAvailableCustomPrebuiltDomainsForCulture(String culture);

    /**
     * Gets all the available custom prebuilt domains for a specific culture.
     *
     * @param culture Culture.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;PrebuiltDomain&gt; object
     */
    Observable<List<PrebuiltDomain>> listAvailableCustomPrebuiltDomainsForCultureAsync(String culture);


}
