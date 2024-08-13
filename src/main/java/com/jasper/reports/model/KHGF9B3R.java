package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGF9B3R extends BaseModel {
	private String identificationNumTxt;
	private String countyCodeTxt;
	private String ssnTxt;
	private String secondaryIdTxt;
	private String programTypeTxt;
	private String providerClientFlagTxt;
	private String pcLastNameTxt;
	private String pcFirstNameTxt;
	private String pcMiddleInitialTxt;
	private double numAmount;
	private String transactionCodeTxt;
	private String rejectCodeTxt;
	private String bankNameTxt;
	private String routingNumTxt;
	private String accountNumTxt;
	private String benefitTypeTxt;
	private String benefitPeriodTxt;
	private String authNumTxt;
	private String processDateTxt;
	private String processTimeTxt;
	private String achProcessDateTxt;
	private String nocRoutingNumTxt;
	private String nocAccountNumTxt;
	private String nocTransactionCodeTxt;
	private String cefsTraceIdTxt;
	private String delawareTraceIdTxt;
	private String rejectCodeDescriptionTxt;
    public KHGF9B3R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.identificationNumTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.countyCodeTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.ssnTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2]:"";
        this.secondaryIdTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3]:"";
        this.programTypeTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4]:"";
        this.providerClientFlagTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5]:"";
        this.pcLastNameTxt = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6].toUpperCase():"";
        this.pcFirstNameTxt = values.length>=8?(StringUtils.isEmpty(values[7])) ? "" : values[7].toUpperCase():"";
        this.pcMiddleInitialTxt = values.length>=9?(StringUtils.isEmpty(values[8])) ? "" : values[8].toUpperCase():"";
        this.numAmount = values.length>=10?(StringUtils.isEmpty(values[9])) ? 0 : Double.parseDouble(values[9]):0;
        this.transactionCodeTxt = values.length>=11?(StringUtils.isEmpty(values[10])) ? "" : values[10]:"";
        this.rejectCodeTxt = values.length>=12?(StringUtils.isEmpty(values[11])) ? "" : values[11]:"";
        this.bankNameTxt = values.length>=13?(StringUtils.isEmpty(values[12])) ? "" : values[12]:"";
        this.routingNumTxt = values.length>=14?(StringUtils.isEmpty(values[13])) ? "" : values[13]:"";
        this.accountNumTxt = values.length>=15?(StringUtils.isEmpty(values[14])) ? "" : values[14]:"";
        this.benefitTypeTxt = values.length>=16?(StringUtils.isEmpty(values[15])) ? "" : values[15]:"";
        this.benefitPeriodTxt = values.length>=17?(StringUtils.isEmpty(values[16])) ? "" : values[16]:"";//yyyyMMdd
        this.authNumTxt = values.length>=18?(StringUtils.isEmpty(values[17])) ? "" : values[17]:"";
        this.processDateTxt = values.length>=19?(StringUtils.isEmpty(values[18])) ? "" : values[18]:"";
        this.processTimeTxt = values.length>=20?(StringUtils.isEmpty(values[19])) ? "" : values[19]:"";
        this.achProcessDateTxt = values.length>=21?(StringUtils.isEmpty(values[20])) ? "" : values[20]:"";
        this.nocRoutingNumTxt = values.length>=22?(StringUtils.isEmpty(values[21])) ? "" : values[21]:"";
        this.nocAccountNumTxt = values.length>=23?(StringUtils.isEmpty(values[22])) ? "" : values[22]:"";
        this.nocTransactionCodeTxt = values.length>=24?(StringUtils.isEmpty(values[23])) ? "" : values[23]:"";
        this.cefsTraceIdTxt = values.length>=25?(StringUtils.isEmpty(values[24])) ? "" : values[24]:"";
        this.delawareTraceIdTxt = values.length>=26?(StringUtils.isEmpty(values[25])) ? "" : values[25]:"";
        this.rejectCodeDescriptionTxt = values.length>=27?(StringUtils.isEmpty(values[26])) ? "" : values[26]:"";
    }
}
