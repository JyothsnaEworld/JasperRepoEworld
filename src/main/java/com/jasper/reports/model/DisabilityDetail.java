package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DisabilityDetail extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("relationshipToPrimary")
    private String relationshipToPrimaryTxt;
    @JsonProperty("disabilityDates")
    private String disabilityDatesTxt;
    @JsonProperty("status")
    private String statusTxt;

    public String getDisabilityDatesTxt() {
        return disabilityDatesTxt;
    }

    public void setDisabilityDatesTxt(String disabilityDatesTxt) {
        this.disabilityDatesTxt = disabilityDatesTxt;
    }

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getRelationshipToPrimaryTxt() {
        return relationshipToPrimaryTxt;
    }

    public void setRelationshipToPrimaryTxt(String relationshipToPrimaryTxt) {
        this.relationshipToPrimaryTxt = relationshipToPrimaryTxt;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

}
