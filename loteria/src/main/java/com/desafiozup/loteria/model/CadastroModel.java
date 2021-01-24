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
@Table(name = "cadastro")
public class CadastroModel {

	// criando a tabela cadastro, que salvará os dados do usuário.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name="nome")
	@NotNull
	private String nome;

	@Column(name="email")
	@NotNull
	private String email;

	@OneToMany(mappedBy = "cadastro", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("cadastro")
	private List<SorteioModel> sorteio;

	
	// Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public List<SorteioModel> getSorteio() {
		return sorteio;
	}

	public void setSorteio(List<SorteioModel> sorteio) {
		this.sorteio = sorteio;
	}

}
