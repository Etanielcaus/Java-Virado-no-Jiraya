package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<String>();
        mangas.add("DBZ");
        mangas.add("Naruto");
        mangas.add("Attack On Titan");
        mangas.add("Pokemon");
        mangas.add("Rogue");

        // Em ordem alfabética
//        Collections.sort(mangas);

        mangas.sort(Collections.reverseOrder());
        mangas.sort(Collections.reverseOrder());

        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("====");

        List<Double> dinheiro = new ArrayList<>(16);
        dinheiro.add(1.0);
        dinheiro.add(4.0);
        dinheiro.add(2.0);
        dinheiro.add(3.0);

//        Collections.sort(dinheiro);
//        dinheiro.sort(Collections.reverseOrder());
        for (Double dinheiro1 : dinheiro) {
            System.out.println(dinheiro1);
        }
        System.out.println("");

//        double acumulado = 0.0;
//        for (int i = 0; i < dinheiro.size(); i++) {
//            acumulado = dinheiro.get(i);
//            dinheiro.set(i, acumulado + dinheiro.get(i));
//        }
//
//        for (Double dinheiro1 : dinheiro) {
//            System.out.println(dinheiro1);
//        }

        System.out.println("===");
        List<SmartPhone> smartPhones = new ArrayList<>();
        SmartPhone s1 = new SmartPhone("123", "Xiaomi");
        SmartPhone s2 = new SmartPhone("321", "Apple");
        SmartPhone s3 = new SmartPhone("456", "Samsung");

        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);

//        smartPhones.sort(Collections.reverseOrder());


        for (SmartPhone smartPhone : smartPhones){
            System.out.println(smartPhone);
        }

    }
}
