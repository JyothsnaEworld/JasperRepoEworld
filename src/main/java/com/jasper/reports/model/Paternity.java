package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Paternity extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("cooperateWithCSEA")
    private String cooperateWithCSEATxt;
    @JsonProperty("1247Provided")
    private String providedTxt;
    @JsonProperty("childInfo")
    private String childInfoTxt;
    @JsonProperty("questions")
    private String questionsTxt;

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

    public String getChildInfoTxt() {
        return childInfoTxt;
    }

    public void setChildInfoTxt(String childInfoTxt) {
        this.childInfoTxt = childInfoTxt;
    }

    public String getQuestionsTxt() {
        return questionsTxt;
    }

    public void setQuestionsTxt(String questionsTxt) {
        this.questionsTxt = questionsTxt;
    }
}
