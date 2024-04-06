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

import com.escolavnw.demo.dto.DadosColaborador;
import com.escolavnw.demo.model.ColaboradorModel;
import com.escolavnw.demo.repository.ColaboradorRepository;
import com.escolavnw.demo.service.ColaboradorService;



@RestController 
@RequestMapping("/colaborador")
public class ColaboradorController {

	@Autowired
	private ColaboradorService service;

	@Autowired
	private ColaboradorRepository repository;

	@GetMapping
	public List<ColaboradorModel> listarTodosOsColaboradores() {
		return service.encontrarTodosOsColaboradores();
	}

	@SuppressWarnings("null")
	@GetMapping("/{id}")
	public ResponseEntity<ColaboradorModel> listarPorId(@PathVariable Long id) {
		return repository.findById(id).map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

	

	@PostMapping 
	public ResponseEntity<String> cadastrarColaborador(@RequestBody DadosColaborador dados) {
		 return ResponseEntity.status(HttpStatus.CREATED).body( service.cadastrar(dados));

	}

}