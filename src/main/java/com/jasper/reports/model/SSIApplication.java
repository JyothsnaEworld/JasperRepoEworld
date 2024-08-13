package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SSIApplication extends BaseModel {

    @JsonProperty("dateApplied")
    private String dateAppliedTxt;
    @JsonProperty("applicationStatus")
    private String applicationStatusTxt;
    @JsonProperty("loanAgreementSignedDate")
    private String loanAgreementSignedDateTxt;
    @JsonProperty("sentDate")
    private String sentDateTxt;

    public String getDateAppliedTxt() {
        return dateAppliedTxt;
    }

    public void setDateAppliedTxt(String dateAppliedTxt) {
        this.dateAppliedTxt = dateAppliedTxt;
    }

    public String getApplicationStatusTxt() {
        return applicationStatusTxt;
    }

    public void setApplicationStatusTxt(String applicationStatusTxt) {
        this.applicationStatusTxt = applicationStatusTxt;
    }

    public String getLoanAgreementSignedDateTxt() {
        return loanAgreementSignedDateTxt;
    }

    public void setLoanAgreementSignedDateTxt(String loanAgreementSignedDateTxt) {
        this.loanAgreementSignedDateTxt = loanAgreementSignedDateTxt;
    }

    public String getSentDateTxt() {
        return sentDateTxt;
    }

    public void setSentDateTxt(String sentDateTxt) {
        this.sentDateTxt = sentDateTxt;
    }
}
