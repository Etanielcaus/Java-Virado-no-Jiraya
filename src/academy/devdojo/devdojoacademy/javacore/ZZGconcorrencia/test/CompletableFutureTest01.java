package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFutureTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPriceAsynFuture(storeService);
        searchPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService) {
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesSync " + (end - start));
    }

    private static void searchPriceAsynFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture = storeService.getPricesAsyncFuture("Store 1");
        Future<Double> pricesAsyncFuture1 = storeService.getPricesAsyncFuture("Store 2");
        Future<Double> pricesAsyncFuture2 = storeService.getPricesAsyncFuture("Store 3");
        Future<Double> pricesAsyncFuture3 = storeService.getPricesAsyncFuture("Store 4");
        try {
            System.out.println(pricesAsyncFuture.get());
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesASync " + (end - start));
        StoreService.shutdown();
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture = storeService.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsyncFuture1 = storeService.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsyncFuture2 = storeService.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsyncFuture3 = storeService.getPricesAsyncCompletableFuture("Store 4");
        
            System.out.println(pricesAsyncFuture.join());
            System.out.println(pricesAsyncFuture1.join());
            System.out.println(pricesAsyncFuture2.join());
            System.out.println(pricesAsyncFuture3.join());

        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesASync " + (end - start));
//        StoreService.shutdown();
    }
}
