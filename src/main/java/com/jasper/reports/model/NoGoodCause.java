package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NoGoodCause extends BaseModel {

    @JsonProperty("custodialParentPerson")
    private String custodialParentPersonTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("cooperateWithCSEA")
    private String cooperateWithCSEATxt;
    @JsonProperty("1247Provided")
    private String providedTxt;
    @JsonProperty("goodCauseExists")
    private String goodCauseExistsTxt;

    public String getCustodialParentPersonTxt() {
        return custodialParentPersonTxt;
    }

    public void setCustodialParentPersonTxt(String custodialParentPersonTxt) {
        this.custodialParentPersonTxt = custodialParentPersonTxt;
    }
    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getCooperateWithCSEATxt() {
        return cooperateWithCSEATxt;
    }

    public void setCooperateWithCSEATxt(String cooperateWithCSEATxt) {
        this.cooperateWithCSEATxt = cooperateWithCSEATxt;
    }

    public String getProvidedTxt() {
        return providedTxt;
    }

    public void setProvidedTxt(String providedTxt) {
        this.providedTxt = providedTxt;
    }

    public String getGoodCauseExistsTxt() {
        return goodCauseExistsTxt;
    }

    public void setGoodCauseExistsTxt(String goodCauseExistsTxt) {
        this.goodCauseExistsTxt = goodCauseExistsTxt;
    }
}
