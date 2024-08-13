package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB23RB extends BaseModel {

    private String programType;
    private String stateFiscalYearTxt;
    private String errorType;
    private double cashAmount;
    private double debtSetoffAmount;

    public KGADB23RB(){

    }

    @Override
    public void setProperties(String[] values) {
        this.programType = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.stateFiscalYearTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.errorType = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.cashAmount = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
        this.debtSetoffAmount = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4])):0;

    }
}
