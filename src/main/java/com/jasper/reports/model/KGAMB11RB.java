package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
public class KGAMB11RB extends BaseModel {
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String taxIdTxt;
    private String claimNbrTxt;
    private String lastPymntDtTxt;
    private double fraudAmt;
    private double nonFraudAmt;
    public KGAMB11RB() {}

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.clientLastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.clientFirstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.clientMiddleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.taxIdTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3]):"";
        this.claimNbrTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        this.lastPymntDtTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5]):"";
        this.fraudAmt = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
        this.nonFraudAmt = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
    }
}
