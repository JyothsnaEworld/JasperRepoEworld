package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Setter
@Getter
public class IncomePay extends BaseModel {

    @JsonProperty("incomePayDetails")
    private List<IncomePayDetails> incomePayDetailsList;
    private JRBeanCollectionDataSource incomePayDetailsdataSource;
    public JRBeanCollectionDataSource getIncomePayDetailsdataSource() {
        return new JRBeanCollectionDataSource(incomePayDetailsList, false);
    }
    public IncomePay() {

    }

    public List<IncomePayDetails> getIncomePayDetailsList() {
        return incomePayDetailsList;
    }

    public void setIncomePayDetailsList(List<IncomePayDetails> incomePayDetailsList) {
        this.incomePayDetailsList = incomePayDetailsList;
    }
}
