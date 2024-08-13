package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQA2R2R extends BaseModel {
    private String sectionName;
    private String totalsGroupName;
    private String typeName;
    private String daysSection;
    private double agencyCaused;
    private double agencyThirdParty;
    private double systemCaused;
    private double clientDelay;
    private double clientInterview;
    private double clientRenewal;
    private double clientThirdParty;
    private double unknownMailingAddress;

    public KHQA2R2R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.sectionName = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.totalsGroupName = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.typeName = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? "" : values[2] : "";
        this.daysSection = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? "" : values[3] : "";
        this.agencyCaused = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.agencyThirdParty = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.systemCaused = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
        this.clientDelay = values.length>=8 ? (StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
        this.clientInterview = values.length>=9 ? (StringUtils.isEmpty(values[8])) ? 0 : Double.parseDouble(values[8]) : 0;
        this.clientRenewal = values.length>=10 ? (StringUtils.isEmpty(values[9])) ? 0 : Double.parseDouble(values[9]) : 0;
        this.clientThirdParty = values.length>=11 ? (StringUtils.isEmpty(values[10])) ? 0 : Double.parseDouble(values[10]) : 0;
        this.unknownMailingAddress = values.length>=12 ? (StringUtils.isEmpty(values[11])) ? 0 : Double.parseDouble(values[11]) : 0;
    }
}
