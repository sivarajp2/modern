package com.siva.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.siva.modern.BaseRateDetails;

import org.springframework.jdbc.core.RowMapper;

public class BaseRateDetailsRowMapper implements RowMapper<BaseRateDetails>
{ 
	  @Override
  public BaseRateDetails mapRow(ResultSet rs, int rowNum) throws SQLException
  {
  BaseRateDetails baseratedetails = new BaseRateDetails();
  baseratedetails.setRateIndexId(rs.getString("rateindexid"));
  baseratedetails.setApr(rs.getBigDecimal("apr"));
  
  return baseratedetails;
 
  }
}