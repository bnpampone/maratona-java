package academy.devdojo.maratonajava.javacore.ZZEstreams.exercises;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class exercises05 {
    public static void main(String[] args) {
        List<Aluno> alunos = List.of(
                new Aluno("Breno", List.of("Java", "Banco de Dados")),
                new Aluno("Joao", List.of("Python", "C")),
                new Aluno("Maria", List.of("Java", "C"))
        );

        List<String> collect = alunos.stream().map(Aluno::getMaterias).flatMap(Collection::stream).collect(Collectors.toList());
        List<String> collect2 = alunos.stream().map(Aluno::getMaterias).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect2);
    }
}
