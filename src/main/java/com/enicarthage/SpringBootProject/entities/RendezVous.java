package com.enicarthage.SpringBootProject.entities;

import java.util.Date;
import java.util.Timer;
import com.enicarthage.SpringBootProject.entities.Consultation;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class RendezVous {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id_Rv;
	private Date date_Rv;
	private String heure_Rv;
	@ManyToOne
	private Medecin medecin;
	@ManyToOne
	private Patient patient;
	@OneToOne
	private Consultation consultation;
	

}
