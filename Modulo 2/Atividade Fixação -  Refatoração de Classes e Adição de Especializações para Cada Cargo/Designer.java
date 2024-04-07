import java.time.LocalDate;

import Enum.Genero;
import Enum.Senioridade;

public class Designer extends Colaborador {

	
	private String habilidadeTecnica;

	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designer(String nome, String cpf, double salario, int idade, Genero genero, Senioridade senioridade, LocalDate contrato, String habilidadeTecnica) {
		super(nome, cpf, salario, idade, genero, senioridade, contrato);
		this.habilidadeTecnica = habilidadeTecnica;
	}
	public Designer(String nome, String cpf, double salario, int idade, Genero genero, Senioridade senioridade, String habilidadeTecnica) {
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
		porcentagem += 0.1;
		
	}
	
	@Override
	public String visualizar() {
		// TODO Auto-generated method stub
		return super.visualizar()+  "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
