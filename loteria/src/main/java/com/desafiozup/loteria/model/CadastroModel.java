package com.desafiozup.loteria.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Cadastro")
public class CadastroModel {

	// criando a tabela cadastro, que salvará os dados do usuário.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name="Nome")
	@NotNull
	private String nome;

	@Column(name="Email")
	@NotNull
	private String email;

	@OneToMany(mappedBy = "sorteio", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("sorteio")
	private List<SorteioModel> aposta;

	// Getters and Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<SorteioModel> getAposta() {
		return aposta;
	}

	public void setAposta(List<SorteioModel> aposta) {
		this.aposta = aposta;
	}

}
