package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.test;

import academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder()
                .firstName("Joao").lastName("Pedro").build();

        ReportDto build = ReportDto.ReportDtoBuilder.builder()
                .withAircraftName(aircraft.getName())
                .withCurrency(currency)
                .withCountry(country)
                .withPersonName(person.getFirstname())
                .build();

        System.out.println(build);
    }
}
