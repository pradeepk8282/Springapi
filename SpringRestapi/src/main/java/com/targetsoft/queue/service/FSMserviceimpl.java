package com.targetsoft.queue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.targetsoft.queue.dao.FSMdao;
import com.targetsoft.queue.model.curve_bhel;

@Service
public class FSMserviceimpl implements FSMservice {
	@Autowired
	FSMdao fsmdao;

	@Override
	public curve_bhel fetchByTime(String time) {
		return fsmdao.fetchByTime(time);
	}

}
