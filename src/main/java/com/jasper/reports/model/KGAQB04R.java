package com.jasper.reports.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.util.StringUtils;

@Setter
@Getter
@NoArgsConstructor
public class KGAQB04R extends BaseModel {
    private Integer oneCurrCase;
    private Integer oneFrmrCase;
    private Double oneCurrAmt;
    private Double oneFrmrAmt;
    private Integer oneACurrCase;
    private Integer oneAFrmrCase;
    private Double oneACurrAmt;
    private Double oneAFrmrAmt;
    private Integer twoCurrCase;
    private Integer twoFrmrCase;
    private Double twoCurrAmt;
    private Double twoFrmrAmt;
    private Integer threeCurrCase;
    private Integer threeFrmrCase;
    private Double threeCurrAmt;
    private Double threeFrmrAmt;
    private Integer fourCurrCase;
    private Integer fourFrmrCase;
    private Double fourCurrAmt;
    private Double fourFrmrAmt;
    private Integer fiveCurrCase;
    private Integer fiveFrmrCase;
    private Double fiveCurrAmt;
    private Double fiveFrmrAmt;
    private Integer sixCurrCase;
    private Integer sixFrmrCase;
    private Double sixCurrAmt;
    private Double sixFrmrAmt;
    private String prgTxt;

    public void setProperties(String[] values) {
        this.oneCurrCase = values.length>=1?(StringUtils.isEmpty(values[0])) ? 0 : Integer.parseInt(values[0]) : 0;
        this.oneFrmrCase = values.length>=2?(StringUtils.isEmpty(values[1])) ? 0 : Integer.parseInt(values[1]) : 0;
        this.oneCurrAmt = values.length>=3?(StringUtils.isEmpty(values[2])) ? 0 : Double.parseDouble(values[2]) : 0;
        this.oneFrmrAmt = values.length>=4?(StringUtils.isEmpty(values[3])) ? 0 : Double.parseDouble(values[3]) : 0;
        this.oneACurrCase = values.length>=5?(StringUtils.isEmpty(values[4])) ? 0 : Integer.parseInt(values[4]) : 0;
        this.oneAFrmrCase = values.length>=6?(StringUtils.isEmpty(values[5])) ? 0 : Integer.parseInt(values[5]) : 0;
        this.oneACurrAmt = values.length>=7?(StringUtils.isEmpty(values[6])) ? 0 : Double.parseDouble(values[6]) : 0;
        this.oneAFrmrAmt = values.length>=8?(StringUtils.isEmpty(values[7])) ? 0 : Double.parseDouble(values[7]) : 0;
        this.twoCurrCase = values.length>=9?(StringUtils.isEmpty(values[8])) ? 0 : Integer.parseInt(values[8]) : 0;
        this.twoFrmrCase = values.length>=10?(StringUtils.isEmpty(values[9])) ? 0 : Integer.parseInt(values[9]) : 0;
        this.twoCurrAmt = values.length>=11?(StringUtils.isEmpty(values[10])) ? 0 : Double.parseDouble(values[10]) : 0;
        this.twoFrmrAmt = values.length>=12?(StringUtils.isEmpty(values[11])) ? 0 : Double.parseDouble(values[11]) : 0;
        this.threeCurrCase = values.length>=13?(StringUtils.isEmpty(values[12])) ? 0 : Integer.parseInt(values[12]) : 0;
        this.threeFrmrCase = values.length>=14?(StringUtils.isEmpty(values[13])) ? 0 : Integer.parseInt(values[13]) : 0;
        this.threeCurrAmt = values.length>=15?(StringUtils.isEmpty(values[14])) ? 0 : Double.parseDouble(values[14]) : 0;
        this.threeFrmrAmt = values.length>=16?(StringUtils.isEmpty(values[15])) ? 0 : Double.parseDouble(values[15]) : 0;
        this.fourCurrCase = values.length>=17?(StringUtils.isEmpty(values[16])) ? 0 : Integer.parseInt(values[16]) : 0;
        this.fourFrmrCase = values.length>=18?(StringUtils.isEmpty(values[17])) ? 0 : Integer.parseInt(values[17]) : 0;
        this.fourCurrAmt = values.length>=19?(StringUtils.isEmpty(values[18])) ? 0 : Double.parseDouble(values[18]) : 0;
        this.fourFrmrAmt = values.length>=20?(StringUtils.isEmpty(values[19])) ? 0 : Double.parseDouble(values[19]) : 0;
        this.fiveCurrCase = values.length>=21?(StringUtils.isEmpty(values[20])) ? 0 : Integer.parseInt(values[20]) : 0;
        this.fiveFrmrCase = values.length>=22?(StringUtils.isEmpty(values[21])) ? 0 : Integer.parseInt(values[21]) : 0;
        this.fiveCurrAmt = values.length>=23?(StringUtils.isEmpty(values[22])) ? 0 : Double.parseDouble(values[22]) : 0;
        this.fiveFrmrAmt = values.length>=24?(StringUtils.isEmpty(values[23])) ? 0 : Double.parseDouble(values[23]) : 0;
        this.sixCurrCase = values.length>=25?(StringUtils.isEmpty(values[24])) ? 0 : Integer.parseInt(values[24]) : 0;
        this.sixFrmrCase = values.length>=26?(StringUtils.isEmpty(values[25])) ? 0 : Integer.parseInt(values[25]) : 0;
        this.sixCurrAmt = values.length>=27?(StringUtils.isEmpty(values[26])) ? 0 : Double.parseDouble(values[26]) : 0;
        //this.sixFrmrAmt = (StringUtils.isEmpty(values[27])) ? 0 : Double.parseDouble(values[27]);
        this.sixFrmrAmt = values.length>=28?(StringUtils.isEmpty(values[27])) ? 0 : Double.parseDouble(values[27]) : 0;
        this.prgTxt = values.length>=29?(StringUtils.isEmpty(values[28])) ? "" : values[28] : "";
    }
}
