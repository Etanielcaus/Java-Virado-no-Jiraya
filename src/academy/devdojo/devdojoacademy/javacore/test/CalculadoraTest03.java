package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double numeroSomado = calculadora.somarDoisParametros(20, 20);
        System.out.println(numeroSomado);
    }
}
