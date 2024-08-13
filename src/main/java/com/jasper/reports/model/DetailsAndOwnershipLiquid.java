package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DetailsAndOwnershipLiquid extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("bankBalance")
    private String bankBalanceTxt;
    @JsonProperty("countableBalance")
    private String countableBalanceTxt;
    @JsonProperty("commingledAmount")
    private String commingledAmountTxt;
    @JsonProperty("accessibility")
    private String accessibilityTxt;
    @JsonProperty("sharedPercentage")
    private String sharedPercentageTxt;

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getBankBalanceTxt() {
        return bankBalanceTxt;
    }

    public void setBankBalanceTxt(String bankBalanceTxt) {
        this.bankBalanceTxt = bankBalanceTxt;
    }

    public String getCountableBalanceTxt() {
        return countableBalanceTxt;
    }

    public void setCountableBalanceTxt(String countableBalanceTxt) {
        this.countableBalanceTxt = countableBalanceTxt;
    }

    public String getCommingledAmountTxt() {
        return commingledAmountTxt;
    }

    public void setCommingledAmountTxt(String commingledAmountTxt) {
        this.commingledAmountTxt = commingledAmountTxt;
    }

    public String getAccessibilityTxt() {
        return accessibilityTxt;
    }

    public void setAccessibilityTxt(String accessibilityTxt) {
        this.accessibilityTxt = accessibilityTxt;
    }

    public String getSharedPercentageTxt() {
        return sharedPercentageTxt;
    }

    public void setSharedPercentageTxt(String sharedPercentageTxt) {
        this.sharedPercentageTxt = sharedPercentageTxt;
    }

}
