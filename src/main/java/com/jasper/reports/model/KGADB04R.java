package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB04R extends BaseModel {
    private String transTypeTxt;
    private Integer numTransProcessed;
    private double transAmt;

    public KGADB04R(){

    }


    @Override
    public void setProperties(String[] values) {
        this.transTypeTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.numTransProcessed = values.length>=2?((StringUtils.isEmpty(values[1]))?0:Integer.parseInt(values[1])):0;
        this.transAmt = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2])):0;
    }
}
