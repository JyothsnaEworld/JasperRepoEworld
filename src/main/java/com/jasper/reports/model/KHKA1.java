package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHKA1 extends BaseModel {
    private String accountingCode;
    private String benefitType;
    private String sectionOrUnit;
    private Integer numberOfCases;
    private Integer numberOfAdults;
    private Integer numberOfChildren;
    private double issuedAmount;

    public KHKA1() {
    }

    @Override
    public void setProperties(String[] values) {
        this.accountingCode = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.benefitType = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.sectionOrUnit = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? "" : values[2] : "";
        this.numberOfCases = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3]) : 0;
        this.numberOfAdults = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]) : 0;
        this.numberOfChildren = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? 0 : Integer.parseInt(values[5]) : 0;
        this.issuedAmount = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
    }
}