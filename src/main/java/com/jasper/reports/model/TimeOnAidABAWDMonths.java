package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TimeOnAidABAWDMonths extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("startEndMonth")
    private String startEndMonthTxt;
    @JsonProperty("status")
    private String statusTxt;
    @JsonProperty("reason")
    private String reasonTxt;
    @JsonProperty("state")
    private String stateTxt;
    @JsonProperty("caseNumber")
    private String caseNumberTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getStartEndMonthTxt() {
        return startEndMonthTxt;
    }

    public void setStartEndMonthTxt(String startEndMonthTxt) {
        this.startEndMonthTxt = startEndMonthTxt;
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

    public String getStateTxt() {
        return stateTxt;
    }

    public void setStateTxt(String stateTxt) {
        this.stateTxt = stateTxt;
    }

    public String getCaseNumberTxt() {
        return caseNumberTxt;
    }

    public void setCaseNumberTxt(String caseNumberTxt) {
        this.caseNumberTxt = caseNumberTxt;
    }

}
