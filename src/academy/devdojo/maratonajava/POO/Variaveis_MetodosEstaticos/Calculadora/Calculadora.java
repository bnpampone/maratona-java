package javacore.POO.Variaveis_MetodosEstaticos.Calculadora;

public class Calculadora {
    private static int numA;
    private static int numB;

    public static int somar(int numA, int numB){
        return numA + numB;
    }

    public static int subtrair(int numA, int numB){
        return numA - numB;
    }

    public static int multiplicar(int numA, int numB){
        return numA * numB;
    }

    public static int dividir(int numA, int numB){
        return numA / numB;
    }

    public static int potencia(int numA, int numB){
        int n = 1;
        for (int i = 1; i <= numB; i++) {
            n*=numA;
        }
        return n;
    }



}
