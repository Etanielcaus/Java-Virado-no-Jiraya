package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice.StoreService;
import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {
    public static void main(String[] args) {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        searchPriceAsyncCompletableFuture(storeServiceDeprecated);

    }

    private static void searchPriceAsyncCompletableFuture(StoreServiceDeprecated storeService) {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(6, r -> {
            Thread thread = new Thread(r);
            thread.setDaemon(true);
            return thread;
        });

        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        List<CompletableFuture<Double>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeService.getPriceSync(s), executorService))
                .collect(Collectors.toList());

        List<Double> doubleList = collect.stream().map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(doubleList);

        executorService.shutdown();
        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesASync " + (end - start));

    }
}
