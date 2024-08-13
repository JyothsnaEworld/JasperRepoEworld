package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PayStubDocumentation extends BaseModel {

    @JsonProperty("datePaid")
    private String datePaidTxt;
    @JsonProperty("payPeriodEndDate")
    private String payPeriodEndDateTxt;
    @JsonProperty("grossWages")
    private String grossWagesTxt;
    @JsonProperty("hoursWorked")
    private String hoursWorkedTxt;
    @JsonProperty("tips")
    private String tipsTxt;
    @JsonProperty("grossWagesYTD")
    private String grossWagesYTDTxt;
    public PayStubDocumentation() {

    }

    public String getDatePaidTxt() {
        return datePaidTxt;
    }

    public void setDatePaidTxt(String datePaidTxt) {
        this.datePaidTxt = datePaidTxt;
    }

    public String getPayPeriodEndDateTxt() {
        return payPeriodEndDateTxt;
    }

    public void setPayPeriodEndDateTxt(String payPeriodEndDateTxt) {
        this.payPeriodEndDateTxt = payPeriodEndDateTxt;
    }

    public String getGrossWagesTxt() {
        return grossWagesTxt;
    }

    public void setGrossWagesTxt(String grossWagesTxt) {
        this.grossWagesTxt = grossWagesTxt;
    }

    public String getHoursWorkedTxt() {
        return hoursWorkedTxt;
    }

    public void setHoursWorkedTxt(String hoursWorkedTxt) {
        this.hoursWorkedTxt = hoursWorkedTxt;
    }

    public String getTipsTxt() {
        return tipsTxt;
    }

    public void setTipsTxt(String tipsTxt) {
        this.tipsTxt = tipsTxt;
    }

    public String getGrossWagesYTDTxt() {
        return grossWagesYTDTxt;
    }

    public void setGrossWagesYTDTxt(String grossWagesYTDTxt) {
        this.grossWagesYTDTxt = grossWagesYTDTxt;
    }
}