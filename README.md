# KGADB05R - PDF Format
After starting the application, you can trigger report generation for KGADB05R using the below curl command:

```
curl --location 'http://localhost:8080/generateReport' \
--header 'Content-Type: application/json' \
--data '{
  "reportName":"KGADB05R",
  "reportMonth":"February",
  "reportYear":2022,
  "rptYrMonthYYYYMM":"202202",
  "extractTimeStamp": "20230803223055",
  "reportFormat": "PDF"
}'
```
# KGADB04R - BES data
```
{
"reportName":"KGADB04R",
"reportMonth":"February",
"reportYear":2024,
"rptYrMonthYYYYMM":"202402",
"extractTimeStamp": "20240620181720",
"reportFormat": "PDF",
"periodFrom":"02/06/2024",
"periodTo":"02/06/2024"
}
```
# KGADB04R
```
{
"reportName":"KGADB04R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "PDF",
"periodFrom":"02/22/2022",
"periodTo":"02/22/2022"
}
```
# KGADB05R
```
{
"reportName":"KGADB05R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803223055",
"reportFormat": "PDF",
"periodFrom":"02/22/2022",
"periodTo":"02/22/2022"
}
```
# KGADB06R
```
{
"reportName":"KGADB06R",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp": "20230803223055",
"reportFormat": "PDF",
"periodFrom":"10/24/2019",
"periodTo":"10/24/2019"
}
```
# KGAA18R1 - Excel Format
```
curl --location 'http://localhost:8080/generateExcelReport' \
--header 'Content-Type: application/json' \
--data '{
"reportName":"KGAA18R1",
"reportMonth":"December",
"reportYear":2018,
"rptYrMonthYYYYMM":"201812",
"extractTimeStamp": "20230825074035",
"reportFormat": "PDF"
}'
```

# KHPD3A4R - FAPCSSummary
```
{
"reportName":"KHPD3A4R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803201520",
"reportFormat": "PDF"
}
```

# KHFB7 - SMRFSummary
```
{
"reportName":"KHFB7",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803181520",
"reportFormat": "PDF"
}
```

# KHFB7 - SMRFSummary
```
{
"reportName":"KHFB7",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230703181520",
"reportFormat": "PDF"
}
```

# EBTMCBC
```
{
"reportName":"EBTMCBC",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "PDF"
}
```
# KHGE5E2R
```
{
"reportName":"KHGE5E2R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "PDF"
}
```
# K100471A
```
{
"reportName":"K100471A",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803223055",
"reportFormat": "PDF"
}
```
# KGAMB02R
```
{
"reportName": "KGAMB02R",
"reportMonth": "December",
"reportYear": 2016,
"rptYrMonthYYYYMM": "201612",
"extractTimeStamp": "20231009174035",
"reportFormat": "pdf",
"periodFrom":"02/01/2016",
"periodTo":"06/30/2016"
}
```
# KGAMB03R
```
{
"reportName": "KGAMB03R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "pdf",
"periodFrom":"02/01/2022",
"periodTo":"06/30/2022"
}
```
# KGAMB09R
```
{
"reportName":"KGAMB09R",
"reportMonth":"December",
"reportYear":2016,
"rptYrMonthYYYYMM":"201612",
"extractTimeStamp": "20230813161555",
"reportFormat": "PDF"
}
```

# KGADF02R
```
{
"reportName":"KGADF02R",
"reportMonth":"December",
"reportYear":2020,
"rptYrMonthYYYYMM":"202012",
"extractTimeStamp": "20230814171055",
"reportFormat": "PDF"
}
```

# KGADB05R
```
{
"reportName":"KGADB05R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803223055",
"reportFormat": "PDF"
}
```

# KGADB11R
```
{
"reportName":"KGADB11R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803223055",
"reportFormat": "PDF",
"periodFrom":"10/25/2019",
"periodTo":"10/25/2019"
}
```

