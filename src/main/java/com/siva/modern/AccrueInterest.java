package com.siva.modern;

import java.math.BigDecimal;

public class AccrueInterest {
    private String accountNumber;
    private BigDecimal apr;
    private BigDecimal transactionAmount;
    private BigDecimal interestAccrued;

    @Override
    public String toString() {
        return "AccrueInterest [accountNumber=" + accountNumber + ", apr="
                + apr + ", transactionAmount=" + transactionAmount
                + ", interestAccrued=" + interestAccrued + "]";
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getApr() {
        return apr;
    }

    public void setApr(BigDecimal apr) {
        this.apr = apr;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public BigDecimal getInterestAccrued() {
        return interestAccrued;
    }

    public void setInterestAccrued(BigDecimal interestAccrued) {
        this.interestAccrued = interestAccrued;
    }

}
