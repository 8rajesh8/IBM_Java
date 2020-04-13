package com.my.main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.dto.raja;
import com.my.service.rajaServiceImp;

@SpringBootApplication
public class JdbcTemplateCurdApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JdbcTemplateCurdApplication.class, args);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("MyBeans.xml");
		rajaServiceImp obj=ctx.getBean("rajaServiceImp",rajaServiceImp.class);
		
		
		/*
		 * obj.create(new raja(3,"hen",99)); obj.create(new raja(4,"pig",88));
		 */
		
		obj.update(1, "sheep");
		obj.deleteById(10);
		
		obj.displayAll();
		}

}
