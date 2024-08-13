package com.jasper.reports.controller;

import com.jasper.reports.model.PrintRequestBodyObj;
import com.jasper.reports.model.RequestBodyObj;
import com.jasper.reports.services.ReportsGenerationService;
import com.jasper.reports.validator.ReportValidator;
import jakarta.validation.Valid;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/")
public class ReportsController {

    private static final Logger log = LoggerFactory.getLogger(ReportsController.class);

    @Autowired
    ReportValidator validator;
    @Autowired
    ReportsGenerationService service;

    @RequestMapping(value = "/hello/name/{name}", method = RequestMethod.GET)
    public ResponseEntity<String> getGreatingsWithName(@PathVariable(name = "name") String name) {
        System.out.println("Hello " + name);
        log.info("Hello {}", name);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @RequestMapping(value = "/generateReport", method = RequestMethod.POST)
    public ResponseEntity<String> generateReportPost(@Valid @RequestBody RequestBodyObj requestBodyObj) {
        validator.validate(requestBodyObj);
        System.out.println("Hello, Request Body is: " + requestBodyObj.toString());
        log.info("Hello, Request Body is:  {}", requestBodyObj.toString());
        service.generateReport(requestBodyObj);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

    @RequestMapping(value = "/printReport", method = RequestMethod.POST)
    public ResponseEntity<String> printReportPost(@NotNull @RequestBody PrintRequestBodyObj requestBodyObj) {
        validator.validate(requestBodyObj);
        System.out.println("Hello "+ ToStringBuilder.reflectionToString(requestBodyObj, ToStringStyle.JSON_STYLE));
        log.info("Hello {}",ToStringBuilder.reflectionToString(requestBodyObj, ToStringStyle.JSON_STYLE));
        service.printReport(requestBodyObj);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }

}