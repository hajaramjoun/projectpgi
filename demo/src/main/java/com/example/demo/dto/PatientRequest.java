package com.example.demo.dto;

import java.util.Date;

public class PatientRequest {
private String prenom;
private	String nom;
private	String sexe;
private	int poids;
private	int taille;
private	int telephone;
private	Date date_naissance;
private	Date date_admission;
private	Date date_sortie;
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public int getPoids() {
	return poids;
}
public void setPoids(int poids) {
	this.poids = poids;
}
public int getTaille() {
	return taille;
}
public void setTaille(int taille) {
	this.taille = taille;
}
public int getTelephone() {
	return telephone;
}
public void setTelephone(int telephone) {
	this.telephone = telephone;
}
public Date getDate_naissance() {
	return date_naissance;
}
public void setDate_naissance(Date date_naissance) {
	this.date_naissance = date_naissance;
}
public Date getDate_admission() {
	return date_admission;
}
public void setDate_admission(Date date_admission) {
	this.date_admission = date_admission;
}
public Date getDate_sortie() {
	return date_sortie;
}
public void setDate_sortie(Date date_sortie) {
	this.date_sortie = date_sortie;
}

	

}
