package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KGADB11R extends BaseModel {
    private String prgNum;
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String taxIdTxt;
    private double fraudAmt;
    private double nonFraudAmt;
    private double agencyAmt;
    private String lastPymntDtTxt;
    public KGADB11R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.prgNum = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.clientLastNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.clientFirstNameTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.clientMiddleInitialTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.taxIdTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        this.fraudAmt = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.nonFraudAmt = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
        this.agencyAmt = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.lastPymntDtTxt=values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
    }
}
