package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KGADB05R extends BaseModel {
    private String prgType;
    private String errType;
    private String tranType;
    private String ssn;
    private String clmnbr;
    private String fstNme;
    private String midNme;
    private String lastNme;
    private String dateIncrd;
    private String chnRsn;
    private String statCd;
    private double amount;

    public KGADB05R(){

    }


    @Override
    public void setProperties(String[] values) {
        this.prgType = values.length>=1?((StringUtils.isEmpty(values[0]))?"":values[0]):"";
        this.errType = values.length>=2?((StringUtils.isEmpty(values[1]))?"":values[1]):"";
        this.tranType = values.length>=3?((StringUtils.isEmpty(values[2]))?"":values[2]):"";
        this.ssn = values.length>=4?((StringUtils.isEmpty(values[3]))?"":values[3]):"";
        this.clmnbr = values.length>=5?((StringUtils.isEmpty(values[4]))?"":values[4]):"";
        this.fstNme = values.length>=6?((StringUtils.isEmpty(values[5]))?"":values[5].toUpperCase()):"";
        this.midNme = values.length>=7?((StringUtils.isEmpty(values[6]))?"":values[6].toUpperCase()):"";
        this.lastNme = values.length>=8?((StringUtils.isEmpty(values[7]))?"":values[7].toUpperCase()):"";
        this.dateIncrd = values.length>=9?((StringUtils.isEmpty(values[8]))?"":values[8]):"";
        this.chnRsn = values.length>=10?((StringUtils.isEmpty(values[9]))?"":values[9]):"";
        this.statCd = values.length>=11?((StringUtils.isEmpty(values[10]))?"":values[10]):"";
        this.amount = values.length>=12?((StringUtils.isEmpty(values[11]))?0:Double.parseDouble(values[11])):0;
    }
}
