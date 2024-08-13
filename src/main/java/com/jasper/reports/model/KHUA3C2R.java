package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHUA3C2R extends BaseModel {

    private String unitNumber;
    private String caseLastName;
    private String caseFirstName;
    private String caseMiddleInitial;
    private String caseNumber;
    private String livingArrangement;

    public KHUA3C2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.unitNumber = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.caseLastName = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1].toUpperCase():"";
        this.caseFirstName = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2].toUpperCase():"";
        this.caseMiddleInitial = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3].toUpperCase():"";
        this.caseNumber = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4]:"";
        this.livingArrangement = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5]:"";
    }
}
