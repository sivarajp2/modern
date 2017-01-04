package com.siva.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.siva.modern.AccountDetails;
import com.siva.modern.TranDetails;

public class TranRowMapper implements RowMapper<TranDetails> {
    @Override
    public TranDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        TranDetails trandetails = new TranDetails();
        trandetails.setAccountNumber(rs.getString("accountnumber"));
        trandetails.setTransactionCode(rs.getString("transactioncode"));
        trandetails.setTransactionAmount(rs.getBigDecimal("transactionamount"));
        trandetails.setTransactionDesc(rs.getString("transactiondesc"));
        trandetails.setTransactionDate(rs.getString("transactiondate"));
        trandetails.setTransactionEffectiveDate(rs.getString("transactioneffectivedate"));
        trandetails.setTransactionType(rs.getString("transactiontype"));
        trandetails.setMyTimeStamp(rs.getTimestamp("mytimestamp"));

        return trandetails;

    }
}