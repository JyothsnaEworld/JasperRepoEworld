package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class KGAA18R3 extends BaseModel {
    private String taxIdTxt;
    private String firstNameTxt;
    private String middleInitialTxt;
    private String lastNameTxt;
    private String prgTypeTxt;
    private String clmNumTxt;
    private String errTypeTxt;
    private String lastPmtDtTxt;
    private String clmDtTxt;
    private double initialOpAmt;
    private double writeoffAmt;

    public KGAA18R3(){

    }

    @Override
    public void setProperties(String[] values)  throws ParseException {
        this.taxIdTxt = values[0];
        this.firstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.middleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.lastNameTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.prgTypeTxt = values[4];
        this.clmNumTxt = values[5];
        this.errTypeTxt = values[6];
        if (StringUtils.isEmpty(values[7]))
            this.lastPmtDtTxt ="";
        else
        {
            //should be able to handle M/d/yy or M/d/yyyy
            String datevalue = values[7];
            SimpleDateFormat formatter = (datevalue.substring(datevalue.length() - 4).contains("/")) ?
                    new SimpleDateFormat("M/d/yy") : new SimpleDateFormat("M/d/yyyy");
            //Parsing the given String to Date object
            Date date = formatter.parse(datevalue);
            this.lastPmtDtTxt = new SimpleDateFormat("MM/dd/yyyy").format(date);
        }
        if (StringUtils.isEmpty(values[8]))
            this.clmDtTxt ="";
        else
        {
            //should be able to handle M/d/yy or M/d/yyyy
            String datevalue = values[8];
            SimpleDateFormat formatter = (datevalue.substring(datevalue.length() - 4).contains("/")) ?
                    new SimpleDateFormat("M/d/yy") : new SimpleDateFormat("M/d/yyyy");
            //Parsing the given String to Date object
            Date date = formatter.parse(datevalue);
            this.clmDtTxt = new SimpleDateFormat("MM/dd/yyyy").format(date);
        }
        this.initialOpAmt = values.length>=10?(StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9]):0;
        this.writeoffAmt = values.length>=11?(StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10]):0;
    }
}
