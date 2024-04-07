import java.time.LocalDate;

import Enum.Genero;
import Enum.Senioridade;

public class Gerente extends Colaborador {

	private String habilidadeTecnica;
	
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gerente(String nome, String cpf, double salario, int idade, Genero genero, Senioridade senioridade, LocalDate contrato, String habilidadeTecnica) {
		super(nome, cpf, salario, idade, genero, senioridade, contrato);
		this.habilidadeTecnica = habilidadeTecnica;
	}
	public Gerente(String nome, String cpf, double salario, int idade, Genero genero, Senioridade senioridade, String habilidadeTecnica) {
		super(nome, cpf, salario, idade, genero, senioridade);
		this.habilidadeTecnica = habilidadeTecnica;
	}


	public String getHabilidadeTecnica() {
		return habilidadeTecnica;
	}


	public void setHabilidadeTecnica(String habilidadeTecnica) {
		this.habilidadeTecnica = habilidadeTecnica;
	}

	
	@Override
	public void receberAumento(double porcentagem) {
		porcentagem += 4;
		
	}
	
	@Override
	public String visualizar() {
		return super.visualizar()+  "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
