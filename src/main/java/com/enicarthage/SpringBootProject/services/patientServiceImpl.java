package com.enicarthage.SpringBootProject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enicarthage.SpringBootProject.entities.Patient;
import com.enicarthage.SpringBootProject.repositories.PatientRepository;

@Service
public class patientServiceImpl implements patientService {
	
	//private static final String PatientRepository = "";
	@Autowired
	private  PatientRepository 	PatientRepository;
	@Override
	public List<Patient> getAllPatient() {
		try {
			return (List<Patient>) PatientRepository.findAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void savePatient(Patient patient) {
		this.PatientRepository.save(patient);
	}

	@Override
	public Patient getPatientById(long id) {
		Optional<Patient> optional = PatientRepository.findById(id);
		Patient patient = null;
		if (optional.isPresent()) {
			patient = optional.get();
		} else {
			throw new RuntimeException(" patient not found for id :: " + id);
		}
		return patient;
	}

	@Override
	public void deletePatientById(long id) {
		this.PatientRepository.deleteById(id);
	}
}
