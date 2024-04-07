import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import Enum.Genero;
import Enum.ModeloContrato;
import Enum.Senioridade;

public abstract class Colaborador {

	private String nome;
	private String cpf;
	private int idade;
	private boolean isAtivo = true;
	private double salario;
	private String matricula;
	private LocalDate dataContratacao; 
	private Genero genero;
	private Senioridade senioridade;
	private ModeloContrato contrato;
	private double VT;
	private double FGTS;
    private double decTercSalario;
    private double VA;
	private double VR;
	private LocalDate finalContrato;
	static int i = 500;


	

	

	public Colaborador() {

	}

	

	public Colaborador(String nome, String cpf, double salario, int idade, Genero genero, Senioridade senioridade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
		this.contrato = contrato;
		this.genero = genero;
		this.senioridade = senioridade;
		dataContratacao =  LocalDate.now();
		this.contrato =ModeloContrato.CLT;		
		FGTS = salario*1.56;
		decTercSalario = salario*0.95;
		VA = salario * 0.55;
		VT = 24 * (salario*0.03);
		if(VT>2000)	
		VT= 30*(salario*0.005);
		VR = salario*0.009*24;
		finalContrato = null;	
		i++;
		this.matricula = null;	
	}
	public Colaborador(String nome, String cpf, double salario, int idade, Genero genero, Senioridade senioridade, LocalDate finalContrato) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.salario = salario;
		this.contrato = contrato;
		this.genero = genero;
		this.senioridade = senioridade;
		dataContratacao =  LocalDate.now();
		this.contrato =ModeloContrato.PJ;		
		this.finalContrato = finalContrato;
		int dias = (int) dataContratacao.until(finalContrato, ChronoUnit.DAYS);
		VT = (dias * (salario*0.007))/(dias/30);
		VR = ((dias*(salario*0.015))/(dias/30));
		FGTS = 0;
		decTercSalario = 0;
		VA = 0;	
		this.matricula = "B"+i;	
				
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

	public LocalDate getdataContratacao(){
		return dataContratacao;
	}

	// Métodos
	public String visualizar() {
		String saida = "[ " + this.nome + ", " + this.idade + " ]\n";
  		saida += " CPF: " + this.cpf + "\n";
		if( this.matricula != null)
		saida+= " Matricula:"+this.matricula+ "\n";
  		saida += " Está ativo : " + this.isAtivo + "\n";
  		saida += " Salário: R$ " + this.salario + "\n";
  		saida += " Data de Contratação: " + this.dataContratacao + "\n";
  		saida += " Gênero: " + this.genero + "\n";
  		saida += " Senioridade: " + this.senioridade + "\n";
  		saida += " Modelo de Contrato: " + this.contrato + "\n";
		saida += " Vale Transporte: " + this.VT + "\n";
		saida += " Vale Refeição: " + this.VR + "\n";
		if(this.VA > 0)
		 saida+= " VA:"+this.VA+ "\n";
		if(this.FGTS > 0)
		 saida+= " FGTS:"+this.FGTS+ "\n";
		 if(this.decTercSalario > 0)
		 saida+= " Decimo Terceiro Salario:"+this.decTercSalario+ "\n";
		if(this.finalContrato !=null)
		saida+= " Final Contrato:"+this.finalContrato+"\n";
		return saida;
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
