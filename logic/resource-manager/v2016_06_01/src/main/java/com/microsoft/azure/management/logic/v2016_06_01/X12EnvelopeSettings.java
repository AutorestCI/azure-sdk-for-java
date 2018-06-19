/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The X12 agreement envelope settings.
 */
public class X12EnvelopeSettings {
    /**
     * The controls standards id.
     */
    @JsonProperty(value = "controlStandardsId", required = true)
    private int controlStandardsId;

    /**
     * The value indicating whether to use control standards id as repetition
     * character.
     */
    @JsonProperty(value = "useControlStandardsIdAsRepetitionCharacter", required = true)
    private boolean useControlStandardsIdAsRepetitionCharacter;

    /**
     * The sender application id.
     */
    @JsonProperty(value = "senderApplicationId", required = true)
    private String senderApplicationId;

    /**
     * The receiver application id.
     */
    @JsonProperty(value = "receiverApplicationId", required = true)
    private String receiverApplicationId;

    /**
     * The control version number.
     */
    @JsonProperty(value = "controlVersionNumber", required = true)
    private String controlVersionNumber;

    /**
     * The interchange  control number lower bound.
     */
    @JsonProperty(value = "interchangeControlNumberLowerBound", required = true)
    private int interchangeControlNumberLowerBound;

    /**
     * The interchange  control number upper bound.
     */
    @JsonProperty(value = "interchangeControlNumberUpperBound", required = true)
    private int interchangeControlNumberUpperBound;

    /**
     * The value indicating whether to rollover interchange control number.
     */
    @JsonProperty(value = "rolloverInterchangeControlNumber", required = true)
    private boolean rolloverInterchangeControlNumber;

    /**
     * The value indicating whether to enable default group headers.
     */
    @JsonProperty(value = "enableDefaultGroupHeaders", required = true)
    private boolean enableDefaultGroupHeaders;

    /**
     * The functional group id.
     */
    @JsonProperty(value = "functionalGroupId")
    private String functionalGroupId;

    /**
     * The group control number lower bound.
     */
    @JsonProperty(value = "groupControlNumberLowerBound", required = true)
    private int groupControlNumberLowerBound;

    /**
     * The group control number upper bound.
     */
    @JsonProperty(value = "groupControlNumberUpperBound", required = true)
    private int groupControlNumberUpperBound;

    /**
     * The value indicating whether to rollover group control number.
     */
    @JsonProperty(value = "rolloverGroupControlNumber", required = true)
    private boolean rolloverGroupControlNumber;

    /**
     * The group header agency code.
     */
    @JsonProperty(value = "groupHeaderAgencyCode", required = true)
    private String groupHeaderAgencyCode;

    /**
     * The group header version.
     */
    @JsonProperty(value = "groupHeaderVersion", required = true)
    private String groupHeaderVersion;

    /**
     * The transaction set control number lower bound.
     */
    @JsonProperty(value = "transactionSetControlNumberLowerBound", required = true)
    private int transactionSetControlNumberLowerBound;

    /**
     * The transaction set control number upper bound.
     */
    @JsonProperty(value = "transactionSetControlNumberUpperBound", required = true)
    private int transactionSetControlNumberUpperBound;

    /**
     * The value indicating whether to rollover transaction set control number.
     */
    @JsonProperty(value = "rolloverTransactionSetControlNumber", required = true)
    private boolean rolloverTransactionSetControlNumber;

    /**
     * The transaction set control number prefix.
     */
    @JsonProperty(value = "transactionSetControlNumberPrefix")
    private String transactionSetControlNumberPrefix;

    /**
     * The transaction set control number suffix.
     */
    @JsonProperty(value = "transactionSetControlNumberSuffix")
    private String transactionSetControlNumberSuffix;

    /**
     * The value indicating whether to overwrite existing transaction set
     * control number.
     */
    @JsonProperty(value = "overwriteExistingTransactionSetControlNumber", required = true)
    private boolean overwriteExistingTransactionSetControlNumber;

    /**
     * The group header date format. Possible values include: 'NotSpecified',
     * 'CCYYMMDD', 'YYMMDD'.
     */
    @JsonProperty(value = "groupHeaderDateFormat", required = true)
    private X12DateFormat groupHeaderDateFormat;

    /**
     * The group header time format. Possible values include: 'NotSpecified',
     * 'HHMM', 'HHMMSS', 'HHMMSSdd', 'HHMMSSd'.
     */
    @JsonProperty(value = "groupHeaderTimeFormat", required = true)
    private X12TimeFormat groupHeaderTimeFormat;

