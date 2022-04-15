package com.enicarthage.SpringBootProject.entities;

import java.util.Date;
import java.util.Timer;
import com.enicarthage.SpringBootProject.entities.Consultation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class RendezVous {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idRv;
	private Date dateRv;
	private String heureRv;

	//@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	//@JoinColumn(name = "patient_id_user")
	//private Patient patient;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "medecin_id_user")
	private Medecin medecin;

	@OneToOne
	private Consultation consultation;

}
