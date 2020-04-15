package com.raja.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="myth")
public class Myth implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6696911959863247993L;
	@Id
	private int id;
	
	@Column
	private String name;
	private String country;
	@Override
	public String toString() {
		return "Myth [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

	

}
