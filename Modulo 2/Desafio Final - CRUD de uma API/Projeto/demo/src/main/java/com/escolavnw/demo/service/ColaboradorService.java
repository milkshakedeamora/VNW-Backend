package com.escolavnw.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolavnw.demo.dto.DadosColaborador;
import com.escolavnw.demo.model.ColaboradorModel;
import com.escolavnw.demo.repository.ColaboradorRepository;

@Service 
public class ColaboradorService {

	@Autowired
	private ColaboradorRepository repository;
	
	public List<ColaboradorModel> encontrarTodosOsColaboradores() {
		return repository.findAll(); 
	}

	public String cadastrar(DadosColaborador dados) {
		
		
		var existente = repository.findByCpf(dados.cpf());
		
		if(existente.isPresent()) {
			return "CPF Ja cadastrado";
		}
		else {
			var colaborador = new ColaboradorModel(dados.nome(), dados.cpf(), dados.email(), dados.cargo());
			repository.save(colaborador); 
			
			return "Cadastro feito com sucesso";
		}
		
	}
	
}
