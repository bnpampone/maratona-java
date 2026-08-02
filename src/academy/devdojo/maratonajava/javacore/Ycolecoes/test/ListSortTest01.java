package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> livros = new ArrayList<>(6);
        livros.add("Zorro");
        livros.add("Dom Quixote");
        livros.add("Memorias Postumas de Brascubas");
        livros.add("O ladrão de casaca");
        livros.add("A pedra filosofal - Harry Potter");

        Collections.sort(livros);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23D);
        dinheiros.add(23.9999);
        dinheiros.add(21D);
        dinheiros.add(98.10);

        System.out.println(dinheiros);

        Collections.sort(dinheiros);

        System.out.println(dinheiros);

        for(String livro : livros){
            System.out.println(livro);
        }

    }
}
