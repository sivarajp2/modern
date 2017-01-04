package com.siva.modern;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.siva.service.ServiceInterfaces;

@RestController
public class ModernizationController {
    private ServiceStatus serviceStatus;
    private static final String template = "Hello, %s!";
    private final int counter1 = 1;
    @Autowired
    private ServiceInterfaces serviceinterfaces;

    @RequestMapping("/greeting")
    public List<Contact> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        System.out.println("entering");
        List<Contact> contactAs = serviceinterfaces.findAll();
        System.out.println("notentering");
        System.out.println("customer detail:" + contactAs);
        return contactAs;
    }

    @RequestMapping("/greeting1/{id}")
    public Contact greeting1(@PathVariable("id") int id) {


        System.out.println("entering");
        Contact contactAs1 = serviceinterfaces.findId(id);
        System.out.println("notentering");
        System.out.println("customer detail:" + contactAs1);
        return contactAs1;


    }

    @RequestMapping(value = "/greeting2/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Contact> greeting2(@RequestBody Contact contact) {

        serviceinterfaces.updateId(contact.getDept(), contact.getId());
        System.out.println("notentering");
        return new ResponseEntity(HttpStatus.OK);


    }

    @RequestMapping(value = "/greeting3/{id}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Contact> greeting3(@RequestBody Contact contact) {


        System.out.println("entering");
        System.out.println("siva" + contact.getDept());
        System.out.println("siva2" + contact.getId());
        serviceinterfaces.addId(contact.getId(), contact.getDept());
        System.out.println("notentering");
        return new ResponseEntity(HttpStatus.OK);


    }

    @CrossOrigin
    @RequestMapping(value = "/accountinquiry/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AccountDetails> accountInquiryMethod(@RequestBody AccountInquiry accountInquiry) {
        System.out.println("entering");
        AccountDetails accountInfo = serviceinterfaces.findAccountInfo(accountInquiry.getAccountNumber());
        System.out.println("customer detail:" + accountInfo);
        serviceStatus = accountInfo.getServiceStatus();
        if (serviceStatus.getStatusCode() == true) {
            return new ResponseEntity<>(accountInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(accountInfo, HttpStatus.OK);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/controlinquiry/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ControlDetails> controlInquiryMethod(@RequestBody AccountInquiry accountInquiry) {
        System.out.println("entering");
        ControlDetails controlInfo = serviceinterfaces.findControlInfo(accountInquiry.getAccountNumber());
        System.out.println("control detail:" + controlInfo);
        serviceStatus = controlInfo.getReturnstatus();
        if (serviceStatus.getStatusCode() == true) {
            return new ResponseEntity<>(controlInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(controlInfo, HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/updateinterest/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ServiceStatus> updateInterestMethod(@RequestBody AccrueInterest accrueInterest) {
        System.out.println("entering");
        ServiceStatus serviceStatusInfo = serviceinterfaces.updateInterestInfo(accrueInterest);
        System.out.println("interest detail:" + serviceStatusInfo);

        if (serviceStatusInfo.getStatusCode() == true) {
            return new ResponseEntity<>(serviceStatusInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(serviceStatusInfo, HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/updatemindue/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ServiceStatus> updateMinimumDueMethod(@RequestBody MinimumDueReq minimumduereq) {
        System.out.println("entering");
        ServiceStatus serviceStatusInfo = serviceinterfaces.updateMinimumDueInfo(minimumduereq);
        System.out.println("minimumdue detail:" + serviceStatusInfo);

        if (serviceStatusInfo.getStatusCode() == true) {
            return new ResponseEntity<>(serviceStatusInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(serviceStatusInfo, HttpStatus.BAD_REQUEST);
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/updatefee/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ServiceStatus> updateFeeMethod(@RequestBody feeReq feereq) {
        System.out.println("entering");
        ServiceStatus serviceStatusInfo = serviceinterfaces.updateFeeInfo(feereq);
        System.out.println("fee detail:" + serviceStatusInfo);

        if (serviceStatusInfo.getStatusCode() == true) {
            return new ResponseEntity<>(serviceStatusInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(serviceStatusInfo, HttpStatus.BAD_REQUEST);
        }
    }


    @CrossOrigin
    @RequestMapping(value = "/transactioninquiry/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TransactionWrapper> tranLookUp(@RequestBody TranInput tranInput) {
        System.out.println("entering");
        TransactionWrapper tranInfo = serviceinterfaces.findTranInfo(tranInput);
        System.out.println("tran detail:" + tranInfo);
        serviceStatus = tranInfo.getReturnstatus();
        if (serviceStatus.getStatusCode() == true) {
            return new ResponseEntity<>(tranInfo, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(tranInfo, HttpStatus.BAD_REQUEST);
        }
    }

}

