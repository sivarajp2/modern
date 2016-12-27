package com.siva.modern;

import java.math.BigDecimal;

public class InterestDetails {
private String intCode;
private BigDecimal varIntRate;
private String intType;
private String rateIndexID;
@Override
public String toString() {
	return "InterestDetails [intCode=" + intCode + ", varIntRate=" + varIntRate
			+ ", intType=" + intType + ", rateIndexID=" + rateIndexID + "]";
}
public String getIntCode() {
	return intCode;
}
public void setIntCode(String intCode) {
	this.intCode = intCode;
}
public BigDecimal getVarIntRate() {
	return varIntRate;
}
public void setVarIntRate(BigDecimal varIntRate) {
	this.varIntRate = varIntRate;
}
public String getIntType() {
	return intType;
}
public void setIntType(String intType) {
	this.intType = intType;
}
public String getRateIndexID() {
	return rateIndexID;
}
public void setRateIndexID(String rateIndexID) {
	this.rateIndexID = rateIndexID;
}
}