# Print Application
```
{
  "reportName":"PrintApplication",
  "reportMonth":"September",
  "reportYear":2023,
  "rptYrMonthYYYYMM":"202309",
  "extractTimeStamp": "20230924084500",
  "caseNumber": "00000011",
  "householdMembers": [{"name":"White, Carnation\nF  05/15/1985  38y  (73)","householdMembership":"In 05/24/2023","program":"Financial - 05/24/2023\nSNAP - 05/24/2023","identification":"Married, Involuntary Separation - 07/25/2021\n\nHighest Education: High School/GED\n\nH12345678 - 05/25/2026","citizenship":"U.S. Citizen, Naturalized - 05/25/1985\n\nCountry of birth: United States Minor Outlying Islands","raceAndEthnicity":"Race: American Indian or Alaskan Native\n\nEthnicity: Not Hispanic/Latin American"},
    {"name":"White, Mimosa\nM  09/28/1982  40y  (75)","householdMembership":"In 05/24/2023","program":"Financial - 05/24/2023\nSNAP Expedited - 05/24/2023","identification":"","citizenship":"Qualified Non-Citizen, Lawful Permanent Resident - 12/25/2021","raceAndEthnicity":"Race: Filipino\n\nEthnicity: Declined to Answer"},
    {"name":"White, Cyclamen\nM  12/28/2019  3y  (81)","householdMembership":"In 05/24/2023","program":"Financial - 05/24/2023\nSNAP - 05/24/2023","identification":"","citizenship":"U.S. Citizen, Birthright - 12/28/2019","raceAndEthnicity":"Race: American Indian or Alaskan Native\n\nEthnicity: Not Hispanic/Latin American"},
    {"name":"White, Hyacinth\nM  04/05/1959  64y  (78)","householdMembership":"In 05/24/2023","program":"Financial - 05/24/2023\nSNAP - 05/24/2023","identification":"","citizenship":"Non-Citizen","raceAndEthnicity":"Race: Filipino\nEthnicity: Declined to Answer"},
    {"name":"Green, Everygreen\nF  04/28/1988  35y (25134)","householdMembership":"In 07/10/2023","program":"","identification":"","citizenship":"Other Non-Citizen, No Permanent Residency Status - 05/25/2020","raceAndEthnicity":"Race: Declined to Answer\n\nEthnicity: Declined to Answer"}],
  "householdRelationships": [{"name":"White, Carnation\nF  05/15/1985  38y  (73)","startDate":"05/24/2023","endDate":"","relationship":"Primary","relatedIndividual":""},
    {"name":"White, Mimosa\nM  09/28/1982  40y  (75)","startDate":"05/24/2023","endDate":"","relationship":"Spouse","relatedIndividual":""},
    {"name":"White, Cyclamen\nM  12/28/2019  3y  (81)","startDate":"05/24/2023","endDate":"","relationship":"Child","relatedIndividual":""},
    {"name":"","startDate":"05/24/2023","endDate":"","relationship":"is a child of","relatedIndividual":"White, Mimosa\nM  09/28/1982  40y  (75)"},
    {"name":"White, Hyacinth\nM  04/05/1959  64y  (78)","startDate":"05/24/2023","endDate":"","relationship":"Parent","relatedIndividual":""},
    {"name":"","startDate":"05/24/2023","endDate":"","relationship":"is a grandparent/great grandparent of","relatedIndividual":"White, Cyclamen\nM  12/28/2019  3y  (81)"},
    {"name":"Green, Everygreen\nF  04/28/1988  35y (25134)","startDate":"05/24/2023","endDate":"","relationship":"Niece/Nephew","relatedIndividual":""}],
  "authorizedRepresentative": [{"name":"Yellow, Bougainvillea\nF  05/27/1988  35y  (113)","ssn":"xxx-xx-5273","contactInformation":"Preferred spoken language: English\nPreferred written language: English\n\nMobile (808) 415-4849\n\nSelf service portal: Yes\nNotices: Mail","mailingAddress":"1515 Bishop Street\nSuite 155\nHonolulu, HI 96825\nEffective: 06/19/2023","ebtAddress":"1515 Bishop Street\nSuite 155\nHonolulu, HI 96825\nEffective: 06/19/2023","currentAccess":"Financil - Represents, Receive Correspondence, Access to Benefits"},
    {"name":"Blue, Cheese\nM  12/23/1981  42y  (1697)","ssn":"xxx-xx-2231","contactInformation":"Preferred spoken language: English\nPreferred written language: English\n\nMobile (808) 425-3388\nBlueCheese@hotmail.com","mailingAddress":"1022 Bishop Street\nSuite 411\nHonolulu, Hi 96825\nEffective: 05/29/2023","ebtAddress":"","currentAccess":"SNAP - Represents"}],
  "residencyInformation": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","residenceAddress":"1030 Bishop Street\nSuite 103\nHonolulu, HI 96825\nEffective: 05/24/2023","mailingAddress":"1030 Bishop Street\nSuite 103\nHonolulu, HI 96825\nEffective: 05/24/2023","residency":"Intend to reside or have job commitment - 05/24/2023","outOfHome":""},
    {"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","residenceAddress":"","mailingAddress":"","residency":"Lives with Primary - 05/24/2023","outOfHome":""},
    {"householdMember":"White, Cyclamen\nM  12/28/2019  3y  (81)","residenceAddress":"","mailingAddress":"","residency":"Lives with Primary - 05/24/2023","outOfHome":""},
    {"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","residenceAddress":"","mailingAddress":"","residency":"Lives with Primary - 05/24/2023","outOfHome":""},
    {"householdMember":"Green, Everygreen\nF  04/28/1988  35y (25134)","residenceAddress":"","mailingAddress":"","residency":"Lives with Primary - 07/10/2023","outOfHome":"Work Related - From 07/24/2023 to 08/04/2023\nActual return date: 08/03/2023"}],
  "communication":[{"caseContactPerson":"White, Carnation (73)\n\nSelf service portal: Yes\nNotices: Mail\n\nConsent received: Yes","residenceAddress":"1030 Bishop Street\nSuite 103\nHonolulu, HI 96813\nEffective: 05/24/2023","mailingAddress":"1031 Bishop Street\nSuite 103\nHonolulu, HI 96813\nEffective: 05/24/2023","ebtAddress":"1032 Bishop Street\nSuite 103\nHonolulu, HI 96813\nEffective: 05/24/2023","limitedEnglishProficiency":"Encountered date: 09/17/2023\nContact type: Telephone\nInterpreter type: Not Related\nEnglish proficiency: Unknown\nPrimary language 1: Japanese\nPrimary language 2: Korean\nPrimary language 3: Cantonese\nNotes: Review English proficiency"}],"communicationContact":[{"type":"Need an interpreter","value":"Yes","contactType":"","contactPerson":"","notes":""},
  {"type":"Preferred spoken language","value":"Other","contactType":"","contactPerson":"","notes":"Other spoken language"},
  {"type":"Preferred written language","value":"Other","contactType":"","contactPerson":"","notes":"Other written language"},
  {"type":"TDD/TTY","value":"(808) 455-3399","contactType":"","contactPerson":"","notes":""},
  {"type":"Special accommodations","value":"Yes","contactType":"","contactPerson":"","notes":"Wheelchair accessibility"},
  {"type":"Best contact number","value":"(808) 415-7788","contactType":"Mobile","contactPerson":"White, Carnation (73)","notes":""},
  {"type":"Alternate contact number","value":"(808) 425-1234","contactType":"Work","contactPerson":"White, Mimosa (75)","notes":""},
  {"type":"Other phones","value":"(808) 422-8836","contactType":"Mobile","contactPerson":"White, Hyacinth (78)","notes":""},
  {"type":"Other phones","value":"(808) 415-2356","contactType":"Mobile","contactPerson":"Green, Everygreen (25134)","notes":""},
  {"type":"Other phones","value":"(808) 433-5689","contactType":"Mobile","contactPerson":"","notes":"Best friend"},
  {"type":"Email","value":"White7788@hotmail.com","contactType":"","contactPerson":"","notes":"Check email after 6pm"}],
  "disqualificationQuestionnaire":[{"questionnaire":"Fleeing a felony warrant, a parole/probation violator","isAnyoneInTheHousehold":"No"},{"questionnaire":"Convicted of receiving SNAP or Financial in multiple states at the same time","isAnyoneInTheHousehold":"No"},{"questionnaire":"Committed an Intentional Program Violation for SNAP or Financial benefits","isAnyoneInTheHousehold":"No"},{"questionnaire":"A convicted drug felon refusing treatment","isAnyoneInTheHousehold":"No"},{"questionnaire":"Convicted of trafficking SNAP for less than $500","isAnyoneInTheHousehold":"No"},{"questionnaire":"Convicted of trafficking SNAP for $500 or more","isAnyoneInTheHousehold":"No"},{"questionnaire":"Convitcted of using SNAP benefits to buy firearms","isAnyoneInTheHousehold":"No"}],
  "disqualification":[{"householdMember":"Green, Everygreen\nF  04/28/1988  35y (25134)","disqualification":"Type: Fleeing Felon or Probation/Parole Violator\nState: Hawaii\nBenefit program: SNAP, FA","status":"Active","effDates":"07/09/2023","minTermDate":"","otherInformation":"Agency name: ABC Agency\nWarrant date: 07/03/2023\nWarrant informed date: 06/03/2023\nConviction date: 03/30/2023\nLocation: Hawaii\nCourt: Local\nINVO contact information: Smith, John"},{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","disqualification":"Type: Lump Sum\nState: Hawaii\nBenefit progam: FA","status":"Active","effDates":"08/01/2023","minTermDate":"","otherInformation":"Lump sum amount: $5000.00\nOther net income: $1525.00\nSON: $1050.00\nNumber of ineligible months: 3\nFirst ineligible month: 08/2023\nLast ineligible month: 10/2023\nRemainder of LS counted in first future eligible month: $125.00"}],
  "nonCitizenship":[{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","effectiveDates":"12/01/2023 - ","type":"Lawfully Admitted for Permanent Residence","subType":"40 Qualifying Work Quarters","quartersInformation":"Total work quarters: 40\nCountable work quarters: 20\nNon-countable work quarters: 20","otherInformation":"Date of entry: 12/19/2018\nIs not applying: Yes\nAlien number: 123456789\nCountry of citizenship: Andorra\nCategory code: A10\nOpt Out of Indigency: Yes"}],
  "sponsor":[{"sponsorDetails":"Yellow, Bougainvillea \nMarried, Living With Spouse\nSpouse: Yamaguchi, Robert J\n\nSpouse of the sponsor has signed a sponship affidavit\n\n1 non-citizens sponsored\n2 tax dependents","effectiveDates":"02/01/2019 -\n\n","incomeExpenseAsset":"Earned income: $5500.00\n\nChild support amount: $550.00\n\nTotal asset value: $1585.00\n","contactInformation":"Preferred spoken language: English\nPreferred written language: English\n\nMobile (808) 422-3355\nNot available after 6pm\n","residenceAddress":"1015 Bishop Street\nSuite 215\nHonolulu, HI 96825\nEffective: 05/25/2023","mailingAddress":"1015 Bishop Street\nSuite 215\nHonolulu, HI 96825\nEffective: 05/25/2023"}],
  "disabilityDetail": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","relationshipToPrimary":"Primary","disabilityDates":"12/01/2023 - 02/29/2024","status":"Temporary"}],
  "cyrcaEvaluation": [{"disabilityDates":"12/01/2023 - 02/29/2024","status":"Completed","type":"Physical","decisionInformation":"Decision: Disabled\nDisability status: Temporary\nSource: Medical Board\nDecision date: 02/08/2024","reevaluationDate":"06/17/2024","otherInformation":"Appointment: 02/08/2024 10:00AM\nOrganization: CYRCA Disability Evaluation\nProgram requirement: Medication Management\nTreatment compliance: Compliant"}],
  "disabilityDetermination": [{"disabilityDates":"12/01/2023 - 02/29/2024","type":"Physical","decision":"Temporary Disabled","source":"Medical Board"}],
  "goodCaseInformation": [{"type":"Evaluation Reschedule","date":"05/15/2024","granted":"N","reason":""},
  {"type":"Evaluation Reschedule","date":"05/17/2024","granted":"Y","reason":"Family emergency"}],
  "ssiApplication": [{"dateApplied":"02/05/2023","applicationStatus":"APPLIED","loanAgreementSignedDate":"01/29/2023","sentDate":""}],
  "veteransMilitary": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"05/05/2023","veteranCurrentMilitary":"Related to Veteran","type":"Retired Veteran","relatedPerson":"Pants, Blue","relationToVeteran":"Ex-Spouse"}],
  "pregnancyInformation": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","edc":"12/29/2023","reportDate":"05/24/2023","effEndDate":"","ninthMonthStartDate":"11/01/2023","numberOfChildrenExpected":"1"}],
  "schoolInformation": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","snapStudentEligibility":"Single Parent No Child Care Under Age 6 Through 11","effectiveDates":"08/01/2023 -","type":"Institute of Higher Education","schoolInformation":"Hawaii Institute of Higher Education, 08/01/2023 -","enrollment":"Less Than Half-Time, Online"}],
  "timeOnAidABAWD": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","benefitMonth":"2023-09","countable":"2","remaining":"1","administrative":"0","extension":"0"},{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","benefitMonth":"2023-09","countable":"0","remaining":"3","administrative":"0","extension":"0"},{"householdMember":"White, Cyclamen\nM  12/28/2019  3y  (81)","benefitMonth":"2023-09","countable":"0","remaining":"3","administrative":"0","extension":"0"},{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","benefitMonth":"2023-09","countable":"0","remaining":"3","administrative":"0","extension":"0"},{"householdMember":"Green, Everygreen\nF  04/28/1988  35y (25134)","benefitMonth":"2023-09","countable":"0","remaining":"3","administrative":"0","extension":"0"}],
  "timeOnAidABAWDMonths": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","startEndMonth":"01/2023 - 02/2023\nMonths: 2","status":"Countable","reason":"","state":"CA","caseNumber":""}],
  "timeOnAidTANF": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","countable":"12","remaining":"48","exempt":"0","eb":"0","totalTANFMonths":"12"},{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","countable":"0","remaining":"60","exempt":"0","eb":"0","totalTANFMonths":"0"},{"householdMember":"White, Cyclamen\nM  12/28/2019  3y  (81)","countable":"0","remaining":"60","exempt":"0","eb":"0","totalTANFMonths":"0"},{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","countable":"0","remaining":"60","exempt":"0","eb":"0","totalTANFMonths":"0"},{"householdMember":"Green, Everygreen\nF  04/28/1988  35y (25134)","countable":"0","remaining":"60","exempt":"0","eb":"0","totalTANFMonths":"0"}],
  "timeOnAidTANFMonths": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","startEndMonth":"01/2022 - 1/2022\nMonths: 12","status":"Countable","reason":"","state":"CA","caseNumber":""}],
  "ftwParticipation": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","startDate":"08/08/2023","status":"Orientation","reason":""},{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","startDate":"08/15/2023","status":"End","reason":"Temporarily Disabled"}],
  "ebStatus": [{"monthsUsed":"0","monthsRemaining":"12"}],
  "domesticViolence": [{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","effectiveDates":"06/22/2023","noDVExemption":"Yes","exemptionReason":"DHS Determination"}],
  "eandtParticipation": [{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","startDate":"08/14/2023","status":"End","reason":"Temporarily Disabled"}],
  "cooperateWithCSEA": [{"custodialParentPerson":"White, Cactus\nF  12/25/1988  34y  (83)","effectiveDates":"05/24/2023 -","cooperateWithCSEA":"Yes","1247Provided":"Mailed Out","childInfo":"Whte, Sunflower\nF  08/29/2018 5y (85)","questions":"Paternity was established: No\nMother married when child was born: No\nIs there a court decision or VEP naming the AP as the father of this child: No"}],
  "absentParentInformation": [{"apInfo":"Name: Unknown01\nOther name: Unknown\nGender: Male\nRace: Black or African American","motherAndFatherInfo":"Mother's name: Unknown\nMother's maiden name: Unknown\nFather's name: Unknown","maritalInfo":"Married to CP: No\nDivorce pending: No","contactInfo":"Last Know address: 1012 Bishop Street\nSuite 102\nHonolulu, HI 96825\nEffective: 05/31/2023","lastKnownEmployer":"ABC Company\n10115 Bishop Street\nSuite 115\nHonolulu, HI 96825\nEffective 05/31/2023","obligation":"Established date: 05/26/2021\nCourt order number: 12345678\nCollection payee: Custodial Parent\nPayment frequency: Monthly\nChild support amount: $550.00\nPayment due date: 09/01/2023\nLast payment amount: $550.00\nLast payment date: 08/01/2023"},{"apInfo":"Name: Unknown04","motherAndFatherInfo":"","maritalInfo":"","contactInfo":"","lastKnownEmployer":"","obligation":""}],
  "goodCauseInformation": [{"goodCauseDate":"06/01/2023","exemption":"Emotional Harm","goodCauseReason":"If I cooperate, it is likely to result in serious emotional hame to my child(ren).","goodCauseDecision":"Withdrawn - Will not cooperate.","determinationDate":"08/23/2023"}],
  "noGoodCause": [{"custodialParentPerson":"White, Morning-glory\nF  08/18/1980  43y  (2374)","effectiveDates":"06/01/2023 -","cooperateWithCSEA":"No","1247Provided":"Mailed Out","goodCauseExists":"No"}],
  "paternityInformationTwoParents": [{"householdMember":"White, Bleeding Heart\nF  05/26/1983  10y  (17101)","1303Signed":"Yes","reason":"","goodCause":""},{"householdMember":"Blue, Poppy\nM  07/28/1980  43y (17104)","1303Signed":"No","reason":"He is not the biological father of the child","goodCause":"Yes"}],
  "assetLiquid": [{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","relationshipToPrimary":"Spouse","assetType":"Checking (Personal)","bankBranchName":"Hawaii Bank","accountNumber":"******6789","designation":"Financial: Countable\nSNAP: Countable"}],
  "detailsAndOwnershipLiquid": [{"effectiveDates":"05/24/2023 -","bankBalance":"50","countableBalance":"50","commingledAmount":"No","accessibility":"Accessible","sharedPercentage":"White, Carnation: 50%\nWhite, Mimosa: 50%"}],
  "assetVehicle": [{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","relationshipToPrimary":"Spouse","assetType":"Car","vehicleInfo":"Make: Hyundai\nModel: Santa Fe\nYear: 2010","designation":"Financial: Exempt\nSNAP: Exempt","purchaseDate":"09/08/2021"}],
  "detailsAndOwnershipVehicle": [{"effectiveDates":"05/24/2023 -","value":"","fairMarketValue":"7250","amountOwed":"5000","equityInformation":"Calculated equity: $2250.00\nquity: $2250.00\nAccessible","sharedPercentage":"White, Carnation: 50%\nWhite, Mimosa: 50%"}],
  "assetOther": [{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","relationshipToPrimary":"Parent","assetInformation":"Asset type: Burial Plot\nDescription: Nu'uanu Memorial Park & Mortuary","designation":"Financial: Countable\nSNAP: Countable","purchaseSoldTransferredDate":"Purchase date: 06/25/2018\nSold/Transferred date: 03/28/2022","disposalValue":"1000"}],
  "detailsAndOwnershipOther": [{"effectiveDates":"05/24/2021 - 03/28/2022","purchasePrice":"","value":"Fair market value: $7500.00\nCase value: $6950.00","encumbrance":"","equityInformation":"Calculated equity: $7500.00\nEquity: $7500.00\nAccessible","sharedPercentage":"White, Hyacinth: 50%\nWhite, Carnation: 50%\n"}],
  "incomePay": [{"incomePayDetails": [{"incomeWagesAndPay": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"05/24/2023 - ","incomeTypeAndSubtype":"Type: Wages\nSubtype: Pay\nLump sum: No","countedDesignation":"Counted as: Earned\nSNAP: Countable\nFinancial: Countable","employer":"ABC Company","employment":"Type: Full time\nStatus: Active"}]},
    {"wagesInformation": [{"effectiveDates":"05/24/2023 -","frequencyAndMonthlyHours":"Monthly 65 hours","rateAndFrequency":"$15.00 Hour","hoursWorked":"15 Weekly","calculatedMonthly":"$974.00","grossIncomeMonthly":""}]}]},
    {"incomePayDetails": [{"incomeWagesAndPay": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"07/01/2023 - ","incomeTypeAndSubtype":"Type: Wages\nSubtype: Pay\nLump sum: No","countedDesignation":"Counted as: Earned\nSNAP: Countable\nFinancial: Countable","employer":"Honolulu Restaurant","employment":"Type: Part Time\nStatus: Active"}]},
      {"wagesInformation": [{"effectiveDates":"07/01/2023","frequencyAndMonthlyHours":"Monthly 18 hours","rateAndFrequency":"","hoursWorked":"","calculatedMonthly":"$397.50","grossIncomeMonthly":""}]},
      {"payStubDocumentation": [{"datePaid":"07/05/2023","payPeriodEndDate":"06/30/2023","grossWages":"$300.00","hoursWorked":"20","tips":"$150.00","grossWagesYTD":""},
        {"datePaid":"06/05/2023","payPeriodEndDate":"05/31/2023","grossWages":"$225.00","hoursWorked":"15","tips":"$120.00","grossWagesYTD":""}]}]},
    {"incomePayDetails": [{"incomeWagesAndPay": [{"householdMember":"White, Mimosa\nM  09/28/1982  40y  (75)","effectiveDates":"05/24/2023 - ","incomeTypeAndSubtype":"Type: Wages\nSubtype: Pay\nLump sum: No","countedDesignation":"Counted as: Earned\nSNAP: Countable\nFinancial: Countable","employer":"Hawaii Bank","employment":"Type: Full Time\nStatus: Active"}]},
      {"wagesInformation": [{"effectiveDates":"05/24/2023","frequencyAndMonthlyHours":"Monthly 20 hours","rateAndFrequency":"","hoursWorked":"","calculatedMonthly":"$300.00","grossIncomeMonthly":""}]},
      {"payStubDocumentation": [{"datePaid":"05/05/2023","payPeriodEndDate":"04/30/2023","grossWages":"$300.00","hoursWorked":"20","tips":"","grossWagesYTD":""}]}]}],
  "incomeGeneric": [{"incomeGenericDetails": [{"incomeGenericInfo": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"05/24/2023 - ","incomeTypeAndSubtype":"Type: Property\nSubtype: Rent\nLump sum: No","countedDesignation":"Counted as: Earned\nSNAP: Countable\nFinancial: Countable","additionalInfo":"","description":""}]},
    {"incomeDetails": [{"effectiveDates":"05/24/2023 -","paymentFrequency":"Monthly","grossAmount":"$1,525.00","deductions":"Mortgage: $500.00","calculatedMonthly":"$1,025.00","netAmount":"$1,025.00"}]}]},
    {"incomeGenericDetails": [{"incomeGenericInfo": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"05/24/2023 - ","incomeTypeAndSubtype":"Type: Settlement\nSubtype: Insurance\nLump sum: Yes","countedDesignation":"Counted as: Unearned\nSNAP: Countable\nFinancial: Countable","additionalInfo":"Personal Injury: Yes\nPaid more than one time: No","description":"Car accident 2021"}]},
      {"incomeDetails": [{"effectiveDates":"05/24/2023 -","paymentFrequency":"One-Time","grossAmount":"$5,500.00","deductions":"Legal Fees: $1,250.00\nInterpreter fees: $250.00","calculatedMonthly":"$4,000.00","netAmount":"$4,000.00"}]}]}],
  "incomeSelfEmployment": [{"incomeSelfEmploymentDetails": [{"incomeSelfEmploymentInfo": [{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","effectiveDates":"05/24/2023 - ","relationshipToPrimary":"Primary","incomeType":"Self-Employment\nLump sum: No","countedDesignation":"Counted as: Earned\nSNAP: Countable\nFinancial: Countable","employmentInformation":"Business name: Bakery (Best Bakery)\nEmployment type: Part time\nEmployment status: ACTIVE"}]},
      {"selfEmploymentIncomeAndExpenses": [{"effectiveDates":"05/24/2023 - ","monthlyHours":"30","totalIncomeAndExpenses":"Total income: $850.00\nTotal expense: $150.00","netIncome":"$700.00","monthsCovered":"1","calculatedMonthly":"$700.00"}]},
    {"incomeAndExpense": [{"type":"Income","income":"$850.00","expense":"","datePeriod":"04/30/2023","description":""},
      {"type":"Expense","income":"","expense":"$150.00","datePeriod":"04/30/2023","description":""}]}]}],
  "otherIncome": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"07/10/2023 - ","type":"Supplemental Security Income (SSI)","status":"Failed to Apply For","appStatusAndDate":"Denied, 07/03/2023","reason":"Reason not provided by denying agency"}],
  "utilityExpenseInfo": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"06/01/2023 - "}],
  "utilityExpenses": [{"expenseTypeAndFrequency":"Water, Monthly","billedAmount":"$42.00","paidByHHAmount":"$42.00","paidByOtherAmount":"","personOrAgencyThatHelpsPay":"","startAndEndDates":"06/01/2023 -"},
    {"expenseTypeAndFrequency":"Garbage, Monthly","billedAmount":"$35.00","paidByHHAmount":"$35.00","paidByOtherAmount":"","personOrAgencyThatHelpsPay":"","startAndEndDates":"06/01/2023 -"},
    {"expenseTypeAndFrequency":"Gas, Monthly","billedAmount":"$45.00","paidByHHAmount":"$25.00","paidByOtherAmount":"$20.00","personOrAgencyThatHelpsPay":"ABC Agency","startAndEndDates":"06/01/2023 -"},
    {"expenseTypeAndFrequency":"Electric, Monthly","billedAmount":"$55.00","paidByHHAmount":"$55.00","paidByOtherAmount":"","personOrAgencyThatHelpsPay":"","startAndEndDates":"06/01/2023 -"},
    {"expenseTypeAndFrequency":"Sewer, Monthly","billedAmount":"$28.00","paidByHHAmount":"$28.00","paidByOtherAmount":"","personOrAgencyThatHelpsPay":"","startAndEndDates":"06/01/2023 -"}],
  "medicalExpenseInfo": [{"householdMember":"White, Hyacinth\nM  04/05/1959  64y  (78)","effectiveDates":"06/01/2023 - "}],
  "medicalExpenses": [{"expenseTypeAndFrequency":"Medical, Monthly","providerAndServiceDate":"Hawaili Hospital, 07/20/2023","description":"Hospital bills","totalAmountOwed":"$3,000.00","monthlyExpenseAllowed":"$500.00","startAndEndDates":"08/01/2023 - 01/31/2024"},
    {"expenseTypeAndFrequency":"Medical, One-Time","providerAndServiceDate":"","description":"Chiroprator","totalAmountOwed":"","monthlyExpenseAllowed":"$85.00","startAndEndDates":"06/01/2023 - 06/30/2023"},
    {"expenseTypeAndFrequency":"Dental, One-Time","providerAndServiceDate":"06/14/2023","description":"Dental Bill","totalAmountOwed":"","monthlyExpenseAllowed":"$245.00","startAndEndDates":"06/01/2023 - 06/30/2023"},
    {"expenseTypeAndFrequency":"Vision, One-Time","providerAndServiceDate":"05/26/2023","description":"Glasses","totalAmountOwed":"","monthlyExpenseAllowed":"$135.00","startAndEndDates":"06/01/2023 - 06/30/2023"},
    {"expenseTypeAndFrequency":"Medical, Monthly","providerAndServiceDate":"05/04/2023","description":"Medical Bill","totalAmountOwed":"","monthlyExpenseAllowed":"$65.00","startAndEndDates":"06/01/2023 -"}],
  "shelterExpenses": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"07/01/2023 -","expenseTypeAndFrequency":"Rent, Monthly","snap":"","amount":"Actual amount: $1600.00\nAmount paid by household: $800.00\nAmount paid by other: $800.00","paidByOtherInformation":"Who: Other Agency\nName: ABC Agency\nPaid to Landlord: No\nLoad to be repaid: Yes"},
    {"householdMember":"","effectiveDates":"06/01/2023 -","expenseTypeAndFrequency":"Rental Insurance, Monthly","snap":"","amount":"Actual amount: $50.00","paidByOtherInformation":""},
    {"householdMember":"","effectiveDates":"06/01/2023 -","expenseTypeAndFrequency":"Other, Monthly,\nOther shelter expense","snap":"Not Allowed","amount":"Actual amount: $250.00","paidByOtherInformation":""}],
  "supportExpenses": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"07/01/2023 -","expenseTypeAndFrequency":"Payment for Dependent Out of Home, Monthly","courtOrderedLegallyObligated":"Yes","obligationAmount":"$450.00","amountPaid":"$450.00"},
    {"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"06/01/2023 -","expenseTypeAndFrequency":"Child Support, Monthly","courtOrderedLegallyObligated":"Yes","obligationAmount":"$350.00","amountPaid":"$350.00"}],
  "dependentCareExpenseInfo": [{"householdMember":"White, Carnation\nF  05/15/1985  38y  (73)","effectiveDates":"06/01/2023 - "}],
  "dependentCareExpenses": [{"expenseTypeAndFrequency":"Child Care, Monthly","hhMemberNeedingCare":"White, Cyclamen\nM  12/28/2019  3y  (81)","incurredReason":"Yes","provider":"Child Care Provider","paidByAmounts":"Paid by household: $350.00\nAmount paid by other: $250.00","name":"Child Care Agency"},
    {"expenseTypeAndFrequency":"Care for a Dependent Adult, Monthly","hhMemberNeedingCare":"White, Hyacinth\nM  04/05/1959  64y  (78)","incurredReason":"Yes","provider":"Hawaii Dependent Care","paidByAmounts":"Paid by household: $100.00\nAmount paid by other: $200.00","name":"John Smith"}]
}
```

