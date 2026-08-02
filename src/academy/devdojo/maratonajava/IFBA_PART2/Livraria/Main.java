package academy.devdojo.maratonajava.IFBA_PART2.Livraria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EstoqueLivro estoqueLivro = new EstoqueLivro();

        Livro livro1 = new Livro(222, "Lupin", "Leblanc", "222");
        Livro  livro2 = new Livro(3333, "Arsene", "Maurice", "3333");
        Livro  livro3 = new Livro(44, "Galego", "Quincas Borba", "44");
        Livro  livro4 = new Livro(55555, "Deyvin", "Augusto Kipper", "55555");
        Livro  livro5 = new Livro(100, "Cris", "Felipe Massa", "100");

        estoqueLivro.adicionarLivro(livro1);
        estoqueLivro.adicionarLivro(livro2);
        estoqueLivro.adicionarLivro(livro3);
        estoqueLivro.adicionarLivro(livro4);
        estoqueLivro.adicionarLivro(livro5);

        estoqueLivro.listarTodosLivros();

        estoqueLivro.buscarLivroPorTitulo("lUpIn");
        estoqueLivro.buscarLivroPorTitulo("pipe");

        estoqueLivro.removerLivroPorISBN("100");
        estoqueLivro.listarTodosLivros();

        estoqueLivro.removerLivroPorISBN("777");
    }
}
