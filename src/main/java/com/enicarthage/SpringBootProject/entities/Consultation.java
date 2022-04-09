package com.enicarthage.SpringBootProject.entities;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor  @AllArgsConstructor
@Entity
public class Consultation {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long idCons;
	private Date dateCons;
	private String rapportCons;
	private double prixCons;
	//@OneToOne 
	//private RendezVous rendezvous;
}
