package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class SFAASummaryExcel extends BaseModel {
    private String applicationCategory;
    private String applicationStatus;
    private Integer numberOfClients;
    private Integer numberOfCases;
    private Integer lessThan45Days;
    private Integer moreThan45;

    public SFAASummaryExcel() {}

    @Override
    public void setProperties(String[] values) {
        this.applicationCategory = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.applicationStatus = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.numberOfClients = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.numberOfCases = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.lessThan45Days = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        this.moreThan45 = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5])):0;
    }
}