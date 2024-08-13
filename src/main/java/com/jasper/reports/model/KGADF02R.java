package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KGADF02R extends BaseModel {
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String taxIdTxt;
    private String judgementStatusTxt;
    private double amtIV;
    private double amtHH;
    private double amtAG;
    public KGADF02R() {

    }

    @Override
    public void setProperties(String[] values) throws ParseException {
        this.clientLastNameTxt = values[0];
        this.clientFirstNameTxt = values[1];
        this.clientMiddleInitialTxt = values[2];
        this.taxIdTxt = values[3];
        this.judgementStatusTxt = values[4];
        this.amtIV = (StringUtils.isEmpty(values[5]))?0:Double.parseDouble(values[5]);
        this.amtHH = (StringUtils.isEmpty(values[6]))?0:Double.parseDouble(values[6]);
        if(values.length==8)//default will be 0.0
            this.amtAG = (StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7]);
    }
}
