package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAQF03RA extends BaseModel {
    private String grpName;
    private String month;
    private String type;
    private Integer paymentCnt;
    private Integer reversalCnt;
    private double paymentAmt;
    private double reversalAmt;

    public KGAQF03RA() {
    }

    @Override
    public void setProperties(String[] values) {
        this.grpName = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.month = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.type = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? "" : values[2] : "";
        this.paymentCnt = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3]) : 0;
        this.reversalCnt = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]) : 0;
        this.paymentAmt = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.reversalAmt = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
    }
}
