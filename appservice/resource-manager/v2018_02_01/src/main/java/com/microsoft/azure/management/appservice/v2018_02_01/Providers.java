/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import rx.Observable;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.ProvidersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Providers.
 */
public interface Providers extends HasInner<ProvidersInner> {
    /**
     * Get available application frameworks and their versions.
     * Get available application frameworks and their versions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationStack> getAvailableStacksAsync();

    /**
     * Get available application frameworks and their versions.
     * Get available application frameworks and their versions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationStack> listAsync();

    /**
     * Gets all available operations for the Microsoft.Web resource provider. Also exposes resource metric definitions.
     * Gets all available operations for the Microsoft.Web resource provider. Also exposes resource metric definitions.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CsmOperationDescription> listOperationsAsync();

}
