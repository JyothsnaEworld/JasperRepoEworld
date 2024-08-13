package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Setter
@Getter
public class RMTSSummary extends BaseModel {

    private String islandNameTxt;
    private String sectionNameTxt;
    private String userFirstNameTxt;
    private String userMiddleInitialTxt;
    private String userLastNameTxt;
    private String userDateTxt;
    private String userTimeTxt;
    private String rmtsCode;
    private double tanfCredits;
    private double taonfCredits;
    private double gaCredits;
    private double snapCredits;
    private double refugeeCredits;
    private double aabdCredits;
    private double ftwCredits;
    private double eandtCredits;
    private double childCareCredits;

    public RMTSSummary(){

    }

    @Override
    public void setProperties(String[] values) throws ParseException {

        this.sectionNameTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.userFirstNameTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.userMiddleInitialTxt = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2].toUpperCase()):"";
        this.userLastNameTxt = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3].toUpperCase()):"";
        this.userDateTxt = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        /*if (values.length>=5)
        {
            if (StringUtils.isEmpty(values[4]))
                this.userDateTxt ="";
            else
            {
                //should be able to handle M/d/yy or M/d/yyyy
                String datevalue = values[4];
                SimpleDateFormat formatter = (datevalue.substring(datevalue.length() - 4).contains("/")) ?
                        new SimpleDateFormat("M/d/yy") : new SimpleDateFormat("M/d/yyyy");
                //Parsing the given String to Date object
                Date date = formatter.parse(datevalue);
                this.userDateTxt = new SimpleDateFormat("MM/dd/yyyy").format(date);
            }
        }
        else
            this.userDateTxt ="";
        */
        this.userTimeTxt = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5]):"";
        this.rmtsCode = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6]):"";
        this.tanfCredits = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Double.parseDouble(values[7])):0;
        this.taonfCredits = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Double.parseDouble(values[8])):0;
        this.gaCredits = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Double.parseDouble(values[9])):0;
        this.snapCredits = values.length>=11?((StringUtils.isEmpty(values[10]))?0:Double.parseDouble(values[10])):0;
        this.refugeeCredits = values.length>=12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
        this.aabdCredits = values.length>=13?((StringUtils.isEmpty(values[12]))?0:Double.parseDouble(values[12])):0;
        this.ftwCredits = values.length>=14?((StringUtils.isEmpty(values[13]))?0:Double.parseDouble(values[13])):0;
        this.eandtCredits = values.length>=15?((StringUtils.isEmpty(values[14]))?0:Double.parseDouble(values[14])):0;
        this.childCareCredits = values.length>=16?((StringUtils.isEmpty(values[15]))?0:Double.parseDouble(values[15])):0;
        this.islandNameTxt = values.length>=17?((StringUtils.isEmpty(values[16]))?"":values[16]):"";
    }
}
