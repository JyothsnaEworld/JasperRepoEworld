package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EandTParticipation extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("startDate")
    private String startDateTxt;
    @JsonProperty("status")
    private String statusTxt;
    @JsonProperty("reason")
    private String reasonTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getStartDateTxt() {
        return startDateTxt;
    }

    public void setStartDateTxt(String startDateTxt) {
        this.startDateTxt = startDateTxt;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

    public String getReasonTxt() {
        return reasonTxt;
    }

    public void setReasonTxt(String reasonTxt) {
        this.reasonTxt = reasonTxt;
    }

}
