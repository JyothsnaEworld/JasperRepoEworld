package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeDetails extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("paymentFrequency")
    private String paymentFrequencyTxt;
    @JsonProperty("grossAmount")
    private String grossAmountTxt;
    @JsonProperty("deductions")
    private String deductionsTxt;
    @JsonProperty("calculatedMonthly")
    private String calculatedMonthlyTxt;
    @JsonProperty("netAmount")
    private String netAmountTxt;
    public IncomeDetails() {

    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getPaymentFrequencyTxt() {
        return paymentFrequencyTxt;
    }

    public void setPaymentFrequencyTxt(String paymentFrequencyTxt) {
        this.paymentFrequencyTxt = paymentFrequencyTxt;
    }

    public String getGrossAmountTxt() {
        return grossAmountTxt;
    }

    public void setGrossAmountTxt(String grossAmountTxt) {
        this.grossAmountTxt = grossAmountTxt;
    }

    public String getDeductionsTxt() {
        return deductionsTxt;
    }

    public void setDeductionsTxt(String deductionsTxt) {
        this.deductionsTxt = deductionsTxt;
    }

    public String getCalculatedMonthlyTxt() {
        return calculatedMonthlyTxt;
    }

    public void setCalculatedMonthlyTxt(String calculatedMonthlyTxt) {
        this.calculatedMonthlyTxt = calculatedMonthlyTxt;
    }

    public String getNetAmountTxt() {
        return netAmountTxt;
    }

    public void setNetAmountTxt(String netAmountTxt) {
        this.netAmountTxt = netAmountTxt;
    }
}