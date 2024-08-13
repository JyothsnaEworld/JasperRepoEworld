package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Getter
@Setter
@NoArgsConstructor
public class KGAMB12R extends BaseModel{

    private String prgTxt;
    private Double begBalAccRec;
    private Double begBalAdj;
    private Double newCases;
    private Double collCash;
    private Double collCashDebt;
    private Double grnshmnts;
    private Double nonCashFdStmp;
    private Double nonCashBnftRed;
    private Double cashBnftRed;
    private Double noncashOffPrBnft;
    private Double rfndCash;
    private Double rfndCashDebt;
    private Double rcpmnts;
    private Double othrRductnWvr;
    private Double termntn;
    private Double legalComp;
    private Integer noOfCases;
    private Integer undupCases;

    public void setProperties(String[] values) {
        this.prgTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.begBalAccRec = values.length>=2?(StringUtils.isEmpty(values[1])) ? 0 : Double.parseDouble(values[1]) : 0;
        this.begBalAdj = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Double.parseDouble(values[2]) : 0;
        this.newCases = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.collCash = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.collCashDebt = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.grnshmnts = values.length>=7?(StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
        this.nonCashFdStmp = values.length>=8?(StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
        this.nonCashBnftRed = values.length>=9?(StringUtils.isEmpty(values[8])) ? 0 : Double.parseDouble(values[8]) : 0;
        this.cashBnftRed = values.length>=10?(StringUtils.isEmpty(values[9])) ? 0 : Double.parseDouble(values[9]) : 0;
        this.noncashOffPrBnft = values.length>=11?(StringUtils.isEmpty(values[10])) ? 0 : Double.parseDouble(values[10]) : 0;
        this.rfndCash = values.length>=12?(StringUtils.isEmpty(values[11])) ? 0 : Double.parseDouble(values[11]) : 0;
        this.rfndCashDebt = values.length>=13?(StringUtils.isEmpty(values[12])) ? 0 : Double.parseDouble(values[12]) : 0;
        this.rcpmnts = values.length>=14?(StringUtils.isEmpty(values[13])) ? 0 : Double.parseDouble(values[13]) : 0;
        this.othrRductnWvr = values.length>=15?(StringUtils.isEmpty(values[14])) ? 0 : Double.parseDouble(values[14]) : 0;
        this.termntn = values.length>=16?(StringUtils.isEmpty(values[15])) ? 0 : Double.parseDouble(values[15]) : 0;
        this.legalComp = values.length>=17?(StringUtils.isEmpty(values[16])) ? 0 : Double.parseDouble(values[16]) : 0;
        this.noOfCases = values.length>=18?(StringUtils.isEmpty(values[17])) ? 0 : Integer.parseInt(values[17]) : 0;
        this.undupCases = values.length>=19?(StringUtils.isEmpty(values[18])) ? 0 : Integer.parseInt(values[18]) : 0;
        
    }

}
