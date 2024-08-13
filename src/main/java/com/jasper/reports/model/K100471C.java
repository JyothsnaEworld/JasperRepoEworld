package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class K100471C extends BaseModel {

    private String txtRptMonth;
    private double num0FedIssuedAmt;
    private double num0SegIssuedAmt;
    private double num1FedIssuedAmt;
    private double num1SegIssuedAmt;
    private double num2FedIssuedAmt;
    private double num2SegIssuedAmt;
    public K100471C() {

    }

    @Override
    public void setProperties(String[] values) {
        this.txtRptMonth = values.length>=1?values[0]:"";
        this.num0FedIssuedAmt = values.length>=2?(StringUtils.isEmpty(values[1]))?0:Double.parseDouble(values[1]):0;
        this.num0SegIssuedAmt = values.length>=3?(StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2]):0;
        this.num1FedIssuedAmt = values.length>=4?(StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3]):0;
        this.num1SegIssuedAmt = values.length>=5?(StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4]):0;
        this.num2FedIssuedAmt = values.length>=6?(StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5]):0;
        this.num2SegIssuedAmt = values.length>=7?(StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6]):0;
    }
}
