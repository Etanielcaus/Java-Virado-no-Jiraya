package academy.devdojo.devdojoacademy.javacore.ZZCLambdas.test;

import academy.devdojo.devdojoacademy.javacore.ZZCLambdas.dominio.Anime;
import academy.devdojo.devdojoacademy.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5), new Anime("Naruto", 10), new Anime("DBZ", 3)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

//        Supplier<Anime> newAnimeSupplier = Anime::new;

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        Anime anime1 = animeBiFunction.apply("Karl Marx", 8);
    }
}
