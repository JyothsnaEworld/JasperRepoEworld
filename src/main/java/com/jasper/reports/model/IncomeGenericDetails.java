package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Setter
@Getter
public class IncomeGenericDetails extends BaseModel {

    @JsonProperty("incomeGenericInfo")
    private List<IncomeGenericInfo> incomeGenericInfoList;
    @JsonProperty("incomeDetails")
    private List<IncomeDetails> incomeDetailsList;
    private JRBeanCollectionDataSource incomeGenericInfodataSource;
    public JRBeanCollectionDataSource getIncomeGenericInfodataSource() {
        return new JRBeanCollectionDataSource(incomeGenericInfoList, false);
    }
    private JRBeanCollectionDataSource incomeDetailsdataSource;
    public JRBeanCollectionDataSource getIncomeDetailsdataSource() {
        return new JRBeanCollectionDataSource(incomeDetailsList, false);
    }
    public IncomeGenericDetails() {

    }

    public List<IncomeGenericInfo> getIncomeGenericInfoList() {
        return incomeGenericInfoList;
    }

    public void setIncomeGenericInfoList(List<IncomeGenericInfo> incomeGenericInfoList) {
        this.incomeGenericInfoList = incomeGenericInfoList;
    }

    public List<IncomeDetails> getIncomeDetailsList() {
        return incomeDetailsList;
    }

    public void setIncomeDetailsList(List<IncomeDetails> incomeDetailsList) {
        this.incomeDetailsList = incomeDetailsList;
    }
}
