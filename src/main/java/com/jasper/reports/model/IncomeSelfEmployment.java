package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import java.util.List;

@Setter
@Getter
public class IncomeSelfEmployment extends BaseModel {

    @JsonProperty("incomeSelfEmploymentDetails")
    private List<IncomeSelfEmploymentDetails> incomeSelfEmploymentDetailsList;
    private JRBeanCollectionDataSource incomeSelfEmploymentDetailsdataSource;
    public JRBeanCollectionDataSource getIncomeSelfEmploymentDetailsdataSource() {
        return new JRBeanCollectionDataSource(incomeSelfEmploymentDetailsList, false);
    }
    public IncomeSelfEmployment() {

    }

    public List<IncomeSelfEmploymentDetails> getIncomeSelfEmploymentDetailsList() {
        return incomeSelfEmploymentDetailsList;
    }

    public void setIncomeSelfEmploymentDetailsList(List<IncomeSelfEmploymentDetails> incomeSelfEmploymentDetailsList) {
        this.incomeSelfEmploymentDetailsList = incomeSelfEmploymentDetailsList;
    }
}
