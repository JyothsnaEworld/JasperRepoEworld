package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class RReport extends BaseModel {

    private String caseNumberTxt;
	private String lastNameCaseTxt;
	private String firstNameCaseTxt;
	private String middleInitialCaseTxt;
	private String lastNameClientTxt;
	private String firstNameClientTxt;
	private String middleInitialClientTxt;
	private String benefitTypeTxt;
	private String dateOfBirthTxt;
	private String dateOfEntryTxt;
	private String dateOfApplicationTxt;
	private String programTypeTxt;
	private double loanAmount;
	private String ninetyDaysAlertTxt;

    public RReport(){

    }

    @Override
    public void setProperties(String[] values) {
        this.caseNumberTxt = values.length>=1?values[0]:"";
        this.lastNameCaseTxt = values.length>=2?values[1].toUpperCase():"";
        this.firstNameCaseTxt = values.length>=3?values[2].toUpperCase():"";
        this.middleInitialCaseTxt = values.length>=4?values[3].toUpperCase():"";
        this.lastNameClientTxt = values.length>=5?values[4].toUpperCase():"";
        this.firstNameClientTxt = values.length>=6?values[5].toUpperCase():"";
        this.middleInitialClientTxt = values.length>=7?values[6].toUpperCase():"";
        this.benefitTypeTxt = values.length>=8?values[7]:"";
        this.dateOfBirthTxt = values.length>=9?values[8]:"";
        this.dateOfEntryTxt = values.length>=10?values[9]:"";
        this.dateOfApplicationTxt = values.length>=11?values[10]:"";
        this.programTypeTxt = values.length>=12?values[11]:"";
        this.loanAmount = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.ninetyDaysAlertTxt = values.length>=14?values[13]:"";
    }
}