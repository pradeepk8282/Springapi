package com.targetsoft.queue.dao;

import org.springframework.stereotype.Repository;

import com.targetsoft.queue.model.curve_bhel;

@Repository
public interface FSMdao {

	public curve_bhel fetchByTime(String time);
	
}
