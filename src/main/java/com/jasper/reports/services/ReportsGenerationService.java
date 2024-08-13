package com.jasper.reports.services;

import com.jasper.reports.model.PrintRequestBodyObj;
import com.jasper.reports.model.RequestBodyObj;
import org.jvnet.hk2.annotations.Contract;

@Contract
public interface ReportsGenerationService {

    public void generateReport(RequestBodyObj requestBodyObj);

    public void printReport(PrintRequestBodyObj requestBodyObj);

}
