package academy.devdojo.devdojoacademy.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> namesFamous = new ArrayList<List<String>>();
        List<String> actors = List.of("Leonardo Dicaprio", "Robert Dw J", "Seu jorge");
        List<String> cantors = List.of("Mateus fazeno Rock", "Froid", "Trisão");
        namesFamous.add(actors);
        namesFamous.add(cantors);

//        for (List<String> names : namesFamous) {
//            for (String name : names) {
//                System.out.println(name);
//            }
//        }

        namesFamous.stream().flatMap(List::stream).forEach(System.out::println);
    }
}
