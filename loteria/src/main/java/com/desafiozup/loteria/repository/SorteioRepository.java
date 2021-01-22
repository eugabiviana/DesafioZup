package com.desafiozup.loteria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafiozup.loteria.model.SorteioModel;

@Repository
public interface SorteioRepository extends JpaRepository<SorteioModel, Long> {

	public List<SorteioModel> findAllByIdContainingIgnoreCase(String id);
}
