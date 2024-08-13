package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB02R2 extends BaseModel {

    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String taxIdTxt;
    private String transType;
    private String paymentDate;
    private String depositClaim;
    private String claimType;
    private String pgmTypes;
    private String errTypeTxt;
    private String errorDate;
    private double claimAmount;

    public KGADB02R2(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.taxIdTxt = values.length>=4?values[3]:"";
        this.transType = values.length>=5?values[4]:"";
        this.paymentDate = values.length>=6?values[5]:"";
        this.depositClaim = values.length>=7?values[6]:"";
        this.claimType = values.length>=8?values[7]:"";
        this.pgmTypes = values.length>=9?values[8]:"";
        this.errTypeTxt = values.length>=10?values[9]:"";
        this.errorDate = values.length>=11?values[10]:"";
        this.claimAmount = values.length==12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
    }
}
