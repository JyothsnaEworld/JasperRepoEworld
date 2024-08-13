package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Setter
@Getter
public class IncomeSelfEmploymentDetails extends BaseModel {

    @JsonProperty("incomeSelfEmploymentInfo")
    private List<IncomeSelfEmploymentInfo> incomeSelfEmploymentInfoList;
    @JsonProperty("selfEmploymentIncomeAndExpenses")
    private List<SelfEmploymentIncomeAndExpenses> selfEmploymentIncomeAndExpensesList;
    @JsonProperty("incomeAndExpense")
    private List<IncomeAndExpense> incomeAndExpenseList;
    private JRBeanCollectionDataSource incomeSelfEmploymentInfodataSource;
    public JRBeanCollectionDataSource getIncomeSelfEmploymentInfodataSource() {
        return new JRBeanCollectionDataSource(incomeSelfEmploymentInfoList, false);
    }
    private JRBeanCollectionDataSource selfEmploymentIncomeAndExpensesdataSource;
    public JRBeanCollectionDataSource getSelfEmploymentIncomeAndExpensesdataSource() {
        return new JRBeanCollectionDataSource(selfEmploymentIncomeAndExpensesList, false);
    }
    private JRBeanCollectionDataSource incomeAndExpensedataSource;
    public JRBeanCollectionDataSource getIncomeAndExpensedataSource() {
        return new JRBeanCollectionDataSource(incomeAndExpenseList, false);
    }
    public IncomeSelfEmploymentDetails() {

    }

    public List<IncomeSelfEmploymentInfo> getIncomeSelfEmploymentInfoList() {
        return incomeSelfEmploymentInfoList;
    }

    public void setIncomeSelfEmploymentInfoList(List<IncomeSelfEmploymentInfo> incomeSelfEmploymentInfoList) {
        this.incomeSelfEmploymentInfoList = incomeSelfEmploymentInfoList;
    }

    public List<SelfEmploymentIncomeAndExpenses> getSelfEmploymentIncomeAndExpensesList() {
        return selfEmploymentIncomeAndExpensesList;
    }

    public void setSelfEmploymentIncomeAndExpensesList(List<SelfEmploymentIncomeAndExpenses> selfEmploymentIncomeAndExpensesList) {
        this.selfEmploymentIncomeAndExpensesList = selfEmploymentIncomeAndExpensesList;
    }

    public List<IncomeAndExpense> getIncomeAndExpenseList() {
        return incomeAndExpenseList;
    }

    public void setIncomeAndExpenseList(List<IncomeAndExpense> incomeAndExpenseList) {
        this.incomeAndExpenseList = incomeAndExpenseList;
    }
}
