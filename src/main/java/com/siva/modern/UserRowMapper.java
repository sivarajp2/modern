package com.siva.modern;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<Contact>
{
	  @Override
  public Contact mapRow(ResultSet rs, int rowNum) throws SQLException
  {
  Contact contact = new Contact();
  contact.setId(rs.getInt("id"));
  contact.setDept(rs.getString("dept"));
  System.out.println("notentering template");
  return contact;
 
  }
}
