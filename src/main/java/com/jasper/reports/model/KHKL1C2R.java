package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHKL1C2R extends BaseModel {

    private String caseNumberTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String citizenCodeTxt;
    private String ssnTxt;
    private String dateOfBirthTxt;
    private String dateOfEntryTxt;
    private String programTypesTxt;
    private double assistanceAmt;
    private String twelveMonthAlertTxt;

    public KHKL1C2R(){

    }

    @Override
    public void setProperties(String[] values) {

        this.caseNumberTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.caseLastNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.caseFirstNameTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.caseMiddleInitialTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.lastNameTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4].toUpperCase()):"";
        this.firstNameTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5].toUpperCase()):"";
        this.middleInitialTxt = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6].toUpperCase()):"";
        this.citizenCodeTxt = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7]):"";
        this.ssnTxt = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
        this.dateOfBirthTxt = values.length>=10?((StringUtils.isEmpty(values[9]))?"":values[9]):"";
        this.dateOfEntryTxt = values.length>=11?((StringUtils.isEmpty(values[10]))?"":values[10]):"";
        this.programTypesTxt = values.length>=12?((StringUtils.isEmpty(values[11]))?"":values[11]):"";
        this.assistanceAmt = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.twelveMonthAlertTxt = values.length==14?((StringUtils.isEmpty(values[13]))?"":values[13]):"";
    }
}
