package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Setter
@Getter
public class IncomePayDetails extends BaseModel {

    @JsonProperty("incomeWagesAndPay")
    private List<IncomeWagesAndPay> incomeWagesAndPayList;
    @JsonProperty("wagesInformation")
    private List<WagesInformation> wagesInformationList;
    @JsonProperty("payStubDocumentation")
    private List<PayStubDocumentation> payStubDocumentationList;
    private JRBeanCollectionDataSource incomeWagesAndPaydataSource;
    public JRBeanCollectionDataSource getIncomeWagesAndPaydataSource() {
        return new JRBeanCollectionDataSource(incomeWagesAndPayList, false);
    }
    private JRBeanCollectionDataSource wagesInformationdataSource;
    public JRBeanCollectionDataSource getWagesInformationdataSource() {
        return new JRBeanCollectionDataSource(wagesInformationList, false);
    }
    private JRBeanCollectionDataSource payStubDocumentationdataSource;
    public JRBeanCollectionDataSource getPayStubDocumentationdataSource() {
        return new JRBeanCollectionDataSource(payStubDocumentationList, false);
    }
    public IncomePayDetails() {

    }

    public List<IncomeWagesAndPay> getIncomeWagesAndPayList() {
        return incomeWagesAndPayList;
    }

    public void setIncomeWagesAndPayList(List<IncomeWagesAndPay> incomeWagesAndPayList) {
        this.incomeWagesAndPayList = incomeWagesAndPayList;
    }

    public List<WagesInformation> getWagesInformationList() {
        return wagesInformationList;
    }

    public void setWagesInformationList(List<WagesInformation> wagesInformationList) {
        this.wagesInformationList = wagesInformationList;
    }

    public List<PayStubDocumentation> getPayStubDocumentationList() {
        return payStubDocumentationList;
    }

    public void setPayStubDocumentationList(List<PayStubDocumentation> payStubDocumentationList) {
        this.payStubDocumentationList = payStubDocumentationList;
    }
}