# KGAQF03RB
```
{
"reportName": "KGAQF03RB",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803223055",
"periodFrom": "04/01/2019",
"periodTo": "06/28/2019",
"reportFormat": "PDF"
}
```

# FAPCSSummary
```
{
"reportName":"FAPCSSummary",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803201520",
"reportFormat": "PDF"
}
```

# SMRFSummary
```
{
"reportName":"SMRFSummary",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803181520",
"reportFormat": "PDF"
}
```

# EBTMCBC
```
{
"reportName":"EBTMCBC",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "PDF"
}
```
# KGAMB09R
```
{
"reportName":"KGAMB09R",
"reportMonth":"December",
"reportYear":2016,
"rptYrMonthYYYYMM":"201612",
"extractTimeStamp":"20230813161555",
"reportFormat":"PDF"
}
```

# KGAMB11R
```
{
"reportName":"KGAMB11R",
"reportMonth":"December",
"reportYear":2016,
"rptYrMonthYYYYMM":"201612",
"extractTimeStamp":"20231015183000",
"reportFormat":"PDF"
}
```
# KGAMB12R
```
{
"reportName":"KGAMB12R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp":"20230803221520",
"reportFormat":"PDF"
}
```
# KGAMB12R - July 2024 from BES
```
{
"reportName":"KGAMB12R",
"reportMonth":"July",
"reportYear":2024,
"rptYrMonthYYYYMM":"202407",
"extractTimeStamp":"20240731204500",
"reportFormat":"PDF"
}
```
# KGAMB11RB
```
{
"reportName":"KGAMB11RB",
"reportMonth":"December",
"reportYear":2016,
"rptYrMonthYYYYMM":"201612",
"extractTimeStamp":"20231005161555",
"reportFormat":"PDF"
}
```

