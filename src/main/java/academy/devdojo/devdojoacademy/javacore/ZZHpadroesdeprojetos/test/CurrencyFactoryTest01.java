package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.Country;
import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.Currency;
import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
