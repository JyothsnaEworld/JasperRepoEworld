package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TimeOnAidTANF extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("countable")
    private String countableTxt;
    @JsonProperty("remaining")
    private String remainingTxt;
    @JsonProperty("exempt")
    private String exemptTxt;
    @JsonProperty("eb")
    private String ebTxt;
    @JsonProperty("totalTANFMonths")
    private String totalTANFMonthsTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getCountableTxt() {
        return countableTxt;
    }

    public void setCountableTxt(String countableTxt) {
        this.countableTxt = countableTxt;
    }

    public String getRemainingTxt() {
        return remainingTxt;
    }

    public void setRemainingTxt(String remainingTxt) {
        this.remainingTxt = remainingTxt;
    }

    public String getExemptTxt() {
        return exemptTxt;
    }

    public void setExemptTxt(String exemptTxt) {
        this.exemptTxt = exemptTxt;
    }

    public String getEbTxt() {
        return ebTxt;
    }

    public void setEbTxt(String ebTxt) {
        this.ebTxt = ebTxt;
    }

    public String getTotalTANFMonthsTxt() {
        return totalTANFMonthsTxt;
    }

    public void setTotalTANFMonthsTxt(String totalTANFMonthsTxt) {
        this.totalTANFMonthsTxt = totalTANFMonthsTxt;
    }
}
