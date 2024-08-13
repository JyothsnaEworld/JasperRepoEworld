package com.jasper.reports.validator;

import com.jasper.reports.model.PrintRequestBodyObj;
import com.jasper.reports.model.RequestBodyObj;
import org.jvnet.hk2.annotations.Contract;

@Contract
public interface ReportValidator {

    public void validate(RequestBodyObj requestBodyObj);
    public void validate(PrintRequestBodyObj requestBodyObj);
}
