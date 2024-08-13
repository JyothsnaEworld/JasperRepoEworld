package com.jasper.reports.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportFormat {
    PDF("PDF"),
    XLS("XLS"),
    XLSX("XLSX");

    private String value;

    private ReportFormat(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static ReportFormat fromString(String text) {
        ReportFormat reportName = findType(text);
        if (reportName == null) {
            throw new IllegalArgumentException(text);
        } else {
            return reportName;
        }
    }

    public static ReportFormat findType(String text) {
        ReportFormat[] var1 = values();
        int var2 = var1.length;
        for (int i = 0; i < var2; ++i) {
            ReportFormat name = var1[i];
            if (String.valueOf(name.value).equalsIgnoreCase(text))
                return name;
        }
        return null;
    }

    public String toString() {
        return this.value;
    }
}
