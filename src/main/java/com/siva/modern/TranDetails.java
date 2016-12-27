package com.siva.modern;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class TranDetails {

    private String accountNumber;
    private Timestamp myTimeStamp;
    private BigDecimal transactionAmount;
    private String transactionCode;
    private String transactionType;
    private String transactionDesc;
    private String transactionDate;
    private String transactionEffectiveDate;

	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Timestamp getMyTimeStamp() {
		return myTimeStamp;
	}
	public void setMyTimeStamp(Timestamp myTimeStamp) {
		this.myTimeStamp = myTimeStamp;
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
	@Override
	public String toString() {
		return "TranDetails [ accountNumber="
				+ accountNumber + ", myTimeStamp=" + myTimeStamp
				+ ", transactionAmount=" + transactionAmount
				+ ", transactionCode=" + transactionCode + ", transactionType="
				+ transactionType + ", transactionDesc=" + transactionDesc
				+ ", transactionDate=" + transactionDate
				+ ", transactionEffectiveDate=" + transactionEffectiveDate
				+ "]";
	}
    
	
}
