package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Disqualification extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("disqualification")
    private String disqualificationTxt;
    @JsonProperty("status")
    private String statusTxt;
    @JsonProperty("effDates")
    private String effDatesTxt;
    @JsonProperty("minTermDate")
    private String minTermDateTxt;
    @JsonProperty("otherInformation")
    private String otherInformationTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getDisqualificationTxt() {
        return disqualificationTxt;
    }

    public void setDisqualificationTxt(String disqualificationTxt) {
        this.disqualificationTxt = disqualificationTxt;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

    public String getEffDatesTxt() {
        return effDatesTxt;
    }

    public void setEffDatesTxt(String effDatesTxt) {
        this.effDatesTxt = effDatesTxt;
    }

    public String getMinTermDateTxt() {
        return minTermDateTxt;
    }

    public void setMinTermDateTxt(String minTermDateTxt) {
        this.minTermDateTxt = minTermDateTxt;
    }

    public String getOtherInformationTxt() {
        return otherInformationTxt;
    }

    public void setOtherInformationTxt(String otherInformationTxt) {
        this.otherInformationTxt = otherInformationTxt;
    }
}
