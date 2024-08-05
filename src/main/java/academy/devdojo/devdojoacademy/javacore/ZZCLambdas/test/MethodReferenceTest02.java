package academy.devdojo.devdojoacademy.javacore.ZZCLambdas.test;

import academy.devdojo.devdojoacademy.javacore.ZZCLambdas.dominio.Anime;
import academy.devdojo.devdojoacademy.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5), new Anime("Naruto", 10), new Anime("DBZ", 3)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
//        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
