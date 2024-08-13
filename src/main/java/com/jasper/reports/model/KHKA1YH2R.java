package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KHKA1YH2R extends BaseModel {

    private String prgTypeTxt;
    private Double monIssAmt;
    private Integer numRecSent;
    private Double dtDepAmtIss;
    private Integer numDtDepRec;

    public void setProperties(String[] values)  {
        this.prgTypeTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.monIssAmt = values.length>=2?((StringUtils.isEmpty(values[1]))?0:Double.parseDouble(values[1])):0;
        this.numRecSent = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.dtDepAmtIss = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
        this.numDtDepRec = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        }
}
