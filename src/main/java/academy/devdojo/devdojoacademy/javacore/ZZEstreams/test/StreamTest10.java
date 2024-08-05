package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i + 2).limit(100).forEach(System.out::println);
        System.out.println("======");

        List<int[]> collect = Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .collect(Collectors.toList());
        for (int[] i : collect) {
            System.out.println(i[0] + " " + i[1]);
        }

        System.out.println("=======");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);

        System.out.println("=======");
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate(() -> random.nextInt(1, 500)).limit(10).forEach(System.out::println);
    }

}
