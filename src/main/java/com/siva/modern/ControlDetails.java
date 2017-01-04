package com.siva.modern;

import java.math.BigDecimal;

public class ControlDetails {

    private ServiceStatus returnstatus;
    private String accountNumber;
    private String tranCode;
    private BigDecimal intToBeCharged;

    @Override
    public String toString() {
        return "ControlDetails [returnstatus=" + returnstatus
                + ", accountNumber=" + accountNumber + ", tranCode=" + tranCode
                + ", intToBeCharged=" + intToBeCharged + ", minimumDuePercent="
                + minimumDuePercent + ", transasctionFee=" + transasctionFee
                + "]";
    }

    public String getTranCode() {
        return tranCode;
    }

    public void setTranCode(String tranCode) {
        this.tranCode = tranCode;
    }

    public ServiceStatus getReturnstatus() {
        return returnstatus;
    }

    public void setReturnstatus(ServiceStatus returnstatus) {
        this.returnstatus = returnstatus;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getIntToBeCharged() {
        return intToBeCharged;
    }

    public void setIntToBeCharged(BigDecimal intToBeCharged) {
        this.intToBeCharged = intToBeCharged;
    }

    public BigDecimal getMinimumDuePercent() {
        return minimumDuePercent;
    }

    public void setMinimumDuePercent(BigDecimal minimumDuePercent) {
        this.minimumDuePercent = minimumDuePercent;
    }

    public BigDecimal getTransasctionFee() {
        return transasctionFee;
    }

    public void setTransasctionFee(BigDecimal transasctionFee) {
        this.transasctionFee = transasctionFee;
    }

    private BigDecimal minimumDuePercent;
    private BigDecimal transasctionFee;
}
