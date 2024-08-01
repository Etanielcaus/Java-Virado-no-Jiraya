package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.test;

import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice.StoreServiceWithDiscount;
import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount serviceWithDiscount = new StoreServiceWithDiscount();
        searchPriceWithDiscount(serviceWithDiscount);
    }

    private static void searchPriceWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
//        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        stores.stream().map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
    }

}
