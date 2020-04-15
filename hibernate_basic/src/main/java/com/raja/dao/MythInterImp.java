package com.raja.dao;

import java.util.List;

import org.hibernate.Session;

import com.raja.dto.Myth;
import com.raja.hibernate_basic.Factory;

public class MythInterImp implements MythInter {
	
private Session se=Factory.sf.openSession();//sf.getCurrentSession()  it will continue with current session or it will create one

	public List<Myth> displayAll() {
		// here Myth is a class rather than table
		return se.createQuery("from Myth",Myth.class).list();
		
	}

	public void deleteById(int id) {
		se.getTransaction().begin();
		Myth obj=se.get(Myth.class,id);
		se.delete(obj);
		se.getTransaction().commit();

	}

	public void create(Myth obj) {
		se.getTransaction().begin();
		se.save(obj);
		se.getTransaction().commit();

	}

}
