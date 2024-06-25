package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Maria");
//        nomes.add(123); // não é possivel passar int, pois a List<String> está forçando ser uma String

        for (String nome : nomes) {
            System.out.println(nome.toUpperCase());
        }
        
        nomes.add("Suane");
        System.out.println("=====");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

    }
}
