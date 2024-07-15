package academy.devdojo.devdojoacademy.javacore.ZZCLambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> natsu = List.of("Natsu", "Jocemar");
        List<String> map = map(natsu, r -> String.valueOf(r.length()));
        System.out.println(map);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}
