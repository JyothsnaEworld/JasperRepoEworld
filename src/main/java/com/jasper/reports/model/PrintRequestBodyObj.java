package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jasper.reports.constants.ReportMonth;
import com.jasper.reports.constants.ReportName;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Setter
@Getter
public class PrintRequestBodyObj {

    @NotNull
    @JsonProperty("reportName")
    private ReportName reportName;

    @JsonProperty("reportMonth")
    private ReportMonth reportMonth;

    @JsonProperty("periodFrom")
    private String periodFrom;

    @JsonProperty("periodTo")
    private String periodTo;

    @Pattern(regexp = "[0-9]")
    private Integer reportYear;

    @Pattern(regexp = "[0-9]")
    private String rptYrMonthYYYYMM;

    @Pattern(regexp = "[0-9]")
    private String extractTimeStamp;
    @JsonProperty("caseNumber")
    private String caseNumber;
    @JsonProperty("householdMembers")
    private List<HouseholdMembers> householdMembers;
    @JsonProperty("utilityExpenseInfo")
    private List<UtilityExpenseInfo> utilityExpenseInfo;
    @JsonProperty("utilityExpenses")
    private List<UtilityExpenses> utilityExpenses;
    @JsonProperty("medicalExpenseInfo")
    private List<MedicalExpenseInfo> medicalExpenseInfo;
    @JsonProperty("medicalExpenses")
    private List<MedicalExpenses> medicalExpenses;
    @JsonProperty("shelterExpenses")
    private List<ShelterExpenses> shelterExpenses;
    @JsonProperty("supportExpenses")
    private List<SupportExpenses> supportExpenses;
    @JsonProperty("dependentCareExpenses")
    private List<DependentCareExpenses> dependentCareExpenses;
    @JsonProperty("dependentCareExpenseInfo")
    private List<DependentCareExpenseInfo> dependentCareExpenseInfo;

    public List<UtilityExpenseInfo> getUtilityExpenseInfo() {
        return utilityExpenseInfo;
    }

    public void setUtilityExpenseInfo(List<UtilityExpenseInfo> utilityExpenseInfo) {
        this.utilityExpenseInfo = utilityExpenseInfo;
    }

    public List<UtilityExpenses> getUtilityExpenses() {
        return utilityExpenses;
    }

    public void setUtilityExpenses(List<UtilityExpenses> utilityExpenses) {
        this.utilityExpenses = utilityExpenses;
    }

    public List<MedicalExpenseInfo> getMedicalExpenseInfo() {
        return medicalExpenseInfo;
    }

    public void setMedicalExpenseInfo(List<MedicalExpenseInfo> medicalExpenseInfo) {
        this.medicalExpenseInfo = medicalExpenseInfo;
    }

    public List<MedicalExpenses> getMedicalExpenses() {
        return medicalExpenses;
    }

    public void setMedicalExpenses(List<MedicalExpenses> medicalExpenses) {
        this.medicalExpenses = medicalExpenses;
    }

    public List<ShelterExpenses> getShelterExpenses() {
        return shelterExpenses;
    }

    public void setShelterExpenses(List<ShelterExpenses> shelterExpenses) {
        this.shelterExpenses = shelterExpenses;
    }

    public List<SupportExpenses> getSupportExpenses() {
        return supportExpenses;
    }

    public void setSupportExpenses(List<SupportExpenses> supportExpenses) {
        this.supportExpenses = supportExpenses;
    }

    public List<DependentCareExpenses> getDependentCareExpenses() {
        return dependentCareExpenses;
    }

    public void setDependentCareExpenses(List<DependentCareExpenses> dependentCareExpenses) {
        this.dependentCareExpenses = dependentCareExpenses;
    }

    public List<DependentCareExpenseInfo> getDependentCareExpenseInfo() {
        return dependentCareExpenseInfo;
    }

    public void setDependentCareExpenseInfo(List<DependentCareExpenseInfo> dependentCareExpenseInfo) {
        this.dependentCareExpenseInfo = dependentCareExpenseInfo;
    }

    public List<IncomeSelfEmployment> getIncomeSelfEmployment() {
        return incomeSelfEmployment;
    }

