package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class HouseholdMembers extends BaseModel {

    @JsonProperty("name")
    private String nameTxt;
    @JsonProperty("householdMembership")
    private String householdMembershipTxt;
    @JsonProperty("program")
    private String programTxt;
    @JsonProperty("identification")
    private String identificationTxt;
    @JsonProperty("citizenship")
    private String citizenshipTxt;
    @JsonProperty("raceAndEthnicity")
    private String raceAndEthnicityTxt;
    public HouseholdMembers() {

    }

    public String getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(String nameTxt) {
        this.nameTxt = nameTxt;
    }

    public String getHouseholdMembershipTxt() {
        return householdMembershipTxt;
    }

    public void setHouseholdMembershipTxt(String householdMembershipTxt) {
        this.householdMembershipTxt = householdMembershipTxt;
    }

    public String getProgramTxt() {
        return programTxt;
    }

    public void setProgramTxt(String programTxt) {
        this.programTxt = programTxt;
    }

    public String getIdentificationTxt() {
        return identificationTxt;
    }

    public void setIdentificationTxt(String identificationTxt) {
        this.identificationTxt = identificationTxt;
    }

    public String getCitizenshipTxt() {
        return citizenshipTxt;
    }

    public void setCitizenshipTxt(String citizenshipTxt) {
        this.citizenshipTxt = citizenshipTxt;
    }

    public String getRaceAndEthnicityTxt() {
        return raceAndEthnicityTxt;
    }

    public void setRaceAndEthnicityTxt(String raceAndEthnicityTxt) {
        this.raceAndEthnicityTxt = raceAndEthnicityTxt;
    }
/*    @Override
    public void setProperties(String[] values) {
        this.nameTxt = values[0];
        this.householdMembershipTxt = values[1];
        this.programTxt = values[2];
        this.maritalStatusTxt = values[3];
        this.highestEducationTxt = values[4];
        this.hdlTxt = values[5];
        this.citizenshipTxt = values[6];
        this.raceAndEthnicityTxt = (values.length==8)?values[7];
    }
*/
}
