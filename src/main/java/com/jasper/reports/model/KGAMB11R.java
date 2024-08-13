package com.jasper.reports.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
public class KGAMB11R extends BaseModel {

    private String errorTxt;
    private double beginningNumber;
    private double newCasesNumber;
    private double changesNumber;
    private double closedCasesNumber;
    private double terminatedNumber;
    private double legalCompromiseNumber;
    private double beginningAmount;
    private double beginningBalAdjAmount;
    private double newCasesAmount;
    private double changesAmount;
    private double collectionsCashAmount;
    private double collectionsFoodStampsAmount;
    private double collectionsBenefitsReducedAmount;
    private double offsetPriorBenefitsAmount;
    private double refundsCashAmount;
    private double refundsRecoupmentAmount;
    private double terminatedAmount;
    private double legalCompromiseAmount;

    public KGAMB11R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {

        this.errorTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.beginningNumber = values.length>=2?((StringUtils.isEmpty(values[1]))?0:Double.parseDouble(values[1])):0;
        this.newCasesNumber = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2])):0;
        this.changesNumber = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
        this.closedCasesNumber = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4])):0;
        this.terminatedNumber = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.legalCompromiseNumber = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
        this.beginningAmount = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.beginningBalAdjAmount = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.newCasesAmount = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.changesAmount = values.length>=11?((StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10])):0;
        this.collectionsCashAmount = values.length>=12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
        this.collectionsFoodStampsAmount = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.collectionsBenefitsReducedAmount = values.length>=14?((StringUtils.isEmpty(values[13]))?0:Double.parseDouble(values[13])):0;
        this.offsetPriorBenefitsAmount = values.length>=15?((StringUtils.isEmpty(values[14]))?0:Double.parseDouble(values[14])):0;
        this.refundsCashAmount = values.length>=16?((StringUtils.isEmpty(values[15]))?0:Double.parseDouble(values[15])):0;
        this.refundsRecoupmentAmount = values.length>=17?((StringUtils.isEmpty(values[16]))?0:Double.parseDouble(values[16])):0;
        this.terminatedAmount = values.length>=18?((StringUtils.isEmpty(values[17]))?0:Double.parseDouble(values[17])):0;
        this.legalCompromiseAmount = values.length>=19?((StringUtils.isEmpty(values[18]))?0:Double.parseDouble(values[18])):0;

    }
}