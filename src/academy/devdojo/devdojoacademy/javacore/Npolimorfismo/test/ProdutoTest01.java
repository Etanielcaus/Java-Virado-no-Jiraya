package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.test;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MAC X", 14000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
