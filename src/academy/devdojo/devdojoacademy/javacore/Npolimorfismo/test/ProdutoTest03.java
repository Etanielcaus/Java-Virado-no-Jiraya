package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.test;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 5000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        tomate.setDataValidade("18/05");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
