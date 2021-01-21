package com.desafiozup.loteria.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class SorteioModel {

	@Id
	@GeneratedValue
	private String numeroSorteado;
	
	
	//Getters and Setters

	public String getNumeroSorteado() {
		return numeroSorteado;
	}

	public void setNumeroSorteado(String numeroSorteado) {
		this.numeroSorteado = numeroSorteado;
	}
		
}
