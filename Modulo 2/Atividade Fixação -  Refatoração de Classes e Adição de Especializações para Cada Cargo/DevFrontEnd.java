package br.com.vainaweb.backendt1.classeabstrata;

public class DevFrontEnd extends Colaborador{

	private String habilidadeTecnica;
	
	
	public DevFrontEnd() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DevFrontEnd(String nome, String cpf, int idade, String habilidadeTecnica) {
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
		porcentagem += 0.5;
		
	}
	
	@Override
	public String visualizar() {
		return super.visualizar() +  "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