    public void setIncomeSelfEmployment(List<IncomeSelfEmployment> incomeSelfEmployment) {
        this.incomeSelfEmployment = incomeSelfEmployment;
    }

    public List<IncomeSelfEmploymentDetails> getIncomeSelfEmploymentDetails() {
        return incomeSelfEmploymentDetails;
    }

    public void setIncomeSelfEmploymentDetails(List<IncomeSelfEmploymentDetails> incomeSelfEmploymentDetails) {
        this.incomeSelfEmploymentDetails = incomeSelfEmploymentDetails;
    }

    public List<IncomeSelfEmploymentInfo> getIncomeSelfEmploymentInfo() {
        return incomeSelfEmploymentInfo;
    }

    public void setIncomeSelfEmploymentInfo(List<IncomeSelfEmploymentInfo> incomeSelfEmploymentInfo) {
        this.incomeSelfEmploymentInfo = incomeSelfEmploymentInfo;
    }

    public List<SelfEmploymentIncomeAndExpenses> getSelfEmploymentIncomeAndExpenses() {
        return selfEmploymentIncomeAndExpenses;
    }

    public void setSelfEmploymentIncomeAndExpenses(List<SelfEmploymentIncomeAndExpenses> selfEmploymentIncomeAndExpenses) {
        this.selfEmploymentIncomeAndExpenses = selfEmploymentIncomeAndExpenses;
    }

    public List<IncomeAndExpense> getIncomeAndExpense() {
        return incomeAndExpense;
    }

    public void setIncomeAndExpense(List<IncomeAndExpense> incomeAndExpense) {
        this.incomeAndExpense = incomeAndExpense;
    }

    @JsonProperty("incomeSelfEmployment")
    private List<IncomeSelfEmployment> incomeSelfEmployment;
    @JsonProperty("incomeSelfEmploymentDetails")
    private List<IncomeSelfEmploymentDetails> incomeSelfEmploymentDetails;
    @JsonProperty("incomeSelfEmploymentInfo")
    private List<IncomeSelfEmploymentInfo> incomeSelfEmploymentInfo;
    @JsonProperty("selfEmploymentIncomeAndExpenses")
    private List<SelfEmploymentIncomeAndExpenses> selfEmploymentIncomeAndExpenses;
    @JsonProperty("incomeAndExpense")
    private List<IncomeAndExpense> incomeAndExpense;
    @JsonProperty("incomePay")
    private List<IncomePay> incomePay;
    @JsonProperty("incomePayDetails")
    private List<IncomePayDetails> incomePayDetails;
    @JsonProperty("incomeWagesAndPay")
    private List<IncomeWagesAndPay> incomeWagesAndPay;
    @JsonProperty("wagesInformation")
    private List<WagesInformation> wagesInformation;
    @JsonProperty("payStubDocumentation")
    private List<PayStubDocumentation> payStubDocumentation;
    @JsonProperty("incomeGeneric")
    private List<IncomeGeneric> incomeGeneric;
    @JsonProperty("incomeGenericDetails")
    private List<IncomeGenericDetails> incomeGenericDetails;
    @JsonProperty("incomeGenericInfo")
    private List<IncomeGenericInfo> incomeGenericInfo;
    @JsonProperty("incomeDetails")
    private List<IncomeDetails> incomeDetails;

    public List<IncomeGeneric> getIncomeGeneric() {
        return incomeGeneric;
    }

    public void setIncomeGeneric(List<IncomeGeneric> incomeGeneric) {
        this.incomeGeneric = incomeGeneric;
    }

    public List<IncomeGenericDetails> getIncomeGenericDetails() {
        return incomeGenericDetails;
    }

    public void setIncomeGenericDetails(List<IncomeGenericDetails> incomeGenericDetails) {
        this.incomeGenericDetails = incomeGenericDetails;
    }

    public List<IncomeGenericInfo> getIncomeGenericInfo() {
        return incomeGenericInfo;
    }

    public void setIncomeGenericInfo(List<IncomeGenericInfo> incomeGenericInfo) {
        this.incomeGenericInfo = incomeGenericInfo;
    }

