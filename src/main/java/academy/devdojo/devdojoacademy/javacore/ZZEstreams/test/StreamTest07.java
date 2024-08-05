package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import java.util.List;
import java.util.Optional;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

//        for (Integer integer : integers) {
//            int i = integer + 1;
//            System.out.println(i);
//        }

//        Optional<Integer> reduceOptional = integers.stream().reduce((x, y) -> x + y);
//        Optional<Integer> reduceOptional = integers.stream().reduce(Integer::sum);
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);

        System.out.println(integers.stream().reduce(0, Integer::sum));

        System.out.println(integers.stream().reduce(1,(x, y) -> x / y));

        integers.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        integers.stream().reduce( Integer::max).ifPresent(System.out::println);




    }
}
