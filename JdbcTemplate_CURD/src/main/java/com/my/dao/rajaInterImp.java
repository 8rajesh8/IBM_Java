package com.my.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.my.dto.raja;
import com.my.dto.rajaInter;
@Service
public class rajaInterImp implements rajaInter {
	@Autowired
	JdbcTemplate jdbcObj;

	@Override
	public void create(raja obj) {
		jdbcObj.update("insert into raja (id,name,phone) values(?,?,?)",obj.getId(),obj.getName(),obj.getPhone());

	}

	@Override
	public void deleteById(int id) {
		jdbcObj.update("delete from raja where id=?",id);

	}

	@Override
	public void update(int id, String name) {
		jdbcObj.update("update raja set name=? where id=?",name,id);

	}

	@Override
	public List<raja> displayAll() {
		//jdbcObj.query("select * from raja",new BeanPropertyRowMapper());
		return jdbcObj.query("select * from raja",new rajaMapper());
	
	}

	@Override
	public raja displayById(int id) {
		//jdbcObj.queryForList("select * from raja where id=?",new BeanPropertyRowMapper());
		raja go=jdbcObj.queryForObject("select * from raja where id=?",new Object[]{id},new rajaMapper());
		return go;
	}

	@Override
	public void reset() {
		jdbcObj.update("truncate table raja");

	}

}
