package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
public class KGAMB49R extends BaseModel {
    private String progTypeTxt;
    private String errTypeTxt;
    private String tranTypeTxt;
    private String ssnTxt;
    private String caseNbrTxt;
    private String claimNbrTxt;
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String transDateTxt;
    private String dateIncrdTxt;
    private String chgRsnTxt;
    private double amount;

    public KGAMB49R() {}

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.progTypeTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0]):"";
        this.errTypeTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1]):"";
        this.tranTypeTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2]):"";
        this.ssnTxt = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3]):"";
        this.caseNbrTxt = values.length>=5?(StringUtils.isEmpty(values[4])?"":values[4]):"";
        this.claimNbrTxt = values.length>=6?(StringUtils.isEmpty(values[5])?"":values[5]):"";
        this.clientFirstNameTxt = values.length>=7?(StringUtils.isEmpty(values[6])?"":values[6].toUpperCase()):"";
        this.clientLastNameTxt = values.length>=8?(StringUtils.isEmpty(values[7])?"":values[7].toUpperCase()):"";
        this.clientMiddleInitialTxt = values.length>=9?(StringUtils.isEmpty(values[8])?"":values[8].toUpperCase()):"";
        this.transDateTxt = values.length>=10?(StringUtils.isEmpty(values[9])?"":values[9]):"";
        this.dateIncrdTxt = values.length>=11?(StringUtils.isEmpty(values[10])?"":values[10]):"";
        this.chgRsnTxt = values.length>=12?(StringUtils.isEmpty(values[11])?"":values[11]):"";
        this.amount = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
    }
}