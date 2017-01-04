package com.siva.modern;

import java.util.ArrayList;
import java.util.List;

public class TransactionWrapper {

    private ServiceStatus returnstatus;
    private List<TranDetails> trandetails;

    public ServiceStatus getReturnstatus() {
        return returnstatus;
    }

    public void setReturnstatus(ServiceStatus returnstatus) {
        this.returnstatus = returnstatus;
    }

    public List<TranDetails> getTrandetails() {
        return trandetails;
    }

    public void setTrandetails(List<TranDetails> trandetails) {
        this.trandetails = trandetails;
    }

    @Override
    public String toString() {
        return "TransactionWrapper [returnstatus=" + returnstatus
                + ", trandetails=" + trandetails + "]";
    }


}
