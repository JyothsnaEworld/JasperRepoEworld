package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQA1A2R extends BaseModel {
    private String projectArea;
    private String columnName;
    private Integer oneRaceAmericanIndian;
    private Integer oneRaceAsian;
    private Integer oneRaceBlack;
    private Integer oneRaceNativeHawaiian;
    private Integer oneRaceWhite;
    private Integer twoRaceAmericanIndian;
    private Integer twoRaceAsian;
    private Integer twoRaceBlack;
    private Integer twoRaceAmericanIndianAndBlack;
    private Integer balance;
    private Integer snapOther;
    private Integer snapInvalid;
    private Integer snapDeclined;

    public KHQA1A2R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.projectArea = (StringUtils.isEmpty(values[0])) ? "" : values[0];
        this.columnName = (StringUtils.isEmpty(values[1])) ? "" : values[1];
        this.oneRaceAmericanIndian = (StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]);
        this.oneRaceAsian = (StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3]);
        this.oneRaceBlack = (StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]);
        this.oneRaceNativeHawaiian = (StringUtils.isEmpty(values[5])) ? 0 : Integer.parseInt(values[5]);
        this.oneRaceWhite = (StringUtils.isEmpty(values[6])) ? 0 : Integer.parseInt(values[6]);
        this.twoRaceAmericanIndian = (StringUtils.isEmpty(values[7])) ? 0 : Integer.parseInt(values[7]);
        this.twoRaceAsian = (StringUtils.isEmpty(values[8])) ? 0 : Integer.parseInt(values[8]);
        this.twoRaceBlack = (StringUtils.isEmpty(values[9])) ? 0 : Integer.parseInt(values[9]);
        this.twoRaceAmericanIndianAndBlack = (StringUtils.isEmpty(values[10])) ? 0 : Integer.parseInt(values[10]);
        this.balance = (StringUtils.isEmpty(values[11])) ? 0 : Integer.parseInt(values[11]);
        if (values.length >= 13) {
            this.snapOther = (StringUtils.isEmpty(values[12])) ? 0 : Integer.parseInt(values[12]);
        } else {
            this.snapOther = null;
        }
        if (values.length >= 14) {
            this.snapInvalid = (StringUtils.isEmpty(values[13])) ? 0 : Integer.parseInt(values[13]);
        } else {
            this.snapInvalid = null;
        }
        if (values.length >= 15) {
            this.snapDeclined = (StringUtils.isEmpty(values[14])) ? 0 : Integer.parseInt(values[14]);
        } else {
            this.snapDeclined = null;
        }
    }
}
