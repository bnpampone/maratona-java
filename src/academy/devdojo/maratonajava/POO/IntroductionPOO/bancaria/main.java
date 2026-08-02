package javacore.POO.IntroductionPOO.bancaria;

public class main {
    static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente();

        corrente.nome = "Fernando Alonso";
        corrente.banco = "XP";
        corrente.numero = 1455588;
        corrente.limite = 2000;
        corrente.saldo = 500;
        corrente.isEspecial = false;


        System.out.println("NOME: " + corrente.nome);
        System.out.println("BANCO: " + corrente.banco);
        System.out.println("NUMERO: " + corrente.numero);
        System.out.println("LIMITE: " + corrente.limite);
        System.out.println("SALDO: " + corrente.saldo);
        System.out.println("ESPECIAL: " + corrente.isEspecial);
    }
}
