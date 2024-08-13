package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHPA1J3R extends BaseModel {

    private String unitNumTxt;
    private String unitNameTxt;
    private String programTypeTxt;
    //TOTAL OPEN/SUSPENDED CASES NOT SELECTED
    private Integer numCases1;
    private Double oldBenAmt1;
    private Double newBenAmt1;
    //CASES WHICH COULD NOT BE PROCESSED
    private Integer numCases2;
    private Double oldBenAmt2;
    private Double newBenAmt2;
    //TOTAL NUMBER OF CASES PROCESSED
    private Integer numCases3;
    private Double oldBenAmt3;
    private Double newBenAmt3;
    //CASES UNAFFECTED AFTER PROCESSING
    private Integer numCases4;
    private Double oldBenAmt4;
    private Double newBenAmt4;
    //CASES WITH BENEFIT REDUCTIONS
    private Integer numCases5;
    private Double oldBenAmt5;
    private Double newBenAmt5;
    //CASES WITH THEIR BENEFITS INCREASED
    private Integer numCases6;
    private Double oldBenAmt6;
    private Double newBenAmt6;
    //CASES WHICH ARE NOW INELIGIBLE
    private Integer numCases7;
    private Double oldBenAmt7;
    private Double newBenAmt7;
    //NET CHANGE IN PROGRAMS
    private Integer numCases8;
    private Double oldBenAmt8;
    private Double newBenAmt8;

    public KHPA1J3R(){

    }

    public void setProperties(String[] values) {
        this.unitNumTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.unitNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.programTypeTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        //TOTAL OPEN/SUSPENDED CASES NOT SELECTED
        this.numCases1 = values.length>=4?((StringUtils.isEmpty(values[3]))?null:Integer.parseInt(values[3])):null;
        this.oldBenAmt1 = values.length>=5?((StringUtils.isEmpty(values[4]))?null:Double.parseDouble(values[4])):null;
        this.newBenAmt1 = values.length>=6?((StringUtils.isEmpty(values[5]))?null:Double.parseDouble(values[5])):null;
        //CASES WHICH COULD NOT BE PROCESSED
        this.numCases2 = values.length>=7?((StringUtils.isEmpty(values[6]))?null:Integer.parseInt(values[6])):null;
        this.oldBenAmt2 = values.length>=8?((StringUtils.isEmpty(values[7]))?null:Double.parseDouble(values[7])):null;
        this.newBenAmt2 = values.length>=9?((StringUtils.isEmpty(values[8]))?null:Double.parseDouble(values[8])):null;
        //TOTAL NUMBER OF CASES PROCESSED
        this.numCases3 = values.length>=10?((StringUtils.isEmpty(values[9]))?null:Integer.parseInt(values[9])):null;
        this.oldBenAmt3 = values.length>=11?((StringUtils.isEmpty(values[10]))?null:Double.parseDouble(values[10])):null;
        this.newBenAmt3 = values.length>=12?((StringUtils.isEmpty(values[11]))?null:Double.parseDouble(values[11])):null;
        //CASES UNAFFECTED AFTER PROCESSING
        this.numCases4 = values.length>=13?((StringUtils.isEmpty(values[12]))?null:Integer.parseInt(values[12])):null;
        this.oldBenAmt4 = values.length>=14?((StringUtils.isEmpty(values[13]))?null:Double.parseDouble(values[13])):null;
        this.newBenAmt4 = values.length>=15?((StringUtils.isEmpty(values[14]))?null:Double.parseDouble(values[14])):null;
        //CASES WITH BENEFIT REDUCTIONS
        this.numCases5 = values.length>=16?((StringUtils.isEmpty(values[15]))?null:Integer.parseInt(values[15])):null;
        this.oldBenAmt5 = values.length>=17?((StringUtils.isEmpty(values[16]))?null:Double.parseDouble(values[16])):null;
        this.newBenAmt5 = values.length>=18?((StringUtils.isEmpty(values[17]))?null:Double.parseDouble(values[17])):null;
        //CASES WITH THEIR BENEFITS INCREASED
        this.numCases6 = values.length>=19?((StringUtils.isEmpty(values[18]))?null:Integer.parseInt(values[18])):null;
        this.oldBenAmt6 = values.length>=20?((StringUtils.isEmpty(values[19]))?null:Double.parseDouble(values[19])):null;
        this.newBenAmt6 = values.length>=21?((StringUtils.isEmpty(values[20]))?null:Double.parseDouble(values[20])):null;
        //CASES WHICH ARE NOW INELIGIBLE
        this.numCases7 = values.length>=22?((StringUtils.isEmpty(values[21]))?null:Integer.parseInt(values[21])):null;
        this.oldBenAmt7 = values.length>=23?((StringUtils.isEmpty(values[22]))?null:Double.parseDouble(values[22])):null;
        this.newBenAmt7 = values.length>=24?((StringUtils.isEmpty(values[23]))?null:Double.parseDouble(values[23])):null;
        //NET CHANGE IN PROGRAMS
        this.numCases8 = values.length>=25?((StringUtils.isEmpty(values[24]))?null:Integer.parseInt(values[24])):null;
        this.oldBenAmt8 = values.length>=26?((StringUtils.isEmpty(values[25]))?null:Double.parseDouble(values[25])):null;
        this.newBenAmt8 = values.length>=27?((StringUtils.isEmpty(values[26]))?null:Double.parseDouble(values[26])):null;
    }
}