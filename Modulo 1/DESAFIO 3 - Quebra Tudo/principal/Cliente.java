package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	String nome;
	String cpf; 
	List<Pedido> pedido = new ArrayList<Pedido>();
	Scanner sc = new Scanner(System.in);
	public Cliente() {
		
	}
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		do {
			this.pedido.add(new Pedido());
		} while (adicionarProduto());
	}

	public boolean adicionarProduto(){
		System.out.println("Valor: R$"+retornarValor());
		sc.nextLine();
		String continua = sc.nextLine();
		if(continua.isEmpty())
		 return true;
		return false;
	}

	public double retornarValor(){
		 double valor = 0;		
			for (Pedido p : pedido) {
				valor+= (p.preco*p.quantidade);
			}
			return valor;
		
	}
}
