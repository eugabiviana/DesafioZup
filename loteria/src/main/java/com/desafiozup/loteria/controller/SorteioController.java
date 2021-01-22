package com.desafiozup.loteria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiozup.loteria.model.SorteioModel;
import com.desafiozup.loteria.repository.SorteioRepository;

@RestController
@CrossOrigin(origins="*", allowedHeaders= "*")
@RequestMapping("/sorteio")
public class SorteioController {

		@Autowired
		private SorteioRepository repository;
		
		@GetMapping
		public ResponseEntity <List<SorteioModel>> getAll() {
			return ResponseEntity.ok(repository.findAll()); 
		}
		
		@PostMapping
		public ResponseEntity<SorteioModel> post (@RequestBody SorteioModel sorteio) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(sorteio));
		}
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable String id) {
			repository.deleteById(id);
		}
	
}

