package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DisabilityDetermination extends BaseModel {

    @JsonProperty("disabilityDates")
    private String disabilityDatesTxt;
    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("decision")
    private String decisionTxt;
    @JsonProperty("source")
    private String sourceTxt;

    public String getDisabilityDatesTxt() {
        return disabilityDatesTxt;
    }

    public void setDisabilityDatesTxt(String disabilityDatesTxt) {
        this.disabilityDatesTxt = disabilityDatesTxt;
    }

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getDecisionTxt() {
        return decisionTxt;
    }

    public void setDecisionTxt(String decisionTxt) {
        this.decisionTxt = decisionTxt;
    }

    public String getSourceTxt() {
        return sourceTxt;
    }

    public void setSourceTxt(String sourceTxt) {
        this.sourceTxt = sourceTxt;
    }
}
