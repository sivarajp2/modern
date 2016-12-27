package com.siva.modern;

import java.math.BigDecimal;

public class MinimumDueDetails {
private String minimumDueCode;
private BigDecimal minimumDuePercent;


@Override
public String toString() {
	return "MinimumDueDetails [minimumDueCode=" + minimumDueCode
			+ ", minimumDuePercent=" + minimumDuePercent + "]";
}
public String getMinimumDueCode() {
	return minimumDueCode;
}
public void setMinimumDueCode(String minimumDueCode) {
	this.minimumDueCode = minimumDueCode;
}
public BigDecimal getMinimumDuePercent() {
	return minimumDuePercent;
}
public void setMinimumDuePercent(BigDecimal minimumDuePercent) {
	this.minimumDuePercent = minimumDuePercent;
}
}
