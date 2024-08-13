package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB23RA extends BaseModel {


    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String clientLastNameTxt;
    private String taxIdTxt;
    private String transType;
    private String paymentDate;
    private String depositNumTxt;
    private String claimType;
    private String pgmType;
    private String errorType;
    private String errorDate;
    private double cpAmt;
    private double dsAmt;

    public KGADB23RA(){

    }

    @Override
    public void setProperties(String[] values) {
        this.clientFirstNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.clientMiddleInitialTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.clientLastNameTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.taxIdTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3]):"";
        this.transType = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        this.cpAmt = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.paymentDate = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
        this.depositNumTxt = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7]):"";
        this.claimType = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
        this.pgmType =  values.length>=10?((StringUtils.isEmpty(values[9]))?"":values[9]):"";
        this.errorType = values.length>=11?((StringUtils.isEmpty(values[10]))?"":values[10]):"";
        this.errorDate = values.length>=12?((StringUtils.isEmpty(values[11]))?"":values[11]):"";
        this.dsAmt = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
    }
}
