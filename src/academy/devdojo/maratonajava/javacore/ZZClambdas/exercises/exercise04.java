package academy.devdojo.maratonajava.javacore.ZZClambdas.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class exercise04 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Mouse", 50),
                new Produto("Teclado", 150),
                new Produto("Monitor", 800),
                new Produto("Cabo HDMI", 25)
        );

        List<Produto> produtosList = filter(produtos, produto -> produto.getPreco() > 100);
        System.out.println(produtosList);


    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> resultado = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                resultado.add(t);
            }
        }
        return resultado;
    }
}
