package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGF1P2R extends BaseModel {

    private String caseStatusTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private String caseNumberTxt;
    private String piSsnTxt;
    private String unitNumberTxt;
    private double ebtBalanceAmount;
    private double hawiFSBalanceAmount;
    private double arsFSBalanceAmount;

    public KHGF1P2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.caseStatusTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0]):"";
        this.caseLastNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
        this.caseFirstNameTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
        this.caseMiddleInitialTxt = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3].toUpperCase()):"";
        this.caseNumberTxt = values.length>=5?(StringUtils.isEmpty(values[4])?"":values[4]):"";
        this.piSsnTxt = values.length>=6?(StringUtils.isEmpty(values[5])?"":values[5]):"";
        this.unitNumberTxt = values.length>=7?(StringUtils.isEmpty(values[6])?"":values[6]):"";
        this.ebtBalanceAmount = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.hawiFSBalanceAmount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.arsFSBalanceAmount = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
    }
}
