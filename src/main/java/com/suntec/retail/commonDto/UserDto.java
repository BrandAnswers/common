package com.suntec.retail.commonDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.suntec.retail.commonEnums.EntityType;
import com.suntec.retail.commonEnums.OnBoardingStatus;
import com.suntec.retail.commonEnums.Status;

import java.util.Map;


public class UserDto {
    private String username;
    private long createTimestamp;
    private String firstName;
    private String lastName;
    private EntityType entityType;
    private String role;
    private String entityId;
    private String profilePicture;
    private String email;
    private Status status;
    private String department;
    private OnBoardingStatus onBoardingStatus;
    private Map<String, String> onBoarding;
    @JsonProperty("configuration")
    private ConfigurationDto configuration;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public OnBoardingStatus getOnBoardingStatus() {
        return onBoardingStatus;
    }

    public void setOnBoardingStatus(OnBoardingStatus onBoardingStatus) {
        this.onBoardingStatus = onBoardingStatus;
    }

    public Map<String, String> getOnBoarding() {
        return onBoarding;
    }

    public void setOnBoarding(Map<String, String> onBoarding) {
        this.onBoarding = onBoarding;
    }

    public ConfigurationDto getConfiguration() {
        return configuration;
    }

    public void setConfiguration(ConfigurationDto configuration) {
        this.configuration = configuration;
    }
}
