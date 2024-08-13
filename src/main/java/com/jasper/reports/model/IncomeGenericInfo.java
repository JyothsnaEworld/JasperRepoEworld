package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class IncomeGenericInfo extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("incomeTypeAndSubtype")
    private String incomeTypeAndSubtypeTxt;
    @JsonProperty("countedDesignation")
    private String countedDesignationTxt;
    @JsonProperty("additionalInfo")
    private String additionalInfoTxt;
    @JsonProperty("description")
    private String descriptionTxt;
    public IncomeGenericInfo() {

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

    public String getAdditionalInfoTxt() {
        return additionalInfoTxt;
    }

    public void setAdditionalInfoTxt(String additionalInfoTxt) {
        this.additionalInfoTxt = additionalInfoTxt;
    }

    public String getDescriptionTxt() {
        return descriptionTxt;
    }

    public void setDescriptionTxt(String descriptionTxt) {
        this.descriptionTxt = descriptionTxt;
    }
}
