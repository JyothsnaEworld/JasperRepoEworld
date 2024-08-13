package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UtilityExpenses extends BaseModel {

    @JsonProperty("expenseTypeAndFrequency")
    private String expenseTypeAndFrequencyTxt;
    @JsonProperty("billedAmount")
    private String billedAmountTxt;
    @JsonProperty("paidByHHAmount")
    private String paidByHHAmountTxt;
    @JsonProperty("paidByOtherAmount")
    private String paidByOtherAmountTxt;
    @JsonProperty("personOrAgencyThatHelpsPay")
    private String personOrAgencyThatHelpsPayTxt;
    @JsonProperty("startAndEndDates")
    private String startAndEndDatesTxt;

    public String getExpenseTypeAndFrequencyTxt() {
        return expenseTypeAndFrequencyTxt;
    }

    public void setExpenseTypeAndFrequencyTxt(String expenseTypeAndFrequencyTxt) {
        this.expenseTypeAndFrequencyTxt = expenseTypeAndFrequencyTxt;
    }

    public String getBilledAmountTxt() {
        return billedAmountTxt;
    }

    public void setBilledAmountTxt(String billedAmountTxt) {
        this.billedAmountTxt = billedAmountTxt;
    }

    public String getPaidByHHAmountTxt() {
        return paidByHHAmountTxt;
    }

    public void setPaidByHHAmountTxt(String paidByHHAmountTxt) {
        this.paidByHHAmountTxt = paidByHHAmountTxt;
    }

    public String getPaidByOtherAmountTxt() {
        return paidByOtherAmountTxt;
    }

    public void setPaidByOtherAmountTxt(String paidByOtherAmountTxt) {
        this.paidByOtherAmountTxt = paidByOtherAmountTxt;
    }

    public String getPersonOrAgencyThatHelpsPayTxt() {
        return personOrAgencyThatHelpsPayTxt;
    }

    public void setPersonOrAgencyThatHelpsPayTxt(String personOrAgencyThatHelpsPayTxt) {
        this.personOrAgencyThatHelpsPayTxt = personOrAgencyThatHelpsPayTxt;
    }

    public String getStartAndEndDatesTxt() {
        return startAndEndDatesTxt;
    }

    public void setStartAndEndDatesTxt(String startAndEndDatesTxt) {
        this.startAndEndDatesTxt = startAndEndDatesTxt;
    }
}
