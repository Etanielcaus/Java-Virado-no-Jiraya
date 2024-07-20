package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
//        Criar uma stream de integers
//        Range: 1, 49 / RangeClosed 1, 50
        IntStream.rangeClosed(1, 50)
                .filter(i -> i % 2 == 0) // número par
                .forEach(n -> System.out.println(n + " "));

        System.out.println("");

        Stream.of("Isso é ", "Uma ", "Stream")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println("");

        int nums[] = {1,2,3,4,5};
        Arrays.stream(nums).average().ifPresent(System.out::println);

        try (Stream<String> lines = Files.lines(Paths.get("pasta2/StreamsArchive.txt"))){
            lines.filter(l -> l.contains("Java"))
            .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
