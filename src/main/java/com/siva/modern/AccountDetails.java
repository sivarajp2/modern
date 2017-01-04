package com.siva.modern;

import java.math.BigDecimal;

public class AccountDetails {

    private ServiceStatus returnstatus;
    private String accountNumber;
    private String custName;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private BigDecimal creditLimit;
    private BigDecimal currentBalance;
    private BigDecimal openToBuy;
    private BigDecimal minimumDue;
    private String pricingId;
    private BigDecimal feeCharged;
    private BigDecimal intCharged;

    public void setServiceStatus(ServiceStatus servicestatusobj) {
        this.returnstatus = servicestatusobj;
    }

    public ServiceStatus getServiceStatus() {
        return returnstatus;
    }

    @Override
    public String toString() {
        return "AccountDetails [returnstatus=" + returnstatus
                + ", accountNumber=" + accountNumber + ", custName="
                + custName + ", addressLine1=" + addressLine1
                + ", addressLine2=" + addressLine2 + ", city=" + city
                + ", state=" + state + ", creditLimit=" + creditLimit
                + ", currentBalance=" + currentBalance + ", openToBuy="
                + openToBuy + ", minimumDue=" + minimumDue + ", pricingId="
                + pricingId + ", feeCharged=" + feeCharged
                + ", intCharged=" + intCharged + "]";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getOpenToBuy() {
        return openToBuy;
    }

    public void setOpenToBuy(BigDecimal openToBuy) {
        this.openToBuy = openToBuy;
    }

    public BigDecimal getMinimumDue() {
        return minimumDue;
    }

    public void setMinimumDue(BigDecimal minimumDue) {
        this.minimumDue = minimumDue;
    }

    public String getPricingId() {
        return pricingId;
    }

    public void setPricingId(String pricingId) {
        this.pricingId = pricingId;
    }

    public BigDecimal getFeeCharged() {
        return feeCharged;
    }

    public void setFeeCharged(BigDecimal feeCharged) {
        this.feeCharged = feeCharged;
    }

    public BigDecimal getIntCharged() {
        return intCharged;
    }

    public void setIntCharged(BigDecimal intCharged) {
        this.intCharged = intCharged;
    }


}
