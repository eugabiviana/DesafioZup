package com.desafiozup.loteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiozup.loteria.model.CadastroModel;

@Repository
public interface CadastroRepository extends JpaRepository<CadastroModel, Long>{

	public List<CadastroModel> findAllByEmailContainingIgnoreCase(String email);

}
