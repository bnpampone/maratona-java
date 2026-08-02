package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Livro;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Rock BalBoa");
        Consumidor consumidor2 = new Consumidor("David Gogins");
        Livro livro1 = new Livro(5L, "Zorro", 19.9);
        Livro livro2 = new Livro(1L, "Dom Quixote", 9.5);
        Livro livro3 = new Livro(4L, "Memorias Postumas de Brascubas", 3.2);
        Livro livro4 = new Livro(3L, "O ladrão de casaca", 11.20);
        Livro livro5 = new Livro(2L, "A pedra filosofal - Harry Potter", 2.99);


        List<Livro> livroConsumidor1List = List.of(livro1, livro2, livro3);
        List<Livro> livroConsumidor2List = List.of(livro4, livro5);
        Map<Consumidor, List<Livro>>  consumidorLivro = new HashMap<>();
        consumidorLivro.put(consumidor1, livroConsumidor1List);
        consumidorLivro.put(consumidor2,livroConsumidor2List);

        for (Map.Entry<Consumidor, List<Livro>> entry : consumidorLivro.entrySet()) {
            System.out.print(entry.getKey().getNome() + " ------> ");
            for (Livro livro : entry.getValue()) {
                System.out.print(livro.getNome() + " - ");
            }

            System.out.println();
        }

    }
}
