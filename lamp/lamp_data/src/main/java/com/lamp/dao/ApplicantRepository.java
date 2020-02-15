package com.lamp.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.lamp.entities.Applicant;
import com.sun.tools.javac.util.List;

@Repository
public interface ApplicantRepository extends MongoRepository<Applicant, String> {

	public Applicant findApplicantById(String applicantId);
	
	public Applicant findByFirstName(String firstName);
	
	public List<Applicant> findAllApplicant();
	
	public void deleteApplicant(String id);
	
}
