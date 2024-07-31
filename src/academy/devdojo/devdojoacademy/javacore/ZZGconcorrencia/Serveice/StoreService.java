package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice;

import java.util.concurrent.*;

public class StoreService {
    private static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSync(String storeName) {
        System.out.println("Getting prices sync for store: " + storeName);
        return priceGenerator();
    }

    public Future<Double> getPricesAsyncFuture(String storeName){
        System.out.println("Getting prices async for store: " + storeName);
        return ex.submit(this::priceGenerator);

    }

    public CompletableFuture<Double> getPricesAsyncCompletableFuture(String storeName){
        System.out.println("Getting prices async for store: " + storeName);
        return CompletableFuture.supplyAsync(this::priceGenerator);

    }


    public static void shutdown(){
        ex.shutdown();
    }

    private double priceGenerator() {
        System.out.printf("%s : generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
