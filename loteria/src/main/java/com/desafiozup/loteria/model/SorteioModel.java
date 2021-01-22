package com.desafiozup.loteria.model;

import java.util.Date;
import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Sorteio")
public class SorteioModel {

	Random sorteio = new Random();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());

	@NotNull
	@Size(min = 5, max = 15)
	private String sorte;

	@NotNull
	private int numero1 = sorteio.nextInt(10) + 1;

	@NotNull
	private int numero2 = sorteio.nextInt(10) + 10;

	@NotNull
	private int numero3 = sorteio.nextInt(10) + 20;

	@NotNull
	private int numero4 = sorteio.nextInt(10) + 30;

	@NotNull
	private int numero5 = sorteio.nextInt(10) + 40;

	@NotNull
	private int numero6 = sorteio.nextInt(10) + 50;

	@ManyToOne
	@JsonIgnoreProperties("sorteio")
	private CadastroModel cadastro;

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSorte() {
		return sorte;
	}

	public void setSorte(String sorte) {
		this.sorte = sorte;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int getNumero3() {
		return numero3;
	}

	public void setNumero3(int numero3) {
		this.numero3 = numero3;
	}

	public int getNumero4() {
		return numero4;
	}

	public void setNumero4(int numero4) {
		this.numero4 = numero4;
	}

	public int getNumero5() {
		return numero5;
	}

	public void setNumero5(int numero5) {
		this.numero5 = numero5;
	}

	public int getNumero6() {
		return numero6;
	}

	public void setNumero6(int numero6) {
		this.numero6 = numero6;
	}

	public CadastroModel getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroModel cadastro) {
		this.cadastro = cadastro;
	}

}
