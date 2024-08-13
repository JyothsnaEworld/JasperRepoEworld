package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VeteransMilitary extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("veteran")
    private String veteranTxt;
    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("relatedPerson")
    private String relatedPersonTxt;
    @JsonProperty("relationToVeteran")
    private String relationToVeteranTxt;

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

    public String getVeteranTxt() {
        return veteranTxt;
    }

    public void setVeteranTxt(String veteranTxt) {
        this.veteranTxt = veteranTxt;
    }

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getRelatedPersonTxt() {
        return relatedPersonTxt;
    }

    public void setRelatedPersonTxt(String relatedPersonTxt) {
        this.relatedPersonTxt = relatedPersonTxt;
    }

    public String getRelationToVeteranTxt() {
        return relationToVeteranTxt;
    }

    public void setRelationToVeteranTxt(String relationToVeteranTxt) {
        this.relationToVeteranTxt = relationToVeteranTxt;
    }
}
