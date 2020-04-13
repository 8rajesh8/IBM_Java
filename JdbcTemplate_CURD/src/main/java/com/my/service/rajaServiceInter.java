package com.my.service;

import java.util.List;

import com.my.dto.raja;

public interface rajaServiceInter {
	public void create(raja obj);

	public void deleteById(int id);
	public void update(int id,String name);

	public List<raja> displayAll();
	public raja displayById(int id);
	public void reset();
}
