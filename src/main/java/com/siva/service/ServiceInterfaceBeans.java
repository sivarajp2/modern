package com.siva.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siva.dao.Dontknow;
import com.siva.modern.AccountDetails;
import com.siva.modern.AccrueInterest;
import com.siva.modern.BaseRateDetails;
import com.siva.modern.Contact;
import com.siva.modern.ControlDetails;
import com.siva.modern.FeeDetails;
import com.siva.modern.InterestDetails;
import com.siva.modern.MinimumDueDetails;
import com.siva.modern.MinimumDueReq;
import com.siva.modern.PricingDetails;
import com.siva.modern.ServiceStatus;
import com.siva.modern.TranInput;
import com.siva.modern.TransactionWrapper;
import com.siva.modern.feeReq;

@Service

public class ServiceInterfaceBeans implements ServiceInterfaces {
    @Autowired
    Dontknow dontknow;
    ControlDetails controlInfo;
    private ServiceStatus serviceStatus;

    public List<Contact> findAll() {
        List<Contact> contactAs = dontknow.findAll();
        return contactAs;
    }

    public Contact findId(int id1) {

        Contact contactAs1 = dontknow.findId(id1);
        return contactAs1;
    }

    public void updateId(String dept, int id1) {
        dontknow.updateId(dept, id1);
    }

    public void addId(int id, String dept) {
        dontknow.addId(id, dept);
    }

    public AccountDetails findAccountInfo(String accountNumber) {

        AccountDetails accountInfo = dontknow.findAcountInfo(accountNumber);
        return accountInfo;
    }

    public ControlDetails findControlInfo(String accountNumber) {

        AccountDetails accountInfo = dontknow.findAcountInfo(accountNumber);


        serviceStatus = accountInfo.getServiceStatus();
        ControlDetails controlInfo = new ControlDetails();
        if (serviceStatus.getStatusCode() == true) {


            PricingDetails pricingInfo = dontknow.findPricingInfo(accountInfo.getPricingId());
            FeeDetails feeInfo = dontknow.findFeeInfo(pricingInfo.getFeeCode());
            MinimumDueDetails minimumdueInfo = dontknow.findMinimumDueInfo(pricingInfo.getMinimumDueCode());
            InterestDetails interestinfo = dontknow.findInterestInfo(pricingInfo.getIntCode());
            BaseRateDetails baserateinfo = dontknow.findBaseRateInfo(interestinfo.getRateIndexID());

            controlInfo.setAccountNumber(accountInfo.getAccountNumber());
            controlInfo.setMinimumDuePercent(minimumdueInfo.getMinimumDuePercent());
            controlInfo.setTransasctionFee(feeInfo.getTransactionFee());
            controlInfo.setTranCode(feeInfo.getTransactionCode());
            controlInfo.setReturnstatus(serviceStatus);
            if (interestinfo.getIntType() == "f")
                controlInfo.setIntToBeCharged(baserateinfo.getApr());
            else
                controlInfo.setIntToBeCharged(baserateinfo.getApr().add(interestinfo.getVarIntRate()));

            return controlInfo;
        } else {
            controlInfo.setReturnstatus(serviceStatus);
            return controlInfo;
        }

    }

    public ServiceStatus updateInterestInfo(AccrueInterest accrueInterest) {
        BigDecimal tempAccrueInterest;
        BigDecimal bg;
        String s;
        Long l = new Long("36500");
        bg = BigDecimal.valueOf(l);
        tempAccrueInterest =
                (((accrueInterest.getApr()).multiply(accrueInterest.getTransactionAmount()))).add(accrueInterest.getInterestAccrued()).divide(bg, 2, RoundingMode.CEILING);
        s = tempAccrueInterest.toPlainString();
        System.out.println("sivaaa" + s);
        dontknow.updateInterestInfo(accrueInterest.getAccountNumber(), tempAccrueInterest);
        ServiceStatus servicestatus = new ServiceStatus();
        servicestatus.setStatusCode(true);
        servicestatus.setErrorCode("000");
        servicestatus.setErrorDesc("updatesuccessful");
        return servicestatus;


    }

    public ServiceStatus updateMinimumDueInfo(MinimumDueReq minimumduereq) {
        System.out.println("revaaa" + minimumduereq);
        BigDecimal tempMinDueAmt;
        BigDecimal bg;
        String s;
        Long l = new Long("100");
        bg = BigDecimal.valueOf(l);
        tempMinDueAmt =
                (((minimumduereq.getCurrentBalance()).multiply(minimumduereq.getMinimumduepercent()))).divide(bg, 2, RoundingMode.CEILING);
        s = tempMinDueAmt.toPlainString();
        System.out.println("sivaaa" + s);
        dontknow.updateMinimumDueInfo(minimumduereq.getAccountNumber(), tempMinDueAmt);
        ServiceStatus servicestatus = new ServiceStatus();
        servicestatus.setStatusCode(true);
        servicestatus.setErrorCode("000");
        servicestatus.setErrorDesc("updatesuccessful");
        return servicestatus;


    }


    public ServiceStatus updateFeeInfo(feeReq feereq) {
        System.out.println("revaaa" + feereq);
        BigDecimal calcfee = null;
        BigDecimal calcbalancetemp = null;


        System.out.println("sivarajfeeeee" + feereq.getTransactionType());
        if (feereq.getTransactionType().charAt(0) == 'D' || feereq.getTransactionType().charAt(0) == 'd') {
        	 if (feereq.getTransactionCode().charAt(0) == '5') {
            calcfee = feereq.getChargedFee().add(feereq.getTransactionAmount());
            calcbalancetemp = feereq.getCurrentBalance().add(feereq.getTransactionAmount());
                 }
        	 else {
        		 calcfee = feereq.getChargedFee();
        		 calcbalancetemp = feereq.getCurrentBalance().add(feereq.getTransactionAmount());
        	 	  }
        		 
        	 }
         else {
        	 if (feereq.getTransactionCode().charAt(0) == '5') {
            calcfee = feereq.getChargedFee().subtract(feereq.getTransactionAmount());
            calcbalancetemp = feereq.getCurrentBalance().subtract(feereq.getTransactionAmount());
        	 } 
        	 else {
        		 calcfee = feereq.getChargedFee();
        		 calcbalancetemp = feereq.getCurrentBalance().subtract(feereq.getTransactionAmount());
        	 }
        }
        dontknow.updateFeeInfo(feereq.getAccountNumber(), feereq.getTransactionAmount(), feereq.getTransactionCode(), feereq.getTransactionType(), feereq.getTransactionDesc(), feereq.getTransactionDate(), feereq.getTransactionEffectiveDate(), calcfee, calcbalancetemp);
        ServiceStatus servicestatus = new ServiceStatus();
        servicestatus.setStatusCode(true);
        servicestatus.setErrorCode("000");
        servicestatus.setErrorDesc("updatesuccessful");
        return servicestatus;


    }


    public TransactionWrapper findTranInfo(TranInput traninput) {
        System.out.println("etering service" + traninput.getMytimestamp());
        long currentDateTime = Long.parseLong(traninput.getMytimestamp());
        ;
        Date currentDate = new Date(currentDateTime);
        System.out.println("current Date: " + currentDate);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println("Milliseconds to Date: " + df.format(currentDate));
        TransactionWrapper tranInfo = dontknow.findTranInfo(traninput.getAccountNumber(), df.format(currentDate));
        return tranInfo;
    }

}
