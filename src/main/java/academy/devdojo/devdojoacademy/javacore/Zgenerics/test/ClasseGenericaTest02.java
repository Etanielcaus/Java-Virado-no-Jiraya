package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();

//        Fora da aula... só achei mais interessante adicionar essa funcionalidade.
        Barco barco1 = new Barco("Fusca");
        barcoRentavelService.adicionarBarco(barco1);

        System.out.println("Usando Barco por um mês: " + barco.getNome());

        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
