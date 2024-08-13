package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KHPD3A4R extends BaseModel{

    private String programTxt;
    private Integer numOahu;
    private Integer numEastHawaii;
    private Integer numWestHawaii;
    private Integer numKauai;
    private Integer numMauiIsland;
    private Integer numMolokai;
    private Integer numLanai;

    public void setProperties(String[] values) {
        this.programTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.numOahu = values.length>=2?((StringUtils.isEmpty(values[1]))?0:Integer.parseInt(values[1])):0;
        this.numEastHawaii = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.numWestHawaii = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.numKauai = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        this.numMauiIsland = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5])):0;
        this.numMolokai = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Integer.parseInt(values[6])):0;
        this.numLanai = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Integer.parseInt(values[7])):0;
    }
}
