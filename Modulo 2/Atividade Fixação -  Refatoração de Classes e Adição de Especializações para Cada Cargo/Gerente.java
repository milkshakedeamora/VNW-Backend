package br.com.vainaweb.backendt1.classeabstrata;

public class Gerente extends Colaborador {

	private String habilidadeTecnica;
	
	
	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Gerente(String nome, String cpf, int idade, String habilidadeTecnica) {
		super(nome, cpf, idade);
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