# KGADF02R
```
{
"reportName":"KGADF02R",
"reportMonth":"December",
"reportYear":2020,
"rptYrMonthYYYYMM":"202012",
"extractTimeStamp":"20230814171055",
"reportFormat":"PDF"
}
```

# KGAQB03R
```
{
"reportName":"KGAQB03R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp":"20230813161555",
"periodFrom":"04/01/2019",
"periodTo":"06/28/2019",
"reportFormat":"PDF"
}
```

# KGAQB04R
```
{
"reportName":"KGAQB04R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230813161555",
"periodFrom": "04/01/2019",
"periodTo": "06/28/2019",
"reportFormat": "PDF"
}
```
# KHGE7K2R
```
{
"reportName":"KHGE7K2R",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp": "20230803223055",
"periodFrom":"02/01/2022",
"periodTo":"06/30/2022",
"reportFormat": "PDF"
}
```
# KHGE7M2R
```
{
"reportName":"KHGE7M2R",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp": "20230803223055",
"periodFrom":"02/01/2022",
"periodTo":"06/30/2022",
"reportFormat": "PDF"
}
```
# KHGE7P2R
```
{
"reportName":"KHGE7P2R",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp": "20230803223055",
"periodFrom":"02/01/2022",
"periodTo":"06/30/2022",
"reportFormat": "PDF"
}
```
# KHGE7R2R
```
{
"reportName":"KHGE7R2R",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp": "20230803223045",
"periodFrom":"11/04/2022",
"periodTo":"11/04/2022",
"reportFormat": "PDF"
}
```
# KHGE7V2R
```
{
"reportName":"KHGE7V2R",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp": "20230803223055",
"periodFrom":"11/04/2022",
"periodTo":"11/04/2022",
"reportFormat": "PDF"
}
```
# KHPB7D2R
```
{
"reportName":"KHPB7D2R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803223055",
"reportFormat": "PDF"
}
```

