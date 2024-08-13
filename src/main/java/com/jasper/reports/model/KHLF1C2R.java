package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHLF1C2R extends BaseModel {

    private String locationTxt;
    private String typeTxt;
    private int numHhApprovedOngoing;
    private int numPersonsApprovedOngoing;
    private int totalBenefitsApprovedOngoing;
    private int numHhApprovedNew;
    private int numPersonsApprovedNew;
    private int totalBenefitsApprovedNew;
    private int averageBenefitPerHh;
    private int numHhDenied;

    public KHLF1C2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.locationTxt = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0].toUpperCase()):"";
        this.typeTxt = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1].toUpperCase()):"";
        this.numHhApprovedOngoing = values.length>=3?((StringUtils.isEmpty(values[2]))?0:Integer.parseInt(values[2])):0;
        this.numPersonsApprovedOngoing = values.length>=4?((StringUtils.isEmpty(values[3]))?0:Integer.parseInt(values[3])):0;
        this.totalBenefitsApprovedOngoing = values.length>=5?((StringUtils.isEmpty(values[4]))?0:Integer.parseInt(values[4])):0;
        this.numHhApprovedNew = values.length>=6?((StringUtils.isEmpty(values[5]))?0:Integer.parseInt(values[5])):0;
        this.numPersonsApprovedNew = values.length>=7?((StringUtils.isEmpty(values[6]))?0:Integer.parseInt(values[6])):0;
        this.totalBenefitsApprovedNew = values.length>=8?((StringUtils.isEmpty(values[7]))?0:Integer.parseInt(values[7])):0;
        this.averageBenefitPerHh = values.length>=9?((StringUtils.isEmpty(values[8]))?0:Integer.parseInt(values[8])):0;
        this.numHhDenied = values.length>=10?((StringUtils.isEmpty(values[9]))?0:Integer.parseInt(values[9])):0;
    }
}
