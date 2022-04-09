package com.enicarthage.SpringBootProject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.enicarthage.SpringBootProject.entities.Patient;
@Service
public interface patientService {
	
	List<Patient> getAllPatient();
	 void savePatient(Patient patient) ;

	  Patient getPatientById(long id) ;
	
	void deletePatientById(long id);

}


