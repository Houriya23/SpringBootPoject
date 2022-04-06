package com.enicarthage.SpringBootProject.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@DiscriminatorValue(value="M")
//@Data @NoArgsConstructor 
public class Medecin extends Utilisateur {
	
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medecin(long idUser, @NotBlank(message = "le nom est obligatoire!") String nomUser,
			@NotBlank(message = "le prenom est obligatoire!") String prenomUser,
			@NotBlank(message = "l'adresse est obligatoire!") String addresseUser,
			@NotBlank(message = "le telephone est obligatoire!") int telUser,
			@NotBlank(message = "le mdp est obligatoire!") String mdpUser, String villeUser, String sexeUser) {
		super(idUser, nomUser, prenomUser, addresseUser, telUser, mdpUser, villeUser, sexeUser);
		// TODO Auto-generated constructor stub
	}
	

}
