package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAWF01RB extends BaseModel {


    private String taxIdTxt;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String claimNumTxt;
    private String errorTypeTxt;
    private String paymentDateTxt;
    private String traceNumTxt;
    private double transAmount;
    private double feesAmount;
    private String addlTraceNumDtlsTxt;
    private String transTypeTxt;

    public KGAWF01RB(){

    }

    @Override
    public void setProperties(String[] values) {
        this.taxIdTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0]):"";
        this.lastNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
        this.firstNameTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
        this.middleInitialTxt = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3].toUpperCase()):"";
        this.claimNumTxt = values.length>=5?(StringUtils.isEmpty(values[4])?"":values[4]):"";
        this.errorTypeTxt = values.length>=6?(StringUtils.isEmpty(values[5])?"":values[5]):"";
        this.paymentDateTxt = values.length>=7?(StringUtils.isEmpty(values[6])?"":values[6]):"";
        this.traceNumTxt = values.length>=8?(StringUtils.isEmpty(values[7])?"":values[7]):"";
        this.transAmount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.feesAmount = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.addlTraceNumDtlsTxt = values.length>=11?(StringUtils.isEmpty(values[10])?"":values[10]):"";
        this.transTypeTxt = values.length>=12?(StringUtils.isEmpty(values[11])?"":values[11]):"";
    }
}
