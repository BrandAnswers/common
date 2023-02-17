package com.suntec.retail.commonDto;

import lombok.Data;

import java.util.List;

@Data
public class AdditionalInfoEntityId {

    private String attributeId;

    private String attributeName;

    private String attributeValue;

    private String attributeType;

    private String attributeValidationType;

    private List<String> attributeDefaultValues;

    private boolean isPlatformAttribute;

    private boolean isMandatory;

}
