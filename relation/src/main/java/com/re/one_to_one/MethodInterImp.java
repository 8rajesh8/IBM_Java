package com.re.one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



class Factory {
	public static SessionFactory sf=new Configuration().configure()
			.addAnnotatedClass(Plant.class)
			.addAnnotatedClass(Plant_Disc.class).buildSessionFactory();
	
		

}

public class MethodInterImp implements MethodsInter {
	private Session se=Factory.sf.openSession();
	
	
	public void create(Plant obj) {
		se.getTransaction().begin();
		se.save(obj);
		se.getTransaction().commit();
		

	}

	public void deleteById(int id) {
		se.getTransaction().begin();
		Plant obj=se.get(Plant.class,id);
		se.delete(obj);
		se.getTransaction().commit();

	}

}
