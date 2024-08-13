package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
public class K100471S extends BaseModel {
    private String pcTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private String caseNumTxt;
    private String benefitMonthYearTxt;
    private String pfiTxt;
    private String messageTxt;
    public K100471S() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.pcTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.caseLastNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1].toUpperCase():"";
        this.caseFirstNameTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2].toUpperCase():"";
        this.caseMiddleInitialTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase():"";
        this.caseNumTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4]:"";
        this.benefitMonthYearTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5]:"";
        this.pfiTxt = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6]:"";
        this.messageTxt = values.length>=8?(StringUtils.isEmpty(values[7])) ? "" : values[7]:"";//MM/yyyy format
    }
}
