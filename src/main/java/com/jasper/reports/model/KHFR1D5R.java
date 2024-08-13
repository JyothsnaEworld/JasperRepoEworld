package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHFR1D5R extends BaseModel {

    private String pcTxt;
    private String caseNumberTxt;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String pgmTypeTxt;
    private String dateRecdTxt;
    private String intcTypeTxt;
    private String expeditedDueDateTxt;
    private String regularDueDateTxt;
    private Integer daysPending;
    private Integer overdueCount;

    public KHFR1D5R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.pcTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.caseNumberTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.lastNameTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.firstNameTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.middleInitialTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4].toUpperCase()):"";
        this.pgmTypeTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5]):"";
        this.dateRecdTxt = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
        this.intcTypeTxt = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7]):"";
        this.expeditedDueDateTxt = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
        this.regularDueDateTxt = values.length>=10?((StringUtils.isEmpty(values[9]))?"":values[9]):"";
        this.daysPending = values.length>=11?((StringUtils.isEmpty(values[10]))?0:Integer.parseInt(values[10])):0;
        this.overdueCount = values.length>=12?((StringUtils.isEmpty(values[11]))?0:Integer.parseInt(values[11])):0;
    }
}
