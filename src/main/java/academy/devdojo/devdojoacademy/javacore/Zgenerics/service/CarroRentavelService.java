package academy.devdojo.devdojoacademy.javacore.Zgenerics.service;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Audi")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando Carro disponivel");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro: " + carro);
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo carro: " + carro.getNome());

        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis: " );
        System.out.println(carrosDisponiveis);
    }

//    Fora da aula.
    public void adicionarCarro(Carro carro){
        carrosDisponiveis.add(carro);
    }
}
