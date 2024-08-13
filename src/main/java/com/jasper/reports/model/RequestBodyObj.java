package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jasper.reports.constants.ReportFormat;
import com.jasper.reports.constants.ReportMonth;
import com.jasper.reports.constants.ReportName;
import lombok.Getter;
import lombok.Setter;

import jakarta.validation.constraints.*;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Setter
@Getter
public class RequestBodyObj {

    @NotNull(message = "The reportFormat is required.")
    @JsonProperty("reportFormat")
    private ReportFormat reportFormat;

    @NotNull(message = "The reportName is required.")
    @JsonProperty("reportName")
    private ReportName reportName;

    @NotNull(message = "The reportMonth is required.")
    @JsonProperty("reportMonth")
    private ReportMonth reportMonth;

    @NotNull(message = "The reportYear is required.")
    @JsonProperty("reportYear")
    private Integer reportYear;

    @Pattern(regexp = "^[0-9]*$")
    @Size(min = 6, max = 6, message = "The rptYrMonthYYYYMM must be 6 digits[YYYYMM].")
    private String rptYrMonthYYYYMM;

    @NotNull(message = "The extractTimeStamp is required in YYYYMMDDHHMISS (HH represents 24-hour clock)")
    @Pattern(regexp = "^[0-9]*$")
    private String extractTimeStamp;

    @JsonProperty("periodFrom")
    private String periodFrom;

    @JsonProperty("periodTo")
    private String periodTo;

    public ReportName getReportName() {
        return reportName;
    }

    public void setReportName(ReportName reportName) {
        this.reportName = reportName;
    }

    public ReportMonth getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(ReportMonth reportMonth) {
        this.reportMonth = reportMonth;
    }

    public Integer getReportYear() {
        return reportYear;
    }

    public void setReportYear(Integer reportYear) {
        this.reportYear = reportYear;
    }

    public String getRptYrMonthYYYYMM() {
        return rptYrMonthYYYYMM;
    }

    public void setRptYrMonthYYYYMM(String rptYrMonthYYYYMM) {
        this.rptYrMonthYYYYMM = rptYrMonthYYYYMM;
    }

    public String getExtractTimeStamp() {
        return extractTimeStamp;
    }

    public void setExtractTimeStamp(String extractTimeStamp) {
        this.extractTimeStamp = extractTimeStamp;
    }
    public String getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(String periodFrom) {
        this.periodFrom = periodFrom;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    public ReportFormat getReportFormat() { return reportFormat; }

    public void setReportFormat(ReportFormat reportFormat) { this.reportFormat = reportFormat; }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
