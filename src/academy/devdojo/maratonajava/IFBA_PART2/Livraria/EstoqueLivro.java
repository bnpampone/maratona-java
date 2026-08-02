package academy.devdojo.maratonajava.IFBA_PART2.Livraria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class EstoqueLivro {
    List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro " + livro.getTitulo().toUpperCase() + " adicionado com sucesso!");
    }

    public boolean removerLivroPorISBN(String isbn) {
        for (int i = 0; i < livros.size(); i++) {
            if(livros.get(i).getIsbn().equalsIgnoreCase(isbn)){
                System.out.println("Livro " + livros.get(i).getTitulo() + " removido com sucesso");
                livros.remove(livros.get(i));
                return true;

            }
        }
        System.out.println("Livro não encontrado");
        return false;
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                return livro;
                
            }
        }
        System.out.println("Nenhum livro encontrado");
        return null;

    }

    public void listarTodosLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
        System.out.println();
    }
}
