/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;

/**
 * The optional parameters class for "addVideoFrameUrl" method.
 */
public class AddVideoFrameUrlOptionalParameter {
    /**
    * Timescale of the video.
    */
    private Integer timescale;

    /**
    * Get the timescale value.
    *
    * @return the timescale value
    */
    public Integer timescale() {
        return this.timescale;
    }

    /**
    * Set the timescale value.
    * <p>
    * Timescale of the video.
    *
    * @param timescale the timescale value to set
    * @return the addVideoFrameUrlOptionalParameter object itself.
    */
    public AddVideoFrameUrlOptionalParameter withTimescale(int timescale) {
        this.timescale = timescale;
        return this;
    }

    }