package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQA2C2R extends BaseModel {
    private String processingCenter;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String caseNumber;
    private String dateOfApp;
    private String typeOfApp;
    private String exp;
    private String dateDetermined;
    private String typeOfDisp;
    private String denialReasonCode;
    private String issueType;
    private int days;
    private String untimelyReasonCode;
    private String ewComDate;

    public KHQA2C2R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.processingCenter = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.lastNameTxt = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1].toUpperCase() : "";
        this.firstNameTxt = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? "" : values[2].toUpperCase() : "";
        this.middleInitialTxt = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase() : "";
        this.caseNumber = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? "" : values[4] : "";
        this.dateOfApp = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? "" : values[5] : "";
        this.typeOfApp = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? "" : values[6] : "";
        this.exp = values.length>=8 ? (StringUtils.isEmpty(values[7])) ? "" : values[7] : "";
        this.dateDetermined = values.length>=9 ? (StringUtils.isEmpty(values[8])) ? "" : values[8] : "";
        this.typeOfDisp = values.length>=10 ? (StringUtils.isEmpty(values[9])) ? "" : values[9] : "";
        this.denialReasonCode = values.length>=11 ? (StringUtils.isEmpty(values[10])) ? "" : values[10] : "";
        this.issueType = values.length>=12 ? (StringUtils.isEmpty(values[11])) ? "" : values[11] : "";
        this.days = values.length>=13 ? (StringUtils.isEmpty(values[12]) ? 0 : Integer.parseInt(values[12])) : 0;
        this.untimelyReasonCode = values.length>=14 ? (StringUtils.isEmpty(values[13])) ? "" : values[13] : "";
        this.ewComDate = values.length>=15 ? (StringUtils.isEmpty(values[14])) ? "" : values[14] : "";
    }
}