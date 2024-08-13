package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TimeOnAidABAWD extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("benefitMonth")
    private String benefitMonthTxt;
    @JsonProperty("countable")
    private String countableTxt;
    @JsonProperty("remaining")
    private String remainingTxt;
    @JsonProperty("administrative")
    private String administrativeTxt;
    @JsonProperty("extension")
    private String extensionTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getBenefitMonthTxt() {
        return benefitMonthTxt;
    }

    public void setBenefitMonthTxt(String benefitMonthTxt) {
        this.benefitMonthTxt = benefitMonthTxt;
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

    public String getAdministrativeTxt() {
        return administrativeTxt;
    }

    public void setAdministrativeTxt(String administrativeTxt) {
        this.administrativeTxt = administrativeTxt;
    }

    public String getExtensionTxt() {
        return extensionTxt;
    }

    public void setExtensionTxt(String extensionTxt) {
        this.extensionTxt = extensionTxt;
    }
}
