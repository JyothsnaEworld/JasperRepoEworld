package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KHFT1 extends BaseModel {
    private String pcTxt;
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String caseNumTxt;
    private String prgrmTxt;
    private String benefitYearMonthTxt;
    public KHFT1() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.pcTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.clientLastNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1].toUpperCase():"";
        this.clientFirstNameTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2].toUpperCase():"";
        this.clientMiddleInitialTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase():"";
        this.caseNumTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4]:"";
        this.prgrmTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5]:"";
        this.benefitYearMonthTxt = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6]:"";//yyyyMM format
    }
}
