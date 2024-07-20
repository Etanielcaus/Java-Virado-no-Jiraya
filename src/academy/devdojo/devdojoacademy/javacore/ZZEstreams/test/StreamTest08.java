package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> novels = new ArrayList<LightNovel>(List.of(
            new LightNovel("gfxg", 120),new LightNovel("guy", 125),
            new LightNovel("asd", 580),new LightNovel("vxcvsd", 300),
            new LightNovel("ascxcvxcv", 3600), new LightNovel("awfwef", 200),
            new LightNovel("awfwef", 500)
    ));

    public static void main(String[] args) {
        novels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price < 500)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = novels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price < 500)
                .sum();

        System.out.println(sum);
    }


}
