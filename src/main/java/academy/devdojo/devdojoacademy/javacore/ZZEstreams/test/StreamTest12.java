package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> novels = new ArrayList<>(List.of(
            new LightNovel("Naruto", 1.20, Category.DRAMA),
            new LightNovel("Dragon Ball Z", 1.25, Category.DRAMA),
            new LightNovel("One Piece", 2.50, Category.ROMANCE),
            new LightNovel("My Hero Academia", 3.00, Category.ROMANCE),
            new LightNovel("Sword Art Online", 4.75, Category.FANTASY),
            new LightNovel("Attack on Titan", 5.00, Category.DRAMA),
            new LightNovel("Fullmetal Alchemist", 6.50, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<Category, List<LightNovel>>();

//        Se for fazer sem os streams
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel novel : novels) {
            switch (novel.getCategory()) {
                case DRAMA:
                    drama.add(novel);
                    break;
                case ROMANCE:
                    romance.add(novel);
                    break;
                case FANTASY:
                    fantasy.add(novel);
                    break;
            }
        }

        categoryListMap.put(Category.DRAMA, fantasy);
        categoryListMap.put(Category.ROMANCE, drama);
        categoryListMap.put(Category.FANTASY, romance);
        System.out.println(categoryListMap);

//        Fazer com Streams
        Map<Category, List<LightNovel>> categoryListMapWhithStreams = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory));

        System.out.println(categoryListMapWhithStreams);
    }
}
