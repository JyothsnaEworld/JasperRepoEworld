package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHKL1D2R extends BaseModel {

	private String prgTypeCd;
	private String numRecipientsEndPrecedingMonth;
	private String numNewRefugeeRecipientsCurrentMonth;
	private String numIneligibleRefugeeRecipientsCurrentMonth;
	private String numActiveRefugeeRecipientsEndCurrentMonth;
	private String numRecipientsEighteenAndAbove;
	private String numRecipientsUnderEighteen;
	private String numRefugeeRecipientsWithOtherIncome;
	private String numOnePersonRefugeeHouseholds;
	private String numRecipientsRegisteredInUs;
	private String numTimeExpirationCurrentMonth;
	private String numFamilyEarningsExceedsStatesRequirements;
	private String numRecipientsSanctioned;

    public KHKL1D2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.prgTypeCd = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0]):"";
        this.numRecipientsEndPrecedingMonth = values.length>=2?(StringUtils.isEmpty(values[1])?"0":values[1]):"0";
        this.numNewRefugeeRecipientsCurrentMonth = values.length>=3?(StringUtils.isEmpty(values[2])?"0":values[2]):"0";
        this.numIneligibleRefugeeRecipientsCurrentMonth = values.length>=4?(StringUtils.isEmpty(values[3])?"0":values[3]):"0";
        this.numActiveRefugeeRecipientsEndCurrentMonth = values.length>=5?(StringUtils.isEmpty(values[4])?"0":values[4]):"0";
        this.numRecipientsEighteenAndAbove = values.length>=6?(StringUtils.isEmpty(values[5])?"0":values[5]):"0";
        this.numRecipientsUnderEighteen = values.length>=7?(StringUtils.isEmpty(values[6])?"0":values[6]):"0";
        this.numRefugeeRecipientsWithOtherIncome = values.length>=8?(StringUtils.isEmpty(values[7])?"0":values[7]):"0";
        this.numOnePersonRefugeeHouseholds = values.length>=9?(StringUtils.isEmpty(values[8])?"0":values[8]):"0";
        this.numRecipientsRegisteredInUs = values.length>=10?(StringUtils.isEmpty(values[9])?"0":values[9]):"0";
        this.numTimeExpirationCurrentMonth = values.length>=11?(StringUtils.isEmpty(values[10])?"0":values[10]):"0";
        this.numFamilyEarningsExceedsStatesRequirements = values.length>=12?(StringUtils.isEmpty(values[11])?"0":values[11]):"0";
        this.numRecipientsSanctioned = values.length>=13?(StringUtils.isEmpty(values[12])?"0":values[12]):"0";
    }
}
