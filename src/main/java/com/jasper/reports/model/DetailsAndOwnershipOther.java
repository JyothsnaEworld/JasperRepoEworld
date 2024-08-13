package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DetailsAndOwnershipOther extends BaseModel {

    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("purchasePrice")
    private String purchasePriceTxt;
    @JsonProperty("value")
    private String valueTxt;
    @JsonProperty("encumbrance")
    private String encumbranceTxt;
    @JsonProperty("equityInformation")
    private String equityInformationTxt;
    @JsonProperty("sharedPercentage")
    private String sharedPercentageTxt;

    public String getEffectiveDatesTxt() {
        return effectiveDatesTxt;
    }

    public void setEffectiveDatesTxt(String effectiveDatesTxt) {
        this.effectiveDatesTxt = effectiveDatesTxt;
    }

    public String getPurchasePriceTxt() {
        return purchasePriceTxt;
    }

    public void setPurchasePriceTxt(String purchasePriceTxt) {
        this.purchasePriceTxt = purchasePriceTxt;
    }

    public String getValueTxt() {
        return valueTxt;
    }

    public void setValueTxt(String valueTxt) {
        this.valueTxt = valueTxt;
    }

    public String getEncumbranceTxt() {
        return encumbranceTxt;
    }

    public void setEncumbranceTxt(String encumbranceTxt) {
        this.encumbranceTxt = encumbranceTxt;
    }

    public String getEquityInformationTxt() {
        return equityInformationTxt;
    }

    public void setEquityInformationTxt(String equityInformationTxt) {
        this.equityInformationTxt = equityInformationTxt;
    }

    public String getSharedPercentageTxt() {
        return sharedPercentageTxt;
    }

    public void setSharedPercentageTxt(String sharedPercentageTxt) {
        this.sharedPercentageTxt = sharedPercentageTxt;
    }

}
