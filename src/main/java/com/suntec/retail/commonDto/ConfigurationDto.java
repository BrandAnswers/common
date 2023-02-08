package com.suntec.retail.commonDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "component",
        "configSchemaVersion"
})
public class ConfigurationDto {

    @JsonProperty("component")
    private Map<String, ComponentDto> component;
    @JsonProperty("configSchemaVersion")
    private String configSchemaVersion;

    @JsonProperty("component")
    public Map<String, ComponentDto> getComponent() {
        return component;
    }

    @JsonProperty("component")
    public void setComponent(Map<String, ComponentDto> component) {
        this.component = component;
    }

    @JsonProperty("configSchemaVersion")
    public String getConfigSchemaVersion() {
        return configSchemaVersion;
    }

    @JsonProperty("configSchemaVersion")
    public void setConfigSchemaVersion(String configSchemaVersion) {
        this.configSchemaVersion = configSchemaVersion;
    }
}

