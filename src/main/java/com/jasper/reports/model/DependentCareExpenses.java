package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DependentCareExpenses extends BaseModel {

    @JsonProperty("expenseTypeAndFrequency")
    private String expenseTypeAndFrequencyTxt;
    @JsonProperty("hhMemberNeedingCare")
    private String hhMemberNeedingCareTxt;
    @JsonProperty("incurredReason")
    private String incurredReasonTxt;
    @JsonProperty("provider")
    private String providerTxt;
    @JsonProperty("paidByAmounts")
    private String paidByAmountsTxt;
    @JsonProperty("name")
    private String nameTxt;

}
