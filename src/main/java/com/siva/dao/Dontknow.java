package com.siva.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.siva.modern.AccountDetails;
import com.siva.modern.BaseRateDetails;
import com.siva.modern.Contact;
import com.siva.modern.FeeDetails;
import com.siva.modern.FeeRowMapper;
import com.siva.modern.InterestDetails;
import com.siva.modern.MinimumDueDetails;
import com.siva.modern.PricingDetails;
import com.siva.modern.PricingRowMapper;
import com.siva.modern.ServiceStatus;
import com.siva.modern.TranDetails;
import com.siva.modern.TransactionWrapper;
import com.siva.modern.UserRowMapper;
@Repository
public class Dontknow {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private AccountDetails accountDetail;
	private TranDetails trandetails;
	private TransactionWrapper transactionwrapper = new TransactionWrapper();
	
		public List<Contact> findAll() {
		System.out.println("entering");
			return this.jdbcTemplate.query( "select id, dept from sampledb", new UserRowMapper());

		}	
		public Contact findId(int id1){

			String sql = "SELECT * FROM SAMPLEDB WHERE ID = ?";
			return this.jdbcTemplate.queryForObject(
					sql, new Object[] { id1 }, new UserRowMapper());

				}
		public void updateId(String dept, int id1){

			String sql = "Update SAMPLEDB set dept = ? WHERE ID = ?";
			int[] types = {Types.CHAR, Types.INTEGER};
			Object[] params = {dept,id1};
			jdbcTemplate.update(
					sql, params,types);
             
				}
		public void addId(int id,String dept){

			String sql = "INSERT INTO SAMPLEDB (id,dept) values (?,?)";
			int[] types = {Types.INTEGER,Types.CHAR,};
			Object[] params = {id,dept};
			jdbcTemplate.update(
					sql, params,types);
             
				}
		
		public AccountDetails findAcountInfo(String accountNumber){
		
            try {
            	
            	ServiceStatus servicestatus = new ServiceStatus();
	            servicestatus.setStatusCode(true);	
	            String sql = "SELECT * FROM masteraccount WHERE accountnumber = ?";
			    accountDetail = jdbcTemplate.queryForObject(
					sql, new Object[] { accountNumber }, new AccountRowMapper());
			    accountDetail.setServiceStatus(servicestatus);
	         	return accountDetail;		

			}catch(IncorrectResultSizeDataAccessException e) {
					      ServiceStatus servicestatus = new ServiceStatus();
					      servicestatus.setStatusCode(false);
					      servicestatus.setErrorCode("100");
					      servicestatus.setErrorDesc("sorry account not found retry");
					      AccountDetails accountdetails = new AccountDetails();
					      accountdetails.setServiceStatus(servicestatus);
					      System.out.println("enteringhoi"+accountdetails);
					    					      return accountdetails;
			  }
		} 
		
		public FeeDetails findFeeInfo(String feeCode){

			String sql = "SELECT * FROM FEE WHERE FEECODE = ?";
			return this.jdbcTemplate.queryForObject(
					sql, new Object[] { feeCode }, new FeeRowMapper());

				}
		public MinimumDueDetails findMinimumDueInfo(String minCode){

			String sql = "SELECT * FROM MINIMUMDUE WHERE MINIMUMDUECODE = ?";
			return this.jdbcTemplate.queryForObject(
					sql, new Object[] { minCode }, new MinimumDueDetailsRowMapper());

				}
		public InterestDetails findInterestInfo(String intCode){

			String sql = "SELECT * FROM INTEREST WHERE INTCODE = ?";
			return this.jdbcTemplate.queryForObject(
					sql, new Object[] { intCode }, new InterestDetailsRowMapper());

				}
		public BaseRateDetails findBaseRateInfo(String baseIntCode){

			String sql = "SELECT * FROM FIXEDINTEREST WHERE RATEINDEXID = ?";
			return this.jdbcTemplate.queryForObject(
					sql, new Object[] { baseIntCode }, new BaseRateDetailsRowMapper());

				}
		public PricingDetails findPricingInfo(String pricingCode){

			String sql = "SELECT * FROM PRICINGTABLE WHERE PRICINGCODE = ?";
			return this.jdbcTemplate.queryForObject(
					sql, new Object[] { pricingCode }, new PricingRowMapper());

				}

