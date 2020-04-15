package com.raja.hibernate_basic;

import java.util.List;
import java.util.Scanner;

import com.raja.dto.Myth;
import com.raja.service.MythServiceInterImp;

public class App 
{
    public static void main( String[] args )
    {
    	  MythServiceInterImp obj=new MythServiceInterImp();
    	
    	Scanner sc=new Scanner(System.in);
    	boolean loop=true;
    	int id;
    	String name,country;
    	do {
    		System.out.println("1. enter");
        	System.out.println("2. view All");
        	System.out.println("3. delete by id");
        	System.out.println("4. exit");
        	int i=sc.nextInt();
        	switch(i) {
        	case 1:
        		System.out.println("enter id :");
        		id=sc.nextInt();
        		System.out.println("enter name of myth :");
        		name=sc.next();
        		System.out.println("enter country of myth :");
        		country=sc.next();
        		Myth oo=new Myth();
                oo.setId(id);
                oo.setName(name);
                oo.setCountry(country);
                obj.create(oo);
        		break;
        	case 2:
        		List<Myth> temp=obj.displayAll();
        		for(Myth j:temp) {
        			System.out.println(j);
        		}
        		break;
        	case 3:
        		System.out.println("enter the id to delete :");
        		id=sc.nextInt();
        		obj.deleteById(id);
        		break;
        	case 4:
        		loop=false;
        		break;
        	default :
        		System.out.println("please enter correct option!");
        	}
        	
    	}while(loop);
    	
    	
      
        
    }
}
