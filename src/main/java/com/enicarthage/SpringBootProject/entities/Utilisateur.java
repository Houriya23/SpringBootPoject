package com.enicarthage.SpringBootProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.validation.constraints.NotBlank;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorColumn;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
		name="TYPE_User",
		discriminatorType=DiscriminatorType.STRING
)
public abstract class Utilisateur {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long idUser;
	 @NotBlank(message = "le nom est obligatoire!")
	 @Column(name = "nom")
	 private String nomUser;
	 
	 @NotBlank(message = "le prenom est obligatoire!")
	 @Column(name = "prenom")
	 private String prenomUser;
	  
	 @NotBlank(message = "l'adresse est obligatoire!")
	 @Column(name = "addresse")
	 private String addresseUser;
	  
	 @NotBlank(message = "le telephone est obligatoire!")
	 @Column(name = "tel")
	 private int  telUser;
	 
	 @NotBlank(message = "le mdp est obligatoire!")
	 @Column(name = "mdp")
	 private String mdpUser;
	 
	 
	 @Column(name = "ville")
	 private String villeUser;
	 @Column(name = "sexe")
	 private String sexeUser;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(long idUser, @NotBlank(message = "le nom est obligatoire!") String nomUser,
			@NotBlank(message = "le prenom est obligatoire!") String prenomUser,
			@NotBlank(message = "l'adresse est obligatoire!") String addresseUser,
			@NotBlank(message = "le telephone est obligatoire!") int telUser,
			@NotBlank(message = "le mdp est obligatoire!") String mdpUser, String villeUser, String sexeUser) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.addresseUser = addresseUser;
		this.telUser = telUser;
		this.mdpUser = mdpUser;
		this.villeUser = villeUser;
		this.sexeUser = sexeUser;
	}
	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public String getAddresseUser() {
		return addresseUser;
	}
	public void setAddresseUser(String addresseUser) {
		this.addresseUser = addresseUser;
	}
	public int getTelUser() {
		return telUser;
	}
	public void setTelUser(int telUser) {
		this.telUser = telUser;
	}
	public String getMdpUser() {
		return mdpUser;
	}
	public void setMdpUser(String mdpUser) {
		this.mdpUser = mdpUser;
	}
	public String getVilleUser() {
		return villeUser;
	}
	public void setVilleUser(String villeUser) {
		this.villeUser = villeUser;
	}
	public String getSexeUser() {
		return sexeUser;
	}
	public void setSexeUser(String sexeUser) {
		this.sexeUser = sexeUser;
	}
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser
				+ ", addresseUser=" + addresseUser + ", telUser=" + telUser + ", mdpUser=" + mdpUser
				+ ", villeUser=" + villeUser + ", sexeUser=" + sexeUser + "]";
	}
		
}
