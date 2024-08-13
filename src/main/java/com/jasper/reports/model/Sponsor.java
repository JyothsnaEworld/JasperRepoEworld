package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sponsor extends BaseModel {

    @JsonProperty("sponsorDetails")
    private String sponsorDetailsTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("incomeExpenseAsset")
    private String incomeExpenseAssetTxt;
    @JsonProperty("contactInformation")
    private String contactInformationTxt;
    @JsonProperty("residenceAddress")
    private String residenceAddressTxt;
    @JsonProperty("mailingAddress")
    private String mailingAddressTxt;

    public String getSponsorDetailsTxt() {
        return sponsorDetailsTxt;
    }

    public void setSponsorDetailsTxt(String sponsorDetailsTxt) {
        this.sponsorDetailsTxt = sponsorDetailsTxt;
    }

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getIncomeExpenseAssetTxt() {
        return incomeExpenseAssetTxt;
    }

    public void setIncomeExpenseAssetTxt(String incomeExpenseAssetTxt) {
        this.incomeExpenseAssetTxt = incomeExpenseAssetTxt;
    }

    public String getContactInformationTxt() {
        return contactInformationTxt;
    }

    public void setContactInformationTxt(String contactInformationTxt) {
        this.contactInformationTxt = contactInformationTxt;
    }

    public String getResidenceAddressTxt() {
        return residenceAddressTxt;
    }

    public void setResidenceAddressTxt(String residenceAddressTxt) {
        this.residenceAddressTxt = residenceAddressTxt;
    }

    public String getMailingAddressTxt() {
        return mailingAddressTxt;
    }

    public void setMailingAddressTxt(String mailingAddressTxt) {
        this.mailingAddressTxt = mailingAddressTxt;
    }
}