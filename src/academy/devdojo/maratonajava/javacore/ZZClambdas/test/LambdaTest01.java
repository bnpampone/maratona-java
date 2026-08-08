package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    // Predicate<T>: Recebe um objeto e retorna um boolean. O methods abstrato dele chama-se test. Ele serve para responder uma pergunta (Sim/Não).
    // Consumer<T>: Recebe um objeto e retorna void (nada). O methods abstrato dele chama-se accept. Ele serve para executar uma ação (imprimir, salvar, enviar)

    public static void main(String[] args) {
        List<String> names = List.of("Breno", "Marcelo", "Pamponé", "Santana");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(names, s -> System.out.println(s));
        forEach(integers, integer -> System.out.println(integer));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
