package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAQ14C1R extends BaseModel {

    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String clientNumTxt;
    private String ssnTxt;
    private String categoryNumTxt;
    private String reasonTxt;
    private String sidTxt;
    private String caseNumTxt;
    private String programTypeNumTxt;
    private String errorTypeTxt;
    private double balanceAmount;
    private String lastPaymentDateTxt;

    public KGAQ14C1R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.clientNumTxt = values.length>=4?values[3]:"";
        this.ssnTxt = values.length>=5?values[4]:"";
        this.categoryNumTxt = values.length>=6?values[5]:"";
        this.reasonTxt = values.length>=7?values[6]:"";
        this.sidTxt = values.length>=8?values[7]:"";
        this.caseNumTxt = values.length>=9?values[8]:"";
        this.programTypeNumTxt = values.length>=10?values[9]:"";
        this.errorTypeTxt = values.length>=11?values[10]:"";
        this.balanceAmount = values.length>=12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
        this.lastPaymentDateTxt = values.length>=13?values[12]:"";
    }
}
