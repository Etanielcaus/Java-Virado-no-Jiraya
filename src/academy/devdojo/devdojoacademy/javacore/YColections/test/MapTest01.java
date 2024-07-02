package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String > stringMap = new HashMap<>();

        stringMap.put("A", "B");
        stringMap.put("B", "C");
        stringMap.put("C", "D");
        stringMap.put("teklado", "teclado");
        stringMap.putIfAbsent("teklado", "teclado1"); // Adiciona caso não exista

        System.out.println(stringMap);
        System.out.println(stringMap.get("A"));
        System.out.println(stringMap.get("teklado"));

//        Obtém todas as chaves
        for(String chave : stringMap.keySet()){
            System.out.println(chave + ": " + stringMap.get(chave));
        }

        System.out.println("===");

//        Obtém os valores
        for (String value : stringMap.values()) {
            System.out.println(value);
        }

        System.out.println("===");

//        Obtém os dois valores
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
