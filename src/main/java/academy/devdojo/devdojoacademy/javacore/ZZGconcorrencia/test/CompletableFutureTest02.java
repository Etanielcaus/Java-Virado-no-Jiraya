package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
        searchPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPriceAsyncCompletableFuture(StoreService storeService) {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");


//        List<Double> doubleListPrices = stores.stream()
//                .map(storeService::getPricesAsyncCompletableFuture)
////              .map(s -> storeService.getPricesAsyncCompletableFuture(s))
//                .map(CompletableFuture::join)
//                .collect(Collectors.toList());

        List<CompletableFuture<Double>> collectedCompletableFutureList = stores.stream().map(storeService::getPricesAsyncCompletableFuture)
                .collect(Collectors.toList());
        List<Double> doubleList = collectedCompletableFutureList.stream().map(CompletableFuture::join).collect(Collectors.toList());

        System.out.println(doubleList);

        long end = System.currentTimeMillis();
        System.out.println("Time passed to searchPricesASync " + (end - start));
//        StoreService.shutdown();
    }
}
