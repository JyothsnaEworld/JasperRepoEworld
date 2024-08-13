package com.jasper.reports.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ReportName {
    EBTMCBC("EBTMCBC"),
    //FAPCSSUMMARY("FAPCSSummary"),
    //SMRFSUMMARY("SMRFSummary"),
    KGADB04R("KGADB04R"),
    KHFT1("KHFT1"),
    KGADB05R("KGADB05R"),
    KGADB11R("KGADB11R"),
    KGADF02R("KGADF02R"),
    KGAMB09R("KGAMB09R"),
    K100471C("K100471C"),
    KGAA18R1("KGAA18R1"),
    KGAA18R2("KGAA18R2"),
    KGAA18R3("KGAA18R3"),
    KGADB06R("KGADB06R"),
    KHPB7D2R("KHPB7D2R"),
    KHGE7P2R("KHGE7P2R"),
    KHGE7R2R("KHGE7R2R"),
    KHGE7V2R("KHGE7V2R"),
    KHGE7K2R("KHGE7K2R"),
    KHGE7M2R("KHGE7M2R"),
    K100471A("K100471A"),
    KGAQB03R("KGAQB03R"),
    KGAQB04R("KGAQB04R"),
    PRINTAPPLICATION("PrintApplication"),
    KGAMB03R("KGAMB03R"),
    KGAMB02R("KGAMB02R"),
    KGAQF03RB("KGAQF03RB"),
    KHPC3B2R("KHPC3B2R"),
    KGAMB11R("KGAMB11R"),
    KGAMB12R("KGAMB12R"),
    KGAMB54R("KGAMB54R"),
    KGAQB01R("KGAQB01R"),
    KGADB02R1("KGADB02R1"),
    KGADB02R2("KGADB02R2"),
    KGADB02R3("KGADB02R3"),
    KHKL1C2R("KHKL1C2R"),
    KGAAB10R("KGAAB10R"),
    KHQA3C2R("KHQA3C2R"),
    KGAAB10RA("KGAAB10RA"),
    KGAMF09R("KGAMF09R"),
    KGAA19R1("KGAA19R1"),
    KGADB23RA("KGADB23RA"),
    KGADB23RB("KGADB23RB"),
    KGADH01RD("KGADH01RD"),
    KGAMF07RA("KGAMF07RA"),
    KGAMF07RB("KGAMF07RB"),
    KGAMF07RC("KGAMF07RC"),
    KHPB1C2R("KHPB1C2R"),
    KHPJ7C3R("KHPJ7C3R"),
    KHKA3E3R("KHKA3E3R"),
    KHKA3E4R("KHKA3E4R"),
    RMTSDetail("RMTSDetail"),
    KGAMB11RB("KGAMB11RB"),
    KGAMB49R("KGAMB49R"),
    KHQA2R2R("KHQA2R2R"),
    KHQA2V2R("KHQA2V2R"),
    KHQA2I2R("KHQA2I2R"),
    KHQA2M2R("KHQA2M2R"),
    KHFB4E2R("KHFB4E2R"),
    KHFB4E3R("KHFB4E3R"),
    KHQA1A2R("KHQA1A2R"),
    KHFT2("KHFT2"),
    KHFT2Excel("KHFT2Excel"),
    KGAMF03R1("KGAMF03R1"),
    KGAMF03R2("KGAMF03R2"),
    KGAMF04R("KGAMF04R"),
    KHPQ1A1R("KHPQ1A1R"),
    KGAMB40R("KGAMB40R"),
    KHKA1YH2R("KHKA1YH2R"),
    KHPU4C3R("KHPU4C3R"),
    KHUA2C3R1("KHUA2C3R1"),
    KHUA2C3R2("KHUA2C3R2"),
    KGAQF03RA("KGAQF03RA"),
    KGAQF04R("KGAQF04R"),
    KGAMB13RNishanth("KGAMB13RNishanth"),
    KGAMB13R("KGAMB13R"),
    KHQA2C2R("KHQA2C2R"),
    RMTSSummary("RMTSSummary"),
    KHGF1L2R("KHGF1L2R"),
    KHGF1P2R("KHGF1P2R"),
    KHPA1J2R("KHPA1J2R"),
    KHPA1J3R("KHPA1J3R"),
    KHKA("KHKA"),
    KHKA1("KHKA1"),
    KHKA2("KHKA2"),
    OEReport("OEReport"),
    RReport("RReport"),
    KHPT5C2R("KHPT5C2R"),
    KHUA3C2R("KHUA3C2R"),
    KGAWF01RA("KGAWF01RA"),
    KGAWF01RB("KGAWF01RB"),
    KGAWF01RC("KGAWF01RC"),
    KGAWF01RD("KGAWF01RD"),
    KGAWF03R("KGAWF03R"),
    KGAW03RA("KGAW03RA"),
    KHKA1Y2R("KHKA1Y2R"),
    KHPU4C2R("KHPU4C2R"),
    KHQA5C2R("KHQA5C2R"),
    KHQB5D2R("KHQB5D2R"),
    KHQC7C2R("KHQC7C2R"),
    KHQC7C2RSummary("KHQC7C2RSummary"),
    KHFM2I2R("KHFM2I2R"),
    KGAQ14C1R("KGAQ14C1R"),
    KHPQ1A4R("KHPQ1A4R"),
    KHQC4A1R("KHQC4A1R"),
    KHFR1D5R("KHFR1D5R"),
    KHKL1D2R("KHKL1D2R"),
    K100471S("K100471S"),
    KHGF9B2R("KHGF9B2R"),
    KHGF9B3R("KHGF9B3R"),
    KGAQ14("KGAQ14"),
    KHGF1F2R("KHGF1F2R"),
    MCQReport("MCQReport"),
    KHPD3A3R("KHPD3A3R"),
    KHPD3A4R("KHPD3A4R"),
    KHPD3A7R("KHPD3A7R"),
    KHPD3A8R("KHPD3A8R"),
    KHFB7("KHFB7"),
    KHGE5E2R("KHGE5E2R"),
    KHLF1C2R("KHLF1C2R"),
    KGAMB19R("KGAMB19R"),
    KHGE7G2R("KHGE7G2R"),
    KHGE7G2RExcel("KHGE7G2RExcel"),
    KHGE7G3R("KHGE7G3R"),
    KHGE7G3RExcel("KHGE7G3RExcel"),
    KHGE7G4R("KHGE7G4R"),
    KHGE7G4RExcel("KHGE7G4RExcel"),
    SFAASummary("SFAASummary"),
    SFAASummaryExcel("SFAASummaryExcel"),
    TDRJVReport("TDRJVReport"),
    KHPC1B3R("KHPC1B3R"),
    KQ42035("KQ42035");

    private String value;

    private ReportName(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    @JsonCreator
    public static ReportName fromString(String text) {
        ReportName reportName = findType(text);
        if (reportName == null) {
            throw new IllegalArgumentException(text);
        } else {
            return reportName;
        }
    }

    public static ReportName findType(String text) {
        ReportName[] var1 = values();
        int var2 = var1.length;
        for (int i = 0; i < var2; ++i) {
            ReportName name = var1[i];
            if (String.valueOf(name.value).equalsIgnoreCase(text))
                return name;
        }
        return null;
    }

    public String toString() {
        return this.value;
    }
}
