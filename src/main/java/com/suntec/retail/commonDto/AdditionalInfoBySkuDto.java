package com.suntec.retail.commonDto;

import java.util.List;

/**
 * {@link AdditionalInfoBySkuDto}
 */

public class AdditionalInfoBySkuDto {

    private String sku;

    private String attributeId;

    private String entityId;

    private String attributeName;

    private String attributeValue;

    private String attributeType;

    private String attributeValidationType;

    private List<String> attributeDefaultValues;

    private boolean isPlatformAttribute;

    private boolean isMandatory;

    private  boolean allowFiltering;

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(String attributeId) {
        this.attributeId = attributeId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
    }

    public String getAttributeValidationType() {
        return attributeValidationType;
    }

    public void setAttributeValidationType(String attributeValidationType) {
        this.attributeValidationType = attributeValidationType;
    }

    public List<String> getAttributeDefaultValues() {
        return attributeDefaultValues;
    }

    public void setAttributeDefaultValues(List<String> attributeDefaultValues) {
        this.attributeDefaultValues = attributeDefaultValues;
    }

    public boolean isPlatformAttribute() {
        return isPlatformAttribute;
    }

    public void setPlatformAttribute(boolean platformAttribute) {
        isPlatformAttribute = platformAttribute;
    }

    public boolean isMandatory() {
        return isMandatory;
    }

    public void setMandatory(boolean mandatory) {
        isMandatory = mandatory;
    }

    public boolean isAllowFiltering() {
        return allowFiltering;
    }

    public void setAllowFiltering(boolean allowFiltering) {
        this.allowFiltering = allowFiltering;
    }


}
