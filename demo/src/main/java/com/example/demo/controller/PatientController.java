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

import com.example.demo.domain.Patient;
import com.example.demo.dto.PatientRequest;
import com.example.demo.repository.PatientRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200") 
public class PatientController {

	@Autowired
	private PatientRepository patientRepository;
	

	
	// GET /api/v1/projects
	@GetMapping("/api/v1/patients")
	public @ResponseBody ResponseEntity<Iterable<Patient>> list() {
		// On récupère la liste des projets en BDD grâce au repository
		Iterable<Patient> patients = patientRepository.findAll();
		System.out.println(patients);
		// On met ca dans le body de la reponse en disant OK (en gros pas d'erreur)
		return ResponseEntity.ok().body(patients);
	}
	
	
	
	
	
	
    @DeleteMapping("/api/v1/patient/{id}")
    public @ResponseBody ResponseEntity<Patient> delete(@PathVariable int id) {
        Optional<Patient> result = patientRepository.findById(id);
        if (result.isPresent()){
         patientRepository.deleteById(id);
			 return ResponseEntity.ok().build();
		}
			return ResponseEntity.notFound().build();
	
    }

    
    @GetMapping("/api/v1/patient/{id}")
    public @ResponseBody ResponseEntity<Patient> getid(@PathVariable int id) {
        Optional<Patient> result = patientRepository.findById(id);
        if (result.isPresent()){
            Patient patient = result.get();
            return ResponseEntity.ok().body(patient);
        }
            return ResponseEntity.notFound().build();
    }
    
    @PutMapping("/api/v1/patients/{id}")
    public @ResponseBody ResponseEntity<Patient> modifyPatient(@PathVariable int id,
            @RequestBody PatientRequest requestDto) {
        Optional<Patient> result = patientRepository.findById(id);
        if (result.isPresent()) {
        	 Patient patient = result.get();
             patient.setPrenom(requestDto.getPrenom());
             patient.setNom(requestDto.getNom());
             patient.setSexe(requestDto.getSexe());
             patient.setPoids(requestDto.getPoids());
             patient.setTaille(requestDto.getTaille());
             patient.setTelephone(requestDto.getTelephone());
             patient.setDate_admission(requestDto.getDate_admission());
             patient.setDate_sortie(requestDto.getDate_sortie());
             patient.setDate_naissance(requestDto.getDate_naissance());
             patientRepository.save(patient);
             return ResponseEntity.ok().body((patient));
        }
    
       
        return ResponseEntity.notFound().build();
    }
    
    @PostMapping("/api/v1/patient")
    public @ResponseBody ResponseEntity<Patient> createproject(@RequestBody PatientRequest requestDto) {
        Patient patient= new Patient();
        patient.setPrenom(requestDto.getPrenom());
        patient.setNom(requestDto.getNom());
        patient.setSexe(requestDto.getSexe());
        patient.setPoids(requestDto.getPoids());
        patient.setTaille(requestDto.getTaille());
        patient.setTelephone(requestDto.getTelephone());
        patient.setDate_admission(requestDto.getDate_admission());
        patient.setDate_sortie(requestDto.getDate_sortie());
        patient.setDate_naissance(requestDto.getDate_naissance());
        patientRepository.save(patient);
        return ResponseEntity.ok().body((patient));
    }
}

