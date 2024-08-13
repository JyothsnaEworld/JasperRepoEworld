package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQC4A1R extends BaseModel {

    private Integer categorySeq;
    private String categoryTxt;
    private Integer indicatorSeq;
    private String indicatorDescriptionTxt;
    private Integer indicatorCount;

    public KHQC4A1R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.categorySeq = values.length >= 1 ? ((StringUtils.isEmpty(values[0])) ? 0 : Integer.parseInt(values[0])) : 0;
        this.categoryTxt = values.length >= 2 ? ((StringUtils.isEmpty(values[1])) ? "" : values[1]) : "";
        this.indicatorSeq = values.length >= 3 ? ((StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2])) : 0;
        this.indicatorDescriptionTxt = values.length >= 4 ? ((StringUtils.isEmpty(values[3])) ? "" : values[3]) : "";
        this.indicatorCount = values.length >= 5 ? ((StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4])) : 0;
    }
}