package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Optional<Manga> mangaById = MangaRepository.findById(2);
        Manga manga = mangaById.orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Optional<Manga> mangaByTitleCreate = MangaRepository.findByTitle("Drifters");
        Manga newManga = mangaByTitleCreate.orElse(new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
