package com.escolavnw.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escolavnw.demo.dto.DadosAluno;
import com.escolavnw.demo.model.AlunoModel;
import com.escolavnw.demo.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
	private AlunoRepository repository;
	
	public List<AlunoModel> encontrarTodosOsAlunos() {
		return repository.findAll(); 
	}


    public Object cadastrarAluno(DadosAluno dados) {
        var aluno = new AlunoModel(dados.nome(), dados.cpf(), dados.email(), dados.curso(), dados.telefone());
			repository.save(aluno); 
			
			return "Cadastro feito com sucesso";
    }

}
