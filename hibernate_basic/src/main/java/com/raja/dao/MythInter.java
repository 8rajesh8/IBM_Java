package com.raja.dao;

import java.util.List;

import com.raja.dto.Myth;

public interface MythInter {
	public List<Myth> displayAll();
	
	public void deleteById(int id);
	public void create(Myth obj);

}
