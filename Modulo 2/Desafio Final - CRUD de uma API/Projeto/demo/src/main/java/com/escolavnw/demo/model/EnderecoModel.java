package com.escolavnw.demo.model;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable 
public class EnderecoModel {
	
	private String cep;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String complemento;
	private String uf;
	private Integer numero;
	
}