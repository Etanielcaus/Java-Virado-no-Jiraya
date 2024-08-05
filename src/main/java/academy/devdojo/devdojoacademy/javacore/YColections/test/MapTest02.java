package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Consumidor;
import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Joao");
        Consumidor consumidor2 = new Consumidor("Pedro");

//        System.out.println(consumidor1.toString());
//        System.out.println(consumidor2.toString());

        Manga dbz = new Manga(1L, "Dragon Ball", 55.0,2);
        Manga naruto = new Manga(2L, "Naruto", 30.0, 4);
        Manga attackOnTitan = new Manga(20L, "Attack On Titan", 15.0, 6);
        Manga cavaleirosDoZodiaco = new Manga(15L, "Cavaleiros do Zodiaco", 9.0, 0);

        Map<Consumidor, Manga> consumidorMangaHashMap = new HashMap<>();

        consumidorMangaHashMap.put(consumidor1, dbz);
        consumidorMangaHashMap.put(consumidor2, naruto);
//        consumidorMangaHashMap.put(consumidor2, attackOnTitan);
//        consumidorMangaHashMap.put(consumidor1, cavaleirosDoZodiaco);

        for (Map.Entry< Consumidor, Manga> consumidorMangaEntry :  consumidorMangaHashMap.entrySet() ){
            System.out.println(consumidorMangaEntry.getKey().getNome() + " - " + consumidorMangaEntry.getValue().getTitulo());
        }

//        for (Consumidor consumidor : consumidorMangaHashMap.keySet()) {
//            System.out.println(consumidor + ": " + consumidorMangaHashMap.get(consumidor));
//        }
    }
}
