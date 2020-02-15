package com.lamp;

import java.util.List;

import com.lamp.entities.Applicant;


public interface ApplicantService {
	
	public Applicant createApplicant(Applicant applicant);
	
	public Applicant updateApplicant(Applicant applicant, String id);
	
	public List<Applicant> fetchAllApplicant();
	
	public Applicant getApplicant(String id);
	
	public void deleteApplicant(String id);

}
