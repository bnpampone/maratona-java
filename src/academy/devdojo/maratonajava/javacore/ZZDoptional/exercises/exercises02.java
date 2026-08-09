package academy.devdojo.maratonajava.javacore.ZZDoptional.exercises;

import java.util.List;
import java.util.Optional;

public class exercises02 {
    public static void main(String[] args) {
        List<String> nomes = List.of("Breno", "Marcelo", "Pamponé");
        Optional<String> nomeEncontrado = buscarNome(nomes, "Breno");
        System.out.println(nomeEncontrado);
    }
    public static Optional<String> buscarNome(List<String> nomes, String nome){
        if(nomes.contains(nome)){
            return Optional.of(nome);
        }
        return Optional.empty();
    }
}