# KGAQB01R
```
{
"reportName":"KGAQB01R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231020183010",
"periodFrom":"04/01/2019",
"periodTo":"06/30/2019",
"reportFormat":"PDF"
}
```

# KGADB02R1
```
{
"reportName":"KGADB02R1",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp":"20231023182000",
"reportFormat":"PDF",
"periodFrom":"10/24/2019",
"periodTo":"10/24/2019"
}
```

# KGADB02R2
```
{
"reportName":"KGADB02R2",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp": "20231023182001",
"reportFormat": "PDF",
"periodFrom":"10/24/2019",
"periodTo":"10/24/2019"
}
```

# KGADB02R3
```
{
"reportName":"KGADB02R3",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp":"20231024223455",
"reportFormat":"PDF",
"periodFrom":"10/24/2019",
"periodTo":"10/24/2019"
}
```
# KHKL1C2R
```
{
"reportName":"KHKL1C2R",
"reportMonth":"April",
"reportYear":2018,
"rptYrMonthYYYYMM":"201804",
"extractTimeStamp": "20231023182000",
"reportFormat": "PDF"
}
```
# KHKL1D2R
```
{
"reportName":"KHKL1D2R",
"reportMonth":"April",
"reportYear":2018,
"rptYrMonthYYYYMM":"201804",
"extractTimeStamp": "20231023182000",
"reportFormat": "PDF"
}
```
# KGAAB10R
```
{
"reportName":"KGAAB10R",
"reportMonth":"July",
"reportYear":2019,
"rptYrMonthYYYYMM":"201907",
"extractTimeStamp": "20231109182000",
"reportFormat": "PDF"
}
```

# KGAAB10RA
```
{
"reportName":"KGAAB10RA",
"reportMonth":"July",
"reportYear":2019,
"rptYrMonthYYYYMM":"201907",
"extractTimeStamp": "20231109182000",
"reportFormat": "PDF"
}
```
# KHUA32CR
```
{
"reportName":"KHUA32CR",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231111182000",
"reportFormat":"PDF"
}
```
# KGADB23RA
```
{
"reportFormat":"PDF",
"reportName":"KGADB23RA",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp":"20231113182000",
"periodFrom":"10/25/2019",
"periodTo":"10/25/2019"
}
```
# KGADB23RB
```
{
"reportFormat":"PDF",
"reportName":"KGADB23RB",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp":"20231114182000",
"periodFrom":"10/25/2019",
"periodTo":"10/25/2019"
}
```
# KGAA19R1
```
{
"reportFormat":"PDF",
"reportName":"KGAA19R1",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp":"20231116182000",
"periodFrom":"10/25/2019",
"periodTo":"10/25/2019"
}
```
# KGADH01RD
```
{
"reportFormat":"PDF",
"reportName":"KGADH01RD",
"reportMonth":"October",
"reportYear":2019,
"rptYrMonthYYYYMM":"201910",
"extractTimeStamp":"20231116182000",
"periodFrom":"10/25/2019",
"periodTo":"10/25/2019"
}
```
# KGAMF07RA
```
{
"reportName":"KGAMF07RA",
"reportMonth":"May",
"reportYear":2017,
"rptYrMonthYYYYMM":"201705",
"extractTimeStamp":"20231117182000",
"periodFrom":"05/18/2017",
"periodTo":"05/18/2017",
"reportFormat":"PDF"
}
```
# KGAMF07RB
```
{
"reportName":"KGAMF07RB",
"reportMonth":"March",
"reportYear":2022,
"rptYrMonthYYYYMM":"202203",
"extractTimeStamp":"20230803201520",
"periodFrom":"03/15/2022",
"periodTo":"03/15/2022",
"reportFormat":"PDF"
}
```
# KGAMF07RC
```
{
"reportName":"KGAMF07RC",
"reportMonth":"May",
"reportYear":2017,
"rptYrMonthYYYYMM":"201705",
"extractTimeStamp":"20231117182000",
"periodFrom":"05/18/2017",
"periodTo":"05/18/2017",
"reportFormat":"PDF"
}

```

# KGAMB54R

```
{
"reportName":"KGAMB54R",
"reportMonth":"December",
"reportYear":2016,
"rptYrMonthYYYYMM":"201612",
"extractTimeStamp":"20231114182000",
"reportFormat":"PDF"
}

```

# KHQA3C2R

```
{
"reportName":"KHQA3C2R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp":"20230803221520",
"reportFormat":"xls"
}
```
# KHKA3E2R
```
{
"reportName":"KHKA3E2R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231130182100",
"periodFrom":"05/15/2019",
"periodTo":"05/15/2019",
"reportFormat":"PDF"
}
```

# KHKA3E3R
```
{
"reportName":"KHKA3E3R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231129182100",
"periodFrom":"05/15/2019",
"periodTo":"05/15/2019",
"reportFormat":"PDF"
}
```

# KHKA3E4R
```
{
"reportName":"KHKA3E4R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231128182100",
"periodFrom":"05/15/2019",
"periodTo":"05/15/2019",
"reportFormat":"PDF"
}
```
# RMTSSummary
```
{
"reportName":"RMTSSummary",
"reportMonth":"June",
"reportYear":2022,
"rptYrMonthYYYYMM":"202206",
"extractTimeStamp":"20231203182100",
"periodFrom":"06/01/2022",
"periodTo":"06/30/2022",
"reportFormat":"PDF"
}
```
# RMTSDetail
```
{
"reportName":"RMTSDetail",
"reportMonth":"June",
"reportYear":2022,
"rptYrMonthYYYYMM":"202206",
"extractTimeStamp":"20231203182100",
"periodFrom":"06/01/2022",
"periodTo":"06/30/2022",
"reportFormat":"xls"
}
```

