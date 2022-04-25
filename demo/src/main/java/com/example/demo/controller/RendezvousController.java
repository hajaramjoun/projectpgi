package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Patient;
import com.example.demo.domain.Rendezvous;
import com.example.demo.repository.PatientRepository;
import com.example.demo.repository.RendezVousRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class RendezvousController {
	@Autowired
	private RendezVousRepository rendezvousRepository;
	   @Autowired
	    private PatientRepository patientRepository;
	
	
	// GET /api/v1/projects
	@GetMapping("/api/v1/rdvs")
	public @ResponseBody ResponseEntity<Iterable<Rendezvous>> list() {
		// On récupère la liste des projets en BDD grâce au repository
		Iterable<Rendezvous> rdvs = rendezvousRepository.findAll();
		System.out.println(rdvs);
		// On met ca dans le body de la reponse en disant OK (en gros pas d'erreur)
		return ResponseEntity.ok().body(rdvs);
	}
	
	
}
