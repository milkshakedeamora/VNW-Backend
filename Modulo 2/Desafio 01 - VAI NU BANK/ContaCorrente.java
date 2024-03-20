public class ContaCorrente extends Conta {
    private double limiteCredito;

    public ContaCorrente(String nomeTitular, String cpfTitular) {
        super( nomeTitular, cpfTitular);
        //this.limiteCredito = limiteCredito;
        
    }

    @Override
    public void sacar(double valor) {
       if(valor > super.saldo+limiteCredito){

        throw new IllegalArgumentException("O valor do saque não é valido.");

       }
       saldo+=valor;
    }

}
