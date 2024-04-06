package br.com.vainaweb.backendt1.classeabstrata;

import java.util.Scanner;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private int idade;
	private boolean isAtivo = true;
	private double salario;

	public Colaborador() {

	}

	public Colaborador(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isAtivo() {

		return isAtivo;
	}

//	public void setAtivo(boolean isAtivo) {
//		this.isAtivo = isAtivo;
//	}

	public double getSalario() {
		return salario;
	}

	// Métodos
	public String visualizar() {
		return "[ " + this.nome + ", " + this.idade + " ]" + "\n CPF: " + this.cpf + "\nEstá ativo ?: " + this.isAtivo;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Você deseja desvincular " + this.nome + " da empresa ?");
		Character resposta = sc.next().charAt(0);
		Character.toLowerCase(resposta);
		if (resposta.equals('s')) {
			System.out.println(this.nome + " está demitido(a)");
			this.isAtivo = false;
		}
		sc.close();
	}

	public abstract void receberAumento(double porcentagem);

}
