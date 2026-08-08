package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    // Reference to an instance method of a particular object
    public static void main(String[] args) {
        AnimeComparators comparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5), new Anime("One Piece", 100), new Anime("Naruto", 200)));
//        animeList.sort(comparators::compareByEpisodesNonStatic);
        animeList.sort((a1, a2) -> comparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
