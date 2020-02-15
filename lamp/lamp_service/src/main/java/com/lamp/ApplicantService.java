package com.lamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamp.dao.ApplicantRepository;

@Service
public class ApplicantService {

	@Autowired
	private ApplicantRepository applicantRepository; 
	
	public Applicant create(Applicant applicant) {
		
		//Applicant applicant = new Applicant("Omotolani","Ligali","ligaliomotolani","ljdkdkjd","08124590266",1); 
		
		applicantRepository.save(applicant);
		
		return applicant;
	}
}
