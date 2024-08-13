package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMF07RB extends BaseModel {

    private String codeNumTxt;
    private String codeDescriptionTxt;
    private String ssnTxt;
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String addressTxt;
    private String noticeLetterDateTxt;
    private String responseTxt;
    public KGAMF07RB(){

    }

    @Override
    public void setProperties(String[] values) {
        this.codeNumTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.codeDescriptionTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.ssnTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.lastNameTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.firstNameTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4].toUpperCase()):"";
        this.middleInitialTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5].toUpperCase()):"";
        this.addressTxt = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
        this.noticeLetterDateTxt = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7]):"";
        this.responseTxt = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
            }
    }