    public List<IncomeDetails> getIncomeDetails() {
        return incomeDetails;
    }

    public void setIncomeDetails(List<IncomeDetails> incomeDetails) {
        this.incomeDetails = incomeDetails;
    }

    public List<IncomePay> getIncomePay() {
        return incomePay;
    }

    public void setIncomePay(List<IncomePay> incomePay) {
        this.incomePay = incomePay;
    }

    public List<IncomePayDetails> getIncomePayDetails() {
        return incomePayDetails;
    }

    public void setIncomePayDetails(List<IncomePayDetails> incomePayDetails) {
        this.incomePayDetails = incomePayDetails;
    }

    public List<IncomeWagesAndPay> getIncomeWagesAndPay() {
        return incomeWagesAndPay;
    }

    public void setIncomeWagesAndPay(List<IncomeWagesAndPay> incomeWagesAndPay) {
        this.incomeWagesAndPay = incomeWagesAndPay;
    }

    public List<WagesInformation> getWagesInformation() {
        return wagesInformation;
    }

    public void setWagesInformation(List<WagesInformation> wagesInformation) {
        this.wagesInformation = wagesInformation;
    }

    public List<PayStubDocumentation> getPayStubDocumentation() {
        return payStubDocumentation;
    }

    public void setPayStubDocumentation(List<PayStubDocumentation> payStubDocumentation) {
        this.payStubDocumentation = payStubDocumentation;
    }

    @JsonProperty("householdRelationships")
    private List<HouseholdRelationships> householdRelationships;
    @JsonProperty("authorizedRepresentative")
    private List<AuthorizedRepresentative> authorizedRepresentative;
    @JsonProperty("residencyInformation")
    private List<ResidencyInformation> residencyInformation;
    @JsonProperty("communication")
    private List<Communication> communication;
    @JsonProperty("communicationContact")
    private List<CommunicationContact> communicationContact;
    @JsonProperty("disqualification")
    private List<Disqualification> disqualification;
    @JsonProperty("disqualificationQuestionnaire")
    private List<DisqualificationQuestionnaire> disqualificationQuestionnaire;
    @JsonProperty("nonCitizenship")
    private List<NonCitizenship> nonCitizenship;
    @JsonProperty("sponsor")
    private List<Sponsor> sponsor;
    @JsonProperty("assetLiquid")
    private List<AssetLiquid> assetLiquid;
    @JsonProperty("detailsAndOwnershipLiquid")
    private List<DetailsAndOwnershipLiquid> detailsAndOwnershipLiquid;
    @JsonProperty("assetVehicle")
    private List<AssetVehicle> assetVehicle;
    @JsonProperty("detailsAndOwnershipVehicle")
    private List<DetailsAndOwnershipVehicle> detailsAndOwnershipVehicle;
    @JsonProperty("assetOther")
    private List<AssetOther> assetOther;
    @JsonProperty("detailsAndOwnershipOther")
    private List<DetailsAndOwnershipOther> detailsAndOwnershipOther;

    public List<AssetLiquid> getAssetLiquid() {
        return assetLiquid;
    }

    public void setAssetLiquid(List<AssetLiquid> assetLiquid) {
        this.assetLiquid = assetLiquid;
    }

    public List<DetailsAndOwnershipLiquid> getDetailsAndOwnershipLiquid() {
        return detailsAndOwnershipLiquid;
    }

    public void setDetailsAndOwnershipLiquid(List<DetailsAndOwnershipLiquid> detailsAndOwnershipLiquid) {
        this.detailsAndOwnershipLiquid = detailsAndOwnershipLiquid;
    }

    public List<AssetVehicle> getAssetVehicle() {
        return assetVehicle;
    }

    public void setAssetVehicle(List<AssetVehicle> assetVehicle) {
        this.assetVehicle = assetVehicle;
    }

    public List<DetailsAndOwnershipVehicle> getDetailsAndOwnershipVehicle() {
        return detailsAndOwnershipVehicle;
    }

    public void setDetailsAndOwnershipVehicle(List<DetailsAndOwnershipVehicle> detailsAndOwnershipVehicle) {
        this.detailsAndOwnershipVehicle = detailsAndOwnershipVehicle;
    }

