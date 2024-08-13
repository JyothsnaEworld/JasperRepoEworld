package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EBStatus extends BaseModel {

    @JsonProperty("monthsUsed")
    private String monthsUsedTxt;
    @JsonProperty("monthsRemaining")
    private String monthsRemainingTxt;

    public String getMonthsUsedTxt() {
        return monthsUsedTxt;
    }

    public void setMonthsUsedTxt(String monthsUsedTxt) {
        this.monthsUsedTxt = monthsUsedTxt;
    }

    public String getMonthsRemainingTxt() {
        return monthsRemainingTxt;
    }

    public void setMonthsRemainingTxt(String monthsRemainingTxt) {
        this.monthsRemainingTxt = monthsRemainingTxt;
    }
}
