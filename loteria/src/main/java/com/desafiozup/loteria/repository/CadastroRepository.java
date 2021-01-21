package com.desafiozup.loteria.repository;

public interface CadastroRepository extends JpaRepository<Email, String>{

	public Optional<Email> findByEmail(String email);{

}
