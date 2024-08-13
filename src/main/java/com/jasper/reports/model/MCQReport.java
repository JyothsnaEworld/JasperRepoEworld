package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class MCQReport extends BaseModel {

    private String fiscalYear;
    private String stateName;
    private String subStateArea;
    private String stateContactLastNameTxt;
    private String stateContactFirstNameTxt;
    private String stateContactMiddleInitialTxt;
    private String email;
    private String telephoneNumber;
    private String dateChangeImplemented;
    private Integer monthNum;
    private String month;
    private String dataElementMainNum;
    private String dataElementsMainGroup;
    private String dataElementsSubGrpNum;
    private String dataElementsSubGroup;
    private String hhTypeNum;
    private String hhTypeName;
    private Integer monthData;

    public MCQReport(){
    }

    @Override
    public void setProperties(String[] values) {
        this.fiscalYear = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.stateName = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.subStateArea = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.stateContactLastNameTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.stateContactFirstNameTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4].toUpperCase()):"";
        this.stateContactMiddleInitialTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5].toUpperCase()):"";
        this.email = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
        this.telephoneNumber = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7]):"";
        this.dateChangeImplemented = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";

        this.monthNum = values.length>=10 ? ((StringUtils.isEmpty(values[9]))?null:(Integer.parseInt(values[9]))): 0;
        this.month = values.length>=11?((StringUtils.isEmpty(values[10]))?"":values[10]):"";

        this.dataElementMainNum = values.length>=12?((StringUtils.isEmpty(values[11]))?"":values[11]):"";
        this.dataElementsMainGroup = values.length>=13?((StringUtils.isEmpty(values[12]))?"":values[12]):"";
        this.dataElementsSubGrpNum = values.length>=14?((StringUtils.isEmpty(values[13]))?"":values[13]):"";
        this.dataElementsSubGroup = values.length>=15?((StringUtils.isEmpty(values[14]))?"":values[14]):"";
        this.hhTypeNum = values.length>=16?((StringUtils.isEmpty(values[15]))?"":values[15]):"";
        this.hhTypeName = values.length>=17?((StringUtils.isEmpty(values[16]))?"":values[16]):"";

        this.monthData = values.length>=18 ? ((StringUtils.isEmpty(values[17]))?null:(Integer.parseInt(values[17]))) : null;

    }

}
