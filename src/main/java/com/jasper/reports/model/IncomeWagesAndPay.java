package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeWagesAndPay extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("incomeTypeAndSubtype")
    private String incomeTypeAndSubtypeTxt;
    @JsonProperty("countedDesignation")
    private String countedDesignationTxt;
    @JsonProperty("employer")
    private String employerTxt;
    @JsonProperty("employment")
    private String employmentTxt;
    public IncomeWagesAndPay() {

    }

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getIncomeTypeAndSubtypeTxt() {
        return incomeTypeAndSubtypeTxt;
    }

    public void setIncomeTypeAndSubtypeTxt(String incomeTypeAndSubtypeTxt) {
        this.incomeTypeAndSubtypeTxt = incomeTypeAndSubtypeTxt;
    }

    public String getCountedDesignationTxt() {
        return countedDesignationTxt;
    }

    public void setCountedDesignationTxt(String countedDesignationTxt) {
        this.countedDesignationTxt = countedDesignationTxt;
    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getEmploymentTxt() {
        return employmentTxt;
    }

    public void setEmploymentTxt(String employmentTxt) {
        this.employmentTxt = employmentTxt;
    }

    public String getEmployerTxt() {
        return employerTxt;
    }

    public void setEmployerTxt(String employerTxt) {
        this.employerTxt = employerTxt;
    }
}
