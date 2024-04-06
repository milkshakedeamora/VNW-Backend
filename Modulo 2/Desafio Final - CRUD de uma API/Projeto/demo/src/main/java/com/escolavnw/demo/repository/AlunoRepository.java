package com.escolavnw.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escolavnw.demo.model.AlunoModel;
@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{

	
	
}