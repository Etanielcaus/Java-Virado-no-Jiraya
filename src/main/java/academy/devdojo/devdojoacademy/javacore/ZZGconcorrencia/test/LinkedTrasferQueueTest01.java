package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class LinkedTrasferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedDeque, SynchronousQueue, LinkedBlockingDeque

        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Joao"));
        System.out.println(tq.offer("Pedro"));
        System.out.println(tq.offer("Carlos", 10,TimeUnit.SECONDS));
        tq.put("Algusto");
        if (tq.hasWaitingConsumer()){
            tq.transfer("Marcio");
        }
        System.out.println(tq.tryTransfer("Carlão", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
