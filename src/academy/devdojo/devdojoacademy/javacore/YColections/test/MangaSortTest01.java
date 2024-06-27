package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> listaMangas = new ArrayList<Manga>();

        Manga dbz = new Manga(1L, "Dragon Ball", 55.0);
        Manga naruto = new Manga(2L, "Naruto", 30.0);
        Manga attackOnTitan = new Manga(20L, "Attack On Titan", 15.0);
        Manga cavaleirosDoZodiaco = new Manga(15L, "Cavaleiros do Zodiaco", 9.0);

        listaMangas.add(cavaleirosDoZodiaco);
        listaMangas.add(attackOnTitan);
        listaMangas.add(dbz);
        listaMangas.add(naruto);
        listaMangas.add(new Manga(15L, "Boruto", 12.0));

        Collections.sort(listaMangas);

        for (Manga manga : listaMangas){
            System.out.println(manga);
        }

    }
}
