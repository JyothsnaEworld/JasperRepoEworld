package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAQF03RB extends BaseModel {

    private String pledgeType;
    private String monthYear;
    private double ivAmt;
    private double hhAmt;
    private double agAmt;

    public KGAQF03RB(){

    }

    @Override
    public void setProperties(String[] values) {
        this.pledgeType = values[0];
        this.monthYear = values[1];
        this.ivAmt = (StringUtils.isEmpty(values[2]))?0:Double.parseDouble(values[2]);
        this.hhAmt = (StringUtils.isEmpty(values[3]))?0:Double.parseDouble(values[3]);
        if (values.length==5)
            this.agAmt = (StringUtils.isEmpty(values[4]))?0:Double.parseDouble(values[4]);
        else
            this.agAmt = 0;
    }
}
