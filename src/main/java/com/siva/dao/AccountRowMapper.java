package com.siva.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import com.siva.modern.AccountDetails;

import org.springframework.jdbc.core.RowMapper;

public class AccountRowMapper implements RowMapper<AccountDetails>
{ 
	  @Override
  public AccountDetails mapRow(ResultSet rs, int rowNum) throws SQLException
  {
  AccountDetails accountdetails = new AccountDetails();
  accountdetails.setAccountNumber(rs.getString("accountnumber"));
  accountdetails.setCustName(rs.getString("custname"));
  accountdetails.setAddressLine1(rs.getString("addressline1"));
  accountdetails.setAddressLine2(rs.getString("addressline2"));
  accountdetails.setCity(rs.getString("city"));
  accountdetails.setState(rs.getString("state"));
  accountdetails.setCreditLimit(rs.getBigDecimal("creditlimit"));
  accountdetails.setCurrentBalance(rs.getBigDecimal("currentbalance"));
  accountdetails.setOpenToBuy(rs.getBigDecimal("opentobuy"));
  accountdetails.setMinimumDue(rs.getBigDecimal("minimumdue"));
  accountdetails.setPricingId(rs.getString("pricingid"));
  accountdetails.setFeeCharged(rs.getBigDecimal("feecharged"));
  accountdetails.setIntCharged(rs.getBigDecimal("interestcharged"));
  
  return accountdetails;
 
  }
}