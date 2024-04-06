package com.escolavnw.demo.dto;

import com.escolavnw.demo.enums.Curso;

public record DadosAluno(String nome, String cpf, String email, Curso curso, String telefone)  {
	
}

