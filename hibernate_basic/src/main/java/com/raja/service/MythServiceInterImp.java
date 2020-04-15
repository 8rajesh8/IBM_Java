package com.raja.service;

import java.util.List;

import com.raja.dao.MythInter;
import com.raja.dao.MythInterImp;
import com.raja.dto.Myth;

public class MythServiceInterImp implements MythServiceInter {
private MythInter ancestor=new MythInterImp();
	public List<Myth> displayAll() {
		
		return ancestor.displayAll();
	}

	public void deleteById(int id) {
		ancestor.deleteById(id);

	}

	public void create(Myth obj) {
		ancestor.create(obj);

	}

}
