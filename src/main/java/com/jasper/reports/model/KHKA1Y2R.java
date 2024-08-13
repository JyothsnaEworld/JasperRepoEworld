package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHKA1Y2R extends BaseModel {


    private String ebtType;
    private String availabilityDate;
    private double issuedAmount;
    private double numOfRecords;

    public KHKA1Y2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.ebtType = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.availabilityDate = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.issuedAmount = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2])):0;
        this.numOfRecords = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
    }
}
