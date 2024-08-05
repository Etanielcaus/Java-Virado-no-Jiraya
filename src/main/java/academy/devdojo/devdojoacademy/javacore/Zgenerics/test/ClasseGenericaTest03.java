package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        Carro carro = new Carro("Golf");
        Carro carro2 = new Carro("Fusca");
        Barco barco = new Barco("Canoa");
        Barco barco1 = new Barco("Veleiro");

        List<Carro> carros = new ArrayList<>(List.of(carro, carro2));
        List<Barco> barcos = new ArrayList<>(List.of(barco, barco1));

        RentalService<Carro> rentalService = new RentalService<>(carros);
        RentalService<Barco> rentalService1 = new RentalService<>(barcos);

        Barco barcoAlugado = rentalService1.buscarObjetoDisponivel();
        rentalService1.retornarObjetoAlugado(barcoAlugado);
    }
}
