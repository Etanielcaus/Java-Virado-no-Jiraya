package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = novels.stream()
                .collect(Collectors
                        .groupingBy(l -> l.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                        ));

        System.out.println(collect);

//        Map<Category, Map<Promotion, List<LightNovel>>
        Map<Category, Map<Promotion, List<LightNovel>>> collectedMap = novels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.groupingBy(
                                lightNovel -> lightNovel.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                        )));
        System.out.println(collectedMap);
    }
}
