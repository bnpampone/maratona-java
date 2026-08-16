package academy.devdojo.maratonajava.javacore.ZZEstreams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercises04 {
    public static void main(String[] args) {
        List<String> palavras = List.of(
                "Java",
                "Java",
                "Stream",
                "FlatMap"
        );

        List<String> collect = palavras.stream().map(words -> words.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);

    }
}
