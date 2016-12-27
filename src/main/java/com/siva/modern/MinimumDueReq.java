package com.siva.modern;

import java.math.BigDecimal;

public class MinimumDueReq {
	private String accountNumber;
	private BigDecimal minimumduepercent;
	private BigDecimal currentBalance;
	
	@Override
	public String toString() {
		return "MinimumDueReq [accountNumber=" + accountNumber
				+ ", minimumduepercent=" + minimumduepercent
				+ ", currentBalance=" + currentBalance + "]";
	}
	public BigDecimal getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getMinimumduepercent() {
		return minimumduepercent;
	}
	public void setMinimumduepercent(BigDecimal minimumduepercent) {
		this.minimumduepercent = minimumduepercent;
	}

}
