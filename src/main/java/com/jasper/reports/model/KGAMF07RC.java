package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMF07RC extends BaseModel {

    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String ssnNumber;
    private double debtAmount;
    private String judgementClaims;

    public KGAMF07RC(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.ssnNumber = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3]):"";
        this.debtAmount = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4])):0;
        this.judgementClaims = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5]):"";
    }
}
