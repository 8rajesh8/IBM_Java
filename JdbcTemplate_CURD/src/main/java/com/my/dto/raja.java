package com.my.dto;

public class raja {
public int id,phone;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public raja(){}
/**
 * @param id
 * @param phone
 * @param name
 */
public raja(int id,String name, int phone) {
	super();
	this.id = id;
	this.phone = phone;
	this.name = name;
}


}
