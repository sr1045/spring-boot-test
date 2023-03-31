package com.in28minutes.springboot.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aadhaar {

	@Autowired
	Uidai ui;
	
	@RequestMapping("/uidai")
	public Uidai myDetails() {
		return ui;
	}
	
}
		