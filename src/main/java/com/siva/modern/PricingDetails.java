package com.siva.modern;

public class PricingDetails {
    private String pricingCode;
    private String intCode;
    private String feeCode;
    private String minimumDueCode;

    @Override
    public String toString() {
        return "PricingDetails [pricingCode=" + pricingCode + ", intCode="
                + intCode + ", feeCode=" + feeCode + ", minimumDueCode="
                + minimumDueCode + "]";
    }

    public String getPricingCode() {
        return pricingCode;
    }

    public void setPricingCode(String pricingCode) {
        this.pricingCode = pricingCode;
    }

    public String getIntCode() {
        return intCode;
    }

    public void setIntCode(String intCode) {
        this.intCode = intCode;
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getMinimumDueCode() {
        return minimumDueCode;
    }

    public void setMinimumDueCode(String minimumDueCode) {
        this.minimumDueCode = minimumDueCode;
    }
}
