package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class K100471A extends BaseModel {

    private String txtRptMonth;
    private Integer num0FedCaseCount;
    private double num0FedAuthAmount;
    private Integer num0SegCaseCount;
    private double num0SegAuthAmount;
    private Integer num1FedCaseCount;
    private double num1FedAuthAmount;
    private Integer num1SegCaseCount;
    private double num1SegAuthAmount;
    private Integer num2FedCaseCount;
    private double num2FedAuthAmount;
    private Integer num2SegCaseCount;
    private double num2SegAuthAmount;
    public K100471A() {

    }

    @Override
    public void setProperties(String[] values) {
        this.txtRptMonth = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.num0FedCaseCount = values.length>=2?(StringUtils.isEmpty(values[1])) ? 0 : Integer.parseInt(values[1]):0;
        this.num0FedAuthAmount = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Double.parseDouble(values[2]):0;
        this.num0SegCaseCount = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3]):0;
        this.num0SegAuthAmount = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]):0;
        this.num1FedCaseCount = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 : Integer.parseInt(values[5]):0;
        this.num1FedAuthAmount = values.length>=7?(StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]):0;
        this.num1SegCaseCount = values.length>=8?(StringUtils.isEmpty(values[7])) ? 0 : Integer.parseInt(values[7]):0;
        this.num1SegAuthAmount = values.length>=9?(StringUtils.isEmpty(values[8])) ? 0 : Double.parseDouble(values[8]):0;
        this.num2FedCaseCount = values.length>=10?(StringUtils.isEmpty(values[9])) ? 0 : Integer.parseInt(values[9]):0;
        this.num2FedAuthAmount = values.length>=11?(StringUtils.isEmpty(values[10])) ? 0 : Double.parseDouble(values[10]):0;
        this.num2SegCaseCount = values.length>=12?(StringUtils.isEmpty(values[11])) ? 0 : Integer.parseInt(values[11]):0;
        this.num2SegAuthAmount = values.length>=13?(StringUtils.isEmpty(values[12])) ? 0 : Double.parseDouble(values[12]):0;
    }
}