    public List<AssetOther> getAssetOther() {
        return assetOther;
    }

    public void setAssetOther(List<AssetOther> assetOther) {
        this.assetOther = assetOther;
    }

    public List<DetailsAndOwnershipOther> getDetailsAndOwnershipOther() {
        return detailsAndOwnershipOther;
    }

    public void setDetailsAndOwnershipOther(List<DetailsAndOwnershipOther> detailsAndOwnershipOther) {
        this.detailsAndOwnershipOther = detailsAndOwnershipOther;
    }

    public List<DisabilityDetail> getDisabilityDetail() {
        return disabilityDetail;
    }

    public void setDisabilityDetail(List<DisabilityDetail> disabilityDetail) {
        this.disabilityDetail = disabilityDetail;
    }

    public List<DisabilityDetermination> getDisabilityDetermination() {
        return disabilityDetermination;
    }

    public void setDisabilityDetermination(List<DisabilityDetermination> disabilityDetermination) {
        this.disabilityDetermination = disabilityDetermination;
    }

    public List<VeteransMilitary> getVeteransMilitary() {
        return veteransMilitary;
    }

    public void setVeteransMilitary(List<VeteransMilitary> veteransMilitary) {
        this.veteransMilitary = veteransMilitary;
    }

    public List<PregnancyInformation> getPregnancyInformation() {
        return pregnancyInformation;
    }

    public void setPregnancyInformation(List<PregnancyInformation> pregnancyInformation) {
        this.pregnancyInformation = pregnancyInformation;
    }

    public List<SchoolInformation> getSchoolInformation() {
        return schoolInformation;
    }

    public void setSchoolInformation(List<SchoolInformation> schoolInformation) {
        this.schoolInformation = schoolInformation;
    }

    public List<TimeOnAidABAWD> getTimeOnAidABAWD() {
        return timeOnAidABAWD;
    }

    public void setTimeOnAidABAWD(List<TimeOnAidABAWD> timeOnAidABAWD) {
        this.timeOnAidABAWD = timeOnAidABAWD;
    }

    public List<TimeOnAidABAWDMonths> getTimeOnAidABAWDMonths() {
        return timeOnAidABAWDMonths;
    }

    public void setTimeOnAidABAWDMonths(List<TimeOnAidABAWDMonths> timeOnAidABAWDMonths) {
        this.timeOnAidABAWDMonths = timeOnAidABAWDMonths;
    }

    public List<TimeOnAidTANF> getTimeOnAidTANF() {
        return timeOnAidTANF;
    }

    public void setTimeOnAidTANF(List<TimeOnAidTANF> timeOnAidTANF) {
        this.timeOnAidTANF = timeOnAidTANF;
    }

    public List<TimeOnAidTANFMonths> getTimeOnAidTANFMonths() {
        return timeOnAidTANFMonths;
    }

    public void setTimeOnAidTANFMonths(List<TimeOnAidTANFMonths> timeOnAidTANFMonths) {
        this.timeOnAidTANFMonths = timeOnAidTANFMonths;
    }

    public List<FTWParticipation> getFtwParticipation() {
        return ftwParticipation;
    }

    public void setFtwParticipation(List<FTWParticipation> ftwParticipation) {
        this.ftwParticipation = ftwParticipation;
    }

    public List<EBStatus> getEbStatus() {
        return ebStatus;
    }

    public void setEbStatus(List<EBStatus> ebStatus) {
        this.ebStatus = ebStatus;
    }

    public List<DomesticViolence> getDomesticViolence() {
        return domesticViolence;
    }

    public void setDomesticViolence(List<DomesticViolence> domesticViolence) {
        this.domesticViolence = domesticViolence;
    }

    public List<EandTParticipation> getEandtParticipation() {
        return eandtParticipation;
    }

    public void setEandtParticipation(List<EandTParticipation> eandtParticipation) {
        this.eandtParticipation = eandtParticipation;
    }

    public List<CooperateWithCSEA> getCooperateWithCSEA() {
        return cooperateWithCSEA;
    }

