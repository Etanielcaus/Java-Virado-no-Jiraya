package academy.devdojo.devdojoacademy.javacore.ZZCLambdas.test;

import academy.devdojo.devdojoacademy.javacore.ZZCLambdas.dominio.Anime;
import academy.devdojo.devdojoacademy.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Bersek", 5), new Anime("Naruto", 10), new Anime("DBZ", 3)));

//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, (a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisodes);
//        animeList.sort(AnimeComparators.compareByEpisodes());
        System.out.println(animeList);



    }
}
