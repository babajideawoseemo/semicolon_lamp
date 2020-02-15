package com.lamp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lamp.entities.Applicant;
import com.lamp.ApplicantServiceImpl;

@RestController
public class LampController {

	@Autowired
	private ApplicantServiceImpl applicantservice;
	
	
	@PostMapping("/apply")
	public Applicant addApplicant(@RequestBody Applicant applicant) {
	
		return applicantservice.createApplicant(applicant);
		
	}
}
