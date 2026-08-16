package academy.devdojo.maratonajava.javacore.ZZEstreams.exercises;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class exercises03 {
    public static void main(String[] args) {
        List<String> frases = List.of(
                "Java é legal",
                "Streams são poderosas",
                "FlatMap é interessante"
        );

        List<String> collect = frases.stream().map(phrases -> phrases.split(" ")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(collect);

    }
}
