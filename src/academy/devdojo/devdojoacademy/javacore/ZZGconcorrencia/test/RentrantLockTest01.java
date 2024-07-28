package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Worker implements Runnable {
    private String name;
    private ReentrantLock lock;

    public Worker(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            lock.tryLock(2, TimeUnit.SECONDS);
            System.out.printf("Thread %s entrou em uma sessão critica.", name);
            System.out.printf("%n %d Threads esperando na fila %n", lock.getQueueLength());
            System.out.printf("Thread %s vai esperar 2s %n", name);
            Thread.sleep(2000);
            System.out.printf("Thread %s finalizou a espera", name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}

public class RentrantLockTest01 {
    public static void main(String[] Args) {
        ReentrantLock lock = new ReentrantLock(true);
        new Thread(new Worker("A", lock)).start();
        new Thread(new Worker("B", lock)).start();
        new Thread(new Worker("C", lock)).start();
        new Thread(new Worker("D", lock)).start();
    }
}
