import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class ContaPoupança extends Conta{

    

    public ContaPoupança(String nomeTitular, String cpfTitular) {
        super(nomeTitular, cpfTitular);
       
    }

    @Override
    public void sacar(double valor) {
        if(valor*1.02 > saldo){
            throw new IllegalArgumentException("O valor do saque não é valido.");
        }
        saldo-=valor*1.02;
    }

    @Override
    public void depositar(double valor) {
        if(valor < 0){
            throw new IllegalArgumentException("O valor do deposito não é valido.");
        }
        saldo+= aniversario(valor, 2, meses());
    }

   
    /*GPT */
    private static double aniversario(double principal, double taxaDeJuros, int periodos) {
       
        double taxaDecimal = taxaDeJuros / 100.0;
        double montante = principal * Math.pow(1 + taxaDecimal / 12, periodos);
        return montante;
    }
    
    private static int meses() {
        // Gere uma data aleatória
        LocalDate dataAleatoria = dataAleatoria();

        // Obtenha a data atual
        LocalDate hoje = LocalDate.now();

        // Calcule a diferença em meses entre as duas datas
        Period periodo = Period.between(dataAleatoria, hoje);

        // Retorne o número total de meses
        return periodo.getMonths() + periodo.getYears() * 12;
    }

    private static LocalDate dataAleatoria() {
        Random random = new Random();

        // Gere um ano aleatório entre 1900 e o ano atual
        int ano = 2023 + random.nextInt(LocalDate.now().getYear() - 1899);

        // Gere um mês aleatório entre 1 e 12
        int mes = 1 + random.nextInt(12);

        // Gere um dia aleatório válido para o mês e ano fornecidos
        int dia = 1 + random.nextInt(diasNoMes(mes, ano));

        // Crie um objeto LocalDate com os valores aleatórios
        return LocalDate.of(ano, mes, dia);
    }

    private static int diasNoMes(int mes, int ano) {
        return LocalDate.of(ano, mes, 1).lengthOfMonth();
    }

}
