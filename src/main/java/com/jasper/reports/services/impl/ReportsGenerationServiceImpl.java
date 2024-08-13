package com.jasper.reports.services.impl;


import com.jasper.reports.constants.ReportFormat;
import com.jasper.reports.constants.ReportMonthNumTxt;
import com.jasper.reports.util.RemoveBOMFromFile;
import com.jasper.reports.model.*;
import com.jasper.reports.services.ReportsGenerationService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.data.JRMapArrayDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleXlsReportConfiguration;
import net.sf.jasperreports.export.SimpleXlsxReportConfiguration;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.WeekFields;
import java.util.*;
import java.util.regex.Pattern;

import static com.jasper.reports.constants.AppConstants.UNDER_SCORE;

@Service
public class ReportsGenerationServiceImpl implements ReportsGenerationService {
    static ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    private static final Logger log = LoggerFactory.getLogger(ReportsGenerationServiceImpl.class);
    private String rptName;
    private String rptMonthTxt;
    private String rptYrYYYY;
    private String inputFilePath;
    private String fileName;
    private String filePath;
    private String destFileName;

    @Override
    public void generateReport(RequestBodyObj requestBodyObj) {
        try {

            Map<String, Object> parameters = buildParameters(requestBodyObj);

            String line = "";
            List<BaseModel> list = new ArrayList<>();
            String delim = ",";
            String escapeChar = "\\";
            String regex = "(?<!"+Pattern.quote(escapeChar)+")" + Pattern.quote(delim);

            try (BufferedReader br = removeBOM(inputFilePath)) {
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    //String[] values = line.split(regex);
                    String[] outputArray = line.split(regex);
                    String[] values = new String[outputArray.length];
                    for (int i = 0; i < values.length; i++) {
                        values[i] = outputArray[i].replace("\\,", ",");
                    }
                    BaseModel singlerow = (BaseModel) Class.forName("com.jasper.reports.model." + rptName).newInstance();
                    singlerow.setProperties(values);
                    list.add(singlerow);
                    singlerow = null;
                }
            }

            if (requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAWF03R"))
            {
                JRBeanCollectionDataSource KGAWF03RAddDataSource = new JRBeanCollectionDataSource(list);
                parameters.put("KGAWF03RAddDataSource", KGAWF03RAddDataSource);
                String srFileName1 = "templates/KGAWF03RAddSR.jrxml";
                String srFilePath1 = new File(classLoader.getResource(srFileName1).getFile()).getPath();
                JasperReport subreport1 = JasperCompileManager.compileReport(srFilePath1);
                parameters.put("KGAWF03RAddSR", subreport1);
                JRBeanCollectionDataSource KGAWF03RChangeDataSource = new JRBeanCollectionDataSource(list);
                parameters.put("KGAWF03RChangeDataSource", KGAWF03RChangeDataSource);
                String srFileName2 = "templates/KGAWF03RChangeSR.jrxml";
                String srFilePath2 = new File(classLoader.getResource(srFileName2).getFile()).getPath();
                JasperReport subreport2 = JasperCompileManager.compileReport(srFilePath2);
                parameters.put("KGAWF03RChangeSR", subreport2);
                JRBeanCollectionDataSource KGAWF03RDeleteDataSource = new JRBeanCollectionDataSource(list);
                parameters.put("KGAWF03RDeleteDataSource", KGAWF03RDeleteDataSource);
                String srFileName3 = "templates/KGAWF03RDeleteSR.jrxml";
                String srFilePath3 = new File(classLoader.getResource(srFileName3).getFile()).getPath();
                JasperReport subreport3 = JasperCompileManager.compileReport(srFilePath3);
                parameters.put("KGAWF03RDeleteSR", subreport3);
                JRBeanCollectionDataSource KGAWF03RRejectDataSource = new JRBeanCollectionDataSource(list);
                parameters.put("KGAWF03RRejectDataSource", KGAWF03RRejectDataSource);
                String srFileName4 = "templates/KGAWF03RRejectSR.jrxml";
                String srFilePath4 = new File(classLoader.getResource(srFileName4).getFile()).getPath();
                JasperReport subreport4 = JasperCompileManager.compileReport(srFilePath4);
                parameters.put("KGAWF03RRejectSR", subreport4);
            }

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);

            if (ReportFormat.PDF == requestBodyObj.getReportFormat()) {
                JasperReport report = JasperCompileManager.compileReport(filePath);
                JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
                JasperExportManager.exportReportToPdfFile(print, destFileName);
            } else if (ReportFormat.XLS == requestBodyObj.getReportFormat()) {
                JasperDesign jasperDesign = JRXmlLoader.load(filePath);
                if (!requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAQB01R") &&
                        !requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAMB11R") &&
                        !requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAMB12R"))
                    jasperDesign.setIgnorePagination(true);
                JasperReport report = JasperCompileManager.compileReport(jasperDesign);
                JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
                JRXlsExporter exporter = new JRXlsExporter();
                print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xls.auto.fit.row","true");
                //print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xls.exclude.origin.band.3","pageHeader");
                //print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xls.ignore.cell.border","false");
                exporter.setExporterInput(new SimpleExporterInput(print));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFileName));
                SimpleXlsReportConfiguration configuration = new SimpleXlsReportConfiguration();
                //configuration.setRemoveEmptySpaceBetweenRows(true);
                configuration.setWhitePageBackground(true);
                exporter.setConfiguration(configuration);
                exporter.exportReport();
                removeXlsGridLines(destFileName,destFileName);
            }else if (ReportFormat.XLSX == requestBodyObj.getReportFormat()) {
                JasperDesign jasperDesign = JRXmlLoader.load(filePath);
                if (!requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAQB01R") &&
                        !requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAMB11R") &&
                        !requestBodyObj.getReportName().getValue().equalsIgnoreCase("KGAMB12R"))
                    jasperDesign.setIgnorePagination(true);
                JasperReport report = JasperCompileManager.compileReport(jasperDesign);
                JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
                JRXlsxExporter exporter = new JRXlsxExporter();
                print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xlsx.auto.fit.row","true");
                //print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xls.exclude.origin.band.3","pageHeader");
                //print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xls.ignore.cell.border","false");
                //print.getPropertiesMap().setProperty("net.sf.jasperreports.export.xlsx.auto.fit.column","true");
                exporter.setExporterInput(new SimpleExporterInput(print));
                exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(destFileName));
                SimpleXlsxReportConfiguration configuration = new SimpleXlsxReportConfiguration();
                //configuration.setRemoveEmptySpaceBetweenRows(true);
                configuration.setWhitePageBackground(true);
                exporter.setConfiguration(configuration);
                exporter.exportReport();
                removeXlsxGridLines(destFileName,destFileName);
            }else {
                log.error("Invalid report format");
            }

            //System.out.println(rptName +" Report for " + rptMonthTxt + " " + rptYrYYYY + " created successfully.");
            log.info("{} report for {} {} created successfully in {} format.", rptName, rptMonthTxt, rptYrYYYY, requestBodyObj.getReportFormat());

        } catch (Exception e) {
            log.error("Exception occurred...{}", e.getMessage());
            e.printStackTrace();
        }
    }

    private void removeXlsGridLines(String inputPath, String outputPath) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(inputPath);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);

            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                HSSFSheet sheet = workbook.getSheetAt(i);
                sheet.setDisplayGridlines(false);
            }

            FileOutputStream fos = new FileOutputStream(outputPath);
            workbook.write(fos);
        } catch (Exception e) {
            log.error("Exception occurred...{}", e.getMessage());
            e.printStackTrace();
        }
    }

    private void removeXlsxGridLines(String inputPath, String outputPath) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(inputPath);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            int numberOfSheets = workbook.getNumberOfSheets();
            for (int i = 0; i < numberOfSheets; i++) {
                XSSFSheet sheet = workbook.getSheetAt(i);
                sheet.setDisplayGridlines(false);
            }

            FileOutputStream fos = new FileOutputStream(outputPath);
            workbook.write(fos);
        } catch (Exception e) {
            log.error("Exception occurred...{}", e.getMessage());
            e.printStackTrace();
        }
    }

    private Map<String, Object> buildParameters(RequestBodyObj requestBodyObj) {

        rptName = requestBodyObj.getReportName().getValue();
        rptMonthTxt = requestBodyObj.getReportMonth().getValue();
        rptYrYYYY = requestBodyObj.getReportYear().toString();
        String rptYrMonthYYYYMM = requestBodyObj.getRptYrMonthYYYYMM();
        String extractTimeStamp = requestBodyObj.getExtractTimeStamp();
        String extractDate = extractDate(extractTimeStamp);
        String extractTime = extractTime(extractTimeStamp);
        String prdFrom = requestBodyObj.getPeriodFrom();
        String prdTo = requestBodyObj.getPeriodTo();
        String rptFormat = requestBodyObj.getReportFormat().getValue().toLowerCase();

        log.info("Report Name is: {}", rptName);
        log.info("Report Month is: {}", rptMonthTxt);
        log.info("Report Year is: {}", rptYrYYYY);
        log.info("Report Year Month (YYYYMM) is: {}", rptYrMonthYYYYMM);
        log.info("Report Extract TimeStamp is: {}", extractTimeStamp);
        log.info("Report Period From is: {}", prdFrom);
        log.info("Report Period To is: {}", prdTo);
        log.info("Report Format is: {}", rptFormat);

        System.out.println("\n ****");

        inputFilePath = "input/" + rptName + UNDER_SCORE + rptMonthTxt + UNDER_SCORE + rptYrYYYY + UNDER_SCORE + extractTimeStamp + ".csv";
        log.info("Input File is: {}", inputFilePath);
        inputFilePath = new File(classLoader.getResource(inputFilePath).getFile()).getPath();
        log.info("Fully qualified path to Input File is: {}", inputFilePath);

        fileName = "templates/" + rptName + ".jrxml";
        filePath = new File(classLoader.getResource(fileName).getFile()).getPath();

        SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyyHHmmss");
        Date date = new Date();

        destFileName = classLoader.getResource("output").getPath() + "/" + rptName + "_" + rptMonthTxt + "_"
                + rptYrYYYY + "_" + extractTimeStamp + "." + rptFormat;

        String rptMonthNumTxt = Enum.valueOf(ReportMonthNumTxt.class, rptMonthTxt.toUpperCase()).getValue();
        String firstDateInMonth = rptMonthNumTxt + "/1/" + rptYrYYYY;
        LocalDate convertedDate = LocalDate.parse(firstDateInMonth, DateTimeFormatter.ofPattern("M/d/yyyy"));
        /*TO DO*/
        //This piece is getting the last day of the month, We need to get the last working day of the month.
        convertedDate = convertedDate.withDayOfMonth(
                convertedDate.getMonth().length(convertedDate.isLeapYear()));
        DateTimeFormatter formatterMMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("rptNameTxt", rptName);
        parameters.put("rptMonthTxt", rptMonthTxt);
        parameters.put("rptYrYYYY", rptYrYYYY);
        parameters.put("rptYrMonthYYYYMM", rptYrMonthYYYYMM);
        parameters.put("rptExtractDtTxt", extractDate);
        parameters.put("rptExtractTSTxt", extractTime);
        parameters.put("rptMonthNumTxt", (Enum.valueOf(ReportMonthNumTxt.class, rptMonthTxt.toUpperCase()).getValue()));
        parameters.put("rptMonthEndDtTxt", convertedDate.format(formatterMMddyyyy));
        parameters.put("prdFrom", prdFrom);
        parameters.put("prdTo", prdTo);
        if(!(prdFrom==null) && !(prdFrom.isEmpty())) {
            LocalDate fromDate = LocalDate.parse(prdFrom, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            int weekOfYear = fromDate.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
            String weekOfYearTxt = String.valueOf(weekOfYear);
            parameters.put("rptCycleWeek", weekOfYearTxt.length() == 1 ? "0" + weekOfYearTxt : weekOfYearTxt);
        }
        return parameters;
    }

    private BufferedReader removeBOM(String inputFilePath) throws IOException {
        BufferedReader br;
        if (RemoveBOMFromFile.isContainBOM(Path.of(inputFilePath))) {
            byte[] removedBOMFromFileContent = RemoveBOMFromFile.removeBom(Path.of(inputFilePath));
            br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(removedBOMFromFileContent)));
        } else {
            br = new BufferedReader(new FileReader(inputFilePath));
        }
        return br;
    }

    @Override
    public void printReport(PrintRequestBodyObj requestBodyObj) {
        try {

            String rptName = requestBodyObj.getReportName().getValue();
            String rptMonthTxt = requestBodyObj.getReportMonth().getValue();
            String rptYrYYYY = requestBodyObj.getReportYear().toString();
            String rptYrMonthYYYYMM = requestBodyObj.getRptYrMonthYYYYMM();
            String extractTimeStamp = requestBodyObj.getExtractTimeStamp();
            String extractDate = extractDate(extractTimeStamp);
            String extractTime = extractTime(extractTimeStamp);
            String prdFrom = requestBodyObj.getPeriodFrom();
            String prdTo = requestBodyObj.getPeriodTo();
            String caseNumberTxt = requestBodyObj.getCaseNumber();

            log.info("**********************************************");
            log.info("Report Name is: {}", rptName);
            log.info("Report Month is: {}", rptMonthTxt);
            log.info("Report Year is: {}", rptYrYYYY);
            log.info("Report Year Month (YYYYMM) is: {}", rptYrMonthYYYYMM);
            log.info("Report Extract TimeStamp is: {}", extractTimeStamp);
            log.info("Report Period From is: {}", prdFrom);
            log.info("Report Period To is: {}", prdTo);
            log.info("Case Number is: {}", caseNumberTxt);
            log.info("**********************************************");

            System.out.println("\n ****");

            String fileName = "templates/PrintApplication.jrxml";
            String filePath = new File(classLoader.getResource(fileName).getFile()).getPath();

            String destFileName = classLoader.getResource("output").getPath() + "/" + rptName + "_" + rptMonthTxt + "_"
                    + rptYrYYYY + "_" + extractTimeStamp + ".pdf";

            String rptMonthNumTxt = Enum.valueOf(ReportMonthNumTxt.class, rptMonthTxt.toUpperCase()).getValue();
            String firstDateInMonth = rptMonthNumTxt + "/1/" + rptYrYYYY;
            LocalDate convertedDate = LocalDate.parse(firstDateInMonth, DateTimeFormatter.ofPattern("M/d/yyyy"));
            convertedDate = convertedDate.withDayOfMonth(
                    convertedDate.getMonth().length(convertedDate.isLeapYear()));
            DateTimeFormatter formatterMMddyyyy = DateTimeFormatter.ofPattern("MM/dd/yyyy");

            Map<String, Object> parameters = new HashMap<String, Object>();
            parameters.put("rptMonthTxt", rptMonthTxt);
            parameters.put("rptYrYYYY", rptYrYYYY);
            parameters.put("rptYrMonthYYYYMM", rptYrMonthYYYYMM);
            parameters.put("rptExtractDtTxt", extractDate);
            parameters.put("rptExtractTSTxt", extractTime);
            parameters.put("rptMonthNumTxt", (Enum.valueOf(ReportMonthNumTxt.class, rptMonthTxt.toUpperCase()).getValue()));
            parameters.put("rptMonthEndDtTxt", convertedDate.format(formatterMMddyyyy));
            parameters.put("prdFrom", prdFrom);
            parameters.put("prdTo", prdTo);
            parameters.put("rptCaseNumberTxt", caseNumberTxt);

            if (requestBodyObj.getHouseholdMembers() != null) {
                if (!requestBodyObj.getHouseholdMembers().isEmpty()) {
                    JRBeanCollectionDataSource householdMembersDataSource = new JRBeanCollectionDataSource(requestBodyObj.getHouseholdMembers());
                    parameters.put("householdMembersDataSet", householdMembersDataSource);
/*                    log.info("householdMemberList Size: {}", requestBodyObj.getHouseholdMember().size());
                    JRBeanCollectionDataSource householdMemberDataSource = new JRBeanCollectionDataSource(requestBodyObj.getHouseholdMember());
                    Map<String,Object> dataSources = new HashMap<>();
                    dataSources.put("householdMemberDataSource", householdMemberDataSource);
                    log.info("dataSources Size: {}", dataSources.size());
                    JRMapArrayDataSource householdMemberArrayDataSource = new JRMapArrayDataSource(new Object[]{dataSources});
                    parameters.put("householdMemberArrayDataSource", householdMemberArrayDataSource);
                    String srFileName = "templates/HouseholdMembersSR.jrxml";
                    String srFilePath = new File(classLoader.getResource(srFileName).getFile()).getPath();
                    JasperReport subreport = JasperCompileManager.compileReport(srFilePath);
                    parameters.put("householdMembersSR", subreport);*/
                }
            }
            if (requestBodyObj.getHouseholdRelationships() != null) {
                if (!requestBodyObj.getHouseholdRelationships().isEmpty()) {
                    JRBeanCollectionDataSource householdRelationshipsDataSource = new JRBeanCollectionDataSource(requestBodyObj.getHouseholdRelationships());
                    parameters.put("householdRelationshipsDataSet", householdRelationshipsDataSource);
                }
            }
            if (requestBodyObj.getAuthorizedRepresentative() != null) {
                if (!requestBodyObj.getAuthorizedRepresentative().isEmpty()) {
                    JRBeanCollectionDataSource authorizedRepresentativeDataSource = new JRBeanCollectionDataSource(requestBodyObj.getAuthorizedRepresentative());
                    parameters.put("authorizedRepresentativeDataSet", authorizedRepresentativeDataSource);
                }
            }
            if (requestBodyObj.getResidencyInformation() != null) {
                if (!requestBodyObj.getResidencyInformation().isEmpty()) {
                    JRBeanCollectionDataSource residencyInformationDataSource = new JRBeanCollectionDataSource(requestBodyObj.getResidencyInformation());
                    parameters.put("residencyInformationDataSet", residencyInformationDataSource);
                }
            }
            if (requestBodyObj.getCommunication() != null) {
                if (!requestBodyObj.getCommunication().isEmpty()) {
                    JRBeanCollectionDataSource communicationDataSource = new JRBeanCollectionDataSource(requestBodyObj.getCommunication());
                    parameters.put("communicationDataSet", communicationDataSource);
                }
            }
            if (requestBodyObj.getCommunicationContact() != null) {
                if (!requestBodyObj.getCommunicationContact().isEmpty()) {
                    JRBeanCollectionDataSource communicationContactDataSource = new JRBeanCollectionDataSource(requestBodyObj.getCommunicationContact());
                    parameters.put("communicationContactDataSet", communicationContactDataSource);
                }
            }
            if (requestBodyObj.getDisqualificationQuestionnaire() != null) {
                if (!requestBodyObj.getDisqualificationQuestionnaire().isEmpty()) {
                    JRBeanCollectionDataSource disqualificationQuestionnaireDataSource = new JRBeanCollectionDataSource(requestBodyObj.getDisqualificationQuestionnaire());
                    parameters.put("disqualificationQuestionnaireDataSet", disqualificationQuestionnaireDataSource);
                }
            }
            if (requestBodyObj.getDisqualification() != null) {
                if (!requestBodyObj.getDisqualification().isEmpty()) {
                    JRBeanCollectionDataSource disqualificationDataSource = new JRBeanCollectionDataSource(requestBodyObj.getDisqualification());
                    parameters.put("disqualificationDataSet", disqualificationDataSource);
                }
            }
            if (requestBodyObj.getNonCitizenship() != null) {
                if (!requestBodyObj.getNonCitizenship().isEmpty()) {
                    JRBeanCollectionDataSource nonCitizenshipDataSource = new JRBeanCollectionDataSource(requestBodyObj.getNonCitizenship());
                    parameters.put("nonCitizenshipDataSet", nonCitizenshipDataSource);
                }
            }
            if (requestBodyObj.getSponsor() != null) {
                if (!requestBodyObj.getSponsor().isEmpty()) {
                    JRBeanCollectionDataSource sponsorDataSource = new JRBeanCollectionDataSource(requestBodyObj.getSponsor());
                    parameters.put("sponsorDataSet", sponsorDataSource);
                }
            }
            if (requestBodyObj.getDisabilityDetail() != null) {
                if (!requestBodyObj.getDisabilityDetail().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDisabilityDetail());
                    parameters.put("disabilityDetailDataSet", dataSource);
                }
            }
            if (requestBodyObj.getCyrcaEvaluation() != null) {
                if (!requestBodyObj.getCyrcaEvaluation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getCyrcaEvaluation());
                    parameters.put("cyrcaEvaluationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDisabilityDetermination() != null) {
                if (!requestBodyObj.getDisabilityDetermination().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDisabilityDetermination());
                    parameters.put("disabilityDeterminationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getGoodCaseInformation() != null) {
                if (!requestBodyObj.getGoodCaseInformation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getGoodCaseInformation());
                    parameters.put("goodCaseInformationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getSsiApplication() != null) {
                if (!requestBodyObj.getSsiApplication().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getSsiApplication());
                    parameters.put("ssiApplicationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getVeteransMilitary() != null) {
                if (!requestBodyObj.getVeteransMilitary().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getVeteransMilitary());
                    parameters.put("veteransMilitaryDataSet", dataSource);
                }
            }
            if (requestBodyObj.getSchoolInformation() != null) {
                if (!requestBodyObj.getSchoolInformation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getSchoolInformation());
                    parameters.put("schoolInformationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getPregnancyInformation() != null) {
                if (!requestBodyObj.getPregnancyInformation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getPregnancyInformation());
                    parameters.put("pregnancyInformationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getTimeOnAidABAWD() != null) {
                if (!requestBodyObj.getTimeOnAidABAWD().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getTimeOnAidABAWD());
                    parameters.put("timeOnAidABAWDDataSet", dataSource);
                }
            }
            if (requestBodyObj.getTimeOnAidABAWDMonths() != null) {
                if (!requestBodyObj.getTimeOnAidABAWDMonths().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getTimeOnAidABAWDMonths());
                    parameters.put("timeOnAidABAWDMonthsDataSet", dataSource);
                }
            }
            if (requestBodyObj.getTimeOnAidTANF() != null) {
                if (!requestBodyObj.getTimeOnAidTANF().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getTimeOnAidTANF());
                    parameters.put("timeOnAidTANFDataSet", dataSource);
                }
            }
            if (requestBodyObj.getTimeOnAidTANFMonths() != null) {
                if (!requestBodyObj.getTimeOnAidTANFMonths().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getTimeOnAidTANFMonths());
                    parameters.put("timeOnAidTANFMonthsDataSet", dataSource);
                }
            }
            if (requestBodyObj.getFtwParticipation() != null) {
                if (!requestBodyObj.getFtwParticipation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getFtwParticipation());
                    parameters.put("ftwParticipationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getEbStatus() != null) {
                if (!requestBodyObj.getEbStatus().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getEbStatus());
                    parameters.put("ebStatusDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDomesticViolence() != null) {
                if (!requestBodyObj.getDomesticViolence().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDomesticViolence());
                    parameters.put("domesticViolenceDataSet", dataSource);
                }
            }
            if (requestBodyObj.getEandtParticipation() != null) {
                if (!requestBodyObj.getEandtParticipation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getEandtParticipation());
                    parameters.put("eandtParticipationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getCooperateWithCSEA() != null) {
                if (!requestBodyObj.getCooperateWithCSEA().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getCooperateWithCSEA());
                    parameters.put("cooperateWithCSEADataSet", dataSource);
                }
            }
            if (requestBodyObj.getAbsentParentInformation() != null) {
                if (!requestBodyObj.getAbsentParentInformation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getAbsentParentInformation());
                    parameters.put("absentParentInformationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getGoodCauseInformation() != null) {
                if (!requestBodyObj.getGoodCauseInformation().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getGoodCauseInformation());
                    parameters.put("goodCauseInformationDataSet", dataSource);
                }
            }
            if (requestBodyObj.getNoGoodCause() != null) {
                if (!requestBodyObj.getNoGoodCause().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getNoGoodCause());
                    parameters.put("noGoodCauseDataSet", dataSource);
                }
            }
            if (requestBodyObj.getPaternity() != null) {
                if (!requestBodyObj.getPaternity().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getPaternity());
                    parameters.put("paternityDataSet", dataSource);
                }
            }
            if (requestBodyObj.getPaternityInformationTwoParents() != null) {
                if (!requestBodyObj.getPaternityInformationTwoParents().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getPaternityInformationTwoParents());
                    parameters.put("paternityInformationTwoParentsDataSet", dataSource);
                }
            }
            if (requestBodyObj.getAssetLiquid() != null) {
                if (!requestBodyObj.getAssetLiquid().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getAssetLiquid());
                    parameters.put("assetLiquidDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDetailsAndOwnershipLiquid() != null) {
                if (!requestBodyObj.getDetailsAndOwnershipLiquid().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDetailsAndOwnershipLiquid());
                    parameters.put("detailsAndOwnershipLiquidDataSet", dataSource);
                }
            }
            if (requestBodyObj.getAssetVehicle() != null) {
                if (!requestBodyObj.getAssetVehicle().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getAssetVehicle());
                    parameters.put("assetVehicleDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDetailsAndOwnershipVehicle() != null) {
                if (!requestBodyObj.getDetailsAndOwnershipVehicle().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDetailsAndOwnershipVehicle());
                    parameters.put("detailsAndOwnershipVehicleDataSet", dataSource);
                }
            }
            if (requestBodyObj.getAssetOther() != null) {
                if (!requestBodyObj.getAssetOther().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getAssetOther());
                    parameters.put("assetOtherDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDetailsAndOwnershipOther() != null) {
                if (!requestBodyObj.getDetailsAndOwnershipOther().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDetailsAndOwnershipOther());
                    parameters.put("detailsAndOwnershipOtherDataSet", dataSource);
                }
            }
            if (requestBodyObj.getIncomePay() != null) {
                if (!requestBodyObj.getIncomePay().isEmpty()) {
                    //log.info("incomePayList Size: {}", requestBodyObj.getIncomePay().size());
                    JRBeanCollectionDataSource incomePayDataSource = new JRBeanCollectionDataSource(requestBodyObj.getIncomePay());
                    Map<String,Object> dataSources = new HashMap<>();
                    dataSources.put("incomePayDataSource", incomePayDataSource);
                    //log.info("dataSources Size: {}", dataSources.size());
                    JRMapArrayDataSource incomePayArrayDataSource = new JRMapArrayDataSource(new Object[]{dataSources});
                    parameters.put("incomePayArrayDataSource", incomePayArrayDataSource);
                    String srFileName = "templates/IncomePaySR.jrxml";
                    String srFilePath = new File(classLoader.getResource(srFileName).getFile()).getPath();
                    JasperReport subreport = JasperCompileManager.compileReport(srFilePath);
                    parameters.put("incomePaySR", subreport);
                }
            }
            if (requestBodyObj.getIncomeGeneric() != null) {
                if (!requestBodyObj.getIncomeGeneric().isEmpty()) {
                    //log.info("incomeGenericList Size: {}", requestBodyObj.getIncomeGeneric().size());
                    JRBeanCollectionDataSource incomeGenericDataSource = new JRBeanCollectionDataSource(requestBodyObj.getIncomeGeneric());
                    Map<String,Object> dataSources = new HashMap<>();
                    dataSources.put("incomeGenericDataSource", incomeGenericDataSource);
                    //log.info("dataSources Size: {}", dataSources.size());
                    JRMapArrayDataSource incomeGenericArrayDataSource = new JRMapArrayDataSource(new Object[]{dataSources});
                    parameters.put("incomeGenericArrayDataSource", incomeGenericArrayDataSource);
                    String srFileName = "templates/IncomeGenericSR.jrxml";
                    String srFilePath = new File(classLoader.getResource(srFileName).getFile()).getPath();
                    JasperReport subreport = JasperCompileManager.compileReport(srFilePath);
                    parameters.put("incomeGenericSR", subreport);
                }
            }
            if (requestBodyObj.getIncomeSelfEmployment() != null) {
                if (!requestBodyObj.getIncomeSelfEmployment().isEmpty()) {
                    //log.info("incomePayList Size: {}", requestBodyObj.getIncomePay().size());
                    JRBeanCollectionDataSource incomeSelfEmploymentDataSource = new JRBeanCollectionDataSource(requestBodyObj.getIncomeSelfEmployment());
                    Map<String,Object> dataSources = new HashMap<>();
                    dataSources.put("incomeSelfEmploymentDataSource", incomeSelfEmploymentDataSource);
                    //log.info("dataSources Size: {}", dataSources.size());
                    JRMapArrayDataSource incomeSelfEmploymentArrayDataSource = new JRMapArrayDataSource(new Object[]{dataSources});
                    parameters.put("incomeSelfEmploymentArrayDataSource", incomeSelfEmploymentArrayDataSource);
                    String srFileName = "templates/IncomeSelfEmploymentSR.jrxml";
                    String srFilePath = new File(classLoader.getResource(srFileName).getFile()).getPath();
                    JasperReport subreport = JasperCompileManager.compileReport(srFilePath);
                    parameters.put("incomeSelfEmploymentSR", subreport);
                }
            }
            if (requestBodyObj.getOtherIncome() != null) {
                if (!requestBodyObj.getOtherIncome().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getOtherIncome());
                    parameters.put("otherIncomeDataSet", dataSource);
                }
            }
            if (requestBodyObj.getUtilityExpenseInfo() != null) {
                if (!requestBodyObj.getUtilityExpenseInfo().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getUtilityExpenseInfo());
                    parameters.put("utilityExpenseInfoDataSet", dataSource);
                }
            }
            if (requestBodyObj.getUtilityExpenses() != null) {
                if (!requestBodyObj.getUtilityExpenses().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getUtilityExpenses());
                    parameters.put("utilityExpensesDataSet", dataSource);
                }
            }
            if (requestBodyObj.getMedicalExpenseInfo() != null) {
                if (!requestBodyObj.getMedicalExpenseInfo().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getMedicalExpenseInfo());
                    parameters.put("medicalExpenseInfoDataSet", dataSource);
                }
            }
            if (requestBodyObj.getMedicalExpenses() != null) {
                if (!requestBodyObj.getMedicalExpenses().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getMedicalExpenses());
                    parameters.put("medicalExpensesDataSet", dataSource);
                }
            }
            if (requestBodyObj.getShelterExpenses() != null) {
                if (!requestBodyObj.getShelterExpenses().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getShelterExpenses());
                    parameters.put("shelterExpensesDataSet", dataSource);
                }
            }
            if (requestBodyObj.getSupportExpenses() != null) {
                if (!requestBodyObj.getSupportExpenses().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getSupportExpenses());
                    parameters.put("supportExpensesDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDependentCareExpenseInfo() != null) {
                if (!requestBodyObj.getDependentCareExpenseInfo().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDependentCareExpenseInfo());
                    parameters.put("dependentCareExpenseInfoDataSet", dataSource);
                }
            }
            if (requestBodyObj.getDependentCareExpenses() != null) {
                if (!requestBodyObj.getDependentCareExpenses().isEmpty()) {
                    JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(requestBodyObj.getDependentCareExpenses());
                    parameters.put("dependentCareExpensesDataSet", dataSource);
                }
            }

            JasperReport report = JasperCompileManager.compileReport(filePath);

            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());

            JasperExportManager.exportReportToPdfFile(print, destFileName);

            log.info("{} report for {} {} created successfully.", rptName, rptMonthTxt, rptYrYYYY);

        } catch (Exception e) {
            log.error("Exception occurred...{}", e.getMessage());
            e.printStackTrace();
        }
    }

    private String extractDate(String timestamp) {

        LocalDateTime dateTime = LocalDateTime.parse(timestamp, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String date = DateTimeFormatter.ofPattern("MM/dd/yyyy").format(dateTime); // 09:00:00
        return date;
    }

    private String extractTime(String timestamp) {

        LocalDateTime dateTime = LocalDateTime.parse(timestamp, DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        String newString = DateTimeFormatter.ofPattern("HH:mm:ss").format(dateTime); // 09:00
        return newString;
    }

    private Date convertSrtingToDate(String timestamp) {
        Date date;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");

        try {
            date = df.parse(timestamp);
        } catch (ParseException e) {
            throw new RuntimeException("Failed to parse date: ", e);
        }

        return date;
    }

}