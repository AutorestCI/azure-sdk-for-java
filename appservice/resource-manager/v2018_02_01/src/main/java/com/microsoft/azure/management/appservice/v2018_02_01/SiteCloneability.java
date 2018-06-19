/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.SiteCloneabilityInner;
import java.util.List;

/**
 * Type representing SiteCloneability.
 */
public interface SiteCloneability extends HasInner<SiteCloneabilityInner>, HasManager<AppServiceManager> {
    /**
     * @return the blockingCharacteristics value.
     */
    List<SiteCloneabilityCriterion> blockingCharacteristics();

    /**
     * @return the blockingFeatures value.
     */
    List<SiteCloneabilityCriterion> blockingFeatures();

    /**
     * @return the result value.
     */
    CloneAbilityResult result();

    /**
     * @return the unsupportedFeatures value.
     */
    List<SiteCloneabilityCriterion> unsupportedFeatures();

}
