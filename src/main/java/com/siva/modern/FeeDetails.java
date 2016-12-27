package com.siva.modern;

import java.math.BigDecimal;

public class FeeDetails {
	private String feeCode;
	private BigDecimal transactionFee;
	private String transactionCode;

	@Override
	public String toString() {
		return "FeeDetails [feeCode=" + feeCode + ", transactionFee="
				+ transactionFee + ", transactionCode=" + transactionCode + "]";
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getFeeCode() {
		return feeCode;
	}
	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}
	public BigDecimal getTransactionFee() {
		return transactionFee;
	}
	public void setTransactionFee(BigDecimal transactionFee) {
		this.transactionFee = transactionFee;
	}

}
