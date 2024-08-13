package com.jasper.reports.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CommunicationContact extends BaseModel {

    @JsonProperty("type")
    private String typeTxt;
    @JsonProperty("value")
    private String valueTxt;
    @JsonProperty("contactType")
    private String contactTypeTxt;
    @JsonProperty("contactPerson")
    private String contactPersonTxt;
    @JsonProperty("notes")
    private String notesTxt;

    public String getTypeTxt() {
        return typeTxt;
    }

    public void setTypeTxt(String typeTxt) {
        this.typeTxt = typeTxt;
    }

    public String getValueTxt() {
        return valueTxt;
    }

    public void setValueTxt(String valueTxt) {
        this.valueTxt = valueTxt;
    }

    public String getContactTypeTxt() {
        return contactTypeTxt;
    }

    public void setContactTypeTxt(String contactTypeTxt) {
        this.contactTypeTxt = contactTypeTxt;
    }

    public String getContactPersonTxt() {
        return contactPersonTxt;
    }

    public void setContactPersonTxt(String contactPersonTxt) {
        this.contactPersonTxt = contactPersonTxt;
    }

    public String getNotesTxt() {
        return notesTxt;
    }

    public void setNotesTxt(String notesTxt) {
        this.notesTxt = notesTxt;
    }
}
