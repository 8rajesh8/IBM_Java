package com.my.service;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.dao.rajaInterImp;
import com.my.dto.raja;
@Repository
public class rajaServiceImp implements rajaServiceInter {
	@Autowired
	rajaInterImp ancestor;

	private Logger logger=Logger.getLogger("rajaServiceImp");
	@Override
	public void create(raja obj) {
		 ancestor.create(obj);

	}

	@Override
	public void deleteById(int id) {
		try {
		ancestor.deleteById(id);
		}catch(Exception ex) {
			System.out.println("nooo...");
			logger.log(Level.INFO,"id doesn't exist!!!");
		}

	}

	@Override
	public void update(int id, String name) {
		
		ancestor.update(id, name);
		logger.log(Level.INFO,"updated");

	}

	@Override
	public List<raja> displayAll() {
		
		return ancestor.displayAll();
	}

	@Override
	public raja displayById(int id) {
		
		return ancestor.displayById(id);
	}

	@Override
	public void reset() {
		ancestor.reset();

	}

}
