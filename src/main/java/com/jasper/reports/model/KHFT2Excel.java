package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHFT2Excel extends BaseModel {
    private String pc;
    private String prg;
    private String caseId;
    private String caseLastName;
    private String caseFirstName;
    private String caseMiddleInitial;
    private String clientId;
    private String clientLastName;
    private String clientFirstName;
    private String clientMiddleInitial;
    private String disbType;
    private String medDue;
    private String addr1;
    private String addr2;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public KHFT2Excel() {
    }

    @Override
    public void setProperties(String[] values) {
        this.pc = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.prg = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.caseId = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2]:"";
        this.caseLastName = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase():"";
        this.caseFirstName = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4].toUpperCase():"";
        this.caseMiddleInitial = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5].toUpperCase():"";
        this.clientId = values.length>=7?(StringUtils.isEmpty(values[6])) ? "" : values[6]:"";
        this.clientLastName = values.length>=8?(StringUtils.isEmpty(values[7])) ? "" : values[7].toUpperCase():"";
        this.clientFirstName = values.length>=9?(StringUtils.isEmpty(values[8])) ? "" : values[8].toUpperCase():"";
        this.clientMiddleInitial = values.length>=10?(StringUtils.isEmpty(values[9])) ? "" : values[9].toUpperCase():"";
        this.disbType = values.length>=11?(StringUtils.isEmpty(values[10])) ? "" : values[10]:"";
        this.medDue = values.length>=12?(StringUtils.isEmpty(values[11])) ? "" : values[11]:"";
        this.addr1 = values.length>=13?(StringUtils.isEmpty(values[12])) ? "" : values[12]:"";
        this.addr2 = values.length>=14?(StringUtils.isEmpty(values[13])) ? "" : values[13]:"";
        this.city = values.length>=15?(StringUtils.isEmpty(values[14])) ? "" : values[14]:"";
        this.state = values.length>=16?(StringUtils.isEmpty(values[15])) ? "" : values[15]:"";
        this.zip = values.length>=17?(StringUtils.isEmpty(values[16])) ? "" : values[16]:"";
        this.phone = values.length>=18?(StringUtils.isEmpty(values[17])) ? "" : values[17]:"";
    }
}
