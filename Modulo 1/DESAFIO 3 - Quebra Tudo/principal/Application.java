package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = 0;
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Nome do cliente: ");
			String nomeCliente = sc.nextLine();
			System.out.print("cpf do cliente: ");
			String cpf = sc.nextLine();
			System.out.println("Pedido do cliente: ");			
			clientes.add(new Cliente(nomeCliente, cpf));
		}
		
		for(Cliente l: clientes) {
			
			System.out.println(l.nome + "\nPedido:");
			for (Pedido p : l.pedido) {
				System.out.println(p.toString());
			}
			System.out.println("Total: R$"+l.retornarValor());
			total+=l.retornarValor();
			System.out.println("----------------------");
		}
		System.out.println("TOTAL: R$"+total);
		sc.close();

	}

}
