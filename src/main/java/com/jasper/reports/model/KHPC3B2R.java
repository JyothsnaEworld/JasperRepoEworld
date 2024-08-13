package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KHPC3B2R extends BaseModel{
    public String reasonCode;
    public String rptMnth;
    public Integer snap;
    public Integer aabd;
    public Integer ga;
    public Integer domiciliaryCare;
    public Integer refugee;
    public Integer repatriate;
    public Integer tanf;
    public Integer taonf;

    @Override
    public void setProperties(String[] values) {
        this.reasonCode = values.length>=1?(StringUtils.isEmpty(values[0])?"":values[0]):"";
        this.rptMnth = values.length>=2?(StringUtils.isEmpty(values[1])?"":values[1]):"";
        this.snap = values.length>=3?(StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2]):0;
        this.aabd = values.length>=4?(StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3]):0;
        this.ga = values.length>=5?(StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4]):0;
        this.domiciliaryCare = values.length>=6?(StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5]):0;
        this.refugee = values.length>=7?(StringUtils.isEmpty(values[6]))?0:Integer.parseInt(values[6]):0;
        this.repatriate = values.length>=8?(StringUtils.isEmpty(values[7]))?0:Integer.parseInt(values[7]):0;
        this.tanf = values.length>=9?(StringUtils.isEmpty(values[8]))?0:Integer.parseInt(values[8]):0;
        this.taonf = values.length>=10?(StringUtils.isEmpty(values[9]))?0:Integer.parseInt(values[9]):0;
    }
}