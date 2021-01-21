package com.desafiozup.loteria.controller;

import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cadastro")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CadastroController {
	
	@Autowired
	private CadastroService cadastroService;
	
	@GetMapping("/cadastro/{email}")
	public ResponseEntity<List<Email>> getByEmail(@PathVariable String email){
		return ResponseEntity.ok(repository.findByEmail(email));
	}

}
