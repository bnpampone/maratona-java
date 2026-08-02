package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortLivroByIdComparator implements Comparator<Livro>{

    @Override
    public int compare(Livro livro, Livro livro2) {
        return livro.getId().compareTo(livro2.getId());
    }
}

public class LivroSortTest01 {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>(6);
        livros.add(new Livro(5L,"Zorro", 19.9));
        livros.add(new Livro(1L,"Dom Quixote",9.5));
        livros.add(new Livro(4L,"Memorias Postumas de Brascubas", 3.2));
        livros.add(new Livro(3L,"O ladrão de casaca", 11.20));
        livros.add(new Livro(2L,"A pedra filosofal - Harry Potter", 2.99));


        for (Livro livro : livros){
            System.out.println(livro);
        }

        System.out.println(" ============================= ");

        Collections.sort(livros);

        for (Livro livro : livros){
            System.out.println(livro);
        }


        System.out.println("=====================================");

        Collections.sort(livros, new SortLivroByIdComparator());

        for (Livro livro : livros){
            System.out.println(livro);
        }
    }
}
