package com.raja.hibernate_basic;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.raja.dto.Myth;

public class Factory {
	public static SessionFactory sf=new Configuration().configure().addAnnotatedClass(Myth.class).buildSessionFactory();
	
		

}
