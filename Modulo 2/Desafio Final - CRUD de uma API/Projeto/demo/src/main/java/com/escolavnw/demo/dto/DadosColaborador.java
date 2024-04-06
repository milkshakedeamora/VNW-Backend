package com.escolavnw.demo.dto;

import com.escolavnw.demo.enums.Cargo;

public record DadosColaborador(String nome, String cpf, String email, Cargo cargo)  {
	
}