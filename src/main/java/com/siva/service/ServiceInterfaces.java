package com.siva.service;

import java.util.List;

import com.siva.modern.AccountDetails;
import com.siva.modern.AccrueInterest;
import com.siva.modern.Contact;
import com.siva.modern.ControlDetails;
import com.siva.modern.MinimumDueReq;
import com.siva.modern.ServiceStatus;
import com.siva.modern.TranInput;
import com.siva.modern.TransactionWrapper;
import com.siva.modern.feeReq;


public interface ServiceInterfaces {

    public List<Contact> findAll();

    public Contact findId(int id1);

    public void updateId(String dept, int id1);

    public void addId(int id, String dept);

    public AccountDetails findAccountInfo(String accountNumber);

    public ControlDetails findControlInfo(String accountNumber);

    public TransactionWrapper findTranInfo(TranInput traninput);

    public ServiceStatus updateInterestInfo(AccrueInterest accrueInterest);

    public ServiceStatus updateMinimumDueInfo(MinimumDueReq minimuduereq);

    public ServiceStatus updateFeeInfo(feeReq feereq);

}
