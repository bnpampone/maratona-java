package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rock BalBoa");
        Consumidor consumidor2 = new Consumidor("David Gogins");
        Livro livro1 = new Livro(5L, "Zorro", 19.9);
        Livro livro2 = new Livro(1L, "Dom Quixote", 9.5);
        Livro livro3 = new Livro(4L, "Memorias Postumas de Brascubas", 3.2);
        Livro livro4 = new Livro(3L, "O ladrão de casaca", 11.20);
        Livro livro5 = new Livro(2L, "A pedra filosofal - Harry Potter", 2.99);

        Map<Consumidor, Livro>  consumidroLivro = new HashMap<>();

        consumidroLivro.put(consumidor1, livro1);
        consumidroLivro.put(consumidor2, livro4);

        for(Map.Entry<Consumidor,Livro> entry : consumidroLivro.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
