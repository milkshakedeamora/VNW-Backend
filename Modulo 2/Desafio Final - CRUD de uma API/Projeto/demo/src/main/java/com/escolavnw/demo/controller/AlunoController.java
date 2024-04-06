package com.escolavnw.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escolavnw.demo.dto.DadosAluno;
import com.escolavnw.demo.model.AlunoModel;
import com.escolavnw.demo.repository.AlunoRepository;
import com.escolavnw.demo.service.AlunoService;

@RestController 
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService service;

	@Autowired
	private AlunoRepository repository;

	@GetMapping
	public List<AlunoModel> listarTodosOsAlunos() {
		return service.encontrarTodosOsAlunos();
	}

	@SuppressWarnings("null")
	@GetMapping("/{id}")
	public ResponseEntity<AlunoModel> listarPorId(@PathVariable Long id) {
		return repository.findById(id).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	

	@PostMapping 
	public ResponseEntity<Object> cadastrarAluno(@RequestBody DadosAluno dados) {
		 return ResponseEntity.status(HttpStatus.CREATED).body( service.cadastrarAluno(dados));

	}

}