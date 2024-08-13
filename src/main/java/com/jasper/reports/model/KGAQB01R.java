package com.jasper.reports.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
public class KGAQB01R extends BaseModel {

    private String errTxt;
    private double begBalNum;
    private double newlyEstablishedNum;
    private double transferNum;
    private double closedNum;
    private double terminatedNum;
    private double compromisedNum;
    private double begBalAmt;
    private double balAdjAmt;
    private double newlyEstablishedAmt;
    private double transferAmt;
    private double terminatedAmt;
    private double compromisedAmt;
    private double collectionAmt;
    private double cashCheckMoAmt;
    private double foodStampsAmt;
    private double recoupmentAmt;
    private double offsetAmt;
    private double cashRefundsAmt;
    private double nonCashRefundsAmt;

    public KGAQB01R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {

        this.errTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.begBalNum = values.length>=2?((StringUtils.isEmpty(values[1]))?0:Double.parseDouble(values[1])):0;
        this.newlyEstablishedNum = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2])):0;
        this.transferNum = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
        this.closedNum = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4])):0;
        this.terminatedNum = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.compromisedNum = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
        this.begBalAmt = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.balAdjAmt = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.newlyEstablishedAmt = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.transferAmt = values.length>=11?((StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10])):0;
        this.terminatedAmt = values.length>=12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
        this.compromisedAmt = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.collectionAmt = values.length>=14?((StringUtils.isEmpty(values[13]))?0:Double.parseDouble(values[13])):0;
        this.cashCheckMoAmt = values.length>=15?((StringUtils.isEmpty(values[14]))?0:Double.parseDouble(values[14])):0;
        this.foodStampsAmt = values.length>=16?((StringUtils.isEmpty(values[15]))?0:Double.parseDouble(values[15])):0;
        this.recoupmentAmt = values.length>=17?((StringUtils.isEmpty(values[16]))?0:Double.parseDouble(values[16])):0;
        this.offsetAmt = values.length>=18?((StringUtils.isEmpty(values[17]))?0:Double.parseDouble(values[17])):0;
        this.cashRefundsAmt = values.length>=19?((StringUtils.isEmpty(values[18]))?0:Double.parseDouble(values[18])):0;
        this.nonCashRefundsAmt = values.length>=20?((StringUtils.isEmpty(values[19]))?0:Double.parseDouble(values[19])):0;

    }
}