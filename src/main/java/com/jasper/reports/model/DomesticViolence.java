package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DomesticViolence extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("noDVExemption")
    private String noDVExemptionTxt;
    @JsonProperty("exemptionReason")
    private String exemptionReasonTxt;

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

    public String getNoDVExemptionTxt() {
        return noDVExemptionTxt;
    }

    public void setNoDVExemptionTxt(String noDVExemptionTxt) {
        this.noDVExemptionTxt = noDVExemptionTxt;
    }

    public String getExemptionReasonTxt() {
        return exemptionReasonTxt;
    }

    public void setExemptionReasonTxt(String exemptionReasonTxt) {
        this.exemptionReasonTxt = exemptionReasonTxt;
    }
}
