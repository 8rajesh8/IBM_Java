package com.raja.service;

import java.util.List;

import com.raja.dto.Myth;

public interface MythServiceInter {
public List<Myth> displayAll();
	
	public void deleteById(int id);
	public void create(Myth obj);
}
