package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Medecin;


	public interface MedecinRepository extends CrudRepository<Medecin,Integer> {
	    
	}


