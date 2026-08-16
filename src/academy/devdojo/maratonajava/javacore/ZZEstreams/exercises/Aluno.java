package academy.devdojo.maratonajava.javacore.ZZEstreams.exercises;

import java.util.List;

public class Aluno {
    private String nome;
    private List<String> materias;

    public Aluno(String nome, List<String> materias) {
        this.nome = nome;
        this.materias = materias;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getMaterias() {
        return materias;
    }
}
