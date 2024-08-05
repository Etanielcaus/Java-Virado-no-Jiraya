package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
//        list.add(new Consumidor("Joao"));
//        list.add(123);

//        System.out.println(list);
//        for (Object o : list) {
//            if (o instanceof String) {
//                System.out.println(o);
//            }
//            if (o instanceof Consumidor) {
//                System.out.println(o);
//            }
//            if (o instanceof Long) {
//                System.out.println(o);
//            }
//        }

        for (String o : list){
            System.out.println(o);
        }

        add(list, new Consumidor("Joao"));

        for (Object o : list){
            System.out.println(o);
        }


    }

    private static void add(List list, Consumidor consumidor){
        list.add(consumidor);
    }
}
