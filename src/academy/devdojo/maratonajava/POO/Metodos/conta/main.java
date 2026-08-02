package javacore.POO.Metodos.conta;

public class main {
    static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();
        corrente.numero = 2023140053;
        corrente.limite = 5000;
        corrente.saldo = 4000;
        corrente.isEspecial = true;

        System.out.println(corrente);
        corrente.consultarSaldo();
        corrente.saque(3000);

    }
}
