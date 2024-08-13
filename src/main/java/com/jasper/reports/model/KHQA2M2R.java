package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQA2M2R extends BaseModel {
    private String totalsGroup;
    private String subSection;
    private double initialAppsSnap;
    private double initialAppsCombo;
    private double renewalsSnap;
    private double renewalsCombo;

    public KHQA2M2R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.totalsGroup = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.subSection = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.initialAppsSnap = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? 0 : Double.parseDouble(values[2]) : 0;
        this.initialAppsCombo = values.length>=4 ? (StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.renewalsSnap = values.length>=5 ? (StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.renewalsCombo = values.length>=6 ? (StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
    }
}
