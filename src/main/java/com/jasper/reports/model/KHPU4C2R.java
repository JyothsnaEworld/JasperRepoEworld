package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Getter
@Setter
@NoArgsConstructor
public class KHPU4C2R extends BaseModel{

    private String pcNumTxt;
    private String pcTxt;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String caseNumTxt;
    private String caseTypeTxt;
    private Double savingsAmt;

    public void setProperties(String[] values) {
        this.pcNumTxt = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.pcTxt = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" :  values[1] : "";
        this.lastNameTxt = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2].toUpperCase() : "";
        this.firstNameTxt = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase() : "";
        this.middleInitialTxt = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4].toUpperCase() : "";
        this.caseNumTxt = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5] : "";
        this.caseTypeTxt = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6] : "";
        this.savingsAmt = values.length>=8?(StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
    }
}
