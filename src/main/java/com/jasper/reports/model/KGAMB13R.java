package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMB13R extends BaseModel {

    private int orderVal;
    private String dateTxt;
    private String progType;
    private String errorType;
    private int progTypeCount;
    private double progTypeAmount;
    private String caseStatus;

    public KGAMB13R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.orderVal = values.length>=1?(StringUtils.isEmpty(values[0])) ? 0 :  Integer.parseInt(values[0]) : 0;
        this.dateTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" :  values[1].toUpperCase() : "";
        this.progType = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" :  values[2].toUpperCase() : "";
        this.errorType = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase() : "";
        this.progTypeCount = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]) : 0;
        this.progTypeAmount = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.caseStatus = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6].toUpperCase() : "";
    }
}
