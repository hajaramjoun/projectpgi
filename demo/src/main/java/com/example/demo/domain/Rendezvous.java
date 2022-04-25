package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class Rendezvous {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	private	int id_clinique;
	private	Date daterendezvous;
	public int getId() {
		return id;
	}

    
    
//    @ManyToOne
//    private Patient perimeter;



	public int getId_clinique() {
		return id_clinique;
	}
	public void setId_clinique(int id_clinique) {
		this.id_clinique = id_clinique;
	}
	public Date getDaterendezvous() {
		return daterendezvous;
	}
	public void setDaterendezvous(Date daterendezvous) {
		this.daterendezvous = daterendezvous;
	}

//
//	public Patient getPerimeter() {
//		return perimeter;
//	}
//
//
//	public void setPerimeter(Patient perimeter) {
//		this.perimeter = perimeter;
//	}
//
//
//	public Medecin getMedecin() {
//		return medecin;
//	}
//
//
//	public void setMedecin(Medecin medecin) {
//		this.medecin = medecin;
//	}	
//	
	
	
	

}
