package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHUA2C3R2 extends BaseModel {

    private String grpName;
    private String pcName;
    private Integer numPsychological;
    private Integer numPhysical;
    private Integer numDual;

    public KHUA2C3R2() {

    }

    @Override
    public void setProperties(String[] values) {
        this.grpName = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0]:"";
        this.pcName = values.length>=2?(StringUtils.isEmpty(values[1])) ? "" : values[1]:"";
        this.numPsychological = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]):0;
        this.numPhysical = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3]):0;
        this.numDual = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]):0;
        }
}