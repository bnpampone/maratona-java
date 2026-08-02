package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Livro> livros = new PriorityQueue<>(new LivroPrecoComparator().reversed());
        livros.add(new Livro(5L,"Zorro", 19.9, 0));
        livros.add(new Livro(1L,"Dom Quixote",9.5, 5));
        livros.add(new Livro(4L,"Memorias Postumas de Brascubas", 3.2, 0));
        livros.add(new Livro(3L,"O ladrão de casaca", 11.20, 2));
        livros.add(new Livro(2L,"A pedra filosofal - Harry Potter", 2.99, 0));

        while (!livros.isEmpty()){
            System.out.println(livros.poll());
        }
    }
}
