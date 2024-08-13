package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class OEReport extends BaseModel {

    private String pcNumberTxt;
    private String lastNameOverrideByTxt;
    private String firstNameOverrideByTxt;
    private String middleInitialOverrideByTxt;
    private String overrideDateTimeTxt;
    private String lastNameAuthorizedByTxt;
    private String firstNameAuthorizedByTxt;
    private String middleInitialAuthorizedByTxt;
    private String authorizationDateTimeTxt;
    private String caseNumberTxt;
    private String programTxt;
    private String benefitMonthTxt;
    private double originalAmount;
    private double overridenAmount;
    private String overrideReasonTxt;
    private String commentsTxt;

    public OEReport(){

    }

    @Override
    public void setProperties(String[] values) {
        this.pcNumberTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.lastNameOverrideByTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.firstNameOverrideByTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.middleInitialOverrideByTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.overrideDateTimeTxt = values.length>=5?values[4]:"";
        this.lastNameAuthorizedByTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5].toUpperCase()):"";
        this.firstNameAuthorizedByTxt = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6].toUpperCase()):"";
        this.middleInitialAuthorizedByTxt = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7].toUpperCase()):"";
        this.authorizationDateTimeTxt = values.length>=9?values[8]:"";
        this.caseNumberTxt = values.length>=10?values[9]:"";
        this.programTxt = values.length>=11?((StringUtils.isEmpty(values[10]))?"":values[10]):"";
        this.benefitMonthTxt = values.length>=12?values[11]:"";
        this.originalAmount = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.overridenAmount = values.length>=14?((StringUtils.isEmpty(values[13]))?0:Double.parseDouble(values[13])):0;
        this.overrideReasonTxt = values.length>=15?((StringUtils.isEmpty(values[14]))?"":values[14]):"";
        this.commentsTxt = values.length>=16?((StringUtils.isEmpty(values[15]))?"":values[15]):"";
    }
}