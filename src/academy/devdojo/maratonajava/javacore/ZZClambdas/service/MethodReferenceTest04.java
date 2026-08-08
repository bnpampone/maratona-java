package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier= AnimeComparators::new;
        AnimeComparators comparators = animeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5), new Anime("One Piece", 100), new Anime("Naruto", 200)));

        animeList.sort(comparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

//        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Super campeões", 36));
    }
}
