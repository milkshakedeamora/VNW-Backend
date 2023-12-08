public class Calculadora{
    //SOMA
    public static float somar(double... numeros) {
        float i = 0;
        for (double numero : numeros) {
            i+=numero;
        }
        return i;
    }

    //SUBTRAÇÃO
    public static float subtrair(double... numeros) {
        float i = (float)numeros[0];
        for (int j = 1; j < numeros.length; j++) {
            i-=(float)numeros[j];
        }
        return i;
    }

    //MULTIPLICAÇÃO
    public static float multiplicar(double... numeros) {
        float i = 1;
        for (double numero : numeros) {
            i*=numero;
        }
        return i;
    }
    public static float multiplicar(float... numeros) {
        float i = 1;
        for (float numero : numeros) {
            i*=numero;
        }
        return i;
    }
     

    //DIVISÃO
    public static float dividir(double... numeros) {
        float i = (float)numeros[0];
        for (int j = 1; j < numeros.length; j++) {
            i/=(float)numeros[j];
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println(somar(3.5,6,2));
        System.out.println(subtrair(3.5,6,2));
        System.out.println(multiplicar(3.5,6,2));
        System.out.println(dividir(3.5,6,2));
        
    }


    

}