package br.com.vainaweb.backendt1.classeabstrata;

public class Designer extends Colaborador {

	
	private String habilidadeTecnica;

	
	public Designer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Designer(String nome, String cpf, int idade, String habilidadeTecnica) {
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
		porcentagem += 0.1;
		
	}
	
	@Override
	public String visualizar() {
		// TODO Auto-generated method stub
		return super.visualizar()+  "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
