package com.jasper.reports.model;


import lombok.Getter;
import lombok.Setter;
import lombok.val;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KGAMB02R extends BaseModel {
    private String clientPrograms;

    private double oneClientFraud;
    private double oneClientNonFraud;
    private double oneClientAdministrative;

    private double twoClientFraud;
    private double twoClientNonFraud;
    private double twoClientAdministrative;

    private double threeClientFraud;
    private double threeClientNonFraud;
    private double threeClientAdministrative;

    private double fourClientFraud;
    private double fourClientNonFraud;
    private double fourClientAdministrative;

    private double fiveClientFraud;
    private double fiveClientNonFraud;
    private double fiveClientAdministrative;

    private double sixClientFraud;
    private double sixClientNonFraud;
    private double sixClientAdministrative;

    private double sevenClientFraud;
    private double sevenClientNonFraud;
    private double sevenClientAdministrative;

    private double eightClientFraud;
    private double eightClientNonFraud;
    private double eightClientAdministrative;

    private double nineClientFraud;
    private double nineClientNonFraud;
    private double nineClientAdministrative;

    private double tenClientFraud;
    private double tenClientNonFraud;
    private double tenClientAdministrative;

    private double elevenClientFraud;
    private double elevenClientNonFraud;
    private double elevenClientAdministrative;

    private double twelveClientFraud;
    private double twelveClientNonFraud;
    private double twelveClientAdministrative;

    private double thirteenClientFraud;
    private double thirteenClientNonFraud;
    private double thirteenClientAdministrative;

    private double fourteenClientFraud;
    private double fourteenClientNonFraud;
    private double fourteenClientAdministrative;

    private double fifteenClientFraud;
    private double fifteenClientNonFraud;
    private double fifteenClientAdministrative;

    private double sixteenClientFraud;
    private double sixteenClientNonFraud;
    private double sixteenClientAdministrative;

    private double clientsWaived;

    public KGAMB02R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.clientPrograms = values[0];
        this.oneClientFraud = (StringUtils.isEmpty(values[1]))?0:Double.parseDouble(values[1]);
        this.oneClientNonFraud = (StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2]);
        this.oneClientAdministrative = (StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3]);
        this.twoClientFraud = (StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4]);
        this.twoClientNonFraud = (StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5]);
        this.twoClientAdministrative = (StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6]);
        this.threeClientFraud = (StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7]);
        this.threeClientNonFraud = (StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8]);
        this.threeClientAdministrative = (StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9]);
        this.fourClientFraud = (StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10]);
        this.fourClientNonFraud = (StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11]);
        this.fourClientAdministrative = (StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12]);
        this.fiveClientFraud = (StringUtils.isEmpty(values[13]))?0:Double.parseDouble(values[13]);
        this.fiveClientNonFraud = (StringUtils.isEmpty(values[14]))?0:Double.parseDouble(values[14]);
        this.fiveClientAdministrative = (StringUtils.isEmpty(values[15]))?0:Double.parseDouble(values[15]);
        this.sixClientFraud = (StringUtils.isEmpty(values[16]))?0:Double.parseDouble(values[16]);
        this.sixClientNonFraud = (StringUtils.isEmpty(values[17]))?0:Double.parseDouble(values[17]);
        this.sixClientAdministrative = (StringUtils.isEmpty(values[18]))?0:Double.parseDouble(values[18]);
        this.sevenClientFraud = (StringUtils.isEmpty(values[19]))?0:Double.parseDouble(values[19]);
        this.sevenClientNonFraud = (StringUtils.isEmpty(values[20]))?0:Double.parseDouble(values[20]);
        this.sevenClientAdministrative = (StringUtils.isEmpty(values[21]))?0:Double.parseDouble(values[21]);
        this.eightClientFraud = (StringUtils.isEmpty(values[22]))?0:Double.parseDouble(values[22]);
        this.eightClientNonFraud = (StringUtils.isEmpty(values[23]))?0:Double.parseDouble(values[23]);
        this.eightClientAdministrative = (StringUtils.isEmpty(values[24]))?0:Double.parseDouble(values[24]);
        this.nineClientFraud = (StringUtils.isEmpty(values[25]))?0:Double.parseDouble(values[25]);
        this.nineClientNonFraud = (StringUtils.isEmpty(values[26]))?0:Double.parseDouble(values[26]);
        this.nineClientAdministrative = (StringUtils.isEmpty(values[27]))?0:Double.parseDouble(values[27]);
        this.tenClientFraud = (StringUtils.isEmpty(values[28]))?0:Double.parseDouble(values[28]);
        this.tenClientNonFraud = (StringUtils.isEmpty(values[29]))?0:Double.parseDouble(values[29]);
        this.tenClientAdministrative = (StringUtils.isEmpty(values[30]))?0:Double.parseDouble(values[30]);
        this.elevenClientFraud = (StringUtils.isEmpty(values[31]))?0:Double.parseDouble(values[31]);
        this.elevenClientNonFraud = (StringUtils.isEmpty(values[32]))?0:Double.parseDouble(values[32]);
        this.elevenClientAdministrative = (StringUtils.isEmpty(values[33]))?0:Double.parseDouble(values[33]);
        this.twelveClientFraud = (StringUtils.isEmpty(values[34]))?0:Double.parseDouble(values[34]);
        this.twelveClientNonFraud = (StringUtils.isEmpty(values[35]))?0:Double.parseDouble(values[35]);
        this.twelveClientAdministrative = (StringUtils.isEmpty(values[36]))?0:Double.parseDouble(values[36]);
        this.thirteenClientFraud = (StringUtils.isEmpty(values[37]))?0:Double.parseDouble(values[37]);
        this.thirteenClientNonFraud = (StringUtils.isEmpty(values[38]))?0:Double.parseDouble(values[38]);
        this.thirteenClientAdministrative = (StringUtils.isEmpty(values[39]))?0:Double.parseDouble(values[39]);
        this.fourteenClientFraud = (StringUtils.isEmpty(values[40]))?0:Double.parseDouble(values[40]);
        this.fourteenClientNonFraud = (StringUtils.isEmpty(values[41]))?0:Double.parseDouble(values[41]);
        this.fourteenClientAdministrative = (StringUtils.isEmpty(values[42]))?0:Double.parseDouble(values[42]);
        this.fifteenClientFraud = (StringUtils.isEmpty(values[43]))?0:Double.parseDouble(values[43]);
        this.fifteenClientNonFraud = (StringUtils.isEmpty(values[44]))?0:Double.parseDouble(values[44]);
        this.fifteenClientAdministrative = (StringUtils.isEmpty(values[45]))?0:Double.parseDouble(values[45]);
        this.sixteenClientFraud = (StringUtils.isEmpty(values[46]))?0:Double.parseDouble(values[46]);
        this.sixteenClientNonFraud = (StringUtils.isEmpty(values[47]))?0:Double.parseDouble(values[47]);
        this.sixteenClientAdministrative = (StringUtils.isEmpty(values[48]))?0:Double.parseDouble(values[48]);
        if (values.length==50)//no need of else as default value for double is 0 and not null
            this.clientsWaived = (ObjectUtils.isEmpty(values[49]))?0:Double.parseDouble(values[49]);
    }
}