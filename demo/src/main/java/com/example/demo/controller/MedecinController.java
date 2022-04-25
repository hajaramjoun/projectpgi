package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Medecin;
import com.example.demo.domain.Patient;
import com.example.demo.dto.MedecinRequest;
import com.example.demo.dto.PatientRequest;
import com.example.demo.repository.MedecinRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class MedecinController {
	@Autowired
	private MedecinRepository medecinRepository;
	
	 @GetMapping("/api/v1/medecin/{id}")
	    public @ResponseBody ResponseEntity<Medecin> getid(@PathVariable int id) {
	        Optional<Medecin> result = medecinRepository.findById(id);
	        if (result.isPresent()){
	            Medecin medecin = result.get();
	            return ResponseEntity.ok().body(medecin);
	        }
	            return ResponseEntity.notFound().build();
	    }
	
	
	
	
	
	
	

	// GET /api/v1/medecin
	@GetMapping("/api/v1/medecins")
	public @ResponseBody ResponseEntity<Iterable<Medecin>> list() {
		// On récupère la liste des projets en BDD grâce au repository
		Iterable<Medecin> medecins = medecinRepository.findAll();
		System.out.println(medecins);
		// On met ca dans le body de la reponse en disant OK (en gros pas d'erreur)
		return ResponseEntity.ok().body(medecins);
	}
	
	  @DeleteMapping("/api/v1/medecin/{id}")
	    public @ResponseBody ResponseEntity<Patient> delete(@PathVariable int id) {
	        Optional<Medecin> result = medecinRepository.findById(id);
	        if (result.isPresent()){
	         medecinRepository.deleteById(id);
				 return ResponseEntity.ok().build();
			}
				return ResponseEntity.notFound().build();
		
	    }	
	
	  @PostMapping("/api/v1/medecin")
	    public @ResponseBody ResponseEntity<Medecin> createproject(@RequestBody MedecinRequest  requestDto) {
	      Medecin  medecin  =  new Medecin(); 
	        medecin.setPrenom(requestDto.getPrenom());
	        medecin.setNom(requestDto.getNom());
	        medecin.setSpecialite(requestDto.getSpecialite());
	        medecin.setTelephone(requestDto.getTelephone());
	        medecinRepository.save(medecin);
	     	return ResponseEntity.ok().body((medecin));
	    }
	  
	    @PutMapping("/api/v1/medecins/{id}")
	    public @ResponseBody ResponseEntity<Medecin> modifyPatient(@PathVariable int id,
	            @RequestBody MedecinRequest requestDto) {
	        Optional<Medecin> result = medecinRepository.findById(id);
	        if (result.isPresent()) {
	          Medecin medecin= result.get();
	          medecin.setPrenom(requestDto.getPrenom());
		        medecin.setNom(requestDto.getNom());
		        medecin.setSpecialite(requestDto.getSpecialite());
		        medecin.setTelephone(requestDto.getTelephone());
		        medecinRepository.save(medecin);
	             return ResponseEntity.ok().body((medecin));
	        }
	    
	       
	        return ResponseEntity.notFound().build();
	    }
	
}
