package academy.devdojo.devdojoacademy.javacore.Zgenerics.service;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel");
        T t = objetosDisponiveis.removeFirst();
        System.out.println("Alugando Carro: " + t);
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto: " + t);

        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis: " );
        System.out.println(objetosDisponiveis);
    }
}
