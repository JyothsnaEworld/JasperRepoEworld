package com.jasper.reports.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
public class KHPB7D2R extends BaseModel {

    private String unitName;
    private String rowName;
    private int withEarnings;
    private int unEarnedIncome;
    private int withNoIncome;
    private int suspCases;
    private int extMed;
    private int errcOverDue;
    private int errcDue;
    private int errrcProcess;
    private int merfsDue;
    private int merfsProcess;
    private int moBeg;
    private int opnd;
    private int tri;
    private int tro;
    private int closed;
    private int moEnd;

    public KHPB7D2R(){

    }

    @Override
    public void setProperties(String[] values) {
        this.unitName = (values.length >= 1) ? ((StringUtils.isEmpty(values[0])) ? "" : values[0]):"";
        this.rowName = (values.length >= 2) ? ((StringUtils.isEmpty(values[1])) ? "" : values[1]):"";
        this.withEarnings = (values.length >= 3) ? ((StringUtils.isEmpty(values[2])) ? 0 : Integer.parseInt(values[2])) : 0;
        this.unEarnedIncome = (values.length >= 4) ? ((StringUtils.isEmpty(values[3])) ? 0 : Integer.parseInt(values[3])) : 0;
        this.withNoIncome = (values.length >= 5) ? ((StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4])) : 0;
        this.suspCases = (values.length >= 6) ? ((StringUtils.isEmpty(values[5])) ? 0 : Integer.parseInt(values[5])) : 0;
        this.extMed = (values.length >= 7) ? ((StringUtils.isEmpty(values[6])) ? 0 : Integer.parseInt(values[6])) : 0;
        this.errcOverDue = (values.length >= 8) ? ((StringUtils.isEmpty(values[7])) ? 0 : Integer.parseInt(values[7])) : 0;
        this.errcDue = (values.length >= 9) ? ((StringUtils.isEmpty(values[8])) ? 0 : Integer.parseInt(values[8])) : 0;
        this.errrcProcess = (values.length >= 10) ? ((StringUtils.isEmpty(values[9])) ? 0 : Integer.parseInt(values[9])) : 0;
        this.merfsDue = (values.length >= 11) ? ((StringUtils.isEmpty(values[10])) ? 0 : Integer.parseInt(values[10])) : 0;
        this.merfsProcess = (values.length >= 12) ? ((StringUtils.isEmpty(values[11])) ? 0 : Integer.parseInt(values[11])) : 0;
        this.moBeg = (values.length >= 13) ? ((StringUtils.isEmpty(values[12])) ? 0 : Integer.parseInt(values[12])) : 0;
        this.opnd = (values.length >= 14) ? ((StringUtils.isEmpty(values[13])) ? 0 : Integer.parseInt(values[13])) : 0;
        this.tri = (values.length >= 15) ? ((StringUtils.isEmpty(values[14])) ? 0 : Integer.parseInt(values[14])) : 0;
        this.tro = (values.length >= 16) ? ((StringUtils.isEmpty(values[15])) ? 0 : Integer.parseInt(values[15])) : 0;
        this.closed = (values.length >= 17) ? ((StringUtils.isEmpty(values[16])) ? 0 : Integer.parseInt(values[16])) : 0;
        this.moEnd = (values.length >= 18) ? ((StringUtils.isEmpty(values[17])) ? 0 : Integer.parseInt(values[17])) : 0;
    }
}
