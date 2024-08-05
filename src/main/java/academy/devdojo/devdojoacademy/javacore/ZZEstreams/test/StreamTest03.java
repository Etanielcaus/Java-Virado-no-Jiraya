package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import academy.devdojo.devdojoacademy.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> novels = new ArrayList<LightNovel>(List.of(
            new LightNovel("gfxg", 120),new LightNovel("guy", 210),
            new LightNovel("asd", 580),new LightNovel("asd", 580),new LightNovel("vxcvsd", 300),
            new LightNovel("ascxcvxcv", 3600), new LightNovel("awfwef", 200),
            new LightNovel("awfwef", 200)
    ));
    public static void main(String[] args) {
//        novels.forEach(System.out::println);
//        System.out.println("===");
        novels.stream().forEach(System.out::println); // Esse método não é indicado, utilizar
//        o stream para fazer o forEach, ele gasta processamento e etc.

        System.out.println("===");

        Stream<LightNovel> streamNovels = novels.stream();
//        Explicação rápida deste código: streamNovels recebe um filtro, dentro do filtro
//        ele faz uma operação Lambda, verifica os novels com preço menor ou igual a 400
//        e depois faz a contagem de quantos itens possui então retorna um long.
        long count = streamNovels.filter(lightNovel -> lightNovel.getPrice() <= 400).count();
        System.out.println(count);

        long count1 = novels.stream().distinct().filter(ln -> ln.getPrice() > 400).count();
        System.out.println(count1);
    }
}
