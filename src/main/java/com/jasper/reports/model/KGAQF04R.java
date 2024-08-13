package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGAQF04R extends BaseModel {
    private Integer noIpvOffsets;
    private Integer noIheOffsets;
    private Integer noAeOffsets;
    private double amtIpvOffsets;
    private double amtIpvOffsetAdj;
    private double amtIheOffsets;
    private double amtIheOffsetAdj;
    private double amtAeOffsets;
    private double amtAeOffsetAdj;
    private Integer totalRefunds;
    private double newRefunds;
    private double newRefundAdj;

    public KGAQF04R() {
    }

    @Override
    public void setProperties(String[] values) {
        this.noIpvOffsets = values.length >= 1 ? (StringUtils.isEmpty(values[0])) ? 0 : Integer.parseInt(values[0]) : 0;
        this.noIheOffsets = values.length >= 2 ? (StringUtils.isEmpty(values[1])) ? 0 : Integer.parseInt(values[1]) : 0;
        this.noAeOffsets = values.length >= 3 ? (StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2]) : 0;
        this.amtIpvOffsets = values.length >= 4 ? (StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.amtIpvOffsetAdj = values.length >= 5 ? (StringUtils.isEmpty(values[4])) ? 0 : Double.parseDouble(values[4]) : 0;
        this.amtIheOffsets = values.length >= 6 ? (StringUtils.isEmpty(values[5])) ? 0 : Double.parseDouble(values[5]) : 0;
        this.amtIheOffsetAdj = values.length >= 7 ? (StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
        this.amtAeOffsets = values.length >= 8 ? (StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
        this.amtAeOffsetAdj = values.length >= 9 ? (StringUtils.isEmpty(values[8])) ? 0 : Double.parseDouble(values[8]) : 0;
        this.totalRefunds = values.length >= 10 ? (StringUtils.isEmpty(values[9])) ? 0 : Integer.parseInt(values[9]) : 0;
        this.newRefunds = values.length >= 11 ? (StringUtils.isEmpty(values[10])) ? 0 : Double.parseDouble(values[10]) : 0;
        this.newRefundAdj = values.length >= 12 ? (StringUtils.isEmpty(values[11])) ? 0 : Double.parseDouble(values[11]) : 0;
    }
}
