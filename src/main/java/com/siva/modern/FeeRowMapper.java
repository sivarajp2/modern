package com.siva.modern;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.siva.modern.FeeDetails;

import org.springframework.jdbc.core.RowMapper;

public class FeeRowMapper implements RowMapper<FeeDetails> {
    @Override
    public FeeDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        FeeDetails feedetails = new FeeDetails();
        feedetails.setFeeCode(rs.getString("feecode"));
        feedetails.setTransactionFee(rs.getBigDecimal("transactionfee"));
        feedetails.setTransactionCode(rs.getString("transactioncode"));

        return feedetails;

    }
}
