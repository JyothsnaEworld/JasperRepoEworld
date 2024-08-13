package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGE7G4R extends BaseModel {

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

    public KHGE7G4R(){}

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
    }
}
