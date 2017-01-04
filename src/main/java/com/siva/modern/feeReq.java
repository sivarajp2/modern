package com.siva.modern;

import java.math.BigDecimal;

public class feeReq {
    private String accountNumber;
    private BigDecimal transactionAmount;
    private String transactionCode;
    private String transactionType;
    private String transactionDesc;
    private String transactionDate;
    private String transactionEffectiveDate;
    private BigDecimal chargedFee;
    private BigDecimal currentBalance;


    @Override
    public String toString() {
        return "feeReq [accountNumber=" + accountNumber
                + ", transactionAmount=" + transactionAmount
                + ", transactionCode=" + transactionCode + ", transactionType="
                + transactionType + ", transactionDesc=" + transactionDesc
                + ", transactionDate=" + transactionDate
                + ", transactionEffectiveDate=" + transactionEffectiveDate
                + ", chargedFee=" + chargedFee + ", currentBalance="
                + currentBalance + "]";
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }

    public BigDecimal getChargedFee() {
        return chargedFee;
    }

    public void setChargedFee(BigDecimal chargedFee) {
        this.chargedFee = chargedFee;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDesc() {
        return transactionDesc;
    }

    public void setTransactionDesc(String transactionDesc) {
        this.transactionDesc = transactionDesc;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionEffectiveDate() {
        return transactionEffectiveDate;
    }

    public void setTransactionEffectiveDate(String transactionEffectiveDate) {
        this.transactionEffectiveDate = transactionEffectiveDate;
    }


}