		public void updateInterestInfo(String accountnumber, BigDecimal accrueInterest){
			String s;
			s = accrueInterest.toPlainString();
			System.out.println("sivrraaa"+s);
			System.out.println("acsivara"+accountnumber);
			String sql = "Update masteraccount set interestcharged = ? WHERE accountnumber = ?";
			int[] types = {Types.DOUBLE, Types.CHAR};
			Object[] params = {accrueInterest,accountnumber};
			jdbcTemplate.update(
					sql, params,types);
		
		
		}
		
		public void updateMinimumDueInfo(String accountnumber, BigDecimal mindue){
			String s;
			s = mindue.toPlainString();
			System.out.println("sivrraaa"+s);
			System.out.println("acsivara"+accountnumber);
			String sql = "Update masteraccount set minimumdue = ? WHERE accountnumber = ?";
			int[] types = {Types.DOUBLE, Types.CHAR};
			Object[] params = {mindue,accountnumber};
			jdbcTemplate.update(
					sql, params,types);
		
		
		}
		
		public void updateFeeInfo(String accountNumber,BigDecimal transactionAmount,String transactionCode,String transactionType,String transactionDesc,String transactionDate,String transactionEffectiveDate,BigDecimal calcfee,BigDecimal calcbalance){
			Timestamp timestamp = new Timestamp(System.currentTimeMillis());
			System.out.println("sivatime"+timestamp);
						
			String sql = "Update masteraccount set feecharged = ?, currentbalance = ? WHERE accountnumber = ?";
			int[] types = {Types.DOUBLE, Types.DOUBLE, Types.CHAR};
			Object[] params = {calcfee,calcbalance,accountNumber};
			jdbcTemplate.update(
					sql, params,types);
			
			String sqltran = "insert into transaction (accountnumber, mytimestamp, transactionamount, transactioncode, transactiontype, transactionDesc, transactionDate, transactionEffectiveDate)" +
					"values (?, ?, ?, ?, ?, ?, ?, ?)";

			int[] typestran = {Types.CHAR,Types.TIMESTAMP,Types.DOUBLE, Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR, Types.CHAR};
			Object[] paramstran = {accountNumber,timestamp,transactionAmount,transactionCode,transactionType,transactionDesc,transactionDate, transactionEffectiveDate};
			jdbcTemplate.update(
					sqltran, paramstran,typestran);
		
		
		}
		
		
		public TransactionWrapper findTranInfo(String accountNumber, String mytimestamp){
			
           try {
            	jdbcTemplate.setMaxRows(400);
            	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    			System.out.println("sivatime"+timestamp);
                System.out.println("pappy" + mytimestamp); 
                Timestamp ts = Timestamp.valueOf(mytimestamp);
            	ServiceStatus servicestatus = new ServiceStatus();
	            servicestatus.setStatusCode(true);	
	            String sql = "SELECT * FROM transaction WHERE accountnumber = ?  AND mytimestamp <  ?";
	            int[] types = {Types.CHAR, Types.TIMESTAMP};
			   List<TranDetails> trandetails = jdbcTemplate.query(
					sql, new Object[] { accountNumber,ts }, new TranRowMapper());
    		    transactionwrapper.setReturnstatus(servicestatus);
    		    transactionwrapper.setTrandetails(trandetails);
	         	return transactionwrapper;		

			}catch(Exception e) {
				      ServiceStatus servicestatus = new ServiceStatus();
					      servicestatus.setStatusCode(false);
					      servicestatus.setErrorCode("100");
				          servicestatus.setErrorDesc("sorry tranlist error chk log");
		     		      List<TranDetails> trandetails =new ArrayList();
		     		      transactionwrapper.setTrandetails(trandetails);
		     		     transactionwrapper.setReturnstatus(servicestatus);
		//			      trandetails.setReturnstatus(servicestatus);
		//			      System.out.println("enteringhoi"+trandetails);
		     		    return transactionwrapper;
		  }
		} 
		
		
		
		
}

