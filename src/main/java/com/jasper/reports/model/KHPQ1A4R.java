package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHPQ1A4R extends BaseModel {

    private String categoryTxt;
    private String programCodeTxt;
    private Integer caseCount;
    private double benefitAmount;

    public KHPQ1A4R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.categoryTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.programCodeTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.caseCount = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.benefitAmount = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
    }
}
