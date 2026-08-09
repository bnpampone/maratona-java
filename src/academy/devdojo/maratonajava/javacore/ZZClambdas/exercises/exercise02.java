package academy.devdojo.maratonajava.javacore.ZZClambdas.exercises;

import java.util.List;
import java.util.function.Consumer;

public class exercise02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Breno", "Marcelo", "Pamponé");
        forEach(nomes, s -> System.out.println(s.toUpperCase()));

    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
