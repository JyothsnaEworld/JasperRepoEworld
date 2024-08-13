package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MedicalExpenses extends BaseModel {

    @JsonProperty("expenseTypeAndFrequency")
    private String expenseTypeAndFrequencyTxt;
    @JsonProperty("providerAndServiceDate")
    private String providerAndServiceDateTxt;
    @JsonProperty("description")
    private String descriptionTxt;
    @JsonProperty("totalAmountOwed")
    private String totalAmountOwedTxt;
    @JsonProperty("monthlyExpenseAllowed")
    private String monthlyExpenseAllowedTxt;
    @JsonProperty("startAndEndDates")
    private String startAndEndDatesTxt;

    public String getExpenseTypeAndFrequencyTxt() {
        return expenseTypeAndFrequencyTxt;
    }

    public void setExpenseTypeAndFrequencyTxt(String expenseTypeAndFrequencyTxt) {
        this.expenseTypeAndFrequencyTxt = expenseTypeAndFrequencyTxt;
    }

    public String getProviderAndServiceDateTxt() {
        return providerAndServiceDateTxt;
    }

    public void setProviderAndServiceDateTxt(String providerAndServiceDateTxt) {
        this.providerAndServiceDateTxt = providerAndServiceDateTxt;
    }

    public String getDescriptionTxt() {
        return descriptionTxt;
    }

    public void setDescriptionTxt(String descriptionTxt) {
        this.descriptionTxt = descriptionTxt;
    }

    public String getTotalAmountOwedTxt() {
        return totalAmountOwedTxt;
    }

    public void setTotalAmountOwedTxt(String totalAmountOwedTxt) {
        this.totalAmountOwedTxt = totalAmountOwedTxt;
    }

    public String getMonthlyExpenseAllowedTxt() {
        return monthlyExpenseAllowedTxt;
    }

    public void setMonthlyExpenseAllowedTxt(String monthlyExpenseAllowedTxt) {
        this.monthlyExpenseAllowedTxt = monthlyExpenseAllowedTxt;
    }

    public String getStartAndEndDatesTxt() {
        return startAndEndDatesTxt;
    }

    public void setStartAndEndDatesTxt(String startAndEndDatesTxt) {
        this.startAndEndDatesTxt = startAndEndDatesTxt;
    }
}
