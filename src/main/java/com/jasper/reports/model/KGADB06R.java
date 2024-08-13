package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB06R extends BaseModel {

    private String prgmType;
    private String transType;
    private String errorType;
    private String ssnNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String paymentDate;
    private double amount;

    public KGADB06R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.prgmType = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.transType = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.errorType = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.ssnNo = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3]):"";
        this.firstName = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4].toUpperCase()):"";
        this.middleName = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5].toUpperCase()):"";
        this.lastName = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6].toUpperCase()):"";
        this.paymentDate = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7]):"";
        this.amount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
    }
}
