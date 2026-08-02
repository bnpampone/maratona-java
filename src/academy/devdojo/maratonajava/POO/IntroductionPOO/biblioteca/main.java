package javacore.POO.IntroductionPOO.biblioteca;

public class main {
    static void main(String[] args) {

        LivroBiblioteca livro = new LivroBiblioteca();

        livro.autor = "Raúl Sena";
        livro.dataPubli = "31/01/2027";
        livro.nome = "Meus Primeiros 100 mil";
        livro.qntPaginas = 211;
        livro.preco = 34.90;
        livro.isDisponivel = true;
        livro.dataEntrega = "20/10/2027";

        System.out.println(livro);
    }
}
