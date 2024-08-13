package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Communication extends BaseModel {

    @JsonProperty("caseContactPerson")
    private String caseContactPersonTxt;
    @JsonProperty("residenceAddress")
    private String residenceAddressTxt;
    @JsonProperty("mailingAddress")
    private String mailingAddressTxt;
    @JsonProperty("ebtAddress")
    private String ebtAddressTxt;
    @JsonProperty("limitedEnglishProficiency")
    private String limitedEnglishProficiencyTxt;

    public String getCaseContactPersonTxt() {
        return caseContactPersonTxt;
    }

    public void setCaseContactPersonTxt(String caseContactPersonTxt) {
        this.caseContactPersonTxt = caseContactPersonTxt;
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

    public String getEbtAddressTxt() {
        return ebtAddressTxt;
    }

    public void setEbtAddressTxt(String ebtAddressTxt) {
        this.ebtAddressTxt = ebtAddressTxt;
    }

    public String getLimitedEnglishProficiencyTxt() {
        return limitedEnglishProficiencyTxt;
    }

    public void setLimitedEnglishProficiencyTxt(String limitedEnglishProficiencyTxt) {
        this.limitedEnglishProficiencyTxt = limitedEnglishProficiencyTxt;
    }
}
