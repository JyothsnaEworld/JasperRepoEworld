package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HouseholdRelationships extends BaseModel {

    @JsonProperty("name")
    private String nameTxt;
    @JsonProperty("startDate")
    private String startDateTxt;
    @JsonProperty("endDate")
    private String endDateTxt;
    @JsonProperty("relationship")
    private String relationshipTxt;
    @JsonProperty("relatedIndividual")
    private String relatedIndividualTxt;

    public String getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(String nameTxt) {
        this.nameTxt = nameTxt;
    }

    public String getStartDateTxt() {
        return startDateTxt;
    }

    public void setStartDateTxt(String startDateTxt) {
        this.startDateTxt = startDateTxt;
    }

    public String getEndDateTxt() {
        return endDateTxt;
    }

    public void setEndDateTxt(String endDateTxt) {
        this.endDateTxt = endDateTxt;
    }

    public String getRelationshipTxt() {
        return relationshipTxt;
    }

    public void setRelationshipTxt(String relationshipTxt) {
        this.relationshipTxt = relationshipTxt;
    }

    public String getRelatedIndividualTxt() {
        return relatedIndividualTxt;
    }

    public void setRelatedIndividualTxt(String relatedIndividualTxt) {
        this.relatedIndividualTxt = relatedIndividualTxt;
    }
}
