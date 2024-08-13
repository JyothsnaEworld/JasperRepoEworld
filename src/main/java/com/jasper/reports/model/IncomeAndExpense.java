package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeAndExpense extends BaseModel {

    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("income")
    private String incomeTxt;
    @JsonProperty("expense")
    private String expenseTxt;
    @JsonProperty("datePeriod")
    private String datePeriodTxt;
    @JsonProperty("description")
    private String descriptionTxt;
    public IncomeAndExpense() {

    }

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getIncomeTxt() {
        return incomeTxt;
    }

    public void setIncomeTxt(String incomeTxt) {
        this.incomeTxt = incomeTxt;
    }

    public String getExpenseTxt() {
        return expenseTxt;
    }

    public void setExpenseTxt(String expenseTxt) {
        this.expenseTxt = expenseTxt;
    }

    public String getDatePeriodTxt() {
        return datePeriodTxt;
    }

    public void setDatePeriodTxt(String datePeriodTxt) {
        this.datePeriodTxt = datePeriodTxt;
    }

    public String getDescriptionTxt() {
        return descriptionTxt;
    }

    public void setDescriptionTxt(String descriptionTxt) {
        this.descriptionTxt = descriptionTxt;
    }
}
