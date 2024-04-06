package br.com.vainaweb.backendt1.classeabstrata;

public class DevBackEnd extends Colaborador {

	private String habilidadeTecnica;

	public DevBackEnd() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DevBackEnd(String nome, String cpf, int idade, String habilidadeTecnica) {
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
		porcentagem += 2;
		
	}

	@Override
	public String visualizar() {
		return super.visualizar() + "\n Caracteristicas: " + this.habilidadeTecnica;
	}

}
