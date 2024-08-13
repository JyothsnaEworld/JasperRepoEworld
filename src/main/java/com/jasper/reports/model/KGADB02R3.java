package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB02R3 extends BaseModel {

    private String programType;
    private String stateFiscalYearTxt;
    private String errorType;
    private double amount;

    public KGADB02R3(){

    }

    @Override
    public void setProperties(String[] values) {

        this.programType = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.stateFiscalYearTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.errorType = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.amount = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;

    }
}
