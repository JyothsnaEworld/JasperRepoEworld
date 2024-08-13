package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SupportExpenses extends BaseModel {
    
    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("expenseTypeAndFrequency")
    private String expenseTypeAndFrequencyTxt;
    @JsonProperty("courtOrderedLegallyObligated")
    private String courtOrderedLegallyObligatedTxt;
    @JsonProperty("obligationAmount")
    private String obligationAmountTxt;
    @JsonProperty("amountPaid")
    private String amountPaidTxt;

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

    public String getCourtOrderedLegallyObligatedTxt() {
        return courtOrderedLegallyObligatedTxt;
    }

    public void setCourtOrderedLegallyObligatedTxt(String courtOrderedLegallyObligatedTxt) {
        this.courtOrderedLegallyObligatedTxt = courtOrderedLegallyObligatedTxt;
    }

    public String getObligationAmountTxt() {
        return obligationAmountTxt;
    }

    public void setObligationAmountTxt(String obligationAmountTxt) {
        this.obligationAmountTxt = obligationAmountTxt;
    }

    public String getAmountPaidTxt() {
        return amountPaidTxt;
    }

    public void setAmountPaidTxt(String amountPaidTxt) {
        this.amountPaidTxt = amountPaidTxt;
    }
}
