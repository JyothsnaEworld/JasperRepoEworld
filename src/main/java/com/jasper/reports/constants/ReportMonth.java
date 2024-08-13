package com.jasper.reports.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportMonth {
    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");

    private String value;

    private ReportMonth(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static ReportMonth fromString(String text) {
        ReportMonth reportMonth = findType(text);
        if (reportMonth == null) {
            throw new IllegalArgumentException(text);
        } else {
            return reportMonth;
        }
    }

    public static ReportMonth findType(String text) {
        ReportMonth[] var1 = values();
        int var2 = var1.length;
        for (int i = 0; i < var2; ++i) {
            ReportMonth reportMonth = var1[i];
            if (String.valueOf(reportMonth.value).equalsIgnoreCase(text))
                return reportMonth;
        }
        return null;
    }

    public String toString() {
        return this.value;
    }
}