    public void setCooperateWithCSEA(List<CooperateWithCSEA> cooperateWithCSEA) {
        this.cooperateWithCSEA = cooperateWithCSEA;
    }

    public List<AbsentParentInformation> getAbsentParentInformation() {
        return absentParentInformation;
    }

    public void setAbsentParentInformation(List<AbsentParentInformation> absentParentInformation) {
        this.absentParentInformation = absentParentInformation;
    }

    public List<GoodCauseInformation> getGoodCauseInformation() {
        return goodCauseInformation;
    }

    public void setGoodCauseInformation(List<GoodCauseInformation> goodCauseInformation) {
        this.goodCauseInformation = goodCauseInformation;
    }

    public List<NoGoodCause> getNoGoodCause() {
        return noGoodCause;
    }

    public void setNoGoodCause(List<NoGoodCause> noGoodCause) {
        this.noGoodCause = noGoodCause;
    }

    public List<Paternity> getPaternity() {
        return paternity;
    }

    public void setPaternity(List<Paternity> paternity) {
        this.paternity = paternity;
    }

    public List<PaternityInformationTwoParents> getPaternityInformationTwoParents() {
        return paternityInformationTwoParents;
    }

    public void setPaternityInformationTwoParents(List<PaternityInformationTwoParents> paternityInformationTwoParents) {
        this.paternityInformationTwoParents = paternityInformationTwoParents;
    }

    @JsonProperty("disabilityDetail")
    private List<DisabilityDetail> disabilityDetail;
    @JsonProperty("disabilityDetermination")
    private List<DisabilityDetermination> disabilityDetermination;
    @JsonProperty("cyrcaEvaluation")
    private List<CYRCAEvaluation> cyrcaEvaluation;
    @JsonProperty("goodCaseInformation")
    private List<GoodCaseInformation> goodCaseInformation;
    @JsonProperty("ssiApplication")
    private List<SSIApplication> ssiApplication;

    public List<CYRCAEvaluation> getCyrcaEvaluation() {
        return cyrcaEvaluation;
    }

    public void setCyrcaEvaluation(List<CYRCAEvaluation> cyrcaEvaluation) {
        this.cyrcaEvaluation = cyrcaEvaluation;
    }

    public List<GoodCaseInformation> getGoodCaseInformation() {
        return goodCaseInformation;
    }

    public void setGoodCaseInformation(List<GoodCaseInformation> goodCaseInformation) {
        this.goodCaseInformation = goodCaseInformation;
    }

    public List<SSIApplication> getSsiApplication() {
        return ssiApplication;
    }

    public void setSsiApplication(List<SSIApplication> ssiApplication) {
        this.ssiApplication = ssiApplication;
    }

    @JsonProperty("veteransMilitary")
    private List<VeteransMilitary> veteransMilitary;
    @JsonProperty("pregnancyInformation")
    private List<PregnancyInformation> pregnancyInformation;
    @JsonProperty("schoolInformation")
    private List<SchoolInformation> schoolInformation;
    @JsonProperty("timeOnAidABAWD")
    private List<TimeOnAidABAWD> timeOnAidABAWD;
    @JsonProperty("timeOnAidABAWDMonths")
    private List<TimeOnAidABAWDMonths> timeOnAidABAWDMonths;
    @JsonProperty("timeOnAidTANF")
    private List<TimeOnAidTANF> timeOnAidTANF;
    @JsonProperty("timeOnAidTANFMonths")
    private List<TimeOnAidTANFMonths> timeOnAidTANFMonths;
    @JsonProperty("ftwParticipation")
    private List<FTWParticipation> ftwParticipation;
    @JsonProperty("ebStatus")
    private List<EBStatus> ebStatus;
    @JsonProperty("domesticViolence")
    private List<DomesticViolence> domesticViolence;
    @JsonProperty("eandtParticipation")
    private List<EandTParticipation> eandtParticipation;
    @JsonProperty("cooperateWithCSEA")
    private List<CooperateWithCSEA> cooperateWithCSEA;
    @JsonProperty("absentParentInformation")
    private List<AbsentParentInformation> absentParentInformation;
    @JsonProperty("goodCauseInformation")
    private List<GoodCauseInformation> goodCauseInformation;
    @JsonProperty("noGoodCause")
    private List<NoGoodCause> noGoodCause;
    @JsonProperty("paternity")
    private List<Paternity> paternity;
    @JsonProperty("paternityInformationTwoParents")
    private List<PaternityInformationTwoParents> paternityInformationTwoParents;
    public List<Disqualification> getDisqualification() {
        return disqualification;
    }

