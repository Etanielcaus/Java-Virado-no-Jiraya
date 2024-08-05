package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<Manga>();

        Manga dbz = new Manga(1L, "Dragon Ball", 55.0,2);
        Manga naruto = new Manga(2L, "Naruto", 30.0, 4);
        Manga attackOnTitan = new Manga(20L, "Attack On Titan", 15.0, 6);
        Manga cavaleirosDoZodiaco = new Manga(15L, "Cavaleiros do Zodiaco", 9.0, 0);

        mangas.add(dbz);
        mangas.add(naruto);
        mangas.add(attackOnTitan);
        mangas.add(cavaleirosDoZodiaco);

//        for (Manga manga : mangas){
//            if (manga.getQuantidade() == 0){
//                mangas.remove(manga);
//            }
//        }

        Iterator<Manga> iteratorManga = mangas.iterator();
        while (iteratorManga.hasNext()){
            Manga mangaNext = iteratorManga.next();
            if(mangaNext.getQuantidade() == 0){
                iteratorManga.remove();
            }
        }

        System.out.println("===");

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);

    }
}
