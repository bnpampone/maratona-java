package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {

        List<Livro> livros = new LinkedList<>();
        livros.add(new Livro(5L,"Zorro", 19.9, 0));
        livros.add(new Livro(1L,"Dom Quixote",9.5, 5));
        livros.add(new Livro(4L,"Memorias Postumas de Brascubas", 3.2, 0));
        livros.add(new Livro(3L,"O ladrão de casaca", 11.20, 2));
        livros.add(new Livro(2L,"A pedra filosofal - Harry Potter", 2.99, 0));

//        Iterator<Livro> livroIterator = livros.iterator();
//        while ((livroIterator.hasNext())){
//            Livro livro = livroIterator.next();
//            if(livro.getQuantidade()  == 0){
//                livroIterator.remove();
//            }
//        }
//        System.out.println(livros);


        // Java 8
        livros.removeIf(livro -> livro.getQuantidade() == 0);
        System.out.println(livros);
    }
}
