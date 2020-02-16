package com.lamp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lamp.dao.ApplicantRepository;
import com.lamp.entities.Applicant;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantRepository applicantRepository; 
	
	public Applicant createApplicant(Applicant applicant) {
		
		//Applicant applicant = new Applicant("Omotolani","Ligali","ligaliomotolani","ljdkdkjd","08124590266",1);
		
		applicantRepository.save(applicant);
		
		return applicant;
	}
	
	
	
	public Applicant updateApplicant(Applicant applicant,String id) {
		
		applicant = applicantRepository.findApplicantById(id);
		
		return applicantRepository.save(applicant);
	}
	
	public List<Applicant> fetchAllApplicant(){
		
		return applicantRepository.findAll();
	}
	
	public Applicant getApplicant(String id) {
		return applicantRepository.findApplicantById(id);
	
	}
	
	public void deleteApplicant(String id) {

		applicantRepository.deleteById(id);
	}
}
