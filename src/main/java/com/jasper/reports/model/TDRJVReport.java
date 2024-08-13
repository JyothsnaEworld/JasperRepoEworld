package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class TDRJVReport extends BaseModel {
    private String accountingCode;
    private String benefitType;
    private double issuedAmount;

    public TDRJVReport() {
    }

    @Override
    public void setProperties(String[] values) {
        this.accountingCode = values.length>=1 ? (StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.benefitType = values.length>=2 ? (StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.issuedAmount = values.length>=3 ? (StringUtils.isEmpty(values[2])) ? 0 : Double.parseDouble(values[2]) : 0;
    }
}