    public void setDisqualification(List<Disqualification> disqualification) {
        this.disqualification = disqualification;
    }

    public List<DisqualificationQuestionnaire> getDisqualificationQuestionnaire() {
        return disqualificationQuestionnaire;
    }

    public void setDisqualificationQuestionnaire(List<DisqualificationQuestionnaire> disqualificationQuestionnaire) {
        this.disqualificationQuestionnaire = disqualificationQuestionnaire;
    }

    public List<NonCitizenship> getNonCitizenship() {
        return nonCitizenship;
    }

    public void setNonCitizenship(List<NonCitizenship> nonCitizenship) {
        this.nonCitizenship = nonCitizenship;
    }

    public List<Sponsor> getSponsor() {
        return sponsor;
    }

    public void setSponsor(List<Sponsor> sponsor) {
        this.sponsor = sponsor;
    }

    public List<Communication> getCommunication() {
        return communication;
    }

    public void setCommunication(List<Communication> communication) {
        this.communication = communication;
    }

    public List<CommunicationContact> getCommunicationContact() {
        return communicationContact;
    }

    public void setCommunicationContact(List<CommunicationContact> communicationContact) {
        this.communicationContact = communicationContact;
    }

    public List<AuthorizedRepresentative> getAuthorizedRepresentative() {
        return authorizedRepresentative;
    }

    public void setAuthorizedRepresentative(List<AuthorizedRepresentative> authorizedRepresentative) {
        this.authorizedRepresentative = authorizedRepresentative;
    }

    public List<ResidencyInformation> getResidencyInformation() {
        return residencyInformation;
    }

    public void setResidencyInformation(List<ResidencyInformation> residencyInformation) {
        this.residencyInformation = residencyInformation;
    }

    public List<HouseholdRelationships> getHouseholdRelationships() {
        return householdRelationships;
    }

    public void setHouseholdRelationships(List<HouseholdRelationships> householdRelationships) {
        this.householdRelationships = householdRelationships;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public List<HouseholdMembers> getHouseholdMembers() {
        return householdMembers;
    }

    public void setHouseholdMembers(List<HouseholdMembers> householdMembers) {
        this.householdMembers = householdMembers;
    }

    public List<OtherIncome> getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(List<OtherIncome> otherIncome) {
        this.otherIncome = otherIncome;
    }

    @JsonProperty("otherIncome")
    private List<OtherIncome> otherIncome;

    public ReportName getReportName() {
        return reportName;
    }

    public void setReportName(ReportName reportName) {
        this.reportName = reportName;
    }

    public ReportMonth getReportMonth() {
        return reportMonth;
    }

    public void setReportMonth(ReportMonth reportMonth) {
        this.reportMonth = reportMonth;
    }

    public Integer getReportYear() {
        return reportYear;
    }

    public void setReportYear(Integer reportYear) {
        this.reportYear = reportYear;
    }

    public String getRptYrMonthYYYYMM() {
        return rptYrMonthYYYYMM;
    }

    public void setRptYrMonthYYYYMM(String rptYrMonthYYYYMM) {
        this.rptYrMonthYYYYMM = rptYrMonthYYYYMM;
    }

    public String getExtractTimeStamp() {
        return extractTimeStamp;
    }

    public void setExtractTimeStamp(String extractTimeStamp) {
        this.extractTimeStamp = extractTimeStamp;
    }

    public String getPeriodFrom() {
        return periodFrom;
    }

    public void setPeriodFrom(String periodFrom) {
        this.periodFrom = periodFrom;
    }

    public String getPeriodTo() {
        return periodTo;
    }

    public void setPeriodTo(String periodTo) {
        this.periodTo = periodTo;
    }

    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
