package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> list = List.of("Goku", "Naruto", "George");

        String[] splitList = list.get(0).split("");
        System.out.println(Arrays.toString(splitList));

        Stream<List<String>> listStream = list.stream().map(w -> Arrays.stream(w.split("")).collect(Collectors.toList()));
        System.out.println(listStream);

        List<String> collectedStrings = list.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream) // array de String
                .toList();
        System.out.println(collectedStrings);

    }
}
