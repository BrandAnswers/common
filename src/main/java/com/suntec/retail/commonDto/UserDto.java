package com.suntec.retail.commonDto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.suntec.retail.commonEnums.EntityType;
import com.suntec.retail.commonEnums.OnBoardingStatus;
import com.suntec.retail.commonEnums.Status;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@Data
public class UserDto {

    private String username;

    private String userPassword;

    private String firstName;

    private String lastName;

    private EntityType entityType;

    private String entityId;

    private String profilePicture;

    private String email;

    private String department;

    private OnBoardingStatus onBoardingStatus;

    private String role;

    private Status status;

    private List<Phone> phones;

    private List<Address> addresses;

    private String version;

    private Instant createdAt;

    private Instant updatedAt;

    private Map<String, String> onBoarding;

    @JsonProperty("configuration")
    private ConfigurationDto configuration;

}
