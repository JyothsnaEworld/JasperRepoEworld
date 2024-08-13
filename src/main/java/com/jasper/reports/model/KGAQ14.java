package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAQ14 extends BaseModel {

    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String clientNumTxt;
    private String ssnTxt;
    private String sysIdTxt;
    private String caseNumTxt;
    private String programTypeNumTxt;
    private String errorTypeTxt;
    private double balanceAmount;
    private String recentPaymentDateTxt;
    private String statusTxt;
    private String statementFlagTxt;
    private String line1Txt;
    private String line2Txt;
    private String line3Txt;
    private String cityTxt;
    private String stateTxt;
    private String zipTxt;

    public KGAQ14(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.clientNumTxt = values.length>=4?values[3]:"";
        this.ssnTxt = values.length>=5?values[4]:"";
        this.sysIdTxt = values.length>=6?values[5]:"";
        this.caseNumTxt = values.length>=7?values[6]:"";
        this.programTypeNumTxt = values.length>=8?values[7]:"";
        this.errorTypeTxt = values.length>=9?values[8]:"";
        this.balanceAmount = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.recentPaymentDateTxt = values.length>=11?values[10]:"";
        this.statusTxt = values.length>=12?values[11]:"";
        this.statementFlagTxt = values.length>=13?values[12]:"";
        this.line1Txt = values.length>=14?values[13]:"";
        this.line2Txt = values.length>=15?values[14]:"";
        this.line3Txt = values.length>=16?values[15]:"";
        this.cityTxt = values.length>=17?values[16]:"";
        this.stateTxt = values.length>=18?values[17]:"";
        this.zipTxt = values.length>=19?values[18]:"";
    }
}
