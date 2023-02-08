package com.suntec.retail.commonDto;

import com.suntec.retail.commonEnums.BDAStatus;
import com.suntec.retail.commonEnums.Currency;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class AbstractBDA
{
    @Id
    private String BDACode;
    private String version;
    private String BDAName;
    private String supplierId;
    private String supplierName;
    private String buyerId;
    private Currency transactionCurrency;
    private int year;
    private Date startDate;
    private Date endDate;
    private BDAStatus BDAStatus;

    public String getBDACode() {
        return BDACode;
    }

    public void setBDACode(String BDACode) {
        this.BDACode = BDACode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBDAName() {
        return BDAName;
    }

    public void setBDAName(String BDAName) {
        this.BDAName = BDAName;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public Currency getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(Currency transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public com.suntec.retail.commonEnums.BDAStatus getBDAStatus() {
        return BDAStatus;
    }

    public void setBDAStatus(com.suntec.retail.commonEnums.BDAStatus BDAStatus) {
        this.BDAStatus = BDAStatus;
    }
}
