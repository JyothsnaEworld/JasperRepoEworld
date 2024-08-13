package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGE7M2R extends BaseModel {

    private String dailyDateTxt;
    private String benefitTypeTxt;
    private String caseNumTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private String ebtAccountNumTxt;
    private double debitAmount;
    private double accountBalanceAmount;
    private String transactionDateTxt;
    private String transactionTimeTxt;
    private String processingCenterNumTxt;

    public KHGE7M2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.dailyDateTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.benefitTypeTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.caseNumTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2]:"";
        this.caseLastNameTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase():"";
        this.caseFirstNameTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4].toUpperCase():"";
        this.caseMiddleInitialTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5].toUpperCase():"";
        this.ebtAccountNumTxt = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6]:"";
        this.debitAmount = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.accountBalanceAmount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.transactionDateTxt = values.length>=10?(StringUtils.isEmpty(values[9])) ? "" : values[9]:"";
        this.transactionTimeTxt = values.length>=11?(StringUtils.isEmpty(values[10])) ? "" : values[10]:"";
        this.processingCenterNumTxt = values.length>=12?(StringUtils.isEmpty(values[11])) ? "" : values[11]:"";
    }
}
