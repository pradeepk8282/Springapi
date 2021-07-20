package com.targetsoft.queue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.targetsoft.queue.model.curve_bhel;
import com.targetsoft.queue.service.FSMservice;

@RestController
@RequestMapping("/api")
public class FSMRestController {
	@Autowired
	FSMservice fsMservice;

	@GetMapping("/data")
	public curve_bhel fetchbytime(@RequestParam String time) {
		
		return fsMservice.fetchByTime(time);
	}

}
