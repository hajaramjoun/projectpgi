package com.example.demo.dto;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.RendezVousRepository;

public class RendezVousRequest {
		private	int patientId;
		private	int id_medecin;
		private	int id_clinique;
		private	Date daterendezvous;
	
		
		

		public int getId_medecin() {
			return id_medecin;
		}
		public void setId_medecin(int id_medecin) {
			this.id_medecin = id_medecin;
		}
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
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
		}
	
		

	
}










