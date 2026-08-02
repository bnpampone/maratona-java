package javacore.POO.Construtores_Encapsulamento_Sobrecagar.bancaria;

public class main {
    static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(2023140053, 5000, true, 5000);

        System.out.println(conta);
        conta.consultarSaldo();
        conta.realizarSaque(5000);
        conta.consultarSaldo();
        conta.realizarDeposito(4500);
        conta.realizarDeposito(500);
    }
}
