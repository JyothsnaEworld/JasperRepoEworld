package com.jasper.reports.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportMonthNumTxt {
    JANUARY("1"),
    FEBRUARY("2"),
    MARCH("3"),
    APRIL("4"),
    MAY("5"),
    JUNE("6"),
    JULY("7"),
    AUGUST("8"),
    SEPTEMBER("9"),
    OCTOBER("10"),
    NOVEMBER("11"),
    DECEMBER("12");

    private String value;

    private ReportMonthNumTxt(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static ReportMonthNumTxt fromString(String text) {
        ReportMonthNumTxt reportMonth = findType(text);
        if (reportMonth == null) {
            throw new IllegalArgumentException(text);
        } else {
            return reportMonth;
        }
    }

    public static ReportMonthNumTxt findType(String text) {
        ReportMonthNumTxt[] var1 = values();
        int var2 = var1.length;
        for (int i = 0; i < var2; ++i) {
            ReportMonthNumTxt reportMonth = var1[i];
            if (String.valueOf(reportMonth.value).equalsIgnoreCase(text))
                return reportMonth;
        }
        return null;
    }

}
