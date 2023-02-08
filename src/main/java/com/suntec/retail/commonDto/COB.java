package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.COBName;
import com.suntec.retail.commonEnums.COBType;

public class COB {
    private COBName itemName;
    private COBType itemType;
    private String itemValue;

    public COBName getItemName() {
        return itemName;
    }

    public void setItemName(COBName itemName) {
        this.itemName = itemName;
    }

    public COBType getItemType() {
        return itemType;
    }

    public void setItemType(COBType itemType) {
        this.itemType = itemType;
    }

    public String getItemValue() {
        return itemValue;
    }

    public void setItemValue(String itemValue) {
        this.itemValue = itemValue;
    }
}
