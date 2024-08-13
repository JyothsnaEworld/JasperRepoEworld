package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class EBTMCBC extends BaseModel{
    private String txtSection;
    private Integer numCashOnlyEbtAccts;
    private Integer numCashOnlyDirctDpsts;
    private Integer numFsOnlyEbtAccts;
    private Integer numCashAndFsEbtAccts;
    private Integer numCashWithDirctDpstsAndFsEbt;
    private Integer numDirctDpsts;

    public void setProperties(String [] values) {
        this.txtSection = values[0];
        this.numCashOnlyEbtAccts = Integer.parseInt(values[1]);
        this.numCashOnlyDirctDpsts = Integer.parseInt(values[2]);
        this.numFsOnlyEbtAccts = Integer.parseInt(values[3]);
        this.numCashAndFsEbtAccts = Integer.parseInt(values[4]);
        this.numCashWithDirctDpstsAndFsEbt = Integer.parseInt(values[5]);
        this.numDirctDpsts = Integer.parseInt(values[6]);
    }
}
