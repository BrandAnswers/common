package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.MechanismCriteriaType;
import com.suntec.retail.commonEnums.MechanismType;

public class Mechanism {
    private MechanismType mechanismType;
    private MechanismCriteriaType mechanismCriteriaType;
    private String mechanismValue;
    private String mechanismTarget;

    public MechanismType getMechanismType() {
        return mechanismType;
    }

    public void setMechanismType(MechanismType mechanismType) {
        this.mechanismType = mechanismType;
    }

    public MechanismCriteriaType getMechanismCriteriaType() {
        return mechanismCriteriaType;
    }

    public void setMechanismCriteriaType(MechanismCriteriaType mechanismCriteriaType) {
        this.mechanismCriteriaType = mechanismCriteriaType;
    }

    public String getMechanismValue() {
        return mechanismValue;
    }

    public void setMechanismValue(String mechanismValue) {
        this.mechanismValue = mechanismValue;
    }

    public String getMechanismTarget() {
        return mechanismTarget;
    }

    public void setMechanismTarget(String mechanismTarget) {
        this.mechanismTarget = mechanismTarget;
    }
}
