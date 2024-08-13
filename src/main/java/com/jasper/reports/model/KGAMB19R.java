package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAMB19R extends BaseModel {

    private String collectorNameTxt;
    private String typeTxt;
    private String ssnRange;
    private double totalClientsNum;
    private double balanceAmount;

    public KGAMB19R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.collectorNameTxt = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0]):"";
        this.typeTxt = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1]):"";
        this.ssnRange = values.length>=3?(StringUtils.isEmpty(values[2])?"":values[2]):"";
        this.totalClientsNum = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3])):0;
        this.balanceAmount = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4])):0;
    }
}
