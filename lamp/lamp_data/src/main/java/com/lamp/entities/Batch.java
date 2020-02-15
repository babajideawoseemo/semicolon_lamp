package com.lamp.entities;

import java.util.ArrayList;
import java.util.List;

public class Batch {
	private List<Applicant> applicants = new ArrayList<Applicant>();
	private List<Native> natives = new ArrayList<Native>();
	private byte batchId;
	public List<Applicant> getApplicants() {
		return applicants;
	}
	public void setApplicants(List<Applicant> applicants) {
		this.applicants = applicants;
	}
	public List<Native> getNatives() {
		return natives;
	}
	public void setNatives(List<Native> natives) {
		this.natives = natives;
	}
	public String getBatchId() {
		return "B"+batchId;
	}
	public void setBatchId(byte batchId) {
		this.batchId = batchId;
	}
	
	public void addApplicant(Applicant applicant) {
		this.applicants.add(applicant);
	}
	
	public void removeApplicant(Applicant applicant) {
		this.applicants.remove(applicant);
	}
	
	public void addNative(Native natives) {
	this.natives.add(natives);
		
	}

}
