package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMB54R extends BaseModel {


    private String firstNameTxt;
    private String middleInitialTxt;
    private String lastNameTxt;
    private String monthEndingDate;
    private String progType;
    private String caseNumber;
    private String ssnNumber;
    private double pastDue1;
    private double pastDue2;
    private double pastDue3;
    private String lastPaymentDate;
    private String progCode;
    private String paymentCode;
    private String lastPaymentDateFlag;

    public KGAMB54R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.monthEndingDate = values.length>=1?values[0]:"";
        this.progType = values.length>=2?values[1]:"";
        this.firstNameTxt = values.length>=3?values[2]:"";
        this.middleInitialTxt = values.length>=4?values[3]:"";
        this.lastNameTxt = values.length>=5?values[4]:"";
        this.caseNumber = values.length>=6?values[5]:"";
        this.ssnNumber = values.length>=7?values[6]:"";
        this.pastDue1 = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.pastDue2 = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.pastDue3 = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.lastPaymentDate = values.length>=11?values[10]:"";
        this.progCode = values.length>=12?values[11]:"";
        this.paymentCode = values.length>=13?values[12]:"";
        this.lastPaymentDateFlag = values.length>=14?values[13]:"N";
    }
}
