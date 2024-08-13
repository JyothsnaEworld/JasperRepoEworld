package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAWF03R extends BaseModel {

    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String ssnTxt;
    private String topClaimNumTxt;
    private String lastPaymentDate;
    private String delinquentDate;
    private double topAmount;
    private double adjustmentAmount;
    private String closedInactiveTxt;
    private String messageTxt;
    private String claimTypeTxt;

    public KGAWF03R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
        this.ssnTxt = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3]):"";
        this.topClaimNumTxt = values.length>=5?(StringUtils.isEmpty(values[4])?"":values[4]):"";
        this.lastPaymentDate = values.length>=6?(StringUtils.isEmpty(values[5])?"":values[5]):"";
        this.delinquentDate = values.length>=7?(StringUtils.isEmpty(values[6])?"":values[6]):"";
        this.topAmount = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.adjustmentAmount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.closedInactiveTxt = values.length>=10?(StringUtils.isEmpty(values[9])?"":values[9]):"";
        this.messageTxt = values.length>=11?(StringUtils.isEmpty(values[10])?"":values[10]):"";
        this.claimTypeTxt = values.length>=12?(StringUtils.isEmpty(values[11])?"":values[11]):"";
    }
}