package academy.devdojo.maratonajava.javacore.ZZDoptional.exercises;

import java.util.Optional;

public class exercises01 {
    public static void main(String[] args) {
        String nome = "Breno";
        String nomeNulo = null;

        Optional<String> nomeOptional = Optional.of(nome);

        Optional<String> nomeNullable = Optional.ofNullable(nomeNulo);

        Optional<Object> nomeVazio = Optional.empty();

        System.out.println(nomeOptional);
        System.out.println(nomeNullable);
        System.out.println(nomeVazio);
    }

}
