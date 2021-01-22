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

import com.desafiozup.loteria.model.CadastroModel;
import com.desafiozup.loteria.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CadastroController {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping
	public ResponseEntity<List<CadastroModel>> GetAll() {
		return ResponseEntity.ok(cadastroRepository.findAll());
	}
	
	@GetMapping("/cadastro/{email}")
	public ResponseEntity<List<CadastroModel>> getByEmail(@PathVariable String email){
		return ResponseEntity.ok(cadastroRepository.findAllByEmailContainingIgnoreCase(email));
	}

	@PostMapping
	public ResponseEntity<CadastroModel> post (@RequestBody CadastroModel cadastro){
		return ResponseEntity.status(HttpStatus.CREATED).body(cadastroRepository.save(cadastro));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		cadastroRepository.deleteById(id);
	}
}
