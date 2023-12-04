package principal;

import java.util.Scanner;

public class Pedido {
	String nomeProduto;
	int quantidade;
	double preco;
	Scanner sc = new Scanner(System.in);
	public Pedido() {
		System.out.print("Produto:");
		this.nomeProduto = sc.nextLine();
		System.out.print("Preço:");
		try{
			this.preco= sc.nextDouble();
		}
	
		catch(Exception e){
			System.out.printf("Você não digitou um número real!\n");
		}
		System.out.print("Quantidade:");
		try{
			this.quantidade= sc.nextInt();
		}
	
		catch(Exception e){
			System.out.printf("Você não digitou um número inteiro!\n");
		}

		
	}
	
	public Pedido(String nomeProduto, int quantidade, double preco) {
		
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	public String toString() {
		return this.nomeProduto+ " R$"+ this.preco+" x "+ this.quantidade;
		}
	
}
