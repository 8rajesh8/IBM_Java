package com.re.one_to_one;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="plant")
public class Plant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int plantId;
	public String name;
	
	Plant(){}
	
	



	/**
	 * @param name
	 * @param plant_disc
	 */
	public Plant(String name, Plant_Disc plant_disc) {
		super();
		this.name = name;
		this.plant_disc = plant_disc;
	}





	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="plantid")// no idea why primary key
	private Plant_Disc plant_disc;
}
