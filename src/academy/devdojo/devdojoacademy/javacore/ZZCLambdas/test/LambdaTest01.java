package academy.devdojo.devdojoacademy.javacore.ZZCLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("joao", "pedro", "Carlão");
        forEach(strings, (String s) -> System.out.println(s));

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        forEach(nums, (Integer s) -> System.out.println(s));
    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list){
            consumer.accept(e);
        }
    };

}
