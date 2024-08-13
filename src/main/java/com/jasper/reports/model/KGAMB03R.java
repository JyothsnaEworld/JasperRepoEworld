package com.jasper.reports.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KGAMB03R extends BaseModel {
    private String clientPrograms;
    private double oneClientFraud;
    private double oneClientNonFraud;
    private double oneClientAdministrative;
    private double oneClientNegative;
    private double twoClientFraud;
    private double twoClientNonFraud;
    private double twoClientAdministrative;
    private double twoClientNegative;
    private double threeClientFraud;
    private double threeClientNonFraud;
    private double threeClientAdministrative;
    private double threeClientNegative;

    public KGAMB03R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        //this.prgNum = values[0];
        this.clientPrograms = values[0];
        this.oneClientFraud = (StringUtils.isEmpty(values[1]))?0:Double.parseDouble(values[1]);
        this.oneClientNonFraud = (StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2]);
        this.oneClientAdministrative = (StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3]);
        this.oneClientNegative = (StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4]);
        this.twoClientFraud = (StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5]);
        this.twoClientNonFraud = (StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6]);
        this.twoClientAdministrative = (StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7]);
        this.twoClientNegative = (StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8]);
        this.threeClientFraud = (StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9]);
        this.threeClientNonFraud = (StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10]);
        this.threeClientAdministrative = (StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11]);
        if (values.length==13)//no need of else as default value for double is 0 and not null
            this.threeClientNegative = (StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12]);
    }
}