# KHPB1C2R
```
{
"reportName":"KHPB1C2R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp":"20230803221520",
"reportFormat":"PDF"
}
```
# KGAMB49R
```
{
"reportName":"KGAMB49R",
"reportMonth":"December",
"reportYear":2016,
"rptYrMonthYYYYMM":"201612",
"extractTimeStamp":"20231005161555",
"reportFormat":"PDF"
}
```
# KGAMB49R - Data from BES
```
{
"reportName":"KGAMB49R",
"reportMonth":"April",
"reportYear":2016,
"rptYrMonthYYYYMM":"201604",
"extractTimeStamp":"20240708142743",
"reportFormat":"PDF"
}
```
# KHFR1D5R
```
{
"reportName":"KHFR1D5R",
"reportMonth":"February",
"reportYear":2017,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231210182000",
"periodFrom":"02/15/2017",
"periodTo":"02/15/2017",
"reportFormat":"PDF"
}
```
# KGAMB19R
```
{
"reportName":"KGAMB19R",
"reportMonth":"July",
"reportYear":2023,
"rptYrMonthYYYYMM":"202307",
"extractTimeStamp":"20231213182100",
"periodFrom":"07/01/2023",
"periodTo":"07/31/2023",
"reportFormat":"PDF"
}
```
# KGAWF01RA
```
{
"reportName":"KGAWF01RA",
"reportMonth":"July",
"reportYear":2014,
"rptYrMonthYYYYMM":"201407",
"extractTimeStamp":"20231213182100",
"periodFrom":"07/18/2014",
"periodTo":"07/18/2014",
"reportFormat":"PDF"
}
```
# KGAWF01RA - Sample Data from HARI - May 2024
```
{
"reportName":"KGAWF01RA",
"reportMonth":"May",
"reportYear":2024,
"rptYrMonthYYYYMM":"202405",
"extractTimeStamp":"20240516160008",
"periodFrom":"05/03/2024",
"periodTo":"05/03/2024",
"reportFormat":"PDF"
}
```
# KGAWF01RA - Sample Data - July 2024
```
{
"reportName":"KGAWF01RA",
"reportMonth":"July",
"reportYear":2024,
"rptYrMonthYYYYMM":"202407",
"extractTimeStamp":"20240729182100",
"periodFrom":"07/03/2024",
"periodTo":"07/03/2024",
"reportFormat":"PDF"
}
```
# KGAWF01RA - Sample Data from HARI with 0 records for A, B and C reports respectively - May 2024
```
{
"reportName":"KGAWF01RA",
"reportMonth":"May",
"reportYear":2024,
"rptYrMonthYYYYMM":"202405",
"extractTimeStamp":"20240516160000",
"periodFrom":"05/03/2024",
"periodTo":"05/03/2024",
"reportFormat":"PDF"
}
```
# KGAWF01RB
```
{
"reportName":"KGAWF01RB",
"reportMonth":"July",
"reportYear":2014,
"rptYrMonthYYYYMM":"201407",
"extractTimeStamp":"20231213182100",
"periodFrom":"07/18/2014",
"periodTo":"07/18/2014",
"reportFormat":"PDF"
}
```

# KGAWF01RC
```
{
"reportName":"KGAWF01RC",
"reportMonth":"July",
"reportYear":2014,
"rptYrMonthYYYYMM":"201407",
"extractTimeStamp":"20231213182100",
"periodFrom":"07/18/2014",
"periodTo":"07/18/2014",
"reportFormat":"PDF"
}
```

# KGAWF01RD - with rejection records
```
{
"reportName":"KGAWF01RD",
"reportMonth":"July",
"reportYear":2014,
"rptYrMonthYYYYMM":"201407",
"extractTimeStamp":"20231213182100",
"periodFrom":"07/18/2014",
"periodTo":"07/18/2014",
"reportFormat":"PDF"
}
```

# KGAWF01RD - without rejection records
```
{
"reportName":"KGAWF01RD",
"reportMonth":"July",
"reportYear":2014,
"rptYrMonthYYYYMM":"201407",
"extractTimeStamp":"20231213192100",
"periodFrom":"07/18/2014",
"periodTo":"07/18/2014",
"reportFormat":"PDF"
}
```
# KGAWF03R
```
{
  "reportName":"KGAWF03R",
  "reportMonth":"September",
  "reportYear":2019,
  "rptYrMonthYYYYMM":"201909",
  "extractTimeStamp": "20240102191520",
  "periodFrom": "09/22/2019",
  "periodTo": "09/22/2019",
  "reportFormat":"PDF"
}
```
# KGAW03RA
```
{
"reportName":"KGAW03RA",
"reportMonth":"October",
"reportYear":2020,
"rptYrMonthYYYYMM":"202010",
"extractTimeStamp": "20231230201520",
"periodFrom": "10/20/2020",
"periodTo": "10/20/2020",
"reportFormat": "PDF"
}
```
# KHQC4A1R
```
{
"reportName":"KHQC4A1R",
"reportMonth":"July",
"reportYear":2023,
"rptYrMonthYYYYMM":"202307",
"extractTimeStamp":"20231220201520",
"periodFrom":"07/18/2023",
"periodTo":"07/18/2023",
"reportFormat":"PDF"
}
```

# KGAMF09R
```
{
"reportName":"KGAMF09R",
"reportMonth":"October",
"reportYear":2017,
"rptYrMonthYYYYMM":"201710",
"extractTimeStamp":"20231110182000",
"periodFrom":"10/18/2017",
"periodTo":"10/18/2017",
"reportFormat":"PDF"
}
```

# KHPA1J2R
```
{
"reportName":"KHPA1J2R",
"reportMonth":"March",
"reportYear":2017,
"rptYrMonthYYYYMM":"201703",
"extractTimeStamp":"20231123182000",
"reportFormat":"PDF"
}
```

# KHFB4E2R
```
{
"reportName":"KHFB4E2R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231226201520",
"periodFrom":"05/18/2023",
"periodTo":"05/18/2023",
"reportFormat":"PDF"
}
```

# KHFB4E3R
```
{
"reportName":"KHFB4E3R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231228201520",
"periodFrom":"05/18/2023",
"periodTo":"05/18/2023",
"reportFormat":"PDF"
}
```
# KHQA2C2R
```
{
"reportName": "KHQA2C2R",
"reportMonth": "January",
"reportYear": 2024,
"rptYrMonthYYYYMM": "202401",
"extractTimeStamp": "20240124110000",
"periodFrom": "01/01/2024",
"periodTo": "01/31/2024",
"reportFormat": "PDF"
}
```
# KHQA2I2R - Daily
```
{
"reportName":"KHQA2I2R",
"reportMonth":"February",
"reportYear":2023,
"rptYrMonthYYYYMM":"202302",
"extractTimeStamp":"20240120115000",
"periodFrom":"02/18/2023",
"periodTo":"02/18/2023",
"reportFormat":"pdf"
}
```

# KHQA2I2R - Monthly
```
{
"reportName":"KHQA2I2R",
"reportMonth":"December",
"reportYear":2023,
"rptYrMonthYYYYMM":"202312",
"extractTimeStamp":"20240124110000",
"periodFrom":"12/01/2023",
"periodTo":"12/31/2023",
"reportFormat":"pdf"
}
```
# KHQA2I2R - from BES
```
{
"reportName":"KHQA2I2R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240509135200",
"periodFrom":"04/01/2024",
"periodTo":"04/30/2024",
"reportFormat":"pdf"
}
```
# KHQA2M2R
```
{
"reportName":"KHQA2M2R",
"reportMonth":"February",
"reportYear":2023,
"rptYrMonthYYYYMM":"202302",
"extractTimeStamp":"20240122110000",
"periodFrom":"02/01/2023",
"periodTo":"02/28/2023",
"reportFormat":"pdf"
}
```
# KHQA2M2R - from BES
```
{
"reportName":"KHQA2M2R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240508155100",
"periodFrom":"04/01/2024",
"periodTo":"04/30/2024",
"reportFormat":"pdf"
}
```
# KHQA2R2R
```
{
"reportName":"KHQA2R2R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231129113000",
"periodFrom":"06/01/2019",
"periodTo":"06/30/2019",
"reportFormat":"XLS"
}
```
# KHQA2V2R
```
{
"reportName":"KHQA2V2R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231206113000",
"periodFrom":"06/01/2019",
"periodTo":"06/30/2019",
"reportFormat":"xls"
}
```
# KHFB4E2R
```
{
"reportName":"KHFB4E2R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231226201520",
"periodFrom":"05/18/2023",
"periodTo":"05/18/2023",
"reportFormat":"pdf"
}
```
# KHFB4E2R - BES Data
```
{
"reportName":"KHFB4E2R",
"reportMonth":"December",
"reportYear":2023,
"rptYrMonthYYYYMM":"202312",
"extractTimeStamp":"20240514205020",
"periodFrom":"12/01/2023",
"periodTo":"12/31/2023",
"reportFormat":"xls"
}
```
# KHFB4E3R
```
{
"reportName":"KHFB4E3R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231228201520",
"periodFrom":"05/18/2023",
"periodTo":"05/18/2023",
"reportFormat":"pdf"
}
```
# KHFT1
```
{
"reportName": "KHFT1",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "pdf"
}
```
# KHFT1 - big dataset
```
{
"reportName": "KHFT1",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20230822192010",
"reportFormat": "xls"
}
```
# KHFT2
```
{
"reportName":"KHFT2",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231112073000",
"periodFrom":"06/01/2019",
"periodTo":"06/30/2019",
"reportFormat":"pdf"
}
```
# SFAASummary
```
{
"reportName":"SFAASummary",
"reportMonth":"July",
"reportYear":2024,
"rptYrMonthYYYYMM":"202407",
"extractTimeStamp":"20240709100000",
"periodFrom":"01/15/2024",
"periodTo":"03/15/2024",
"reportFormat":"pdf"
}
```
# KHQA1A2R
```
{
"reportName":"KHQA1A2R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231108080000",
"periodFrom":"07/01/2023",
"periodTo":"09/30/2023",
"reportFormat":"pdf"
}
```

# KGAMF03R1
```
{
"reportName":"KGAMF03R1",
"reportMonth":"June",
"reportYear":2016,
"rptYrMonthYYYYMM":"201606",
"extractTimeStamp":"20231115123000",
"periodFrom":"06/30/2016",
"periodTo":"06/30/2016",
"reportFormat":"pdf"
}
```

