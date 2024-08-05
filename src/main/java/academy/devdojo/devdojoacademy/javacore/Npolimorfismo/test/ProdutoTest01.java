package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.test;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC X", 14000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("=======");
        CalculadoraImposto.calcularImposto(tv);
    }
}