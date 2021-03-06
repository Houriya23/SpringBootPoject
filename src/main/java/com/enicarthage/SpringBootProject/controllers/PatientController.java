package com.enicarthage.SpringBootProject.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.enicarthage.SpringBootProject.entities.Patient;
import com.enicarthage.SpringBootProject.repositories.PatientRepository;
import com.enicarthage.SpringBootProject.services.patientService;

import java.util.List;

@Controller
public class PatientController {
	@Autowired
	private patientService patientService;
	private final PatientRepository patientRepository;
	 @Autowired
	 public PatientController(PatientRepository patientRepository) 
	 {
	 this.patientRepository = patientRepository;
	 }
	 
	// @GetMapping("/patient")
	//	public String viewPatient(Model model) {
	//		return findPaginated(1, "firstName", "lastName","adresse","mdp","sexe","tel","ville", model);		
	//	}
	 @GetMapping("/showNewPatientForm")
		public String showNewPatientForm(Model model) {
			// create model attribute to bind form data
			Patient patient = new Patient();
			model.addAttribute("patient", patient);
			return "new_patient";
		}
	 
	 @PostMapping("/savePatient")
		public String savePatient(@ModelAttribute("patient") Patient patient) {
			// save employee to database
			patientService.savePatient(patient);
			return "redirect:/";
		}
	 
	 @GetMapping("/showFormForUpdate/{id}")
		public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		 
			// get patient from the service
			Patient patient = patientService.getPatientById(id);
			//if (patient.getPatientById(id) == 0) return null;
			// set patient as a model attribute to pre-populate the form
			model.addAttribute("patient", patient);
			return "update_patient";
		}
	 
	 @GetMapping("/deletePatient/{id}")
		public String deletePatient(@PathVariable (value = "id") long id) {
			
			// call delete patient method 
			this.patientService.deletePatientById(id);
			return "redirect:/";
		}
	 
	 

	
	
	
}
