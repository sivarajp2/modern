package com.siva.modern;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.siva.modern.PricingDetails;

import org.springframework.jdbc.core.RowMapper;

public class PricingRowMapper implements RowMapper<PricingDetails> {
    @Override
    public PricingDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
        PricingDetails pricingdetails = new PricingDetails();
        pricingdetails.setIntCode(rs.getString("intcode"));
        pricingdetails.setFeeCode(rs.getString("feecode"));
        pricingdetails.setMinimumDueCode(rs.getString("minimumduecode"));


        return pricingdetails;

    }
}
