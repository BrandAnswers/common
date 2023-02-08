package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.ProgramLine;

import java.util.List;
import java.util.Map;

public class IndividualBDA extends AbstractBDA {

    private String brandId;
    private String categoryId;
    private String parentCategoryId;
    private String brandName;
    private String categoryName;
    private String parentCategoryName;
    private String buyerName;
    private String region;
    private double baseTarget;
    private String paymentMode;
    private List<ProgramLine> programLines;
    private List<Mechanism> mechanisms;
    private Map<String, List<String>> termsAndConditions;
    private List<COB> cobs;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(String parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getParentCategoryName() {
        return parentCategoryName;
    }

    public void setParentCategoryName(String parentCategoryName) {
        this.parentCategoryName = parentCategoryName;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getBaseTarget() {
        return baseTarget;
    }

    public void setBaseTarget(double baseTarget) {
        this.baseTarget = baseTarget;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public List<ProgramLine> getProgramLines() {
        return programLines;
    }

    public void setProgramLines(List<ProgramLine> programLines) {
        this.programLines = programLines;
    }

    public List<Mechanism> getMechanisms() {
        return mechanisms;
    }

    public void setMechanisms(List<Mechanism> mechanisms) {
        this.mechanisms = mechanisms;
    }

    public Map<String, List<String>> getTermsAndConditions() {
        return termsAndConditions;
    }

    public void setTermsAndConditions(Map<String, List<String>> termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }

    public List<COB> getCobs() {
        return cobs;
    }

    public void setCobs(List<COB> cobs) {
        this.cobs = cobs;
    }
}
