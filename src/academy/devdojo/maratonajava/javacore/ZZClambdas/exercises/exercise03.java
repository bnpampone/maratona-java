package academy.devdojo.maratonajava.javacore.ZZClambdas.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class exercise03 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Breno", "Marcelo", "Pamponé");
        List<Integer> result = map(nomes, a -> a.length());
        System.out.println(result);
    }

    public static <T,R> List<R> map(List<T> list, Function<T, R> function){
        List<R> resultado = new ArrayList<>();

        for (T t : list) {
            R r = function.apply(t);
            resultado.add(r);
        }
        return resultado;
    }
}
