package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WagesInformation extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("frequencyAndMonthlyHours")
    private String frequencyAndMonthlyHoursTxt;
    @JsonProperty("rateAndFrequency")
    private String rateAndFrequencyTxt;
    @JsonProperty("hoursWorked")
    private String hoursWorkedTxt;
    @JsonProperty("calculatedMonthly")
    private String calculatedMonthlyTxt;
    @JsonProperty("grossIncomeMonthly")
    private String grossIncomeMonthlyTxt;
    public WagesInformation() {

    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getFrequencyAndMonthlyHoursTxt() {
        return frequencyAndMonthlyHoursTxt;
    }

    public void setFrequencyAndMonthlyHoursTxt(String frequencyAndMonthlyHoursTxt) {
        this.frequencyAndMonthlyHoursTxt = frequencyAndMonthlyHoursTxt;
    }

    public String getRateAndFrequencyTxt() {
        return rateAndFrequencyTxt;
    }

    public void setRateAndFrequencyTxt(String rateAndFrequencyTxt) {
        this.rateAndFrequencyTxt = rateAndFrequencyTxt;
    }

    public String getHoursWorkedTxt() {
        return hoursWorkedTxt;
    }

    public void setHoursWorkedTxt(String hoursWorkedTxt) {
        this.hoursWorkedTxt = hoursWorkedTxt;
    }

    public String getCalculatedMonthlyTxt() {
        return calculatedMonthlyTxt;
    }

    public void setCalculatedMonthlyTxt(String calculatedMonthlyTxt) {
        this.calculatedMonthlyTxt = calculatedMonthlyTxt;
    }

    public String getGrossIncomeMonthlyTxt() {
        return grossIncomeMonthlyTxt;
    }

    public void setGrossIncomeMonthlyTxt(String grossIncomeMonthlyTxt) {
        this.grossIncomeMonthlyTxt = grossIncomeMonthlyTxt;
    }
}