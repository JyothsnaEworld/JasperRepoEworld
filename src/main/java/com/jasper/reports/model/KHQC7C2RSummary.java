package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQC7C2RSummary extends BaseModel {

    private Integer monthIndex;
    private String monthYearTxt;
    private String numCategory;
    private Integer rowIndex;
    private String islandName;
    private double regObNum;
    private double speObNum;
    private double rceObNum;
    private double bceObNum;

    public KHQC7C2RSummary(){

    }

    @Override
    public void setProperties(String[] values) {
       this.monthIndex = values.length>=1?((StringUtils.isEmpty(values[0]))?0:Integer.parseInt(values[0])):0;
       this.monthYearTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
       this.numCategory = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
       this.rowIndex = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
       this.islandName = values.length>=5?(StringUtils.isEmpty(values[4])?"":values[4].toUpperCase()):"";
       this.regObNum = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
       this.speObNum = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
       this.rceObNum = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
       this.bceObNum = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
    }
}
