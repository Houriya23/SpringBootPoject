package com.enicarthage.SpringBootProject.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
@DiscriminatorValue(value = "P")
public class Patient extends Utilisateur {

	@OneToMany( cascade =CascadeType.ALL, mappedBy = "patient")
	private Set<RendezVous> rendezvous;
	
	//@ManyToMany(cascade = CascadeType.ALL)
	//private List<Medecin> medecin;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(long idUser, @NotBlank(message = "le nom est obligatoire!") String nomUser,
			@NotBlank(message = "le prenom est obligatoire!") String prenomUser,
			@NotBlank(message = "l'adresse est obligatoire!") String addresseUser,
			@NotBlank(message = "le telephone est obligatoire!") int telUser,
			@NotBlank(message = "le mdp est obligatoire!") String mdpUser, String villeUser, String sexeUser) {
		super(idUser, nomUser, prenomUser, addresseUser, telUser, mdpUser, villeUser, sexeUser);
		// TODO Auto-generated constructor stub
	}
}
