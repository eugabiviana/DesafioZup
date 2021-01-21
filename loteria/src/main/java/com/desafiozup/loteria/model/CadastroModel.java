package com.desafiozup.loteria.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class CadastroModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(unique = true)
	@NotNull
	private String email;
	

	//Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
	
}
