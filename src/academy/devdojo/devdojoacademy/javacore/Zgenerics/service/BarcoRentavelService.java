package academy.devdojo.devdojoacademy.javacore.Zgenerics.service;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco: " + barco.getNome());

        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis: " );
        System.out.println(barcosDisponiveis);
    }

//    Fora da aula.
    public void adicionarBarco(Barco barco){
        barcosDisponiveis.add(barco);
    }
}
