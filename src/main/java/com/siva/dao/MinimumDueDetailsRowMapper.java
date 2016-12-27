package com.siva.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.siva.modern.FeeDetails;
import com.siva.modern.MinimumDueDetails;

import org.springframework.jdbc.core.RowMapper;

public class MinimumDueDetailsRowMapper implements RowMapper<MinimumDueDetails>
{ 
	  @Override
  public MinimumDueDetails mapRow(ResultSet rs, int rowNum) throws SQLException
  {
  MinimumDueDetails minimumduedetails = new MinimumDueDetails();
  minimumduedetails.setMinimumDueCode(rs.getString("minimumduecode"));
  minimumduedetails.setMinimumDuePercent(rs.getBigDecimal("minimumduepercent"));
  
  return minimumduedetails;
 
  }
}

