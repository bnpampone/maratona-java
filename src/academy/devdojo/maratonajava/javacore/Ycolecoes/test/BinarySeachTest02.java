package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySeachTest02 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(6);
        livros.add(new Livro(5L, "Zorro", 19.9));
        livros.add(new Livro(1L, "Dom Quixote", 9.5));
        livros.add(new Livro(4L, "Memorias Postumas de Brascubas", 3.2));
        livros.add(new Livro(3L, "O ladrão de casaca", 11.20));
        livros.add(new Livro(2L, "A pedra filosofal - Harry Potter", 2.99));

//        Collections.sort(livros);
        livros.sort(new SortLivroByIdComparator());

        for (Livro livro : livros) {
            System.out.println(livro);
        }

        Livro livroToSearch = new Livro(2L, "A pedra filosofal - Harry Potter", 2.99);
        System.out.println(Collections.binarySearch(livros, livroToSearch, new SortLivroByIdComparator()));
    }
}
