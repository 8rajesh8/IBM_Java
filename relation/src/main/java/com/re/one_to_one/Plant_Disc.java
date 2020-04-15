package com.re.one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="plant_disc")
public class Plant_Disc {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public String description;
	
	Plant_Disc(){}

	
	public Plant_Disc(String description) {
		super();
		
		this.description = description;
	}
	
	
	

}
