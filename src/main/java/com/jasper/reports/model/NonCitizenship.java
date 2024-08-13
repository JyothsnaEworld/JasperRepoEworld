package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NonCitizenship extends BaseModel {

    @JsonProperty("householdMember")
    private String householdMemberTxt;
    @JsonProperty("effectiveDates")
    private String effectiveDatesTxt;
    @JsonProperty("type")
    private String TypeTxt;
    @JsonProperty("subType")
    private String subTypeTxt;
    @JsonProperty("quartersInformation")
    private String quartersInformationTxt;
    @JsonProperty("otherInformation")
    private String otherInformationTxt;

}
