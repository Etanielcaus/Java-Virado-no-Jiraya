package academy.devdojo.devdojoacademy.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("o1");
        //        Optional<String> joao = Optional.ofNullable(findName("Joao")).orElse("Empty").describeConstable();
//        System.out.println(joao);

//        Optional<String> joao = Optional.ofNullable(findName("Joao"));
        Optional<String> joao = findName("Joao");
        String empty = joao.orElse("Empty");
        System.out.println(empty);

        joao.ifPresent(s -> System.out.println(s.toUpperCase()));

//        System.out.println(nameNew.toUpperCase());

    }

    private static Optional<String> findName(String name){
        List<String> stringList = List.of("Joao", "Pedro", "Agostinho");
        int i = stringList.indexOf(name);
        if(i != 1){
            return Optional.of(stringList.get(i));
        }
        return Optional.empty();
    }
}
