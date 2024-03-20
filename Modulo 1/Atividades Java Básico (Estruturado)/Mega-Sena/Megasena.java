import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Megasena{
    private static final int ARRAY_LENGTH = 7;

    int[] numerosEscolhidos = new int[ARRAY_LENGTH];
    int[] numerosSorteados = new int[ARRAY_LENGTH];

    public boolean verificarNumero(int num,int[] array) {
        if (num < 0 || num > 100) {
           
            return false;
        }

        for (int i : array) {
            if (i == num) {                
                return false;
            }
        }
        return true;
    }

    public void obterNumerosEscolhidos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha 7 números de 0 a 100:");

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int numero = -1;

            do {
                try {
                    System.out.printf("Digite %d ª número:",i+1);
                    numero = scanner.nextInt();                    
                    
                } catch (InputMismatchException e) {
                    System.out.println("Digite um número inteiro.");
                    scanner.next();
                }
            } while (numero == -1 || !verificarNumero(numero,numerosEscolhidos));

            numerosEscolhidos[i] = numero;
        }

        
        scanner.close();
        Arrays.sort(numerosEscolhidos);
    }

    public void gerarNumerosSorteados() {
        Random random = new Random();

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            int numero;
            do {
                numero = random.nextInt(101); 
            } while (!verificarNumero(numero,numerosSorteados));

            numerosSorteados[i] = numero;

        }

        Arrays.sort(numerosSorteados); 
        
    }
    public int numerosAcertados(){
        int acertos = 0;
        for (int i : numerosSorteados) {
            for (int j : numerosEscolhidos) {
            if(i == j){
                acertos++;
            }
        }
        }
        
    
    return acertos;
    }
    public void imprimirPremiacao(){
        int n = numerosAcertados();
        switch (n) {
            case 5:
                System.out.println("Premio de 10 mil reais.");
                break;
            case 6:
                System.out.println("Premio de 50 mil reais.");
                break;
            case 7:
                System.out.println("Premio de 200 mil reais.");
                break;
            
            default:
                System.out.println("Azar. Acertos:"+n);
        }
    }
    public void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        
    }

    public static void main(String[] args) {
        Megasena App = new Megasena();
        App.obterNumerosEscolhidos();
        App.gerarNumerosSorteados();
        System.out.print("Números escolhidos:");
        App.imprimirArray(App.numerosEscolhidos);
        System.out.println("");
        System.out.print("Números sorteados:");
        App.imprimirArray(App.numerosSorteados);
        System.out.println("");
        App.imprimirPremiacao();
    }
}