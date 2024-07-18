package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> novels = new ArrayList<LightNovel>(List.of(
            new LightNovel("gfxg", 120),new LightNovel("guy", 210),
            new LightNovel("asd", 580),new LightNovel("vxcvsd", 300),
            new LightNovel("ascxcvxcv", 3600), new LightNovel("awfwef", 200)
    ));
    public static void main(String[] args) {
        List<String> collect = novels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 400)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
