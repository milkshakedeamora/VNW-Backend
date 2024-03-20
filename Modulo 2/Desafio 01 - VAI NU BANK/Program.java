import java.util.Scanner;

public class Program {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Acessar Conta");
            System.out.println("2. Criar Conta");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    acessarConta();
                    break;
                case 2:
                    criarConta();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 3);
    }

    private static void acessarConta() {
        scanner.nextLine();
        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        
        Conta conta = buscarConta(numeroConta);
        if (conta != null) {
            OpcoesDeConta(conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
    }

    private static void OpcoesDeConta(Conta conta){
        int opcao;
        double valor;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Saldo");
            System.out.println("5. Voltar ao Menu Anterior");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                scanner.nextLine();
                System.out.println("Digite o valor do deposito:");
                valor = scanner.nextDouble(); 
                conta.depositar(valor);

                
                    break;
                case 2:
                scanner.nextLine();
                System.out.println("Digite o valor do saque:");
                valor = scanner.nextDouble(); 
                conta.sacar(valor);
                    break;
                case 3:
                scanner.nextLine();
                System.out.println("Digite o numero da conta do Destinatario:");
                String numeroConta = scanner.nextLine();
                System.out.println("Digite o valor do deposito:");
                valor = scanner.nextDouble(); 
                conta.transferir(valor, buscarConta(numeroConta));

                    break;
                case 4:
                    conta.exibirSaldo();
                    break;
                case 5:
                    return;
                    
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 3);

    }

    private static void criarConta() {
        System.out.println("1 - Corrente / 2 - Poupança");
        int opcao = scanner.nextInt();  
        scanner.nextLine();
        String nome,cpf;  
        Conta conta;  


            switch (opcao) {
                case 1:
                System.out.println("Nome do Cliente: ");
                nome = scanner.nextLine();
                System.out.println("CPF do Cliente: ");
                cpf = scanner.nextLine();
                conta = new ContaCorrente(nome, cpf);
                
                    break;
                case 2:
                System.out.println("Nome do Cliente: ");
                nome = scanner.nextLine();
                System.out.println("CPF do Cliente: ");
                cpf = scanner.nextLine();                
                conta = new ContaCorrente(nome, cpf);
                    break;                
                default:
                    System.out.println("Opção inválida.");
    }
}

private static Conta buscarConta(String numeroConta) {
    
    for (Conta conta : Conta.getContas()) {
        if (conta.getNumero().equals(numeroConta)) {
            return conta;
        }
    }
    return null;
}
}

