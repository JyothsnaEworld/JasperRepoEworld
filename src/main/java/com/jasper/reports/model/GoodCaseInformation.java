package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GoodCaseInformation extends BaseModel {

    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("date")
    private String dateTxt;
    @JsonProperty("granted")
    private String grantedTxt;
    @JsonProperty("reason")
    private String reasonTxt;

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getDateTxt() {
        return dateTxt;
    }

    public void setDateTxt(String dateTxt) {
        this.dateTxt = dateTxt;
    }

    public String getGrantedTxt() {
        return grantedTxt;
    }

    public void setGrantedTxt(String grantedTxt) {
        this.grantedTxt = grantedTxt;
    }

    public String getReasonTxt() {
        return reasonTxt;
    }

    public void setReasonTxt(String reasonTxt) {
        this.reasonTxt = reasonTxt;
    }
}
