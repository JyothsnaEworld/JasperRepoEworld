package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OtherIncome extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("status")
    private String statusTxt;
    @JsonProperty("appStatusAndDate")
    private String appStatusAndDateTxt;
    @JsonProperty("reason")
    private String reasonTxt;

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

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

    public String getAppStatusAndDateTxt() {
        return appStatusAndDateTxt;
    }

    public void setAppStatusAndDateTxt(String appStatusAndDateTxt) {
        this.appStatusAndDateTxt = appStatusAndDateTxt;
    }

    public String getReasonTxt() {
        return reasonTxt;
    }

    public void setReasonTxt(String reasonTxt) {
        this.reasonTxt = reasonTxt;
    }
}
