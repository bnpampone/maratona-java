package javacore.POO.IntroductionPOO.telefone;

public class main {
    static void main(String[] args) {
        Contato contato = new Contato();

        contato.nome = "Hamilton";
        contato.telefone = new String[2];
        contato.telefone[0] = "5502-9914";
        contato.telefone[1] = "4002-8922";
        contato.ativo = true;
        contato.endereco = "Avenida Paulista - Num. 271, Apto. 217";

        System.out.println("NOME: " + contato.nome);
        System.out.println("telefone 1: " + contato.telefone[0]);
        System.out.println("telefone 2: " + contato.telefone[1]);
        System.out.println("STATUS: " + contato.ativo);
        System.out.println("ENDERECO: " + contato.endereco);
    }
}
