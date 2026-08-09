package academy.devdojo.maratonajava.javacore.ZZClambdas.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class exercise01 {
    public static void main(String[] args) {
        List<Integer> idades = List.of(12, 18, 25, 15, 30, 17);
        List<Integer> idadeMaiores = filter(idades, idade -> idade >= 18);

        System.out.println(idadeMaiores);
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
