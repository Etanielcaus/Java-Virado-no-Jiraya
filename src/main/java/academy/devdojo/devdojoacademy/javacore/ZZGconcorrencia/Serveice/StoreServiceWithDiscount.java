package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.Serveice;

import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.dominio.Discount;
import academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.dominio.Quote;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    public String getPriceSync(String storeName) {
        double price = priceGenerator();
        Discount.Code discountCode = Discount.Code.values()[ThreadLocalRandom.current().nextInt(Discount.Code.values().length)];
        return storeName + ":" + price + ":" + discountCode;
    }

    public String applyDiscount(Quote quote){
        delay();
        double discountValue = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        return String.format("'%s' original price: %.2f . Applyng discount code %s . Final Price: %.2f",
                quote.getStore(), quote.getPrice(), quote.getDiscountCode(), discountValue);
    }

    private double priceGenerator() {
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }


    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
