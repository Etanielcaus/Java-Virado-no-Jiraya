package academy.devdojo.devdojoacademy.javacore.test;

import academy.devdojo.devdojoacademy.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double divisao = calculadora.divideDoisParametros(30, 0);
        System.out.println(divisao);

        calculadora.imprimeParametrosDivisao(30, 0);

    }
}
