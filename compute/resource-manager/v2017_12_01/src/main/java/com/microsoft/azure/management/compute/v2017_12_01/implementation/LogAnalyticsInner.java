/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.compute.v2017_12_01.RequestRateByIntervalInput;
import com.microsoft.azure.management.compute.v2017_12_01.ThrottledRequestsInput;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LogAnalytics.
 */
public class LogAnalyticsInner {
    /** The Retrofit service to perform REST calls. */
    private LogAnalyticsService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of LogAnalyticsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LogAnalyticsInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(LogAnalyticsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LogAnalytics to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LogAnalyticsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2017_12_01.LogAnalytics exportRequestRateByInterval" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getRequestRateByInterval")
        Observable<Response<ResponseBody>> exportRequestRateByInterval(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Body RequestRateByIntervalInput parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2017_12_01.LogAnalytics beginExportRequestRateByInterval" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getRequestRateByInterval")
        Observable<Response<ResponseBody>> beginExportRequestRateByInterval(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Body RequestRateByIntervalInput parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2017_12_01.LogAnalytics exportThrottledRequests" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getThrottledRequests")
        Observable<Response<ResponseBody>> exportThrottledRequests(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Body ThrottledRequestsInput parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2017_12_01.LogAnalytics beginExportThrottledRequests" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/logAnalytics/apiAccess/getThrottledRequests")
        Observable<Response<ResponseBody>> beginExportThrottledRequests(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Body ThrottledRequestsInput parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner exportRequestRateByInterval(String location, RequestRateByIntervalInput parameters) {
        return exportRequestRateByIntervalWithServiceResponseAsync(location, parameters).toBlocking().last().body();
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> exportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters, final ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(exportRequestRateByIntervalWithServiceResponseAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<LogAnalyticsOperationResultInner> exportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters) {
        return exportRequestRateByIntervalWithServiceResponseAsync(location, parameters).map(new Func1<ServiceResponse<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>() {
            @Override
            public LogAnalyticsOperationResultInner call(ServiceResponse<LogAnalyticsOperationResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<LogAnalyticsOperationResultInner>> exportRequestRateByIntervalWithServiceResponseAsync(String location, RequestRateByIntervalInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        Observable<Response<ResponseBody>> observable = service.exportRequestRateByInterval(location, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<LogAnalyticsOperationResultInner>() { }.getType());
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner beginExportRequestRateByInterval(String location, RequestRateByIntervalInput parameters) {
        return beginExportRequestRateByIntervalWithServiceResponseAsync(location, parameters).toBlocking().single().body();
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> beginExportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters, final ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginExportRequestRateByIntervalWithServiceResponseAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogAnalyticsOperationResultInner object
     */
    public Observable<LogAnalyticsOperationResultInner> beginExportRequestRateByIntervalAsync(String location, RequestRateByIntervalInput parameters) {
        return beginExportRequestRateByIntervalWithServiceResponseAsync(location, parameters).map(new Func1<ServiceResponse<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>() {
            @Override
            public LogAnalyticsOperationResultInner call(ServiceResponse<LogAnalyticsOperationResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Export logs that show Api requests made by this subscription in the given time window to show throttling activities.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getRequestRateByInterval Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogAnalyticsOperationResultInner object
     */
    public Observable<ServiceResponse<LogAnalyticsOperationResultInner>> beginExportRequestRateByIntervalWithServiceResponseAsync(String location, RequestRateByIntervalInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.beginExportRequestRateByInterval(location, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LogAnalyticsOperationResultInner>>>() {
                @Override
                public Observable<ServiceResponse<LogAnalyticsOperationResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LogAnalyticsOperationResultInner> clientResponse = beginExportRequestRateByIntervalDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LogAnalyticsOperationResultInner> beginExportRequestRateByIntervalDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LogAnalyticsOperationResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LogAnalyticsOperationResultInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner exportThrottledRequests(String location, ThrottledRequestsInput parameters) {
        return exportThrottledRequestsWithServiceResponseAsync(location, parameters).toBlocking().last().body();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> exportThrottledRequestsAsync(String location, ThrottledRequestsInput parameters, final ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(exportThrottledRequestsWithServiceResponseAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<LogAnalyticsOperationResultInner> exportThrottledRequestsAsync(String location, ThrottledRequestsInput parameters) {
        return exportThrottledRequestsWithServiceResponseAsync(location, parameters).map(new Func1<ServiceResponse<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>() {
            @Override
            public LogAnalyticsOperationResultInner call(ServiceResponse<LogAnalyticsOperationResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponse<LogAnalyticsOperationResultInner>> exportThrottledRequestsWithServiceResponseAsync(String location, ThrottledRequestsInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        Observable<Response<ResponseBody>> observable = service.exportThrottledRequests(location, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultAsync(observable, new TypeToken<LogAnalyticsOperationResultInner>() { }.getType());
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LogAnalyticsOperationResultInner object if successful.
     */
    public LogAnalyticsOperationResultInner beginExportThrottledRequests(String location, ThrottledRequestsInput parameters) {
        return beginExportThrottledRequestsWithServiceResponseAsync(location, parameters).toBlocking().single().body();
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LogAnalyticsOperationResultInner> beginExportThrottledRequestsAsync(String location, ThrottledRequestsInput parameters, final ServiceCallback<LogAnalyticsOperationResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(beginExportThrottledRequestsWithServiceResponseAsync(location, parameters), serviceCallback);
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogAnalyticsOperationResultInner object
     */
    public Observable<LogAnalyticsOperationResultInner> beginExportThrottledRequestsAsync(String location, ThrottledRequestsInput parameters) {
        return beginExportThrottledRequestsWithServiceResponseAsync(location, parameters).map(new Func1<ServiceResponse<LogAnalyticsOperationResultInner>, LogAnalyticsOperationResultInner>() {
            @Override
            public LogAnalyticsOperationResultInner call(ServiceResponse<LogAnalyticsOperationResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Export logs that show total throttled Api requests for this subscription in the given time window.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param parameters Parameters supplied to the LogAnalytics getThrottledRequests Api.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LogAnalyticsOperationResultInner object
     */
    public Observable<ServiceResponse<LogAnalyticsOperationResultInner>> beginExportThrottledRequestsWithServiceResponseAsync(String location, ThrottledRequestsInput parameters) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.beginExportThrottledRequests(location, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LogAnalyticsOperationResultInner>>>() {
                @Override
                public Observable<ServiceResponse<LogAnalyticsOperationResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LogAnalyticsOperationResultInner> clientResponse = beginExportThrottledRequestsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LogAnalyticsOperationResultInner> beginExportThrottledRequestsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LogAnalyticsOperationResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LogAnalyticsOperationResultInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
