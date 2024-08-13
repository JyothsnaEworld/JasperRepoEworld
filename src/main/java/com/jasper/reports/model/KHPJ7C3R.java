package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHPJ7C3R extends BaseModel {

    private String monthInQuarterTxt;
    private Integer numTotalCases;
    private Integer numFedCases;

    public KHPJ7C3R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.monthInQuarterTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.numTotalCases = values.length>=2?(StringUtils.isEmpty(values[1])) ? 0 : Integer.parseInt(values[1]):0;
        this.numFedCases = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]):0;
    }
}