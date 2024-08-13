package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DisqualificationQuestionnaire extends BaseModel {

    @JsonProperty("questionnaire")
    private String questionnaireTxt;
    @JsonProperty("isAnyoneInTheHousehold")
    private String isAnyoneInTheHouseholdTxt;

    public String getQuestionnaireTxt() {
        return questionnaireTxt;
    }

    public void setQuestionnaireTxt(String questionnaireTxt) {
        this.questionnaireTxt = questionnaireTxt;
    }

    public String getIsAnyoneInTheHouseholdTxt() {
        return isAnyoneInTheHouseholdTxt;
    }

    public void setIsAnyoneInTheHouseholdTxt(String isAnyoneInTheHouseholdTxt) {
        this.isAnyoneInTheHouseholdTxt = isAnyoneInTheHouseholdTxt;
    }
}
