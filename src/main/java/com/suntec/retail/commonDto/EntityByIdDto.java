package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.EntityType;
import com.suntec.retail.commonEnums.Status;
import lombok.Data;

import java.util.List;


/**
 * {@link EntityByIdDto}
 */
@Data
public class EntityByIdDto {

    private String entityId;

    private EntityType entityType;

    private String entityName;

    private String entityRegistrationNumber;

    private String entityDescription;

    private Status status;

    private String region;

    private String logo;

    private String email;

    private String websiteURL;

    private List<Phone> phones;

    private List<Address> addresses;

    private String authorityName;

    private String typeOfBusiness;

    private String issueDate;

    private String expiryDate;

    private List<AdditionalAttributes> additionalAttributes;

    private List<CooperativesByEntity> cooperativesByEntities;

}
