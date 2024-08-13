package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SchoolInformation extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("snapStudentEligibility")
    private String snapStudentEligibilityTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("schoolInformation")
    private String schoolInformationTxt;
    @JsonProperty("enrollment")
    private String enrollmentTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getSnapStudentEligibilityTxt() {
        return snapStudentEligibilityTxt;
    }

    public void setSnapStudentEligibilityTxt(String snapStudentEligibilityTxt) {
        this.snapStudentEligibilityTxt = snapStudentEligibilityTxt;
    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getSchoolInformationTxt() {
        return schoolInformationTxt;
    }

    public void setSchoolInformationTxt(String schoolInformationTxt) {
        this.schoolInformationTxt = schoolInformationTxt;
    }

    public String getEnrollmentTxt() {
        return enrollmentTxt;
    }

    public void setEnrollmentTxt(String enrollmentTxt) {
        this.enrollmentTxt = enrollmentTxt;
    }
}
