package academy.devdojo.devdojoacademy.javacore.YColections.test;

import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Consumidor;
import academy.devdojo.devdojoacademy.javacore.YColections.dominio.Manga;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class ComparatorConsumidor implements Comparator<Consumidor> {
    @Override
    public int compare(Consumidor o1, Consumidor o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

class ComparatorManga implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class QueueTest02 {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Pedro");
        Manga manga = new Manga(8L, "nn", 1850);
        Manga mangas2 = new Manga(1L, "nn", 1850);
        Manga mangas1 = new Manga(3L, "nn", 1850);

        Queue<Consumidor> queue = new PriorityQueue<>(new ComparatorConsumidor());
        Queue<Manga> mangas = new PriorityQueue<>( new ComparatorManga().reversed());

//        Necessário ter um Comparable na classe para poder utilizar
        queue.add(consumidor);
        mangas.add(manga);
        mangas.add(mangas1);
        mangas.add(mangas2);


        for (Consumidor consumidor1 : queue){
            System.out.println(consumidor1);
        }

        for (Manga manga1 : mangas){
            System.out.println(manga1);
        }

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
