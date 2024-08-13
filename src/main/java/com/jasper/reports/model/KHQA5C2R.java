package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQA5C2R extends BaseModel {

    private String reportingPeriodTxt;
    private String islandCountyName;
    private String regCategoryTxt;
	private double month1Reg;
	private double month2Reg;
	private double month3Reg;
	private double month4Reg;
	private double month5Reg;
	private double month6Reg;
	private double month7Reg;
	private double month8Reg;
	private double month9Reg;
	private double month10Reg;
	private double month11Reg;
    private double month12Reg;

    public KHQA5C2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.reportingPeriodTxt = values.length>=1?values[0]:"";
        this.islandCountyName = values.length>=2?values[1]:"";
        this.regCategoryTxt = values.length>=3?values[2]:"";
        this.month1Reg = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
        this.month2Reg =  values.length>=5?((StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4])):0;
        this.month3Reg = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5])):0;
        this.month4Reg =  values.length>=7?((StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6])):0;
        this.month5Reg = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.month6Reg = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.month7Reg =  values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.month8Reg = values.length>=11?((StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10])):0;
        this.month9Reg =  values.length>=12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
        this.month10Reg = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.month11Reg = values.length>=14?((StringUtils.isEmpty(values[13]))?0:Double.parseDouble(values[13])):0;
        this.month12Reg = values.length>=15?((StringUtils.isEmpty(values[14]))?0:Double.parseDouble(values[14])):0;
         }
}
