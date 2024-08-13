package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHPA1J2R extends BaseModel {

    private String unitNumTxt;
    private String caseNumTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private String benefitTypeTxt;
    private double oldBenefitAmt;
    private double newBenefitAmt;
    public KHPA1J2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.unitNumTxt = values.length>=1?(StringUtils.isEmpty(values[0]))?"":values[0]:"";
        this.caseNumTxt = values.length>=2?(StringUtils.isEmpty(values[1]))?"":values[1]:"";
        this.caseLastNameTxt = values.length>=3?(StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase():"";
        this.caseFirstNameTxt = values.length>=4?(StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase():"";
        this.caseMiddleInitialTxt = values.length>=5?(StringUtils.isEmpty(values[4]))?"":values[4].toUpperCase():"";
        this.benefitTypeTxt = values.length>=6?(StringUtils.isEmpty(values[5]))?"":values[5]:"";
        this.oldBenefitAmt = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
        this.newBenefitAmt = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
    }
}