    /**
     * The usage indicator. Possible values include: 'NotSpecified', 'Test',
     * 'Information', 'Production'.
     */
    @JsonProperty(value = "usageIndicator", required = true)
    private UsageIndicator usageIndicator;

    /**
     * Get the controlStandardsId value.
     *
     * @return the controlStandardsId value
     */
    public int controlStandardsId() {
        return this.controlStandardsId;
    }

    /**
     * Set the controlStandardsId value.
     *
     * @param controlStandardsId the controlStandardsId value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withControlStandardsId(int controlStandardsId) {
        this.controlStandardsId = controlStandardsId;
        return this;
    }

    /**
     * Get the useControlStandardsIdAsRepetitionCharacter value.
     *
     * @return the useControlStandardsIdAsRepetitionCharacter value
     */
    public boolean useControlStandardsIdAsRepetitionCharacter() {
        return this.useControlStandardsIdAsRepetitionCharacter;
    }

    /**
     * Set the useControlStandardsIdAsRepetitionCharacter value.
     *
     * @param useControlStandardsIdAsRepetitionCharacter the useControlStandardsIdAsRepetitionCharacter value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withUseControlStandardsIdAsRepetitionCharacter(boolean useControlStandardsIdAsRepetitionCharacter) {
        this.useControlStandardsIdAsRepetitionCharacter = useControlStandardsIdAsRepetitionCharacter;
        return this;
    }

    /**
     * Get the senderApplicationId value.
     *
     * @return the senderApplicationId value
     */
    public String senderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * Set the senderApplicationId value.
     *
     * @param senderApplicationId the senderApplicationId value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withSenderApplicationId(String senderApplicationId) {
        this.senderApplicationId = senderApplicationId;
        return this;
    }

    /**
     * Get the receiverApplicationId value.
     *
     * @return the receiverApplicationId value
     */
    public String receiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * Set the receiverApplicationId value.
     *
     * @param receiverApplicationId the receiverApplicationId value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withReceiverApplicationId(String receiverApplicationId) {
        this.receiverApplicationId = receiverApplicationId;
        return this;
    }

    /**
     * Get the controlVersionNumber value.
     *
     * @return the controlVersionNumber value
     */
    public String controlVersionNumber() {
        return this.controlVersionNumber;
    }

    /**
     * Set the controlVersionNumber value.
     *
     * @param controlVersionNumber the controlVersionNumber value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withControlVersionNumber(String controlVersionNumber) {
        this.controlVersionNumber = controlVersionNumber;
        return this;
    }

    /**
     * Get the interchangeControlNumberLowerBound value.
     *
     * @return the interchangeControlNumberLowerBound value
     */
    public int interchangeControlNumberLowerBound() {
        return this.interchangeControlNumberLowerBound;
    }

    /**
     * Set the interchangeControlNumberLowerBound value.
     *
     * @param interchangeControlNumberLowerBound the interchangeControlNumberLowerBound value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withInterchangeControlNumberLowerBound(int interchangeControlNumberLowerBound) {
        this.interchangeControlNumberLowerBound = interchangeControlNumberLowerBound;
        return this;
    }

    /**
     * Get the interchangeControlNumberUpperBound value.
     *
     * @return the interchangeControlNumberUpperBound value
     */
    public int interchangeControlNumberUpperBound() {
        return this.interchangeControlNumberUpperBound;
    }

    /**
     * Set the interchangeControlNumberUpperBound value.
     *
     * @param interchangeControlNumberUpperBound the interchangeControlNumberUpperBound value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withInterchangeControlNumberUpperBound(int interchangeControlNumberUpperBound) {
        this.interchangeControlNumberUpperBound = interchangeControlNumberUpperBound;
        return this;
    }

    /**
     * Get the rolloverInterchangeControlNumber value.
     *
     * @return the rolloverInterchangeControlNumber value
     */
    public boolean rolloverInterchangeControlNumber() {
        return this.rolloverInterchangeControlNumber;
    }

    /**
     * Set the rolloverInterchangeControlNumber value.
     *
     * @param rolloverInterchangeControlNumber the rolloverInterchangeControlNumber value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withRolloverInterchangeControlNumber(boolean rolloverInterchangeControlNumber) {
        this.rolloverInterchangeControlNumber = rolloverInterchangeControlNumber;
        return this;
    }

    /**
     * Get the enableDefaultGroupHeaders value.
     *
     * @return the enableDefaultGroupHeaders value
     */
    public boolean enableDefaultGroupHeaders() {
        return this.enableDefaultGroupHeaders;
    }