# KGAMF03R2
```
{
"reportName":"KGAMF03R2",
"reportMonth":"June",
"reportYear":2016,
"rptYrMonthYYYYMM":"201606",
"extractTimeStamp":"20231118123000",
"periodFrom":"06/30/2016",
"periodTo":"06/30/2016",
"reportFormat":"pdf"
}
```

# KGAMF04R
```
{
"reportName":"KGAMF04R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231122183000",
"periodFrom":"06/01/2016",
"periodTo":"06/30/2016",
"reportFormat":"pdf"
}
```
# KGAMF04R - BES data from Jan 2005
```
{
"reportName":"KGAMF04R",
"reportMonth":"January",
"reportYear":2005,
"rptYrMonthYYYYMM":"200501",
"extractTimeStamp":"20240719183000",
"periodFrom":"01/01/2005",
"periodTo":"01/31/2005",
"reportFormat":"pdf"
}
```
# KHPB1C2R
```
{
"reportName": "KHPB1C2R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "PDF"
}
```

# KHPQ1A1R
```
{
"reportName": "KHPQ1A1R",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20230822192010",
"reportFormat": "PDF"
}
```

# KGAMB40R
```
{
"reportName": "KGAMB40R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "PDF"
}
```

# KHKA1YH2R
```
{
  "reportName":"KHKA1YH2R",
  "reportMonth":"July",
  "reportYear":2023,
  "rptYrMonthYYYYMM":"202307",
  "extractTimeStamp":"20230703221520",
  "reportFormat":"PDF"
}
```

# KHKA1Y2R - FA/FS
```
{
  "reportName":"KHKA1Y2R",
  "reportMonth":"September",
  "reportYear":2023,
  "rptYrMonthYYYYMM":"202309",
  "extractTimeStamp":"20240113213055",
  "reportFormat":"PDF",
  "periodFrom":"10/01/2023",
  "periodTo":"10/11/2023"
}
```

# KHKA1Y2R - FS
```
{
  "reportName":"KHKA1Y2R",
  "reportMonth":"September",
  "reportYear":2023,
  "rptYrMonthYYYYMM":"202309",
  "extractTimeStamp":"20240113223055",
  "reportFormat":"PDF"
}
```

# KHKA1Y2R - FA
```
{
  "reportName":"KHKA1Y2R",
  "reportMonth":"September",
  "reportYear":2023,
  "rptYrMonthYYYYMM":"202309",
  "extractTimeStamp":"20240113233055",
  "reportFormat":"PDF"
}
```
# KHPU4C2R
```
{
  "reportName": "KHPU4C2R",
  "reportMonth": "February",
  "reportYear": 2022,
  "rptYrMonthYYYYMM": "202202",
  "extractTimeStamp": "20230803221520",
  "periodFrom":"04/01/2019",
  "periodTo":"06/30/2019",
  "reportFormat": "PDF"
}
```
# KHPU4C3R
```
{
  "reportName": "KHPU4C3R",
  "reportMonth": "February",
  "reportYear": 2022,
  "rptYrMonthYYYYMM": "202202",
  "extractTimeStamp": "20230803221520",
  "periodFrom":"04/01/2019",
  "periodTo":"06/30/2019",
  "reportFormat": "PDF"
}
```
# KGAQF03RA
```
{
  "reportName": "KGAQF03RA",
  "reportMonth": "June",
  "reportYear": 2019,
  "rptYrMonthYYYYMM": "201906",
  "extractTimeStamp": "20231008101010",
  "periodFrom":"04/01/2019",
  "periodTo":"06/30/2019",
  "reportFormat": "PDF"
}
```

# KGAQF04R
```
{
  "reportName": "KGAQF04R",
  "reportMonth": "June",
  "reportYear": 2019,
  "rptYrMonthYYYYMM": "201906",
  "extractTimeStamp": "20231018110000",
  "periodFrom":"04/01/2019",
  "periodTo":"06/30/2019",
  "reportFormat": "PDF"
}
```

# KGAMB13RNishanth
```
{
"reportName": "KGAMB13RNishanth",
"reportMonth": "December",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202312",
"extractTimeStamp": "20240125223055",
"periodFrom": "12/01/2023",
"periodTo": "12/31/2023",
"reportFormat": "PDF"
}
```

# KGAMB13R - No data sample
```
{
"reportName": "KGAMB13R",
"reportMonth": "December",
"reportYear": 2016,
"rptYrMonthYYYYMM": "201612",
"extractTimeStamp": "20240125203055",
"periodFrom": "03/12/2016",
"periodTo": "03/12/2016",
"reportFormat": "PDF"
}
```

