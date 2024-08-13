package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GoodCauseInformation extends BaseModel {

    @JsonProperty("goodCauseDate")
    private String goodCauseDateTxt;
    @JsonProperty("exemption")
    private String exemptionTxt;
    @JsonProperty("goodCauseReason")
    private String goodCauseReasonTxt;
    @JsonProperty("goodCauseDecision")
    private String goodCauseDecisionTxt;
    @JsonProperty("determinationDate")
    private String determinationDateTxt;

    public String getGoodCauseDateTxt() {
        return goodCauseDateTxt;
    }

    public void setGoodCauseDateTxt(String goodCauseDateTxt) {
        this.goodCauseDateTxt = goodCauseDateTxt;
    }

    public String getExemptionTxt() {
        return exemptionTxt;
    }

    public void setExemptionTxt(String exemptionTxt) {
        this.exemptionTxt = exemptionTxt;
    }

    public String getGoodCauseReasonTxt() {
        return goodCauseReasonTxt;
    }

    public void setGoodCauseReasonTxt(String goodCauseReasonTxt) {
        this.goodCauseReasonTxt = goodCauseReasonTxt;
    }

    public String getGoodCauseDecisionTxt() {
        return goodCauseDecisionTxt;
    }

    public void setGoodCauseDecisionTxt(String goodCauseDecisionTxt) {
        this.goodCauseDecisionTxt = goodCauseDecisionTxt;
    }

    public String getDeterminationDateTxt() {
        return determinationDateTxt;
    }

    public void setDeterminationDateTxt(String determinationDateTxt) {
        this.determinationDateTxt = determinationDateTxt;
    }
}