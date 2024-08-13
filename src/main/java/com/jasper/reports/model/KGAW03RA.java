package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAW03RA extends BaseModel {


    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String ssnTxt;
    private String actionTxt;
    private String delinquentDate;
    private String debtClosedInd;
    private String judgeTxt;
    private double debtAmount;
    private String errorTxt;


    public KGAW03RA(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
        this.ssnTxt = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3]):"";
        this.actionTxt = values.length>=5?(StringUtils.isEmpty(values[4])?"":values[4]):"";
        this.delinquentDate = values.length>=6?(StringUtils.isEmpty(values[5])?"":values[5]):"";
        this.debtClosedInd = values.length>=7?(StringUtils.isEmpty(values[6])?"":values[6]):"";
        this.judgeTxt = values.length>=8?(StringUtils.isEmpty(values[7])?"":values[7]):"";
        this.debtAmount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.errorTxt = values.length>=10?(StringUtils.isEmpty(values[9])?"":values[9]):"";
    }
}