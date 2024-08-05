package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.remove(1);
        nomes2.add("joao");
        nomes2.add("maria");
//        nomes.add(123); // não é possivel passar int, pois a List<String> está forçando ser uma String

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome.toUpperCase());
        }

        System.out.println("=====");

        int size = nomes.size();
        for (int i = 0; i < size; i++) {
//            nomes.add("Suane");
            System.out.println(nomes.get(i));
        }
//        System.out.println(nomes);

        System.out.println("===");

        List<Integer> numeros = new ArrayList<>(16);
        numeros.add(1);
        numeros.add(2);
        System.out.println(numeros);


    }
}
