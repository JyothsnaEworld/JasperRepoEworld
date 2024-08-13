package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHPT5C2R extends BaseModel {

	private String unitNumTxt;
	private String caseNumTxt;
	private String caseLastNameTxt;
	private String caseFirstNameTxt;
	private String caseMiddleInitialTxt;
	private String cpLastNameTxt;
	private String cpFirstNameTxt;
	private String cpMiddleInitialTxt;
	private String apNamesTxt;
	private String childLastNameTxt;
	private String childFirstNameTxt;
	private String childMiddleInitialTxt;
	private double amtCollected;

    public KHPT5C2R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.unitNumTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.caseNumTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.caseLastNameTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2]:"";
        this.caseFirstNameTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3]:"";
        this.caseMiddleInitialTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4]:"";
        this.cpLastNameTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5]:"";
        this.cpFirstNameTxt = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6]:"";
        this.cpMiddleInitialTxt = values.length>=8?(StringUtils.isEmpty(values[7])) ? "" : values[7]:"";
        this.apNamesTxt = values.length>=9?(StringUtils.isEmpty(values[8])) ? "" : values[8]:"";
        this.childLastNameTxt = values.length>=10?(StringUtils.isEmpty(values[9])) ? "" : values[9]:"";
        this.childFirstNameTxt = values.length>=11?(StringUtils.isEmpty(values[10])) ? "" : values[10]:"";
        this.childMiddleInitialTxt = values.length>=12?(StringUtils.isEmpty(values[11])) ? "" : values[11]:"";
        this.amtCollected = values.length>=13?(StringUtils.isEmpty(values[12])) ? 0 : Double.parseDouble(values[12]):0;
        System.out.println(apNamesTxt);
    }
}
