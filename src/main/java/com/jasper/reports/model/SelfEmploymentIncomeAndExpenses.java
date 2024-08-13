package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SelfEmploymentIncomeAndExpenses extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("monthlyHours")
    private String monthlyHoursTxt;
    @JsonProperty("totalIncomeAndExpenses")
    private String totalIncomeAndExpensesTxt;
    @JsonProperty("netIncome")
    private String netIncomeTxt;
    @JsonProperty("monthsCovered")
    private String monthsCoveredTxt;
    @JsonProperty("calculatedMonthly")
    private String calculatedMonthlyTxt;
    public SelfEmploymentIncomeAndExpenses() {

    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getMonthlyHoursTxt() {
        return monthlyHoursTxt;
    }

    public void setMonthlyHoursTxt(String monthlyHoursTxt) {
        this.monthlyHoursTxt = monthlyHoursTxt;
    }

    public String getTotalIncomeAndExpensesTxt() {
        return totalIncomeAndExpensesTxt;
    }

    public void setTotalIncomeAndExpensesTxt(String totalIncomeAndExpensesTxt) {
        this.totalIncomeAndExpensesTxt = totalIncomeAndExpensesTxt;
    }

    public String getNetIncomeTxt() {
        return netIncomeTxt;
    }

    public void setNetIncomeTxt(String netIncomeTxt) {
        this.netIncomeTxt = netIncomeTxt;
    }

    public String getMonthsCoveredTxt() {
        return monthsCoveredTxt;
    }

    public void setMonthsCoveredTxt(String monthsCoveredTxt) {
        this.monthsCoveredTxt = monthsCoveredTxt;
    }

    public String getCalculatedMonthlyTxt() {
        return calculatedMonthlyTxt;
    }

    public void setCalculatedMonthlyTxt(String calculatedMonthlyTxt) {
        this.calculatedMonthlyTxt = calculatedMonthlyTxt;
    }
}