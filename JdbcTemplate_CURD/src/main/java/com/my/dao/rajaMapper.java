package com.my.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.my.dto.raja;

public class rajaMapper implements RowMapper<raja> {

	@Override
	public raja mapRow(ResultSet rs, int rowNum) throws SQLException {
		raja obj=new raja();
		obj.setId(rs.getInt("id"));
		obj.setName(rs.getString("name"));
		obj.setId(rs.getInt("phone"));
		return obj;
	}

}
