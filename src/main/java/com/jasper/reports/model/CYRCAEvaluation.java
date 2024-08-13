package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CYRCAEvaluation extends BaseModel {

    @JsonProperty("disabilityDates")
    private String disabilityDatesTxt;
    @JsonProperty("status")
    private String statusTxt;
    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("decisionInformation")
    private String decisionInformationTxt;
    @JsonProperty("reevaluationDate")
    private String reevaluationDateTxt;
    @JsonProperty("otherInformation")
    private String otherInformationTxt;

    public String getDisabilityDatesTxt() {
        return disabilityDatesTxt;
    }

    public void setDisabilityDatesTxt(String disabilityDatesTxt) {
        this.disabilityDatesTxt = disabilityDatesTxt;
    }

    public String getStatusTxt() {
        return statusTxt;
    }

    public void setStatusTxt(String statusTxt) {
        this.statusTxt = statusTxt;
    }

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getDecisionInformationTxt() {
        return decisionInformationTxt;
    }

    public void setDecisionInformationTxt(String decisionInformationTxt) {
        this.decisionInformationTxt = decisionInformationTxt;
    }

    public String getReevaluationDateTxt() {
        return reevaluationDateTxt;
    }

    public void setReevaluationDateTxt(String reevaluationDateTxt) {
        this.reevaluationDateTxt = reevaluationDateTxt;
    }

    public String getOtherInformationTxt() {
        return otherInformationTxt;
    }

    public void setOtherInformationTxt(String otherInformationTxt) {
        this.otherInformationTxt = otherInformationTxt;
    }
}
