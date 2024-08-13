package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQA2I2R extends BaseModel {
    private String processingCenterName;
    private String totalsGroup;
    private String subSection;
    private Double initialAppsSnap;
    private Double initialAppsCombo;
    private Double renewalsSnap;
    private Double renewalsCombo;

    public KHQA2I2R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.processingCenterName = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.totalsGroup = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.subSection = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? "" : values[2] : "";
        this.initialAppsSnap = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.initialAppsCombo = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.renewalsSnap = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.renewalsCombo = values.length>=7 ? (StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
    }
}
