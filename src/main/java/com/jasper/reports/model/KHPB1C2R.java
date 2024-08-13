package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KHPB1C2R extends BaseModel {
    private String groupType;
    private String issuanceType;
    private String issuanceSubType;
    private double estimatedCurrentMonth;
    private double estimatedPreviousMonth;
    private double actualSecondPrecedingMonth;

    public void setProperties(String[] values) {
        this.groupType = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0] : ""; //Expecting first field as mandatory.
        this.issuanceType = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.issuanceSubType = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2] : "";
        this.estimatedCurrentMonth = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.estimatedPreviousMonth = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.actualSecondPrecedingMonth = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
    }
}
