package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ShelterExpenses extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("expenseTypeAndFrequency")
    private String expenseTypeAndFrequencyTxt;
    @JsonProperty("snap")
    private String snapTxt;
    @JsonProperty("amount")
    private String amountTxt;
    @JsonProperty("paidByOtherInformation")
    private String paidByOtherInformationTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getExpenseTypeAndFrequencyTxt() {
        return expenseTypeAndFrequencyTxt;
    }

    public void setExpenseTypeAndFrequencyTxt(String expenseTypeAndFrequencyTxt) {
        this.expenseTypeAndFrequencyTxt = expenseTypeAndFrequencyTxt;
    }

    public String getSnapTxt() {
        return snapTxt;
    }

    public void setSnapTxt(String snapTxt) {
        this.snapTxt = snapTxt;
    }

    public String getAmountTxt() {
        return amountTxt;
    }

    public void setAmountTxt(String amountTxt) {
        this.amountTxt = amountTxt;
    }

    public String getPaidByOtherInformationTxt() {
        return paidByOtherInformationTxt;
    }

    public void setPaidByOtherInformationTxt(String paidByOtherInformationTxt) {
        this.paidByOtherInformationTxt = paidByOtherInformationTxt;
    }
}
