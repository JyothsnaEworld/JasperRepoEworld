package com.jasper.reports.validator.impl;

import com.jasper.reports.model.PrintRequestBodyObj;
import com.jasper.reports.model.RequestBodyObj;
import com.jasper.reports.validator.ReportValidator;
import org.springframework.stereotype.Service;

@Service
public class ReportValidatorImpl implements ReportValidator {

    @Override
    public void validate(RequestBodyObj requestBodyObj) {
        return;
    }
    @Override
    public void validate(PrintRequestBodyObj requestBodyObj) {
        return;
    }
}
