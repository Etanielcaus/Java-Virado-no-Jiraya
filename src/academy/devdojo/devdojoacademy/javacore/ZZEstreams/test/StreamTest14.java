package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
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
//      Quantos itens possui em cada categoria
        Map<Category, Long> collectLong = novels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collectLong);

//        Maior preço por categoria.
        Map<Category, Optional<LightNovel>> collectOptional = novels.stream()
                .collect(Collectors
                        .groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator
                                .comparing(LightNovel::getPrice))));
        System.out.println(collectOptional);
        Map<Category, LightNovel> collectMap = novels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                        Optional::get)));
        System.out.println(collectMap);
    }
}
