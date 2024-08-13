package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Setter
@Getter
public class IncomeGeneric extends BaseModel {

    @JsonProperty("incomeGenericDetails")
    private List<IncomeGenericDetails> incomeGenericDetailsList;
    private JRBeanCollectionDataSource incomeGenericDetailsdataSource;
    public JRBeanCollectionDataSource getIncomeGenericDetailsdataSource() {
        return new JRBeanCollectionDataSource(incomeGenericDetailsList, false);
    }
    public IncomeGeneric() {

    }

    public List<IncomeGenericDetails> getIncomeGenericDetailsList() {
        return incomeGenericDetailsList;
    }

    public void setIncomeGenericDetailsList(List<IncomeGenericDetails> incomeGenericDetailsList) {
        this.incomeGenericDetailsList = incomeGenericDetailsList;
    }
}
