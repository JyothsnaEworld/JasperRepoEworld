package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGE7G2RExcel extends BaseModel {

    private String processingCenter;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String caseNumber;
    private String documentId;
    private double hawiIssuanceAmount;
    private double ebtIssuanceAmount;
    private String remarks;
    private String islandName;
    private String availabilityDate;
    private String correctCaseNumber;
    private String correctCaseName;
    private String correctDocumentId;
    private double correctRequestedAmount;

    public KHGE7G2RExcel(){}

    @Override
    public void setProperties(String[] values) {
        this.processingCenter = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.lastNameTxt = values.length>=2?((StringUtils.isEmpty(values[1].toUpperCase()))?"":values[1].toUpperCase()):"";
        this.firstNameTxt = values.length>=3?((StringUtils.isEmpty(values[2].toUpperCase()))?"":values[2].toUpperCase()):"";
        this.middleInitialTxt = values.length>=4?((StringUtils.isEmpty(values[3].toUpperCase()))?"":values[3].toUpperCase()):"";
        this.caseNumber = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        this.documentId = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5]):"";
        this.hawiIssuanceAmount = values.length>=7 ? ((StringUtils.isEmpty(values[6]))?0:(Double.parseDouble(values[6]))): 0;
        this.ebtIssuanceAmount = values.length>=8 ? ((StringUtils.isEmpty(values[7]))?0:(Double.parseDouble(values[7]))): 0;
        this.remarks = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
        this.islandName = values.length>=10?((StringUtils.isEmpty(values[9]))?"":values[9]):"";
        this.availabilityDate = values.length>=11 ? ((StringUtils.isEmpty(values[10]))?"":values[10]) : "";
        this.correctCaseNumber = values.length>=12 ? ((StringUtils.isEmpty(values[11]))?"":values[11]) : "";
        this.correctCaseName = values.length>=13 ? ((StringUtils.isEmpty(values[12]))?"":values[12]) : "";
        this.correctDocumentId = values.length>=14 ? ((StringUtils.isEmpty(values[13]))?"":values[13]) : "";
        this.correctRequestedAmount = values.length>=15 ? ((StringUtils.isEmpty(values[14]))?0:(Double.parseDouble(values[14]))): 0;
    }
}
