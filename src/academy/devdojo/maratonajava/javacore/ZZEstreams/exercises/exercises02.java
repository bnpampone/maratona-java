package academy.devdojo.maratonajava.javacore.ZZEstreams.exercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class exercises02 {
    public static void main(String[] args) {
        List<List<Integer>> numeros = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        List<Integer> collect = numeros.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
