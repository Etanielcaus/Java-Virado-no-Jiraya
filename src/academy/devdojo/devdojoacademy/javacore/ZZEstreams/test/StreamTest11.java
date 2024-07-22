package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> novels = new ArrayList<LightNovel>(List.of(
            new LightNovel("gfxg", 120), new LightNovel("guy", 125),
            new LightNovel("asd", 580), new LightNovel("vxcvsd", 300),
            new LightNovel("ascxcvxcv", 3600), new LightNovel("awfwef", 200),
            new LightNovel("awfwef", 500)
    ));

    public static void main(String[] args) {

//        Pegar Tamanho
        System.out.println(novels.size());
        System.out.println(novels.stream().count());
        System.out.println(novels.stream().collect(Collectors.counting()));

//        Maior Valor
        novels.stream().max(Comparator
                        .comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

//        Com Collectors
        novels.stream()
                .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);
        novels.stream().collect(Collectors.minBy(Comparator.comparing(LightNovel::getPrice)))
                .ifPresent(System.out::println);
        novels.stream().min(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);

//        Somar
        System.out.println(novels.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println(novels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

//        Média
        novels.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        DoubleSummaryStatistics collected = novels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collected);

//        Coletar todos os nomes em uma String
        String collectString = novels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collectString);


    }
}
