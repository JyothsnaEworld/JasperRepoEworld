package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Getter
@Setter
@NoArgsConstructor
public class KGAMB40R extends BaseModel{

    private Integer prgType;
    private String srcName;
    private Integer srcCode;
    private Double srcAmount;
    private Integer srcCount;

    public void setProperties(String[] values) {
        this.prgType = values.length>=1?(StringUtils.isEmpty(values[0])) ? 0 :  Integer.parseInt(values[0]) : 0;
        this.srcName = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : (values[1]) : "";
        this.srcCode = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]) : 0;
        this.srcCount = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3]) : 0;
        this.srcAmount = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
    }

}
