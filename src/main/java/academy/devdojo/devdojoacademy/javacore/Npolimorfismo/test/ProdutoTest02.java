package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.test;

import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.calcularImposto());
        System.out.println("---------");

        Produto produto1 = new Tomate("Tomate Cereja", 10);
        System.out.println(produto1.getNome());
        System.out.println(produto1.calcularImposto());
    }
}
