package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGE7V2R extends BaseModel {

    private String dailyDateTxt;
    private String benefitTypeTxt;
    private String caseNumTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private double expungedAmount;

    public KHGE7V2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.dailyDateTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.benefitTypeTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.caseNumTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2]:"";
        this.caseLastNameTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase():"";
        this.caseFirstNameTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4].toUpperCase():"";
        this.caseMiddleInitialTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5].toUpperCase():"";
        this.expungedAmount = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
    }
}