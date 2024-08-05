package academy.devdojo.devdojoacademy.javacore.Zgenerics.test;

import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.devdojoacademy.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {

        criarArrayComUmObjeto(new Barco("Canoa"));

    }

    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> lista = new ArrayList<T>();
        lista.add(t);
        System.out.println(lista);
    }

}