# KGAMB13R
```
{
"reportName": "KGAMB13R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"periodFrom": "12/01/2023",
"periodTo": "12/31/2023",
"reportFormat": "PDF"
}
```
# KGAMB13R - from BES
```
{
"reportName": "KGAMB13R",
"reportMonth": "December",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202312",
"extractTimeStamp": "20240510111700",
"periodFrom": "12/01/2023",
"periodTo": "12/31/2023",
"reportFormat": "PDF"
}
```
# KHQA2C2R
```
{
"reportName": "KHQA2C2R",
"reportMonth": "January",
"reportYear": 2024,
"rptYrMonthYYYYMM": "202401",
"extractTimeStamp": "20240124110000",
"periodFrom": "01/01/2024",
"periodTo": "01/31/2024",
"reportFormat": "PDF"
}
```
# KHUA2C3R1
```
{
"reportName":"KHUA2C3R1",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230703181520",
"periodFrom":"02/01/2022",
"periodTo":"02/28/2022",
"reportFormat": "PDF"
}
```
# KHUA2C3R2
```
{
"reportName":"KHUA2C3R2",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230703181520",
"periodFrom":"02/01/2022",
"periodTo":"02/28/2022",
"reportFormat": "PDF"
}
```
# KHGF1F2R
```
{
"reportName":"KHGF1F2R",
"reportMonth":"September",
"reportYear":2019,
"rptYrMonthYYYYMM":"201909",
"extractTimeStamp": "20231230201520",
"periodFrom": "09/30/2019",
"periodTo": "09/30/2019",
"reportFormat":"PDF"
}
```
# KHGF1L2R
```
{
"reportName": "KHGF1L2R",
"reportMonth": "August",
"reportYear": 2021,
"rptYrMonthYYYYMM": "202108",
"extractTimeStamp": "20240130223055",
"periodFrom": "08/12/2021",
"periodTo": "08/12/2021",
"reportFormat": "PDF"
}
```
# KHGF1P2R
```
{
"reportName": "KHGF1P2R",
"reportMonth": "August",
"reportYear": 2021,
"rptYrMonthYYYYMM": "202108",
"extractTimeStamp": "20240130223055",
"periodFrom": "08/12/2021",
"periodTo": "08/12/2021",
"reportFormat": "PDF"
}
```
# KHKA - Daily
```
{
"reportName": "KHKA",
"reportMonth": "January",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202301",
"extractTimeStamp": "20240201110000",
"reportFormat": "pdf",
"periodFrom":"01/21/2023",
"periodTo":"01/21/2023"
}
```
# KHKA - Monthly
```
{
"reportName": "KHKA",
"reportMonth": "January",
"reportYear": 2024,
"rptYrMonthYYYYMM": "202401",
"extractTimeStamp": "20240201110000",
"reportFormat": "pdf",
"periodFrom":"01/01/2024",
"periodTo":"01/31/2024"
}
```
# TDRJVReport - Daily
```
{
"reportName": "TDRJVReport",
"reportMonth": "January",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202301",
"extractTimeStamp": "20240201110000",
"reportFormat": "pdf",
"periodFrom":"01/21/2023",
"periodTo":"01/21/2023"
}
```
# KHKA1 - Daily
```
{
"reportName": "KHKA1",
"reportMonth": "January",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202301",
"extractTimeStamp": "20240201110000",
"reportFormat": "pdf",
"periodFrom":"01/21/2023",
"periodTo":"01/21/2023"
}
```
# KHKA2 - Monthly
```
{
"reportName": "KHKA2",
"reportMonth": "January",
"reportYear": 2024,
"rptYrMonthYYYYMM": "202401",
"extractTimeStamp": "20240201110000",
"reportFormat": "pdf",
"periodFrom":"01/01/2024",
"periodTo":"01/31/2024"
}
```
# KHPA1J2R
```
{
"reportName": "KHPA1J2R",
"reportMonth": "March",
"reportYear": 2017,
"rptYrMonthYYYYMM": "201703",
"extractTimeStamp": "20231123182000",
"reportFormat": "pdf",
"periodFrom":"03/01/2017",
"periodTo":"03/31/2017"
}
```
# KHPA1J3R
```
{
"reportName": "KHPA1J3R",
"reportMonth": "March",
"reportYear": 2017,
"rptYrMonthYYYYMM": "201703",
"extractTimeStamp": "20231123182000",
"reportFormat": "pdf",
"periodFrom":"03/01/2017",
"periodTo":"03/31/2017"
}
```
# KHPC1B3R
```
{
"reportName": "KHPC1B3R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "pdf",
"periodFrom":"02/01/2022",
"periodTo":"02/28/2022"
}
```
# KHPC3B2R
```
{
"reportName": "KHPC3B2R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803221520",
"reportFormat": "pdf",
"periodFrom":"02/01/2022",
"periodTo":"02/28/2022"
}
```
# OEReport
```
{
"reportName": "OEReport",
"reportMonth": "March",
"reportYear": 2017,
"rptYrMonthYYYYMM": "201703",
"extractTimeStamp": "20231123182000",
"reportFormat": "xlsx",
"periodFrom":"03/01/2017",
"periodTo":"03/31/2017"
}
```
# RReport
```
{
"reportName": "RReport",
"reportMonth": "March",
"reportYear": 2017,
"rptYrMonthYYYYMM": "201703",
"extractTimeStamp": "20231123182000",
"reportFormat": "xlsx",
"periodFrom":"03/01/2017",
"periodTo":"03/31/2017"
}
```
# KHPT5C2R
```
{
"reportName": "KHPT5C2R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp":"20231112073000",
"periodFrom":"06/01/2019",
"periodTo":"06/30/2019",
"reportFormat":"pdf"
}
```
# KQ42035
```
{
"reportName": "KQ42035",
"reportMonth":"October",
"reportYear":2020,
"rptYrMonthYYYYMM":"202010",
"extractTimeStamp":"20231112073000",
"periodFrom":"07/01/2020",
"periodTo":"09/30/2020",
"reportFormat":"pdf"
}
```
# KHPJ7C3R
```
{
"reportName":"KHPJ7C3R",
"reportMonth":"January",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20231126182100",
"periodFrom":"10/01/2021",
"periodTo":"12/31/2021",
"reportFormat":"PDF"
}
```
# KHUA3C2R
```
{
"reportName":"KHUA3C2R",
"reportMonth":"June",
"reportYear":2019,
"rptYrMonthYYYYMM":"201906",
"extractTimeStamp": "20231111182000",
"reportFormat":"pdf"
}
```
# KGAMF09R
```
{
"reportName":"KGAMF09R",
"reportMonth":"October",
"reportYear":2017,
"rptYrMonthYYYYMM":"201710",
"extractTimeStamp": "20231110182000",
"periodFrom":"10/19/2017",
"periodTo":"10/19/2017",
"reportFormat":"PDF"
}
```
# KHFB4E2R
```
{
"reportName":"KHFB4E2R",
"reportMonth":"May",
"reportYear":2019,
"rptYrMonthYYYYMM":"201905",
"extractTimeStamp":"20231226201520",
"periodFrom":"05/18/2023",
"periodTo":"05/18/2023",
"reportFormat":"PDF"
}
```
# KHFB4E3R
```
{
  "reportName":"KHFB4E3R",
  "reportMonth":"May",
  "reportYear":2019,
  "rptYrMonthYYYYMM":"201905",
  "extractTimeStamp":"20231228201520",
  "periodFrom":"05/18/2023",
  "periodTo":"05/18/2023",
  "reportFormat":"PDF"
}
```
# KHQA5C2R - Fiscal
```
{
"reportName": "KHQA5C2R",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20231219182100",
"reportFormat": "PDF"
}
```
# KHQA5C2R - Calendar
```
{
"reportName": "KHQA5C2R",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20231219162100",
"reportFormat": "PDF"
}
```
# KHQB5D2R
```
{
"reportName": "KHQB5D2R",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20231219182100",
"periodFrom":"07/01/2023",
"periodTo":"09/30/2023",
"reportFormat": "PDF"
}
```
# KHQC7C2R
```
{
"reportName":"KHQC7C2R",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp":"20240113223055",
"periodFrom":"10/01/2021",
"periodTo":"09/30/2022",
"reportFormat":"PDF"
}
```
# KHQC7C2RSummary
```
{
"reportName":"KHQC7C2RSummary",
"reportMonth":"November",
"reportYear":2022,
"rptYrMonthYYYYMM":"202211",
"extractTimeStamp":"20240113223055",
"periodFrom":"10/01/2021",
"periodTo":"09/30/2022",
"reportFormat":"PDF"
}
```
# KGAQ14
```
{
"reportName":"KGAQ14",
"reportMonth":"September",
"reportYear":2019,
"rptYrMonthYYYYMM":"201909",
"extractTimeStamp": "20231230201520",
"periodFrom": "07/01/2019",
"periodTo": "09/30/2019",
"reportFormat":"PDF"
}
```
# KGAQ14C1R
```
{
"reportName":"KGAQ14C1R",
"reportMonth":"September",
"reportYear":2019,
"rptYrMonthYYYYMM":"201909",
"extractTimeStamp": "20231230201520",
"periodFrom": "07/01/2019",
"periodTo": "09/30/2019",
"reportFormat":"PDF"
}
```
# KHPQ1A4R
```
{
"reportName":"KHPQ1A4R",
"reportMonth":"March",
"reportYear":2017,
"rptYrMonthYYYYMM":"201703",
"extractTimeStamp": "20241106223055",
"periodFrom": "03/01/2017",
"periodTo": "03/31/2017",
"reportFormat":"PDF"
}
```
# K100471C
```
{
"reportName": "K100471C",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "202202",
"extractTimeStamp": "20230803223055",
"periodFrom": "07/01/2015",
"periodTo": "06/30/2017",
"reportFormat": "pdf"
}
```
# K100471S
```
{
"reportName": "K100471S",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20230822192010",
"reportFormat": "pdf"
}
```
# KHGF9B2R
```
{
"reportName": "KHGF9B2R",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20230822192010",
"periodFrom": "02/01/2019",
"periodTo": "02/01/2019",
"reportFormat": "pdf"
}
```
# KHGF9B3R
```
{
"reportName": "KHGF9B3R",
"reportMonth": "July",
"reportYear": 2023,
"rptYrMonthYYYYMM": "202307",
"extractTimeStamp": "20230822192010",
"periodFrom": "03/15/2017",
"periodTo": "03/15/2017",
"reportFormat": "pdf"
}
```
# MCQReport
```
{
"reportName":"MCQReport",
"reportMonth":"March",
"reportYear":2024,
"rptYrMonthYYYYMM":"202403",
"extractTimeStamp": "20240315200000",
"periodFrom": "01/01/2024",
"periodTo": "03/31/2024",
"reportFormat":"XLS"
}
```
# KHFM2I2R
```
{
"reportName":"KHFM2I2R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803181520",
"reportFormat": "PDF"
}
```
# KHFM2I2R
```
{
"reportName":"KHFM2I2R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230703181520",
"reportFormat": "PDF"
}
```
# KHFM2I2R - from BES
```
{
"reportName":"KHFM2I2R",
"reportMonth":"January",
"reportYear":2024,
"rptYrMonthYYYYMM":"202401",
"extractTimeStamp": "20240606115220",
"reportFormat": "PDF"
}
```
# KHPD3A3R
```
{
"reportName":"KHPD3A3R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803201520",
"reportFormat": "PDF"
}
```
# KHPD3A7R
```
{
"reportName":"KHPD3A7R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803201520",
"reportFormat": "PDF"
}
```
# KHPD3A8R
```
{
"reportName":"KHPD3A8R",
"reportMonth":"February",
"reportYear":2022,
"rptYrMonthYYYYMM":"202202",
"extractTimeStamp": "20230803201520",
"reportFormat": "PDF"
}
```
# KHGE7G2R
```
{
"reportName":"KHGE7G2R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240409100000",
"periodFrom":"04/08/2024",
"periodTo":"04/08/2024",
"reportFormat":"pdf"
}
```
# KHGE7G3R
```
{
"reportName":"KHGE7G3R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240408100000",
"periodFrom":"04/07/2024",
"periodTo":"04/07/2024",
"reportFormat":"pdf"
}
```
# KHGE7G4R
```
{
"reportName":"KHGE7G4R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240409100000",
"periodFrom":"04/08/2024",
"periodTo":"04/08/2024",
"reportFormat":"pdf"
}
```
# KHLF1C2R
```
{
"reportName": "KHLF1C2R",
"reportMonth": "February",
"reportYear": 2022,
"rptYrMonthYYYYMM": "201612",
"extractTimeStamp": "20230703181520",
"periodFrom": "03/12/2016",
"periodTo": "03/12/2016",
"reportFormat": "PDF"
}
```
# KHGE7G2R
```
{
"reportName":"KHGE7G2R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240401100000",
"periodFrom":"01/15/2024",
"periodTo":"03/15/2024",
"reportFormat":"xlsx"
}
```
# KHGE7G3R
```
{
"reportName":"KHGE7G3R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240408100000",
"periodFrom":"01/15/2024",
"periodTo":"03/15/2024",
"reportFormat":"pdf"
}
```
# KHGE7G4R
```
{
"reportName":"KHGE7G4R",
"reportMonth":"April",
"reportYear":2024,
"rptYrMonthYYYYMM":"202404",
"extractTimeStamp":"20240409100000",
"periodFrom":"01/15/2024",
"periodTo":"03/15/2024",
"reportFormat":"xlsx"
}
```