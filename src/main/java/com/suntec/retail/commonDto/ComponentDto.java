package com.suntec.retail.commonDto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComponentDto {

    @JsonProperty("componentName")
    private String componentName;

    @JsonProperty("componentId")
    private String componentId;

    @JsonProperty("routeId")
    private String routeId;

    @JsonProperty("isEnabled")
    private boolean isEnabled;

    @JsonProperty("actions")
    private Map<String, ActionDto> actions;

    @JsonProperty("sections")
    private Map<String, SectionDto> sections;


    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    @JsonProperty(value = "isEnabled")
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public Map<String, ActionDto> getActions() {
        return actions;
    }

    public void setActions(Map<String, ActionDto> actions) {
        this.actions = actions;
    }

    public Map<String, SectionDto> getSections() {
        return sections;
    }

    public void setSections(Map<String, SectionDto> sections) {
        this.sections = sections;
    }

}

