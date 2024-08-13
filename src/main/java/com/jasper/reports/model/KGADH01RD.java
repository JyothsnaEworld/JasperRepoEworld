package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
public class KGADH01RD extends BaseModel {
    private String lastNameTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String ssnNumber;

    public KGADH01RD() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.lastNameTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0].toUpperCase()):"";
        this.firstNameTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2].toUpperCase()):"";
        this.ssnNumber = values.length>=4?(StringUtils.isEmpty(values[3])?"":values[3]):"";
    }
}