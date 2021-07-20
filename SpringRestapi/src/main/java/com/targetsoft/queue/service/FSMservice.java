package com.targetsoft.queue.service;

import org.springframework.stereotype.Service;

import com.targetsoft.queue.model.curve_bhel;

@Service
public interface FSMservice {
	
	public curve_bhel fetchByTime(String time);

}
