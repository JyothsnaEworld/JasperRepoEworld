package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KHGE5E2R extends BaseModel{
    private String txtProcessingCenter;
    private Integer numCashOnlyEbtAccts;
    private Integer numCashOnlyDirctDpsts;
    private Integer numFsOnlyEbtAccts;
    private Integer numCashAndFsEbtAccts;
    private Integer numCashWithDirctDpstsAndFsEbt;
    private Integer numDirctDpsts;

    public void setProperties(String [] values) {
        this.txtProcessingCenter = values.length>=1?(StringUtils.isEmpty(values[0])) ? "" : values[0] : "";
        this.numCashOnlyEbtAccts = values.length>=2?(StringUtils.isEmpty(values[1])) ? 0 :  Integer.parseInt(values[1]) : 0;
        this.numCashOnlyDirctDpsts = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 :  Integer.parseInt(values[2]) : 0;
        this.numFsOnlyEbtAccts = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 :  Integer.parseInt(values[3]) : 0;
        this.numCashAndFsEbtAccts = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 :  Integer.parseInt(values[4]) : 0;
        this.numCashWithDirctDpstsAndFsEbt = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 :  Integer.parseInt(values[5]) : 0;
        this.numDirctDpsts = values.length>=7?(StringUtils.isEmpty(values[6])) ? 0 :  Integer.parseInt(values[6]) : 0;
    }
}
