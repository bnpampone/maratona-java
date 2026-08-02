package javacore.POO.IntroductionPOO.lampada;

public class main {
    static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.garantia = 5;
        lampada.marca = "Yamanha";
        lampada.nome = "Fusion V5";
        lampada.preco = 24.99;
        lampada.validade = "27/07/2036";
        lampada.voltagem = 244;

        System.out.println("GARANTIA: "+ lampada.garantia);
        System.out.println("MARCA: "+ lampada.marca);
        System.out.println("NOME: "+ lampada.nome);
        System.out.println("PRECO: "+ lampada.preco);
        System.out.println("VALIDADE: "+ lampada.validade);
        System.out.println("VOLTAGEM: "+ lampada.voltagem);
    }
}
