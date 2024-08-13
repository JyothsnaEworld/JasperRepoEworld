package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssetLiquid extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("relationshipToPrimary")
    private String relationshipToPrimaryTxt;
    @JsonProperty("assetType")
    private String assetTypeTxt;
    @JsonProperty("bankBranchName")
    private String bankBranchNameTxt;
    @JsonProperty("accountNumber")
    private String accountNumberTxt;
    @JsonProperty("designation")
    private String designationTxt;

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

    public String getBankBranchNameTxt() {
        return bankBranchNameTxt;
    }

    public void setBankBranchNameTxt(String bankBranchNameTxt) {
        this.bankBranchNameTxt = bankBranchNameTxt;
    }

    public String getAccountNumberTxt() {
        return accountNumberTxt;
    }

    public void setAccountNumberTxt(String accountNumberTxt) {
        this.accountNumberTxt = accountNumberTxt;
    }

    public String getDesignationTxt() {
        return designationTxt;
    }

    public void setDesignationTxt(String designationTxt) {
        this.designationTxt = designationTxt;
    }
}
