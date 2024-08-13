package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AbsentParentInformation extends BaseModel {

    @JsonProperty("apInfo")
    private String apInfoTxt;
    @JsonProperty("motherAndFatherInfo")
    private String motherAndFatherInfoTxt;
    @JsonProperty("maritalInfo")
    private String maritalInfoTxt;
    @JsonProperty("contactInfo")
    private String contactInfoTxt;
    @JsonProperty("lastKnownEmployer")
    private String lastKnownEmployerTxt;
    @JsonProperty("obligation")
    private String obligationTxt;

    public String getApInfoTxt() {
        return apInfoTxt;
    }

    public void setApInfoTxt(String apInfoTxt) {
        this.apInfoTxt = apInfoTxt;
    }

    public String getMotherAndFatherInfoTxt() {
        return motherAndFatherInfoTxt;
    }

    public void setMotherAndFatherInfoTxt(String motherAndFatherInfoTxt) {
        this.motherAndFatherInfoTxt = motherAndFatherInfoTxt;
    }

    public String getMaritalInfoTxt() {
        return maritalInfoTxt;
    }

    public void setMaritalInfoTxt(String maritalInfoTxt) {
        this.maritalInfoTxt = maritalInfoTxt;
    }

    public String getContactInfoTxt() {
        return contactInfoTxt;
    }

    public void setContactInfoTxt(String contactInfoTxt) {
        this.contactInfoTxt = contactInfoTxt;
    }

    public String getLastKnownEmployerTxt() {
        return lastKnownEmployerTxt;
    }

    public void setLastKnownEmployerTxt(String lastKnownEmployerTxt) {
        this.lastKnownEmployerTxt = lastKnownEmployerTxt;
    }

    public String getObligationTxt() {
        return obligationTxt;
    }

    public void setObligationTxt(String obligationTxt) {
        this.obligationTxt = obligationTxt;
    }
}
