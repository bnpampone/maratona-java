package academy.devdojo.maratonajava.javacore.ZZClambdas.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class exercise05 {
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Mouse", 50),
                new Produto("Teclado", 150),
                new Produto("Monitor", 800),
                new Produto("Cabo HDMI", 25)
        );

        List<Produto> produtosList = filter(produtos, produto -> produto.getPreco() > 100);
        System.out.println(produtosList);

        List<String> map = map(produtosList, produto -> produto.getNome().toUpperCase());

        System.out.println(map);
        forEach(map, show -> System.out.println(show));

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

    public static <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> resultado = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            resultado.add(r);
        }
        return resultado;
    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
