package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHGF1F2R extends BaseModel {

    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String recTypeTxt;
    private String actionCodeTxt;
    private String caseNumTxt;
    private String programTypeNumTxt;
    private double balanceAmount;
    private String lastDebitTxnDateTxt;
    private String warningErrorMsgTxt;

    public KHGF1F2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.lastNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.recTypeTxt = values.length>=4?values[3]:"";
        this.actionCodeTxt = values.length>=5?values[4]:"";
        this.caseNumTxt = values.length>=6?values[5]:"";
        this.programTypeNumTxt = values.length>=7?values[6]:"";
        this.balanceAmount = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.lastDebitTxnDateTxt = values.length>=9?values[8]:"";
        this.warningErrorMsgTxt = values.length>=10?values[9]:"";
    }
}
