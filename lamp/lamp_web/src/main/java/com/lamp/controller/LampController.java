package com.lamp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lamp.Applicant;
import com.lamp.ApplicantService;

@RestController
public class LampController {

	@Autowired
	private ApplicantService applicantservice;
	
	
	@PostMapping("/apply")
	public Applicant addApplicant(@RequestBody Applicant applicant) {
	
		return applicantservice.create(applicant);
		
	}
}
