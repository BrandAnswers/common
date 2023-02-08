package com.suntec.retail.commonDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SectionDto {
    @JsonProperty("sectionName")
    private String sectionName;

    @JsonProperty("sectionId")
    private String sectionId;

    @JsonProperty("isEnabled")
    private Boolean isEnabled;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    @JsonProperty(value = "isEnabled")
    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }
}

