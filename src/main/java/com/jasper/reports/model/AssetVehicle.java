package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssetVehicle extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("relationshipToPrimary")
    private String relationshipToPrimaryTxt;
    @JsonProperty("assetType")
    private String assetTypeTxt;
    @JsonProperty("vehicleInfo")
    private String vehicleInfoTxt;
    @JsonProperty("designation")
    private String designationTxt;
    @JsonProperty("purchaseDate")
    private String purchaseDateTxt;

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

    public String getAssetTypeTxt() {
        return assetTypeTxt;
    }

    public void setAssetTypeTxt(String assetTypeTxt) {
        this.assetTypeTxt = assetTypeTxt;
    }

    public String getVehicleInfoTxt() {
        return vehicleInfoTxt;
    }

    public void setVehicleInfoTxt(String vehicleInfoTxt) {
        this.vehicleInfoTxt = vehicleInfoTxt;
    }

    public String getDesignationTxt() {
        return designationTxt;
    }

    public void setDesignationTxt(String designationTxt) {
        this.designationTxt = designationTxt;
    }

    public String getPurchaseDateTxt() {
        return purchaseDateTxt;
    }

    public void setPurchaseDateTxt(String purchaseDateTxt) {
        this.purchaseDateTxt = purchaseDateTxt;
    }

}
