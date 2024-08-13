package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

import java.text.ParseException;

@Setter
@Getter
@NoArgsConstructor
public class KHPQ1A1R extends BaseModel {
    private String pcNumTxt;
    private String caseNumTxt;
    private String caseLastNameTxt;
    private String caseFirstNameTxt;
    private String caseMiddleInitialTxt;
    private String clientNumTxt;
    private String clientLastNameTxt;
    private String clientFirstNameTxt;
    private String clientMiddleInitialTxt;
    private String citizenshipTxt;
    private String errorMessageTxt;

    public void setProperties(String[] values)  {
        this.pcNumTxt = values.length>=1?values[0]:"";
        this.caseNumTxt = values.length>=2?values[1]:"";
        this.caseLastNameTxt = values.length>=3?values[2]:"";
        this.caseFirstNameTxt = values.length>=4?values[3]:"";
        this.caseMiddleInitialTxt = values.length>=5?values[4]:"";
        this.clientNumTxt = values.length>=6?values[5]:"";
        this.clientLastNameTxt = values.length>=7?values[6]:"";
        this.clientFirstNameTxt = values.length>=8?values[7]:"";
        this.clientMiddleInitialTxt = values.length>=9?values[8]:"";
        this.citizenshipTxt = values.length>=10?values[9]:"";
        this.errorMessageTxt = values.length>=11?values[10]:"";
    }
}
