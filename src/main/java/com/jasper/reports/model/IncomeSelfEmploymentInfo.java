package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeSelfEmploymentInfo extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("relationshipToPrimary")
    private String relationshipToPrimaryTxt;
    @JsonProperty("incomeType")
    private String incomeTypeTxt;
    @JsonProperty("countedDesignation")
    private String countedDesignationTxt;
    @JsonProperty("employmentInformation")
    private String employmentInformationTxt;
    public IncomeSelfEmploymentInfo() {

    }

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getRelationshipToPrimaryTxt() {
        return relationshipToPrimaryTxt;
    }

    public void setRelationshipToPrimaryTxt(String relationshipToPrimaryTxt) {
        this.relationshipToPrimaryTxt = relationshipToPrimaryTxt;
    }

    public String getIncomeTypeTxt() {
        return incomeTypeTxt;
    }

    public void setIncomeTypeTxt(String incomeTypeTxt) {
        this.incomeTypeTxt = incomeTypeTxt;
    }

    public String getCountedDesignationTxt() {
        return countedDesignationTxt;
    }

    public void setCountedDesignationTxt(String countedDesignationTxt) {
        this.countedDesignationTxt = countedDesignationTxt;
    }

    public String getEmploymentInformationTxt() {
        return employmentInformationTxt;
    }

    public void setEmploymentInformationTxt(String employmentInformationTxt) {
        this.employmentInformationTxt = employmentInformationTxt;
    }
}
