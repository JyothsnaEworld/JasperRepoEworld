package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHFB7 extends BaseModel {
    private String grpName;
    private String pcName;
    private Integer numSmrfSent;
    private Integer numSmrfNotRcvd;
    private Integer numSmrfRcvdIncmplt;
    private Integer numSmrfRcvdCmpltIneligible;
    private Integer numSmrfRcvdCmpltEligible;
    private Integer numSmrfDue1Mnth;
    private Integer numSmrfDue2Mnth;
    private Integer numSmrfDue3Mnth;

    public KHFB7() {

    }

    @Override
    public void setProperties(String[] values) {
        this.grpName = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.pcName = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.numSmrfSent = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.numSmrfNotRcvd = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.numSmrfRcvdIncmplt = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        this.numSmrfRcvdCmpltIneligible = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5])):0;
        this.numSmrfRcvdCmpltEligible = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Integer.parseInt(values[6])):0;
        this.numSmrfDue1Mnth = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Integer.parseInt(values[7])):0;
        this.numSmrfDue2Mnth = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Integer.parseInt(values[8])):0;
        this.numSmrfDue3Mnth = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Integer.parseInt(values[9])):0;
    }
}
