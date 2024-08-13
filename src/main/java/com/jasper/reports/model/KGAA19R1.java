package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAA19R1 extends BaseModel {


    private String ssnNumber;
    private String clientNumber;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private double writeOffAmount;
    private String paymentPostedDate;

    public KGAA19R1(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.ssnNumber = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3]):"";
        this.clientNumber = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        this.writeOffAmount = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.paymentPostedDate = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
    }
}
