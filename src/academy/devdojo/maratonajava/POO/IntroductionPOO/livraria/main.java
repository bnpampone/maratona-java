package javacore.POO.IntroductionPOO.livraria;

public class main {
    static void main(String[] args) {
        Livraria livro = new Livraria();
        livro.autor = "Raúl Sena";
        livro.dataPubli = "31/01/2027";
        livro.nome = "Meus Primeiros 100 mil";
        livro.qntPaginas = 211;

        System.out.println(livro);
    }
}
