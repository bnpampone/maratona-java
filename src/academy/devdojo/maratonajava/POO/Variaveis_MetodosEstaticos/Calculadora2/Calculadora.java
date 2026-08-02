package javacore.POO.Variaveis_MetodosEstaticos.Calculadora2;

public class Calculadora {

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

    public static int factorial(int num){
        if(num == 0){
            return 1;
        }

        int total = 1;
        for (int i = num; i > 0; i--) {
            total*=i;
        }
        return total;
    }


}
