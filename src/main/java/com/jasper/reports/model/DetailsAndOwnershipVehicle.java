package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DetailsAndOwnershipVehicle extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("value")
    private String valueTxt;
    @JsonProperty("fairMarketValue")
    private String fairMarketValueTxt;
    @JsonProperty("amountOwed")
    private String amountOwedTxt;
    @JsonProperty("equityInformation")
    private String equityInformationTxt;
    @JsonProperty("sharedPercentage")
    private String sharedPercentageTxt;

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getValueTxt() {
        return valueTxt;
    }

    public void setValueTxt(String valueTxt) {
        this.valueTxt = valueTxt;
    }

    public String getFairMarketValueTxt() {
        return fairMarketValueTxt;
    }

    public void setFairMarketValueTxt(String fairMarketValueTxt) {
        this.fairMarketValueTxt = fairMarketValueTxt;
    }

    public String getAmountOwedTxt() {
        return amountOwedTxt;
    }

    public void setAmountOwedTxt(String amountOwedTxt) {
        this.amountOwedTxt = amountOwedTxt;
    }

    public String getEquityInformationTxt() {
        return equityInformationTxt;
    }

    public void setEquityInformationTxt(String equityInformationTxt) {
        this.equityInformationTxt = equityInformationTxt;
    }

    public String getSharedPercentageTxt() {
        return sharedPercentageTxt;
    }

    public void setSharedPercentageTxt(String sharedPercentageTxt) {
        this.sharedPercentageTxt = sharedPercentageTxt;
    }

}