    /**
     * Set the enableDefaultGroupHeaders value.
     *
     * @param enableDefaultGroupHeaders the enableDefaultGroupHeaders value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withEnableDefaultGroupHeaders(boolean enableDefaultGroupHeaders) {
        this.enableDefaultGroupHeaders = enableDefaultGroupHeaders;
        return this;
    }

    /**
     * Get the functionalGroupId value.
     *
     * @return the functionalGroupId value
     */
    public String functionalGroupId() {
        return this.functionalGroupId;
    }

    /**
     * Set the functionalGroupId value.
     *
     * @param functionalGroupId the functionalGroupId value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withFunctionalGroupId(String functionalGroupId) {
        this.functionalGroupId = functionalGroupId;
        return this;
    }

    /**
     * Get the groupControlNumberLowerBound value.
     *
     * @return the groupControlNumberLowerBound value
     */
    public int groupControlNumberLowerBound() {
        return this.groupControlNumberLowerBound;
    }

    /**
     * Set the groupControlNumberLowerBound value.
     *
     * @param groupControlNumberLowerBound the groupControlNumberLowerBound value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupControlNumberLowerBound(int groupControlNumberLowerBound) {
        this.groupControlNumberLowerBound = groupControlNumberLowerBound;
        return this;
    }

    /**
     * Get the groupControlNumberUpperBound value.
     *
     * @return the groupControlNumberUpperBound value
     */
    public int groupControlNumberUpperBound() {
        return this.groupControlNumberUpperBound;
    }

    /**
     * Set the groupControlNumberUpperBound value.
     *
     * @param groupControlNumberUpperBound the groupControlNumberUpperBound value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupControlNumberUpperBound(int groupControlNumberUpperBound) {
        this.groupControlNumberUpperBound = groupControlNumberUpperBound;
        return this;
    }

    /**
     * Get the rolloverGroupControlNumber value.
     *
     * @return the rolloverGroupControlNumber value
     */
    public boolean rolloverGroupControlNumber() {
        return this.rolloverGroupControlNumber;
    }

    /**
     * Set the rolloverGroupControlNumber value.
     *
     * @param rolloverGroupControlNumber the rolloverGroupControlNumber value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withRolloverGroupControlNumber(boolean rolloverGroupControlNumber) {
        this.rolloverGroupControlNumber = rolloverGroupControlNumber;
        return this;
    }

    /**
     * Get the groupHeaderAgencyCode value.
     *
     * @return the groupHeaderAgencyCode value
     */
    public String groupHeaderAgencyCode() {
        return this.groupHeaderAgencyCode;
    }

    /**
     * Set the groupHeaderAgencyCode value.
     *
     * @param groupHeaderAgencyCode the groupHeaderAgencyCode value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderAgencyCode(String groupHeaderAgencyCode) {
        this.groupHeaderAgencyCode = groupHeaderAgencyCode;
        return this;
    }

    /**
     * Get the groupHeaderVersion value.
     *
     * @return the groupHeaderVersion value
     */
    public String groupHeaderVersion() {
        return this.groupHeaderVersion;
    }

    /**
     * Set the groupHeaderVersion value.
     *
     * @param groupHeaderVersion the groupHeaderVersion value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderVersion(String groupHeaderVersion) {
        this.groupHeaderVersion = groupHeaderVersion;
        return this;
    }

    /**
     * Get the transactionSetControlNumberLowerBound value.
     *
     * @return the transactionSetControlNumberLowerBound value
     */
    public int transactionSetControlNumberLowerBound() {
        return this.transactionSetControlNumberLowerBound;
    }

    /**
     * Set the transactionSetControlNumberLowerBound value.
     *
     * @param transactionSetControlNumberLowerBound the transactionSetControlNumberLowerBound value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberLowerBound(int transactionSetControlNumberLowerBound) {
        this.transactionSetControlNumberLowerBound = transactionSetControlNumberLowerBound;
        return this;
    }

    /**
     * Get the transactionSetControlNumberUpperBound value.
     *
     * @return the transactionSetControlNumberUpperBound value
     */
    public int transactionSetControlNumberUpperBound() {
        return this.transactionSetControlNumberUpperBound;
    }

