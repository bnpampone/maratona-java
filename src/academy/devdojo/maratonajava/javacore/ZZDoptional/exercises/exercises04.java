package academy.devdojo.maratonajava.javacore.ZZDoptional.exercises;

import java.util.List;
import java.util.Optional;

public class exercises04 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(new Produto("Mouse", 50),
                new Produto("Teclado", 150),
                new Produto("Monitor", 800));

        mostrarProduto(buscarProduto(produtos, "teklado"));
        mostrarProduto(buscarProduto(produtos, "teclado"));
        mostrarProduto(buscarProduto(produtos, "Monitor"));

    }
    public static Optional<Produto> buscarProduto(List<Produto> produtos, String nome){
        for (Produto produto : produtos) {
            if(produto.getNome().equalsIgnoreCase(nome)){
                return Optional.of(produto);

            }
        }
        return Optional.empty();
    }

    public static void mostrarProduto(Optional<Produto> produto){
        produto.ifPresentOrElse(
                p -> System.out.println("Produto Encontrado: " + p.getNome()),
                () -> System.out.println("Produto não encontrado"));
    }
}
