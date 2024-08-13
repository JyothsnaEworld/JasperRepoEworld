package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KGAMB09R extends BaseModel {
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String taxIdTxt;
    private double pastDueAmt90DaysTo1Yr;
    private double pastDueAmt1YrTo3Yrs;
    private double pastDueAmtOver3Yrs;
    private String lastPymntDtTxt;
    private String isTopClaim;

    public KGAMB09R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.clientLastNameTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0].toUpperCase()):"";
        this.clientFirstNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
        this.clientMiddleInitialTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
        this.taxIdTxt = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3]):"";
        this.pastDueAmt90DaysTo1Yr = values.length>=5?(StringUtils.isEmpty(values[4]) ? 0 : Double.parseDouble(values[4])):0;
        this.pastDueAmt1YrTo3Yrs = values.length>=6?(StringUtils.isEmpty(values[5]) ? 0 : Double.parseDouble(values[5])):0;
        this.pastDueAmtOver3Yrs = values.length>=7?(StringUtils.isEmpty(values[6]) ? 0 : Double.parseDouble(values[6])):0;
        this.lastPymntDtTxt = values.length>=8?(StringUtils.isEmpty(values[7])?"":values[7]):"";
        this.isTopClaim = values.length>=9?(StringUtils.isEmpty(values[8])?"":values[8]):"";
    }
}