    /**
     * Set the transactionSetControlNumberUpperBound value.
     *
     * @param transactionSetControlNumberUpperBound the transactionSetControlNumberUpperBound value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberUpperBound(int transactionSetControlNumberUpperBound) {
        this.transactionSetControlNumberUpperBound = transactionSetControlNumberUpperBound;
        return this;
    }

    /**
     * Get the rolloverTransactionSetControlNumber value.
     *
     * @return the rolloverTransactionSetControlNumber value
     */
    public boolean rolloverTransactionSetControlNumber() {
        return this.rolloverTransactionSetControlNumber;
    }

    /**
     * Set the rolloverTransactionSetControlNumber value.
     *
     * @param rolloverTransactionSetControlNumber the rolloverTransactionSetControlNumber value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withRolloverTransactionSetControlNumber(boolean rolloverTransactionSetControlNumber) {
        this.rolloverTransactionSetControlNumber = rolloverTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the transactionSetControlNumberPrefix value.
     *
     * @return the transactionSetControlNumberPrefix value
     */
    public String transactionSetControlNumberPrefix() {
        return this.transactionSetControlNumberPrefix;
    }

    /**
     * Set the transactionSetControlNumberPrefix value.
     *
     * @param transactionSetControlNumberPrefix the transactionSetControlNumberPrefix value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberPrefix(String transactionSetControlNumberPrefix) {
        this.transactionSetControlNumberPrefix = transactionSetControlNumberPrefix;
        return this;
    }

    /**
     * Get the transactionSetControlNumberSuffix value.
     *
     * @return the transactionSetControlNumberSuffix value
     */
    public String transactionSetControlNumberSuffix() {
        return this.transactionSetControlNumberSuffix;
    }

    /**
     * Set the transactionSetControlNumberSuffix value.
     *
     * @param transactionSetControlNumberSuffix the transactionSetControlNumberSuffix value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withTransactionSetControlNumberSuffix(String transactionSetControlNumberSuffix) {
        this.transactionSetControlNumberSuffix = transactionSetControlNumberSuffix;
        return this;
    }

    /**
     * Get the overwriteExistingTransactionSetControlNumber value.
     *
     * @return the overwriteExistingTransactionSetControlNumber value
     */
    public boolean overwriteExistingTransactionSetControlNumber() {
        return this.overwriteExistingTransactionSetControlNumber;
    }

    /**
     * Set the overwriteExistingTransactionSetControlNumber value.
     *
     * @param overwriteExistingTransactionSetControlNumber the overwriteExistingTransactionSetControlNumber value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withOverwriteExistingTransactionSetControlNumber(boolean overwriteExistingTransactionSetControlNumber) {
        this.overwriteExistingTransactionSetControlNumber = overwriteExistingTransactionSetControlNumber;
        return this;
    }

    /**
     * Get the groupHeaderDateFormat value.
     *
     * @return the groupHeaderDateFormat value
     */
    public X12DateFormat groupHeaderDateFormat() {
        return this.groupHeaderDateFormat;
    }

    /**
     * Set the groupHeaderDateFormat value.
     *
     * @param groupHeaderDateFormat the groupHeaderDateFormat value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderDateFormat(X12DateFormat groupHeaderDateFormat) {
        this.groupHeaderDateFormat = groupHeaderDateFormat;
        return this;
    }

    /**
     * Get the groupHeaderTimeFormat value.
     *
     * @return the groupHeaderTimeFormat value
     */
    public X12TimeFormat groupHeaderTimeFormat() {
        return this.groupHeaderTimeFormat;
    }

    /**
     * Set the groupHeaderTimeFormat value.
     *
     * @param groupHeaderTimeFormat the groupHeaderTimeFormat value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withGroupHeaderTimeFormat(X12TimeFormat groupHeaderTimeFormat) {
        this.groupHeaderTimeFormat = groupHeaderTimeFormat;
        return this;
    }

    /**
     * Get the usageIndicator value.
     *
     * @return the usageIndicator value
     */
    public UsageIndicator usageIndicator() {
        return this.usageIndicator;
    }

    /**
     * Set the usageIndicator value.
     *
     * @param usageIndicator the usageIndicator value to set
     * @return the X12EnvelopeSettings object itself.
     */
    public X12EnvelopeSettings withUsageIndicator(UsageIndicator usageIndicator) {
        this.usageIndicator = usageIndicator;
        return this;
    }

}
