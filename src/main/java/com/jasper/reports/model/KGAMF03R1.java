package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMF03R1 extends BaseModel {
    private String type;
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String ssn;
    private String cycleNo;
    private String depOrTraceNum;
    private Double ivAmt;
    private Double hhAmt;
    private Double agAmt;

    public KGAMF03R1() {
    }

    @Override
    public void setProperties(String[] values) {
        this.type = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.clientLastNameTxt = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1].toUpperCase() : "";
        this.clientFirstNameTxt = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? "" : values[2].toUpperCase() : "";
        this.clientMiddleInitialTxt = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase() : "";
        this.ssn = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? "" : values[4] : "";
        this.cycleNo = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? "" : values[5] : "";
        this.depOrTraceNum = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? "" : values[6] : "";
        this.ivAmt = values.length>=8 ? (StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
        this.hhAmt = values.length>=9 ? (StringUtils.isEmpty(values[8])) ? 0 : Double.parseDouble(values[8]) : 0;
        this.agAmt = values.length>=10 ? (StringUtils.isEmpty(values[9])) ? 0 : Double.parseDouble(values[9]) : 0;
    }
}