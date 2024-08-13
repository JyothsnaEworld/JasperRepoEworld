package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PregnancyInformation extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("edc")
    private String edcTxt;
    @JsonProperty("reportDate")
    private String reportDateTxt;
    @JsonProperty("effEndDate")
    private String effEndDateTxt;
    @JsonProperty("ninthMonthStartDate")
    private String ninthMonthStartDateTxt;
    @JsonProperty("numberOfChildrenExpected")
    private String numberOfChildrenExpectedTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getEdcTxt() {
        return edcTxt;
    }

    public void setEdcTxt(String edcTxt) {
        this.edcTxt = edcTxt;
    }

    public String getReportDateTxt() {
        return reportDateTxt;
    }

    public void setReportDateTxt(String reportDateTxt) {
        this.reportDateTxt = reportDateTxt;
    }

    public String getEffEndDateTxt() {
        return effEndDateTxt;
    }

    public void setEffEndDateTxt(String effEndDateTxt) {
        this.effEndDateTxt = effEndDateTxt;
    }

    public String getNinthMonthStartDateTxt() {
        return ninthMonthStartDateTxt;
    }

    public void setNinthMonthStartDateTxt(String ninthMonthStartDateTxt) {
        this.ninthMonthStartDateTxt = ninthMonthStartDateTxt;
    }

    public String getNumberOfChildrenExpectedTxt() {
        return numberOfChildrenExpectedTxt;
    }

    public void setNumberOfChildrenExpectedTxt(String numberOfChildrenExpectedTxt) {
        this.numberOfChildrenExpectedTxt = numberOfChildrenExpectedTxt;
    }
}
