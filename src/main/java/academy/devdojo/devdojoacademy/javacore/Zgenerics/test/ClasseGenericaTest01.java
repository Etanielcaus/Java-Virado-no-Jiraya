package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();

//        Fora da aula... só achei mais interessante adicionar essa funcionalidade.
        Carro carro1 = new Carro("Fusca");
        carroRentavelService.adicionarCarro(carro1);

        System.out.println("Usando carro por um mês: " + carro.getNome());

        carroRentavelService.retornarCarroAlugado(carro);
    }
}
