package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResidencyInformation extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("residenceAddress")
    private String residenceAddressTxt;
    @JsonProperty("mailingAddress")
    private String mailingAddressTxt;
    @JsonProperty("residency")
    private String residencyTxt;
    @JsonProperty("outOfHome")
    private String outOfHomeTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getResidenceAddressTxt() {
        return residenceAddressTxt;
    }

    public void setResidenceAddressTxt(String residenceAddressTxt) {
        this.residenceAddressTxt = residenceAddressTxt;
    }

    public String getMailingAddressTxt() {
        return mailingAddressTxt;
    }

    public void setMailingAddressTxt(String mailingAddressTxt) {
        this.mailingAddressTxt = mailingAddressTxt;
    }

    public String getResidencyTxt() {
        return residencyTxt;
    }

    public void setResidencyTxt(String residencyTxt) {
        this.residencyTxt = residencyTxt;
    }

    public String getOutOfHomeTxt() {
        return outOfHomeTxt;
    }

    public void setOutOfHomeTxt(String outOfHomeTxt) {
        this.outOfHomeTxt = outOfHomeTxt;
    }
}
