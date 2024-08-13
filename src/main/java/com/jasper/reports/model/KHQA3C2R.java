package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KHQA3C2R extends BaseModel {
    private String groupType;
    private String countyName;
    private String islandName;
    private Double tanfValue;
    private Double taonfValue;
    private Double gaValue;
    private Double ssiValue;
    private Double abdValue;
    private Double snapOnly;

    public void setProperties(String[] values) {
        this.groupType = values.length>=1? values[0] : ""; //Expecting first field as mandatory.
        this.countyName = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1] : "";
        this.islandName = values.length>=3?(StringUtils.isEmpty(values[2])) ? "" : values[2] : "";
        this.tanfValue = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.taonfValue = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.gaValue = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.ssiValue = values.length>=7?(StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
        this.abdValue = values.length>=8?(StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
        this.snapOnly = values.length>=9?(StringUtils.isEmpty(values[8])) ? 0 : Double.parseDouble(values[8]) : 0;
    }
}
