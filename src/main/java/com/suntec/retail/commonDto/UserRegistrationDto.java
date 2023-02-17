package com.suntec.retail.commonDto;


import com.suntec.retail.commonEnums.EntityType;
import lombok.Data;

@Data
public class UserRegistrationDto {
    private String username;
    private String userPassword;
    private EntityType entityType;
    private String email;
    private String entityName;
    private String regionId;

}
