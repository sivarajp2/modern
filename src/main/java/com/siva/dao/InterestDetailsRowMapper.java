package com.siva.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.siva.modern.InterestDetails;

import org.springframework.jdbc.core.RowMapper;

public class InterestDetailsRowMapper implements RowMapper<InterestDetails> {
    @Override
    public InterestDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        InterestDetails interestdetails = new InterestDetails();
        interestdetails.setVarIntRate(rs.getBigDecimal("varintrate"));
        interestdetails.setIntType(rs.getString("inttype"));
        interestdetails.setRateIndexID(rs.getString("rateindexid"));


        return interestdetails;

    }
}
