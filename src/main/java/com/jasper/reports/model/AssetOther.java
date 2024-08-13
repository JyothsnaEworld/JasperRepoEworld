package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssetOther extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("relationshipToPrimary")
    private String relationshipToPrimaryTxt;
    @JsonProperty("assetInformation")
    private String assetInformationTxt;
    @JsonProperty("designation")
    private String designationTxt;
    @JsonProperty("purchaseSoldTransferredDate")
    private String purchaseSoldTransferredDateTxt;
    @JsonProperty("disposalValue")
    private String disposalValueTxt;

    public String getHouseholdMemberTxt() {
        return householdMemberTxt;
    }

    public void setHouseholdMemberTxt(String householdMemberTxt) {
        this.householdMemberTxt = householdMemberTxt;
    }

    public String getRelationshipToPrimaryTxt() {
        return relationshipToPrimaryTxt;
    }

    public void setRelationshipToPrimaryTxt(String relationshipToPrimaryTxt) {
        this.relationshipToPrimaryTxt = relationshipToPrimaryTxt;
    }

    public String getAssetInformationTxt() {
        return assetInformationTxt;
    }

    public void setAssetInformationTxt(String assetInformationTxt) {
        this.assetInformationTxt = assetInformationTxt;
    }

    public String getDesignationTxt() {
        return designationTxt;
    }

    public void setDesignationTxt(String designationTxt) {
        this.designationTxt = designationTxt;
    }

    public String getPurchaseSoldTransferredDateTxt() {
        return purchaseSoldTransferredDateTxt;
    }

    public void setPurchaseSoldTransferredDateTxt(String purchaseSoldTransferredDateTxt) {
        this.purchaseSoldTransferredDateTxt = purchaseSoldTransferredDateTxt;
    }

    public String getDisposalValueTxt() {
        return disposalValueTxt;
    }

    public void setDisposalValueTxt(String disposalValueTxt) {
        this.disposalValueTxt = disposalValueTxt;
    }

}
