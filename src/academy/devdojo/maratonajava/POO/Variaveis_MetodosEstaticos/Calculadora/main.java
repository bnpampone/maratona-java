package javacore.POO.Variaveis_MetodosEstaticos.Calculadora;

public class main {
    static void main(String[] args) {
        imprime(Calculadora.somar(4,2));
        imprime(Calculadora.subtrair(4,2));
        imprime(Calculadora.multiplicar(4,2));
        imprime(Calculadora.dividir(4,2));
        imprime(Calculadora.potencia(4,2));
    }
    public static void imprime(int num){
        System.out.println(num);
    }
}
