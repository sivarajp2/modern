package com.siva.modern;

public class ServiceStatus {
    private Boolean statusCode;
    private String errorCode;
    private String errorDesc;

    public Boolean getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Boolean statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ServiceStatus [statusCode=" + statusCode + ", errorCode="
                + errorCode + ", errorDesc=" + errorDesc + "]";
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

}
