package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthorizedRepresentative extends BaseModel {

    @JsonProperty("name")
    private String nameTxt;
    @JsonProperty("ssn")
    private String ssnTxt;
    @JsonProperty("contactInformation")
    private String contactInformationTxt;
    @JsonProperty("mailingAddress")
    private String mailingAddressTxt;
    @JsonProperty("ebtAddress")
    private String ebtAddressTxt;
    @JsonProperty("currentAccess")
    private String currentAccessTxt;

    public String getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(String nameTxt) {
        this.nameTxt = nameTxt;
    }

    public String getSsnTxt() {
        return ssnTxt;
    }

    public void setSsnTxt(String ssnTxt) {
        this.ssnTxt = ssnTxt;
    }

    public String getContactInformationTxt() {
        return contactInformationTxt;
    }

    public void setContactInformationTxt(String contactInformationTxt) {
        this.contactInformationTxt = contactInformationTxt;
    }

    public String getMailingAddressTxt() {
        return mailingAddressTxt;
    }

    public void setMailingAddressTxt(String mailingAddressTxt) {
        this.mailingAddressTxt = mailingAddressTxt;
    }

    public String getEbtAddressTxt() {
        return ebtAddressTxt;
    }

    public void setEbtAddressTxt(String ebtAddressTxt) {
        this.ebtAddressTxt = ebtAddressTxt;
    }

    public String getCurrentAccessTxt() {
        return currentAccessTxt;
    }

    public void setCurrentAccessTxt(String currentAccessTxt) {
        this.currentAccessTxt = currentAccessTxt;
    }
}
