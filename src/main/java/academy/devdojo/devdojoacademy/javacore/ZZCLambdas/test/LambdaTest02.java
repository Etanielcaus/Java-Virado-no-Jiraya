package academy.devdojo.devdojoacademy.javacore.ZZCLambdas.test;

import academy.devdojo.devdojoacademy.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> natsu = List.of("Natsu", "Jocemar");
        List<String> map = map(natsu, LambdaTest02::apply);
        List<String> newmap = map(natsu, String::toUpperCase);
        System.out.println(map);
        System.out.println(newmap);


    }



    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }

    private static String apply(String r) {
        return String.valueOf(r.length());
    }
}
