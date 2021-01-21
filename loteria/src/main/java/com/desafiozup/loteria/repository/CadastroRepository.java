package com.desafiozup.loteria.repository;

import java.util.Optional;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroRepository extends JpaRepository<Email, String>{

	public Optional<Email> findByEmail(String email);

}
