package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collectLongBestPrice = novels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collectLongBestPrice);

        Map<Category, Set<Promotion>> collectList = novels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collectList);

        Map<Category, LinkedHashSet<Promotion>> collectLinkedHashSetMap = novels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.mapping(StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collectLinkedHashSetMap);
    }

    private static Promotion getPromotion(LightNovel novel) {
        return novel.getPrice() < 3 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
