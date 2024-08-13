package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHQB5D2R extends BaseModel {

    private String islandName;
    private Integer rrNum;
    private Integer rnNum;
    private Integer rcNum;
    private Integer rpNum;


    public KHQB5D2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.islandName =  values.length>=1?values[0]:"";
        this.rrNum = values.length>=2?((StringUtils.isEmpty(values[1]))?0:Integer.parseInt(values[1])):0;
        this.rnNum = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.rcNum = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.rpNum = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
    }
}