package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHFM2I2R extends BaseModel {
    private String grpName;
    private String pcName;
    private Integer numRenewalsSent;
    private Integer numRenewalsRcvd;
    private Integer numRenewalsNotRcvd;
    private Integer numRenewalsPending;
    private Integer numRenewalsCmpltIneligible;
    private Integer numRenewalsCmpltEligible;
    private Integer numRenewalsDue1Mnth;
    private Integer numRenewalsDue2Mnth;
    private Integer numRenewalsDue3Mnth;

    public KHFM2I2R() {

    }

    @Override
    public void setProperties(String[] values) {
        this.grpName = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.pcName = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.numRenewalsSent = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.numRenewalsRcvd = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.numRenewalsNotRcvd = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        this.numRenewalsPending = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5])):0;
        this.numRenewalsCmpltIneligible = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Integer.parseInt(values[6])):0;
        this.numRenewalsCmpltEligible = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Integer.parseInt(values[7])):0;
        this.numRenewalsDue1Mnth = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Integer.parseInt(values[8])):0;
        this.numRenewalsDue2Mnth = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Integer.parseInt(values[9])):0;
        this.numRenewalsDue3Mnth = values.length>=11?((StringUtils.isEmpty(values[10]))?0:Integer.parseInt(values[10])):0;
    }
}
