package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class SMRFSummary extends BaseModel {
    private String grpName;
    private String pcName;
    private Integer numSMRFSent;
    private Integer numSMRFNotRcvd;
    private Integer numSMRFRcvdIncmplt;
    private Integer numSMRFRcvdCmpltIneligible;
    private Integer numSMRFRcvdCmpltEligible;
    private Integer numSMRFDue1Mnth;
    private Integer numSMRFDue2Mnth;
    private Integer numSMRFDue3Mnth;

    public SMRFSummary() {

    }

    @Override
    public void setProperties(String[] values) {
        this.grpName = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.pcName = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.numSMRFSent = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.numSMRFNotRcvd = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.numSMRFRcvdIncmplt = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        this.numSMRFRcvdCmpltIneligible = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5])):0;
        this.numSMRFRcvdCmpltEligible = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Integer.parseInt(values[6])):0;
        this.numSMRFDue1Mnth = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Integer.parseInt(values[7])):0;
        this.numSMRFDue2Mnth = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Integer.parseInt(values[8])):0;
        this.numSMRFDue3Mnth = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Integer.parseInt(values[9])):0;
    }
}
