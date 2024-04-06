package com.escolavnw.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.escolavnw.demo.model.ColaboradorModel;
@Repository
public interface ColaboradorRepository extends JpaRepository<ColaboradorModel, Long>{

	Optional<ColaboradorModel> findByCpf(String cpf);
	
}