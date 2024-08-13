package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaternityInformationTwoParents extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("1303Signed")
    private String signedTxt;
    @JsonProperty("reason")
    private String reasonTxt;
    @JsonProperty("goodCause")
    private String goodCauseTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getSignedTxt() {
        return signedTxt;
    }

    public void setSignedTxt(String signedTxt) {
        this.signedTxt = signedTxt;
    }

    public String getReasonTxt() {
        return reasonTxt;
    }

    public void setReasonTxt(String reasonTxt) {
        this.reasonTxt = reasonTxt;
    }

    public String getGoodCauseTxt() {
        return goodCauseTxt;
    }

    public void setGoodCauseTxt(String goodCauseTxt) {
        this.goodCauseTxt = goodCauseTxt;
    }
}
