package com.siva.modern;

import java.math.BigDecimal;

public class BaseRateDetails {
	private String rateIndexId;
	private BigDecimal apr;
	@Override
	public String toString() {
		return "BaseRateDetails [rateIndexId=" + rateIndexId + ", apr=" + apr
				+ "]";
	}
	public String getRateIndexId() {
		return rateIndexId;
	}
	public void setRateIndexId(String rateIndexId) {
		this.rateIndexId = rateIndexId;
	}
	public BigDecimal getApr() {
		return apr;
	}
	public void setApr(BigDecimal apr) {
		this.apr = apr;
	}
	

}
