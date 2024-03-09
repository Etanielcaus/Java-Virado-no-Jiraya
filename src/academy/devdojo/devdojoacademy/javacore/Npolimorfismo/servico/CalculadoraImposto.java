package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório do imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor: " + computador.getValor());
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório do imposto do tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate: " + tomate.getNome());
        System.out.println("Imposto: " + imposto);
        System.out.println("Valor: " + tomate.getValor());
    }
}
