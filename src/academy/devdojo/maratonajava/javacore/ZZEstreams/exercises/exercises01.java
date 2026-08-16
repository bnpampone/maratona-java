package academy.devdojo.maratonajava.javacore.ZZEstreams.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class exercises01 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Joao", "Maria", "Jose");

        List<String> collect = nomes.stream().map(n -> n.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
