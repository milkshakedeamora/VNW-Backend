import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class Conta implements OperacoesBancarias {
    private static int proximoNumero = 1000;
    private static String numero;
    private String agencia;
    private String nomeTitular;
    private String cpfTitular;
    protected static double saldo = 0;

   
    private static List<Conta> contas = new ArrayList<>();
    Random random = new Random();

        

    // Construtor
    public Conta(String nomeTitular, String cpfTitular) {
        this.numero = String.valueOf(proximoNumero++);
        this.agencia = String.valueOf(random.nextInt(9000) + 1000) ;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.nomeTitular = nomeTitular;
        if (!validarCPF(cpfTitular)) {
            throw new IllegalArgumentException("CPF inválido!");
        }

        this.cpfTitular = cpfTitular;
        
        contas.add(this);
    }

    public static List<Conta> getContas() {
        return contas;
    }
    public static String getNumero() {
        return numero;
    }

    protected void exibirSaldo(){
        System.out.println("Saldo: R$"+saldo);

    }

    /* FEITO PELO GPT - CONFIANDO CEGAMENTE NELE */
    private boolean validarCPF(String cpf) {
        // Remove caracteres não numéricos do CPF
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (caso contrário, é um CPF inválido)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = 11 - (soma % 11);
        if (digito1 >= 10) {
            digito1 = 0;
        }

        // Verifica o primeiro dígito verificador
        if (digito1 != cpf.charAt(9) - '0') {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = 11 - (soma % 11);
        if (digito2 >= 10) {
            digito2 = 0;
        }

        // Verifica o segundo dígito verificador
        if (digito2 != cpf.charAt(10) - '0') {
            return false;
        }

        // Se passou por todas as verificações, o CPF é válido
        return true;
    }

    /* FIM DO GPT  */
    public void depositar(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("O valor do depósito não é valido.");
        }
        saldo += valor;
    }
    
    @Override
    public void transferir(double valor, Conta destino) {
        if (!contas.contains(destino)) {
            throw new IllegalArgumentException("A conta de destino não existe.");
        }
        this.sacar(valor);
        destino.depositar(valor);
    }

    private void excluir() {
        contas.remove(this);
      }

    
}


