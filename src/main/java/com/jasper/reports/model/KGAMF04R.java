package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMF04R extends BaseModel {
    private String type;
    private String cycleNumber;
    private Integer ivCnt;
    private Integer hhCnt;
    private Integer agCnt;
    private double ivAmt;
    private double hhAmt;
    private double agAmt;

    public KGAMF04R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.type = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.cycleNumber = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.ivCnt = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]) : 0;
        this.ivAmt = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.hhCnt = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]) : 0;
        this.hhAmt = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.agCnt = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? 0 : Integer.parseInt(values[6]) : 0;
        this.agAmt = values.length>=8 ? (StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
    }
}