package academy.devdojo.maratonajava.javacore.ZZDoptional.exercises;

import java.util.List;
import java.util.Optional;

public class exercises03 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Breno", "Marcelo", "Pamponé");
        Optional<String> optional = buscarNome(nomes, "Breno");
        optional.ifPresentOrElse(s -> System.out.println("NOME ENCONTRADO: " + s), () -> System.out.println("NOME NÃO ENCONTRADO"));

    }

    public static Optional<String> buscarNome(List<String> nomes, String nome) {
        if(nomes.contains(nome)){
            return Optional.of(nome);
        }
        return Optional.empty();
    }
}
