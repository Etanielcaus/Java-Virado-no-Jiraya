package academy.devdojo.devdojoacademy.javacore.YColections.test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("A");
        fila.add("B");
        fila.add("N");
        fila.add("K");

        for (String s : fila) {
            System.out.println(s);
        }

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }

    }
}
