package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMF09R extends BaseModel {

    private String clientLastName;
    private String clientFirstName;
    private String clientMiddleInitial;
    private String ssnNumber;
    private String errType;
    private String claimNumber;
    private double claimBalance;

    public KGAMF09R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.clientLastName = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.clientFirstName = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.clientMiddleInitial = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2]:"";
        this.ssnNumber = values.length>=4?(StringUtils.isEmpty(values[3])) ? "" : values[3]:"";
        this.errType = values.length>=5?(StringUtils.isEmpty(values[4])) ? "" : values[4]:"";
        this.claimNumber = values.length>=6?(StringUtils.isEmpty(values[5])) ? "" : values[5]:"";
        this.claimBalance = values.length>=7?(StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]):0;
    }
}
