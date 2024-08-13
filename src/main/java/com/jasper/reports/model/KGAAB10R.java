package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAAB10R extends BaseModel {

    private String firstNameTxt;
    private String middleInitialTxt;
    private String lastNameTxt;
    private String clientNumber;
    private String ssnTxt;
    private double balanceAmount;
    private String errorTxt;

    public KGAAB10R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.clientNumber = values[3];
        this.ssnTxt = values[4];
        this.balanceAmount = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.errorTxt = values.length==7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
    }
}
